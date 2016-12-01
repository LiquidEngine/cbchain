package org.liquidengine.cbchain.impl;

import org.liquidengine.cbchain.AbstractChainCallback;
import org.liquidengine.cbchain.IChainMonitorCallback;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWMonitorCallbackI;

/**
 * Chain callback implementation based on {@link AbstractChainCallback}.
 * <p>
 * Instances of this interface may be passed to the {@link GLFW#glfwSetMonitorCallback SetMonitorCallback} method.
 */
public final class ChainMonitorCallback extends AbstractChainCallback<GLFWMonitorCallbackI> implements IChainMonitorCallback {
    @Override
    public void invoke(long monitor, int event) {
        for (GLFWMonitorCallbackI glfwMonitorCallbackI : callbackChain) {
            glfwMonitorCallbackI.invoke(monitor, event);
        }
    }
}
