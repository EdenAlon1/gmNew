package com.google.android.libraries.inputmethod.emoji.search;

import defpackage.duux;
import defpackage.enru;
import defpackage.ewax;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class EmojiSearchJniImpl implements duux {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/search/EmojiSearchJniImpl");
    public static volatile boolean b;
    public static volatile boolean c;
    public static List d;
    public static ewax e;

    public static native void nativeInit();

    public static native void nativeLoadData(String[] strArr);

    public static native byte[] nativeSearch(byte[] bArr);

    private static native void nativeUnloadData();
}
