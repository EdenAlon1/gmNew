package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlt extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;

    public zlt(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        zlt zltVar = new zlt((ffgu) obj3);
        zltVar.a = (ojf) obj;
        zltVar.b = booleanValue;
        return zltVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new ffcf(this.a, Boolean.valueOf(this.b));
    }
}
