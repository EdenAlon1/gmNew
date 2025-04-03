package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfdc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfdp b;
    final /* synthetic */ ceze c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfdc(cfdp cfdpVar, ceze cezeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cfdpVar;
        this.c = cezeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfdc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cfdp cfdpVar = this.b;
        ceze cezeVar = this.c;
        this.a = 1;
        Object e = cfdpVar.e(cezeVar, this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfdc(this.b, this.c, ffguVar);
    }
}
