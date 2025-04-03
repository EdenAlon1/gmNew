package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ypq extends ffhv implements ffjo {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public ypq(ffgu ffguVar) {
        super(4, ffguVar);
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ypq ypqVar = new ypq((ffgu) obj4);
        ypqVar.a = booleanValue;
        ypqVar.b = (cnpk) obj2;
        ypqVar.c = (aqux) obj3;
        return ypqVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        ?? r1 = this.c;
        boolean z2 = true;
        if (!z && (!((cnpk) obj2).b() || r1 == 0 || r1.s())) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
