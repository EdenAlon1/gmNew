package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cydg extends ffhv implements ffjm {
    int a;
    private /* synthetic */ Object b;

    public cydg(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cydg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        long intValue = ((Number) cydm.a.e()).intValue();
        this.a = 1;
        if (ffsw.c(intValue, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cydg cydgVar = new cydg(ffguVar);
        cydgVar.b = obj;
        return cydgVar;
    }
}
