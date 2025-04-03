package com.google.research.xeno.effect;

import defpackage.fadq;
import defpackage.fads;
import defpackage.faed;
import defpackage.faen;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class FilterProcessorBase extends faen<Effect> {
    public volatile Effect a;

    protected FilterProcessorBase(fadq fadqVar) {
        super(fadqVar);
    }

    protected static native long nativeGetEventManager(long j);

    protected static native long nativeGetUserInteractionManager(long j);

    protected static native long nativeNewVideoProcessor(int i, long j, long j2, long[] jArr, long j3, byte[] bArr, NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback, NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback2, NativeCallbacks$AuxOutputCallback nativeCallbacks$AuxOutputCallback);

    public static native void nativeSendVideoProcessorAudioPacket(long j, long j2, long j3, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeSendVideoProcessorFramePacket(long j, long j2, long j3, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeSetEffect(long j, long j2, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeStartVideoProcessing(long j, int i, long j2, long j3, int i2, int i3, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeStopVideoProcessing(long j, Callbacks$StatusCallback callbacks$StatusCallback);

    public final void b(Effect effect, Callbacks$StatusCallback callbacks$StatusCallback) {
        List asList = Arrays.asList(this, effect);
        fads fadsVar = new fads(this, callbacks$StatusCallback, effect);
        if (asList.isEmpty()) {
            fadsVar.a(null);
        } else {
            faed.b(asList, new long[asList.size()], fadsVar, 0);
        }
    }
}
