package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fems extends feau {
    public final feau a;

    public fems(feau feauVar) {
        this.a = feauVar;
    }

    @Override // defpackage.fdxk
    public final fdxo a(febs febsVar, fdxj fdxjVar) {
        return this.a.a(febsVar, fdxjVar);
    }

    @Override // defpackage.fdxk
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.feau
    public feau d() {
        throw null;
    }

    @Override // defpackage.feau
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.feau
    public final boolean f(TimeUnit timeUnit) {
        return this.a.f(timeUnit);
    }

    @Override // defpackage.feau
    public final fdyc g() {
        return this.a.g();
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("delegate", this.a);
        return b.toString();
    }
}
