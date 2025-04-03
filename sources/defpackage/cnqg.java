package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnqi b;
    final /* synthetic */ cntl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnqg(ffgu ffguVar, cnqi cnqiVar, cntl cntlVar) {
        super(2, ffguVar);
        this.b = cnqiVar;
        this.c = cntlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnqg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cnqi cnqiVar = this.b;
            cntl cntlVar = this.c;
            this.a = 1;
            if (cnqiVar.c(cntlVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnqg cnqgVar = new cnqg(ffguVar, this.b, this.c);
        cnqgVar.d = obj;
        return cnqgVar;
    }
}
