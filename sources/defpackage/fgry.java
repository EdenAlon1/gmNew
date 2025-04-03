package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgry extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public fgry(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgry) c((drhu) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(((drhu) this.a) == drhu.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgry fgryVar = new fgry(ffguVar);
        fgryVar.a = obj;
        return fgryVar;
    }
}
