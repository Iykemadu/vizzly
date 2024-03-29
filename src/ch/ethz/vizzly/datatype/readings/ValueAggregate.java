/*
 * Copyright 2012 ETH Zurich, Computer Engineering and Networks Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.ethz.vizzly.datatype.readings;

import java.io.Serializable;

/**
 * This class implements a data type that makes calculating the mean of a number
 * of accumulated data points easier.
 * @author Matthias Keller
 *
 */
public class ValueAggregate implements Serializable {

	private static final long serialVersionUID = -1L;

	protected double aggSum;
    
    protected int numSamples;
    
    public ValueAggregate() {
        reset();
    }
    
    public void addValue(double value) {
        aggSum += value;
        numSamples++;
    }
    
    public double getAggregatedValue() {
        return aggSum/(double)numSamples;
    }
    
    public int getNumSamples() {
        return numSamples;
    }
    
    public void reset() {
        aggSum = 0.0;
        numSamples = 0;
    }
    
}
