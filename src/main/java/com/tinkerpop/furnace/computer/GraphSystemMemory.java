package com.tinkerpop.furnace.computer;

/**
 * These methods are not intended to be available to the developer of a VertexProgram.
 * As such, they are in an extending interface with the parent interface being the typical cast.
 *
 * @author Matthias Broecheler (me@matthiasb.com)
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public interface GraphSystemMemory extends GraphMemory {

    public void incrIteration();

    public void setRuntime(final long runtime);
}
