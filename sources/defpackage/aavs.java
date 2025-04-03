package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aavs extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ aawf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aavs(aawf aawfVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = aawfVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        aavs aavsVar = new aavs(this.d, (ffgu) obj4);
        aavsVar.a = (engw) obj;
        aavsVar.b = (alxr) obj2;
        aavsVar.c = booleanValue;
        return aavsVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        if (this.c) {
            return new ffcf(obj2, obj3);
        }
        this.d.k.a(null);
        int i = engw.d;
        return new ffcf(enou.a, null);
    }
}
