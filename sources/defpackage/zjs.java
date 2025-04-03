package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zjs extends ffhv implements ffjm {
    int a;
    private /* synthetic */ Object b;

    public zjs(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zjs) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.b;
            int i2 = engw.d;
            engw engwVar = enou.a;
            engwVar.getClass();
            this.a = 1;
            if (ffxyVar.fQ(engwVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        zjs zjsVar = new zjs(ffguVar);
        zjsVar.b = obj;
        return zjsVar;
    }
}
