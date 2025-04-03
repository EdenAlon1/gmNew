package com.google.research.xeno.effect;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.research.xeno.effect.Effect;
import defpackage.fadg;
import defpackage.fado;
import defpackage.faeb;
import defpackage.faec;
import defpackage.fagf;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Effect implements faeb {
    public static final fagf a = new fagf();
    public static final /* synthetic */ int d = 0;
    public final long b;
    public final Map c;
    private final ReentrantReadWriteLock e = new ReentrantReadWriteLock();

    /* compiled from: PG */
    public interface NativeLoadCallback {
        void onCompletion(long j, String str);
    }

    public Effect(long j) {
        this.b = j;
        this.c = nativeGetControls(j);
        nativeGetAuxOutputStreamNames(j);
        String str = fado.a;
        try {
        } catch (Exception e) {
            Log.e(fado.a, "Exception occurred: ".concat(String.valueOf(e.getMessage())));
        }
        a.a(nativeGetEffectAddress(j), this);
    }

    public static void b(final fadg fadgVar, final Effect effect, final String str) {
        Runnable runnable = new Runnable() { // from class: facz
            @Override // java.lang.Runnable
            public final void run() {
                int i = Effect.d;
                fadg.this.a(effect, str);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private native List<String> nativeGetAuxOutputStreamNames(long j);

    private native Map<String, Control> nativeGetControls(long j);

    private static native long nativeGetEffectAddress(long j);

    public static native void nativeLoadCapabilityWithRemoteAssetManager(byte[] bArr, long j, String str, NativeLoadCallback nativeLoadCallback);

    public static native void nativeLoadChoreoWithRemoteAssetManager(byte[] bArr, long j, String str, NativeLoadCallback nativeLoadCallback);

    public static native void nativeLoadWithRemoteAssetManager(byte[] bArr, long j, String str, NativeLoadCallback nativeLoadCallback);

    @Override // defpackage.faeb
    public final void hK(faec faecVar) {
        this.e.readLock().lock();
        try {
            faecVar.a(this.b);
        } finally {
            this.e.readLock().unlock();
        }
    }

    public native String nativeGetName(long j);

    public native byte[] nativeGetSerializedProcessingMetadata(long j);

    public native void nativeSetName(long j, String str);
}
