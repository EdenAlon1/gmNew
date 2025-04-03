package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqvq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqvs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqvq(aqvs aqvsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqvsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqvq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.b.i();
            aqvs aqvsVar = this.b;
            fgdj h = aqvsVar.b.h();
            aqvp aqvpVar = new aqvp(aqvsVar);
            this.a = 1;
            if (h.a(aqvpVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqvq(this.b, ffguVar);
    }
}
