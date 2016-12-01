package org.liquidengine.cbchain.impl;

import org.liquidengine.cbchain.AbstractChainCallback;
import org.liquidengine.cbchain.IChainDropCallback;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWDropCallbackI;

/**
 * Chain callback implementation based on {@link AbstractChainCallback}.
 * <p>
 * Instances of this interface may be passed to the {@link GLFW#glfwSetDropCallback SetDropCallback} method.
 */
public final class ChainDropCallback extends AbstractChainCallback<GLFWDropCallbackI> implements IChainDropCallback {
    @Override
    public void invoke(long window, int count, long names) {
        for (GLFWDropCallbackI glfwDropCallbackI : callbackChain) {
            glfwDropCallbackI.invoke(window, count, names);
        }
    }
}