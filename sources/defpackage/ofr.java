package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofr extends ffhv implements ffjm {
    final /* synthetic */ oft a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofr(oft oftVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = oftVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ofr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.l.i(ofz.a, ofv.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ofr(this.a, ffguVar);
    }
}
