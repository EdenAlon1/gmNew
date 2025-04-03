package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ztv extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public ztv(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ztv) c((zek) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        eylg eylgVar;
        ffci.b(obj);
        zek zekVar = (zek) this.a;
        if (zekVar == null || (eylgVar = zekVar.a) == null || (eylgVar.b & 1) == 0) {
            return null;
        }
        eykv eykvVar = eylgVar.c;
        return eykvVar == null ? eykv.a : eykvVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ztv ztvVar = new ztv(ffguVar);
        ztvVar.a = obj;
        return ztvVar;
    }
}
