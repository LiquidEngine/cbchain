package com.spinyowl.cbchain.impl;

import com.spinyowl.cbchain.AbstractChainCallback;
import com.spinyowl.cbchain.IChainMonitorCallback;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWMonitorCallbackI;

/**
 * Chain callback implementation based on {@link AbstractChainCallback}.
 * <p>
 * Instances of this interface may be passed to the {@link GLFW#glfwSetMonitorCallback SetMonitorCallback} method.
 */
public class ChainMonitorCallback extends AbstractChainCallback<GLFWMonitorCallbackI> implements IChainMonitorCallback {
    @Override
    public void invoke(long monitor, int event) {
        callbackChain.forEach(c -> c.invoke(monitor, event));
    }
}
