package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exn extends ffkk implements ffjn {
    final /* synthetic */ exl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exn(exl exlVar) {
        super(3);
        this.a = exlVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ipo ei;
        long j = ((jzk) obj3).a;
        long j2 = this.a.f;
        int d = jzk.d(j);
        int b = jzk.b(j);
        iqk e = ((ipl) obj2).e(jzk.m(j, ffmk.i((int) (j2 >> 32), d, b), 0, ffmk.i((int) (j2 & 4294967295L), jzk.c(j), jzk.a(j)), 0, 10));
        ei = ((ipq) obj).ei(e.a, e.b, ffem.a, new exm(e));
        return ei;
    }
}
