package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqw {
    final long[] a;
    final long[] b;
    final long[] c;

    public etqw(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }

    static void b(etqw etqwVar, etqv etqvVar) {
        etrf.b(etqwVar.a, etqvVar.a.a, etqvVar.b);
        etqw etqwVar2 = etqvVar.a;
        etrf.b(etqwVar.b, etqwVar2.b, etqwVar2.c);
        etrf.b(etqwVar.c, etqvVar.a.c, etqvVar.b);
    }

    public final byte[] a() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        etrf.a(jArr, this.c);
        etrf.b(jArr2, this.a, jArr);
        etrf.b(jArr3, this.b, jArr);
        byte[] k = etrf.k(jArr3);
        k[31] = (byte) ((etqy.a(jArr2) << 7) ^ k[31]);
        return k;
    }

    public etqw() {
        this(new long[10], new long[10], new long[10]);
    }

    public etqw(etqv etqvVar) {
        this();
        b(this, etqvVar);
    }

    public etqw(etqw etqwVar) {
        this.a = Arrays.copyOf(etqwVar.a, 10);
        this.b = Arrays.copyOf(etqwVar.b, 10);
        this.c = Arrays.copyOf(etqwVar.c, 10);
    }
}
