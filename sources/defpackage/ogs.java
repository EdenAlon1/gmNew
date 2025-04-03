package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogs extends ffhv implements ffjm {
    int a;
    private /* synthetic */ Object b;

    public ogs(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ogs) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxy ffxyVar;
        oks oksVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        if (i == 0) {
            ffci.b(obj);
            ffxyVar = (ffxy) this.b;
            oksVar = null;
        } else {
            if (i != 1) {
                ffci.b(obj);
                return ffcu.a;
            }
            ffxyVar = (ffxy) this.b;
            ffci.b(obj);
            oksVar = (oks) obj;
        }
        Boolean valueOf = Boolean.valueOf(oksVar == oks.a);
        this.b = null;
        this.a = 2;
        if (ffxyVar.fQ(valueOf, this) == ffhhVar) {
            return ffhhVar;
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ogs ogsVar = new ogs(ffguVar);
        ogsVar.b = obj;
        return ogsVar;
    }
}
