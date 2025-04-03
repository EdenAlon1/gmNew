package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfso extends ffhv implements ffjm {
    final /* synthetic */ cfsq a;
    final /* synthetic */ String b;
    final /* synthetic */ aplf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfso(cfsq cfsqVar, String str, aplf aplfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cfsqVar;
        this.b = str;
        this.c = aplfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfso) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.a(this.b, this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfso(this.a, this.b, this.c, ffguVar);
    }
}
