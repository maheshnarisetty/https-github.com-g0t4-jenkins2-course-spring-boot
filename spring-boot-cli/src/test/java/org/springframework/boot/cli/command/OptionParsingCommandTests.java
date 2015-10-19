/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.cli.command;

import org.junit.Test;

import org.springframework.boot.cli.command.options.OptionHandler;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Tests for {@link OptionParsingCommand}.
 *
 * @author Dave Syer
 */
public class OptionParsingCommandTests {

	@Test
	public void optionHelp() {
		OptionHandler handler = new OptionHandler();
		handler.option("bar", "Bar");
		OptionParsingCommand command = new OptionParsingCommand("foo", "Foo", handler) {
		};
		assertThat(command.getHelp(), containsString("--bar"));
	}

}
