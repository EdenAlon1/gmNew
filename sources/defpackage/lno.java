package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lno extends ffkk implements ffjm {
    final /* synthetic */ lki a;
    final /* synthetic */ lkr b;
    final /* synthetic */ ffix c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lno(lki lkiVar, lkr lkrVar, ffix ffixVar, int i) {
        super(2);
        this.a = lkiVar;
        this.b = lkrVar;
        this.c = ffixVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d | 1);
        lnp.a(this.a, this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
