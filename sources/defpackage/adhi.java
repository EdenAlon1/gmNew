package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class adhi extends cpdo {
    public static final cskc a = cskc.g("BugleNetwork", "FirebaseRegistrationStartupTask");
    static final AtomicBoolean b = new AtomicBoolean();
    final Context c;
    final errl d;

    public adhi(Context context, ffbr ffbrVar, errl errlVar) {
        this.c = context;
        ffbrVar.getClass();
        this.d = errlVar;
    }

    @Override // defpackage.cqor
    public ekzz a() {
        throw null;
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        return elfo.f(new Runnable() { // from class: adhh
            @Override // java.lang.Runnable
            public final void run() {
                if (!adhi.b.compareAndSet(false, true)) {
                    throw new AssertionError("FirebaseRegistrationStartupTask is provided more than once");
                }
                adhi adhiVar = adhi.this;
                adhi.a.p("Enabling Firebase component");
                adhiVar.d();
            }
        }, this.d);
    }

    @Override // defpackage.cpeh
    public boolean c() {
        throw null;
    }

    protected void d() {
        throw null;
    }
}
