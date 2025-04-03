package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azmf extends ffhv implements ffjm {
    final /* synthetic */ azml a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azmf(azml azmlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = azmlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azmf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return azlx.a(this.a.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azmf(this.a, ffguVar);
    }
}
