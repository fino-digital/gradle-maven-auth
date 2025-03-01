/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.build.publish.auth.maven;

import org.hibernate.build.publish.auth.CredentialsProviderRegistry;

/**
 * @author Steve Ebersole
 */
public class MavenRepoAuthExtension {

	public MavenRepoAuthExtension(CredentialsProviderRegistry credentialsProviderRegistry) {
		this.credentialsProviderRegistry = credentialsProviderRegistry;
	}

	public static final String NAME = "mavenRepoAuth";

	CredentialsProviderRegistry credentialsProviderRegistry;

	public CredentialsProviderRegistry getCredentialsProviderRegistry() {
		return credentialsProviderRegistry;
	}

	public void setCredentialsProviderRegistry(CredentialsProviderRegistry credentialsProviderRegistry) {
		this.credentialsProviderRegistry = credentialsProviderRegistry;
	}
}
