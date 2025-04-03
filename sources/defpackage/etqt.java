package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class etqt {
    final long[] a;
    final long[] b;
    final long[] c;

    public etqt(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }

    final void a(etqt etqtVar, int i) {
        etqs.a(this.a, etqtVar.a, i);
        etqs.a(this.b, etqtVar.b, i);
        etqs.a(this.c, etqtVar.c, i);
    }

    public void b(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    etqt() {
        this(new long[10], new long[10], new long[10]);
    }

    public etqt(etqt etqtVar) {
        this.a = Arrays.copyOf(etqtVar.a, 10);
        this.b = Arrays.copyOf(etqtVar.b, 10);
        this.c = Arrays.copyOf(etqtVar.c, 10);
    }
}
