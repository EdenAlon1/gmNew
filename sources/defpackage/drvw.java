package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drvw extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ drwc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drvw(drwc drwcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = drwcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drvw) c((drwg) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        drwg drwgVar;
        Object obj2 = ffhh.a;
        ffji ffjiVar = null;
        if (this.a != 0) {
            drwgVar = (drwg) this.b;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            drwg drwgVar2 = (drwg) this.b;
            drwd drwdVar = this.c.aj;
            if (drwdVar == null) {
                ffkj.c("preferences");
                drwdVar = null;
            }
            this.b = drwgVar2;
            this.a = 1;
            aetb aetbVar = (aetb) drwdVar;
            Object a = ffra.a(ekxi.a(aetbVar.b), new aesy(null, aetbVar), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
            drwgVar = drwgVar2;
        }
        ffji ffjiVar2 = this.c.ah;
        if (ffjiVar2 == null) {
            ffkj.c("onResult");
        } else {
            ffjiVar = ffjiVar2;
        }
        ffjiVar.invoke(drwgVar);
        this.c.hw();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        drvw drvwVar = new drvw(this.c, ffguVar);
        drvwVar.b = obj;
        return drvwVar;
    }
}
