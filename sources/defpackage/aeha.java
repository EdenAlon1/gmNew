package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeha extends ffhv implements ffjm {
    final /* synthetic */ aehc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeha(aehc aehcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aehcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aeha) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        aegr aegrVar = (aegr) fflm.b(this.a.a);
        if (aegrVar == null) {
            return null;
        }
        aegrVar.b(2);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aeha(this.a, ffguVar);
    }
}
