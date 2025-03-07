/*
 * Copyright 2012-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.jdbc.init;

import java.nio.charset.Charset;
import java.util.List;

import javax.sql.DataSource;

/**
 * Settings for initializing a database using a JDBC {@link DataSource}.
 *
 * @author Andy Wilkinson
 * @since 2.5.0
 */
public class DataSourceInitializationSettings {

	private List<String> ddlScriptLocations;

	private List<String> dmlScriptLocations;

	private boolean continueOnError = false;

	private String separator = ";";

	private Charset encoding;

	/**
	 * Returns the locations of the DDL (schema) scripts to apply to the database.
	 * @return the locations of the DDL scripts
	 */
	public List<String> getDdlScriptLocations() {
		return this.ddlScriptLocations;
	}

	/**
	 * Sets the locations of DDL (schema) scripts to apply to the database. By default,
	 * initialization will fail if a location does not exist. To prevent a failure, a
	 * location can be made optional by prefixing it with {@code optional:}.
	 * @param ddlScriptLocations locations of the DDL scripts
	 */
	public void setDdlScriptLocations(List<String> ddlScriptLocations) {
		this.ddlScriptLocations = ddlScriptLocations;
	}

	/**
	 * Returns the locations of the DML (data) scripts to apply to the database.
	 * @return the locations of the DML scripts
	 */
	public List<String> getDmlScriptLocations() {
		return this.dmlScriptLocations;
	}

	/**
	 * Sets the locations of DML (data) scripts to apply to the database. By default,
	 * initialization will fail if a location does not exist. To prevent a failure, a
	 * location can be made optional by prefixing it with {@code optional:}.
	 * @param dmlScriptLocations locations of the DML scripts
	 */
	public void setDmlScriptLocations(List<String> dmlScriptLocations) {
		this.dmlScriptLocations = dmlScriptLocations;
	}

	/**
	 * Returns whether to continue when an error occurs while applying a DDL or DML
	 * script.
	 * @return whether to continue on error
	 */
	public boolean isContinueOnError() {
		return this.continueOnError;
	}

	/**
	 * Sets whether initialization should continue when an error occurs when applying a
	 * DDL or DML script.
	 * @param continueOnError whether to continue when an error occurs.
	 */
	public void setContinueOnError(boolean continueOnError) {
		this.continueOnError = continueOnError;
	}

	/**
	 * Returns the statement separator used in the DDL and DML scripts.
	 * @return the statement separator
	 */
	public String getSeparator() {
		return this.separator;
	}

	/**
	 * Sets the statement separator to use when reading the DDL and DML scripts.
	 * @param separator statement separator used in DDL and DML scripts
	 */
	public void setSeparator(String separator) {
		this.separator = separator;
	}

	/**
	 * Returns the encoding to use when reading the DDL and DML scripts.
	 * @return the script encoding
	 */
	public Charset getEncoding() {
		return this.encoding;
	}

	/**
	 * Sets the encoding to use when reading the DDL and DML scripts.
	 * @param encoding encoding to use when reading the DDL and DML scripts
	 */
	public void setEncoding(Charset encoding) {
		this.encoding = encoding;
	}

}
