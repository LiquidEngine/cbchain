package com.spinyowl.cbchain.impl;

import com.spinyowl.cbchain.AbstractChainCallback;
import com.spinyowl.cbchain.IChainJoystickCallback;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWJoystickCallbackI;

/**
 * Chain callback implementation based on {@link AbstractChainCallback}.
 * <p>
 * Instances of this interface may be passed to the {@link GLFW#glfwSetJoystickCallback SetJoystickCallback} method.
 */
public class ChainJoystickCallback extends AbstractChainCallback<GLFWJoystickCallbackI> implements IChainJoystickCallback {
    @Override
    public void invoke(int joy, int event) {
        callbackChain.forEach(c -> c.invoke(joy, event));
    }
}
