package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyjp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyjp(ffxx ffxxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyjp) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.c;
            ffxx ffxxVar = this.b;
            cyjo cyjoVar = new cyjo(ffxyVar);
            this.a = 1;
            if (ffxxVar.a(cyjoVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cyjp cyjpVar = new cyjp(this.b, ffguVar);
        cyjpVar.c = obj;
        return cyjpVar;
    }
}
