package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drvy extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ drwc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drvy(drwc drwcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drwcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drvy) c((drwg) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        drwg drwgVar = (drwg) this.a;
        ffji ffjiVar = this.b.ah;
        if (ffjiVar == null) {
            ffkj.c("onResult");
            ffjiVar = null;
        }
        ffjiVar.invoke(drwgVar);
        this.b.hw();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        drvy drvyVar = new drvy(this.b, ffguVar);
        drvyVar.a = obj;
        return drvyVar;
    }
}
