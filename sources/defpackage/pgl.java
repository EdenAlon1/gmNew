package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pgl {
    public final int a;

    public pgl() {
        int i = pgq.a;
        this.a = pgq.a();
    }

    public final void a(int i) {
        if (this.a >= i) {
            return;
        }
        throw new UnsupportedOperationException("This API requires extension version " + i + ", but the device is on " + this.a);
    }
}
