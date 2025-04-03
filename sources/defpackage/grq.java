package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ grr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grq(grr grrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = grrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((grq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffkz ffkzVar = new ffkz();
            grr grrVar = this.b;
            fgcl fgclVar = grrVar.h.a;
            grp grpVar = new grp(ffkzVar, grrVar);
            this.a = 1;
            if (fgct.g((fgct) fgclVar, grpVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new grq(this.b, ffguVar);
    }
}
