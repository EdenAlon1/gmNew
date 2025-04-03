package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cypz extends ffhv implements ffjr {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;
    final /* synthetic */ cyqd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cypz(cyqd cyqdVar, ffgu ffguVar) {
        super(7, ffguVar);
        this.g = cyqdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cyqd cyqdVar = this.g;
        ?? r1 = this.a;
        boolean z = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        ?? r5 = this.e;
        Object obj4 = this.f;
        boolean z2 = false;
        if (!((aspy) cyqdVar.e.b()).a() && z) {
            z2 = true;
        }
        engw engwVar = (engw) obj4;
        cyqq cyqqVar = (cyqq) obj3;
        return cyqdVar.c(r1, z2, (dlsr) obj2, cyqqVar, r5, engwVar);
    }

    @Override // defpackage.ffjr
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        cypz cypzVar = new cypz(this.g, (ffgu) obj7);
        cypzVar.a = (alxj) obj;
        cypzVar.b = booleanValue;
        cypzVar.c = (dlsr) obj3;
        cypzVar.d = (cyqq) obj4;
        cypzVar.e = (aqux) obj5;
        cypzVar.f = (engw) obj6;
        return cypzVar.b(ffcu.a);
    }
}
