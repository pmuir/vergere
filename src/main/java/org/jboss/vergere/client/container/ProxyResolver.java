/*
 * Copyright 2011 JBoss, by Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.vergere.client.container;

/**
 * A <tt>ProxyResolver</tt> is used to implement a proxy closing strategy in the wiring of beans within the container.
 * This interface is not intended to be used directly by users, but rather implementations of this interface are meant
 * to be generated by the bootstrap generator.
 * <p>
 * The resolver itself has one method {@link #resolve(Object)} that accepts a reference to the actual bean instance
 * which is being proxied. The implementor of this class must then take appropriate action to deal with setting up
 * the proxy.
 * <p>
 * The ProxyResolvers are always called prior to the beans being put into service.
 * @author Mike Brock
 */
public interface ProxyResolver<T> {
  /**
   * The method called by the {@link CreationalContext} when it is ready to wire the actual bean instance to the
   * proxy.
   * @param t the actual non-proxied instance of the bean.
   */
  public void resolve(T t);
}
