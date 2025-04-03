package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ oco c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocn(ffxx ffxxVar, ffgu ffguVar, oco ocoVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = ocoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ocn) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.d;
            ffxx ffxxVar = this.b;
            ocm ocmVar = new ocm(ffxyVar, this.c);
            this.a = 1;
            if (ffxxVar.a(ocmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ocn ocnVar = new ocn(this.b, ffguVar, this.c);
        ocnVar.d = obj;
        return ocnVar;
    }
}
