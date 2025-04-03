package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ecqy implements echl {
    public static final ecqx g() {
        ecqt ecqtVar = new ecqt();
        ecqtVar.b = (byte) 1;
        ecqtVar.a = emux.a;
        ecqtVar.c = 1;
        return ecqtVar;
    }

    @Override // defpackage.echl
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.echl
    public abstract ffbr b();

    @Override // defpackage.echl
    public final boolean c() {
        return e() == 3 || e() == 1;
    }

    public abstract emxc d();

    public abstract int e();

    public abstract void f();
}
