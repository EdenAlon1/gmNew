package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abax extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ boolean e;
    final /* synthetic */ abay f;
    final /* synthetic */ alxr g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abax(boolean z, abay abayVar, alxr alxrVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = z;
        this.f = abayVar;
        this.g = alxrVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xit] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aqux, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r6 = this.a;
        ?? r0 = this.b;
        boolean z = this.c;
        ?? r2 = this.d;
        boolean z2 = false;
        if ((this.e || z) && ((r6.b() == alxi.ONE_ON_ONE || r6.b() == alxi.GROUP) && this.g.v() == r6.o() && r0 != 0 && r0.b().g && (!this.e || r0.m()))) {
            alxr alxrVar = this.g;
            if (r2 != 0) {
                alya d = alxrVar.d();
                alyn alynVar = d instanceof alyn ? (alyn) d : null;
                if (alynVar != null && alynVar.c().w(r2.g())) {
                    z2 = true;
                }
            }
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        abax abaxVar = new abax(this.e, this.f, this.g, (ffgu) obj5);
        abaxVar.a = (alxj) obj;
        abaxVar.b = (xit) obj2;
        abaxVar.c = booleanValue;
        abaxVar.d = (aqux) obj4;
        return abaxVar.b(ffcu.a);
    }
}
