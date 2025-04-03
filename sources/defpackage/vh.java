package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vh implements kto {
    final /* synthetic */ RecyclerView a;

    public vh(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.kto
    public final float a() {
        float f;
        if (this.a.o.ag()) {
            f = this.a.K;
        } else {
            if (!this.a.o.af()) {
                return 0.0f;
            }
            f = this.a.J;
        }
        return -f;
    }

    @Override // defpackage.kto
    public final void b() {
        this.a.ay();
    }

    @Override // defpackage.kto
    public final boolean c(float f) {
        int i;
        int i2;
        if (this.a.o.ag()) {
            i2 = (int) f;
            i = 0;
        } else if (this.a.o.af()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        this.a.ay();
        return this.a.aC(i, i2, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
