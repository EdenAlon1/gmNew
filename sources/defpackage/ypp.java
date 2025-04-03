package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ypp extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;

    public ypp(ffgu ffguVar) {
        super(4, ffguVar);
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ypp yppVar = new ypp((ffgu) obj4);
        yppVar.a = (aqvj) obj;
        yppVar.b = booleanValue;
        yppVar.c = (aqux) obj3;
        return yppVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        boolean z = this.b;
        ?? r1 = this.c;
        boolean z2 = true;
        if (!z && (!((aqvj) obj2).a() || r1 == 0 || r1.s())) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
