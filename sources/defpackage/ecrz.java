package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ecrz implements echl {
    public static final ecrx h() {
        ecrq ecrqVar = new ecrq();
        ecrqVar.a = 10;
        byte b = ecrqVar.c;
        ecrqVar.b = true;
        ecrqVar.c = (byte) (b | 3);
        ecrqVar.e = new ecry(1.0f);
        ecrqVar.d = 1;
        ecrqVar.c = (byte) (b | 7);
        return ecrqVar;
    }

    @Override // defpackage.echl
    public abstract int a();

    @Override // defpackage.echl
    public final /* synthetic */ ffbr b() {
        return null;
    }

    @Override // defpackage.echl
    public final boolean c() {
        return e() == 3;
    }

    public abstract boolean d();

    public abstract int e();

    public abstract ecry f();

    public abstract void g();
}
