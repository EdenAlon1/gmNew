package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nha {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final nhf c = new nhf();
    public int d;
    public int e;
    public long f;
    public nhb g;

    public final long a(ncp ncpVar, int i) {
        ncpVar.j(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }
}
