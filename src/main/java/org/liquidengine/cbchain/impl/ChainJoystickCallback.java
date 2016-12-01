package org.liquidengine.cbchain.impl;

import org.liquidengine.cbchain.AbstractChainCallback;
import org.liquidengine.cbchain.IChainJoystickCallback;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWJoystickCallbackI;

/**
 * Chain callback implementation based on {@link AbstractChainCallback}.
 * <p>
 * Instances of this interface may be passed to the {@link GLFW#glfwSetJoystickCallback SetJoystickCallback} method.
 */
public final class ChainJoystickCallback extends AbstractChainCallback<GLFWJoystickCallbackI> implements IChainJoystickCallback {
    @Override
    public void invoke(int joy, int event) {
        for (GLFWJoystickCallbackI glfwJoystickCallbackI : callbackChain) {
            glfwJoystickCallbackI.invoke(joy, event);
        }
    }
}
