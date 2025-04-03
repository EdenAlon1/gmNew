package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqv {
    final etqw a;
    final long[] b;

    public etqv(etqw etqwVar, long[] jArr) {
        this.a = etqwVar;
        this.b = jArr;
    }

    public etqv() {
        this(new etqw(), new long[10]);
    }

    public etqv(etqv etqvVar) {
        this.a = new etqw(etqvVar.a);
        this.b = Arrays.copyOf(etqvVar.b, 10);
    }
}
