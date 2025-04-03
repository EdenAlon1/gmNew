package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dke extends ffkk implements ffjm {
    final /* synthetic */ dkg a;
    final /* synthetic */ djw b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dke(dkg dkgVar, djw djwVar, int i) {
        super(2);
        this.a = dkgVar;
        this.b = djwVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.c | 1);
        this.a.a(this.b, (hfd) obj, a);
        return ffcu.a;
    }
}
