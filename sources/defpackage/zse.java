package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zse extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;

    public zse(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        zse zseVar = new zse((ffgu) obj3);
        zseVar.a = booleanValue;
        zseVar.b = booleanValue2;
        return zseVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = false;
        if (z && !z2) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
