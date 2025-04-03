package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqx {
    public final etqw a;
    final long[] b;

    public etqx(etqw etqwVar, long[] jArr) {
        this.a = etqwVar;
        this.b = jArr;
    }

    public static void a(etqx etqxVar, etqv etqvVar) {
        etrf.b(etqxVar.a.a, etqvVar.a.a, etqvVar.b);
        etqw etqwVar = etqvVar.a;
        etrf.b(etqxVar.a.b, etqwVar.b, etqwVar.c);
        etrf.b(etqxVar.a.c, etqvVar.a.c, etqvVar.b);
        etqw etqwVar2 = etqvVar.a;
        etrf.b(etqxVar.b, etqwVar2.a, etqwVar2.b);
    }

    public etqx() {
        this(new etqw(), new long[10]);
    }

    public etqx(etqv etqvVar) {
        this();
        a(this, etqvVar);
    }
}
