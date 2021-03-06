package com.spinyowl.cbchain.impl;

import com.spinyowl.cbchain.AbstractChainCallback;
import com.spinyowl.cbchain.IChainCharModsCallback;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWCharModsCallbackI;

/**
 * Chain callback implementation based on {@link AbstractChainCallback}.
 * <p>
 * Instances of this interface may be passed to the {@link GLFW#glfwSetCharModsCallback SetCharModsCallback} method.
 */
public class ChainCharModsCallback extends AbstractChainCallback<GLFWCharModsCallbackI> implements IChainCharModsCallback {
    @Override
    public void invoke(long window, int codepoint, int mods) {
        callbackChain.forEach(c -> c.invoke(window, codepoint, mods));
    }
}
