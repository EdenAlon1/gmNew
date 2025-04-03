package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeni extends ffhv implements ffjm {
    final /* synthetic */ aenq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeni(aenq aenqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aenqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aeni) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        aenq aenqVar = this.a;
        aenqVar.d.b(new aenh(aenqVar));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aeni(this.a, ffguVar);
    }
}
