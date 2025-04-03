package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class echt implements echl {
    public static final echs g() {
        echn echnVar = new echn();
        echnVar.c(new echu() { // from class: echr
            @Override // defpackage.echu
            public final fgmh d() {
                return null;
            }
        });
        echnVar.b = 1;
        echnVar.a = (byte) 1;
        return echnVar;
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
        return e() == 3;
    }

    public abstract echu d();

    public abstract int e();

    public abstract void f();
}
