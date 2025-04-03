package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cssk extends ffhv implements ffjm {
    final /* synthetic */ cssu a;
    final /* synthetic */ cfly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cssk(cssu cssuVar, cfly cflyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cssuVar;
        this.b = cflyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((cssk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cssk(this.a, this.b, ffguVar);
    }
}
