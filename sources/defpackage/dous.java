package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dous extends ffhv implements ffjm {
    final /* synthetic */ dovc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dous(dovc dovcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dovcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dous) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dovc dovcVar = this.a;
        dovcVar.b = true;
        dovcVar.c.b(null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dous(this.a, ffguVar);
    }
}
