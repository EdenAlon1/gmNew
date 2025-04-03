package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfps extends dfpr {
    public final byte[] a;

    public dfps(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.dfpr
    public final byte[] c() {
        return this.a;
    }
}
