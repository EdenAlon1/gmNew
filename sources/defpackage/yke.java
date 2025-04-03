package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yke extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;

    public yke(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        yke ykeVar = new yke((ffgu) obj3);
        ykeVar.a = booleanValue;
        ykeVar.b = (xhu) obj2;
        return ykeVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        boolean z2 = false;
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && z && !((xhu) obj2).a()) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
