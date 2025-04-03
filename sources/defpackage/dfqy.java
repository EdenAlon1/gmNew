package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfqy {
    public dfuj a;
    private Looper b;

    public final dfqz a() {
        if (this.a == null) {
            this.a = new dfry();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new dfqz(this.a, this.b);
    }

    public final void b(Looper looper) {
        dfwv.o(looper, "Looper must not be null.");
        this.b = looper;
    }
}
