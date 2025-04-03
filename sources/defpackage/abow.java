package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abow extends ffhv implements ffjp {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ abox e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abow(abox aboxVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = aboxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [dosl] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        ?? r4 = this.d;
        ?? r2 = obj3;
        if (obj3 == null) {
            r2 = dosf.a;
        }
        abmi abmiVar = (abmi) obj2;
        return new dotb(r2, new dlsr(abmiVar.a, abmiVar.b, false, false, false, abmiVar.d, null, false, null, abmiVar.e, 988), r4, false, z, new abov(this.e), new dota(null), 8);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        abow abowVar = new abow(this.e, (ffgu) obj5);
        abowVar.a = booleanValue;
        abowVar.b = (abmi) obj2;
        abowVar.c = (dosl) obj3;
        abowVar.d = (List) obj4;
        return abowVar.b(ffcu.a);
    }
}
