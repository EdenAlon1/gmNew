package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aahj extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;

    public aahj(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        aahj aahjVar = new aahj((ffgu) obj3);
        aahjVar.a = booleanValue;
        aahjVar.b = booleanValue2;
        return aahjVar.b(ffcu.a);
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
