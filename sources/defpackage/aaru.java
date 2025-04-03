package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaru extends ffhv implements ffjm {
    final /* synthetic */ aasc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaru(aasc aascVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aascVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaru) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.h.h(aine.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaru(this.a, ffguVar);
    }
}
