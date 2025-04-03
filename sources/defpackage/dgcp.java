package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgcp {
    private final byte[] a;

    public dgcp(byte[] bArr) {
        this.a = bArr;
    }

    public final String a() {
        return Base64.encodeToString(this.a, 11);
    }
}
