package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyoo extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ cyoq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyoo(cyoq cyoqVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = cyoqVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r5 = this.a;
        boolean z = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        if (((aspy) this.e.e.b()).a() || !z) {
            return r5.b() == alxi.GROUP ? obj3 : obj2;
        }
        int i = engw.d;
        engw engwVar = enou.a;
        engwVar.getClass();
        return new cyor(engwVar);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        cyoo cyooVar = new cyoo(this.e, (ffgu) obj5);
        cyooVar.a = (alxj) obj;
        cyooVar.b = booleanValue;
        cyooVar.c = (cyor) obj3;
        cyooVar.d = (cyor) obj4;
        return cyooVar.b(ffcu.a);
    }
}
