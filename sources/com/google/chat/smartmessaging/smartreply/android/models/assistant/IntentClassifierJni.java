package com.google.chat.smartmessaging.smartreply.android.models.assistant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class IntentClassifierJni {
    public static native byte[] nativeClassify(long j, byte[] bArr, boolean z);

    public static native long nativeCreate(byte[] bArr);

    public static native void nativeDestroy(long j);
}
