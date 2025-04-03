package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mid {
    public final mic a;
    public int b;
    public Object c;
    public final Looper d;
    public final long e = -9223372036854775807L;
    private final mib f;
    private boolean g;
    private boolean h;

    public mid(mib mibVar, mic micVar, Looper looper) {
        this.f = mibVar;
        this.a = micVar;
        this.d = looper;
    }

    public final synchronized void a(boolean z) {
        this.h = z | this.h;
        notifyAll();
    }

    public final synchronized void b() {
    }

    public final void c() {
        lti.c(!this.g);
        lti.a(true);
        this.g = true;
        this.f.d(this);
    }

    public final void d(Object obj) {
        lti.c(!this.g);
        this.c = obj;
    }

    public final void e(int i) {
        lti.c(!this.g);
        this.b = i;
    }
}
