/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package br.com.caelum.vraptor.serialization;

import java.io.IOException;

import br.com.caelum.vraptor.View;

/**
 * Basic json serialization support using a Json Serializer.
 *
 * @author Lucas Cavalcanti
 * @version 3.0.2
 */
public interface JsonSerialization extends View {

	/**
	 * Serializes this object to the clients writer.
	 * @throws IOException
	 */
	public <T> Serializer from(T object);

}
