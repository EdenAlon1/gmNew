package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajdp extends ffhv implements ffjo {
    int a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    /* synthetic */ boolean d;
    final /* synthetic */ ajee e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajdp(ajee ajeeVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.e = ajeeVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        ajdp ajdpVar = new ajdp(this.e, (ffgu) obj4);
        ajdpVar.b = booleanValue;
        ajdpVar.c = booleanValue2;
        ajdpVar.d = booleanValue3;
        return ajdpVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        ajee ajeeVar = this.e;
        this.a = 1;
        Object c = ajeeVar.c(z, z2, z3, this);
        return c == ffhhVar ? ffhhVar : c;
    }
}
