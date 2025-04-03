package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqu extends etqt {
    private final long[] d;

    etqu() {
        super(new long[10], new long[10], new long[10]);
        this.d = new long[10];
    }

    @Override // defpackage.etqt
    public final void b(long[] jArr, long[] jArr2) {
        etrf.b(jArr, jArr2, this.d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etqu(etqx etqxVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.d = jArr;
        long[] jArr2 = this.a;
        etqw etqwVar = etqxVar.a;
        etrf.j(jArr2, etqwVar.b, etqwVar.a);
        long[] jArr3 = this.b;
        etqw etqwVar2 = etqxVar.a;
        etrf.i(jArr3, etqwVar2.b, etqwVar2.a);
        System.arraycopy(etqxVar.a.c, 0, jArr, 0, 10);
        etrf.b(this.c, etqxVar.b, etra.b);
    }
}
