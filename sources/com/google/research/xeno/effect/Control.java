package com.google.research.xeno.effect;

import android.util.Pair;
import com.google.mediapipe.framework.GraphGlSyncToken;
import com.google.mediapipe.framework.TextureReleaseCallback;
import defpackage.facx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Control {
    public final FloatSetting a;

    /* compiled from: PG */
    public static class BoolSetting extends facx {
        private BoolSetting(long j) {
        }
    }

    /* compiled from: PG */
    public static class ColorSetting {
        private ColorSetting(long j) {
        }
    }

    /* compiled from: PG */
    public static class DoubleSetting extends facx {
        private DoubleSetting(long j) {
            Control.nativeGetDoubleRange(j);
        }
    }

    /* compiled from: PG */
    public static class FloatSetting extends facx {
        public final long b;

        private FloatSetting(long j) {
            this.b = j;
            Control.nativeGetFloatRange(j);
        }
    }

    /* compiled from: PG */
    public static class GpuBufferSetting {
        private GpuBufferSetting(long j) {
        }

        private static void releaseWithSyncToken(long j, TextureReleaseCallback textureReleaseCallback) {
            textureReleaseCallback.release(new GraphGlSyncToken(j));
        }
    }

    /* compiled from: PG */
    public static class IntSetting extends facx {
        private IntSetting(long j) {
            Control.nativeGetIntRange(j);
        }
    }

    /* compiled from: PG */
    public static class RuntimeOptionsSetting {
        private RuntimeOptionsSetting(long j) {
        }
    }

    /* compiled from: PG */
    public static class StringSetting extends facx {
        private StringSetting(long j) {
        }
    }

    private Control(BoolSetting boolSetting, FloatSetting floatSetting, GpuBufferSetting gpuBufferSetting, IntSetting intSetting, RuntimeOptionsSetting runtimeOptionsSetting, StringSetting stringSetting, ColorSetting colorSetting, DoubleSetting doubleSetting) {
        this.a = floatSetting;
    }

    public static native Pair<Double, Double> nativeGetDoubleRange(long j);

    public static native Pair<Float, Float> nativeGetFloatRange(long j);

    public static native float nativeGetFloatValue(long j);

    public static native Pair<Integer, Integer> nativeGetIntRange(long j);

    public static native void nativeSetFloatValue(long j, float f);
}
