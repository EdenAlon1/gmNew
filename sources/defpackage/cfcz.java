package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfcz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfdp b;
    final /* synthetic */ ceze c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfcz(ffgu ffguVar, cfdp cfdpVar, ceze cezeVar) {
        super(2, ffguVar);
        this.b = cfdpVar;
        this.c = cezeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfcz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = this.b.b(this.c);
            this.a = 1;
            if (fgfz.c(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfcz cfczVar = new cfcz(ffguVar, this.b, this.c);
        cfczVar.d = obj;
        return cfczVar;
    }
}
