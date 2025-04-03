package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drwa extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ drwc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drwa(drwc drwcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = drwcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drwa) c((drwg) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        aeuk aeukVar;
        drwg drwgVar;
        ffhh ffhhVar = ffhh.a;
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
            drva drvaVar = this.c.am;
            this.b = drwgVar2;
            this.a = 1;
            int ordinal = drwgVar2.ordinal();
            if (ordinal == 0) {
                aeukVar = aeuk.PHOTOS_LINK;
            } else {
                if (ordinal != 1) {
                    throw new ffcd();
                }
                aeukVar = aeuk.STANDARD;
            }
            Object a = ((aetb) drwdVar).a(drvaVar, aeukVar, this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == ffhhVar) {
                return ffhhVar;
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
        drwa drwaVar = new drwa(this.c, ffguVar);
        drwaVar.b = obj;
        return drwaVar;
    }
}
