package com.google.android.libraries.geller.portable;

import defpackage.exqc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class GellerException extends Exception {
    public GellerException(int i, String str) {
        this(exqc.b(i), str, (byte[]) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GellerException(int i, String str, byte[] bArr) {
        super(String.format("Code: %s, Message: %s", exqc.a(i), str));
        if (i == 0) {
            throw null;
        }
    }

    public GellerException(int i, String str, Throwable th) {
        super(String.format("Code: %s, Message: %s", exqc.a(i), str), th);
    }

    public GellerException(String str) {
        this(3, str, (byte[]) null);
    }
}
