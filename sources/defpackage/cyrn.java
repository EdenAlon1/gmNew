package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyrn extends ffhv implements ffjr {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ boolean e;
    /* synthetic */ Object f;
    final /* synthetic */ cyrs g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyrn(cyrs cyrsVar, ffgu ffguVar) {
        super(7, ffguVar);
        this.g = cyrsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [alxg, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cyrs cyrsVar = this.g;
        ?? r1 = this.a;
        ?? r2 = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        boolean z = this.e;
        Object obj4 = this.f;
        boolean z2 = false;
        if (!((aspy) cyrsVar.g.b()).a() && z) {
            z2 = true;
        }
        return cyrsVar.c(r1, r2, (engw) obj2, (engw) obj3, z2, (dlsr) obj4);
    }

    @Override // defpackage.ffjr
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        cyrn cyrnVar = new cyrn(this.g, (ffgu) obj7);
        cyrnVar.a = (alxj) obj;
        cyrnVar.b = (alxg) obj2;
        cyrnVar.c = (engw) obj3;
        cyrnVar.d = (engw) obj4;
        cyrnVar.e = booleanValue;
        cyrnVar.f = (dlsr) obj6;
        return cyrnVar.b(ffcu.a);
    }
}
