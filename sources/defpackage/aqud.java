package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqud extends ffhv implements ffjm {
    final /* synthetic */ aque a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqud(aque aqueVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqueVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqud) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.i();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqud(this.a, ffguVar);
    }
}
