package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aahl extends ffhv implements ffjm {
    /* synthetic */ boolean a;
    final /* synthetic */ aahw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aahl(aahw aahwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aahwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((aahl) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a ? this.b.s.e() : new fgcp(new aahk(null));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aahl aahlVar = new aahl(this.b, ffguVar);
        aahlVar.a = ((Boolean) obj).booleanValue();
        return aahlVar;
    }
}
