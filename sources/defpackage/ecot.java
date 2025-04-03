package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ecot implements echl {
    public static final ecos i() {
        ecoq ecoqVar = new ecoq();
        ecoqVar.c(false);
        ecoqVar.a = 50;
        ecoqVar.c = (byte) (ecoqVar.c | 1);
        ecoqVar.b = emux.a;
        ecoqVar.d = 1;
        return ecoqVar;
    }

    @Override // defpackage.echl
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.echl
    public final /* synthetic */ ffbr b() {
        return null;
    }

    @Override // defpackage.echl
    public final boolean c() {
        return g() == 3;
    }

    public abstract int d();

    public abstract emxc e();

    public abstract boolean f();

    public abstract int g();

    public abstract void h();
}
