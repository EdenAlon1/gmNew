package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cftl extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public cftl(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cftl) c((cftg) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cftf cftfVar = (cftf) ((cftg) this.a).toBuilder();
        cftfVar.getClass();
        cftfVar.copyOnWrite();
        cftg cftgVar = (cftg) cftfVar.instance;
        cftgVar.b |= 2;
        cftgVar.c = true;
        return cfto.a(cftfVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cftl cftlVar = new cftl(ffguVar);
        cftlVar.a = obj;
        return cftlVar;
    }
}
