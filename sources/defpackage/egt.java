package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egt {
    public boolean a;
    public Object b;
    public final ejx c;
    private final hjz d;
    private final hjz e;

    public egt() {
        this(0, 0);
    }

    public final int a() {
        return this.d.c();
    }

    public final int b() {
        return this.e.c();
    }

    public final void c(int i) {
        this.d.i(i);
    }

    public final void d(int i) {
        this.e.i(i);
    }

    public final void e(int i, int i2) {
        if (i < 0.0f) {
            dwv.c("Index should be non-negative");
        }
        c(i);
        this.c.c(i);
        d(i2);
    }

    public egt(int i, int i2) {
        this.d = new hhy(i);
        this.e = new hhy(i2);
        this.c = new ejx(i, 90, BasePaymentResult.ERROR_REQUEST_FAILED);
    }
}
