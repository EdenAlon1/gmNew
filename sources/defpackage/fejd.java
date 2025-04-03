package defpackage;

import androidx.car.app.model.Alert;
import io.grpc.Status;
import io.grpc.StatusException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fejd extends femr {
    public final fekh a;
    public final String b;
    final /* synthetic */ feje d;
    private volatile Status e;
    private Status f;
    public final AtomicInteger c = new AtomicInteger(-2147483647);
    private final fejc g = new fejc(this);

    public fejd(feje fejeVar, fekh fekhVar, String str) {
        this.d = fejeVar;
        this.a = fekhVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.femr
    protected final fekh a() {
        return this.a;
    }

    public final void b() {
        synchronized (this) {
            if (this.c.get() != 0) {
                return;
            }
            Status status = this.f;
            this.f = null;
            if (status != null) {
                super.n(status);
            }
        }
    }

    @Override // defpackage.femr, defpackage.fejv
    public final fejs d(febs febsVar, febo feboVar, fdxj fdxjVar, fdxt[] fdxtVarArr) {
        fejs fejsVar;
        Executor executor;
        fdxg fdxgVar = fdxjVar.e;
        if (fdxgVar == null) {
            fdxgVar = null;
        }
        if (fdxgVar == null) {
            return this.c.get() >= 0 ? new femm(this.e, fdxtVarArr) : this.a.d(febsVar, feboVar, fdxjVar, fdxtVarArr);
        }
        fera feraVar = new fera(this.a, febsVar, feboVar, fdxjVar, this.g, fdxtVarArr);
        if (this.c.incrementAndGet() > 0) {
            this.g.a();
            return new femm(this.e, fdxtVarArr);
        }
        try {
            if (!((feee) fdxgVar).f || (executor = fdxjVar.c) == null) {
                executor = this.d.a;
            }
            fecq fecqVar = (fecq) emxa.c((fecq) this.a.q().a(femv.a), fecq.NONE);
            if (!((feee) fdxgVar).b || fecqVar == fecq.PRIVACY_AND_INTEGRITY) {
                try {
                    feee.a((String) emxa.c(null, this.b), febsVar);
                    ((feee) fdxgVar).c.a(executor, new feeb((feee) fdxgVar, feraVar));
                } catch (StatusException e) {
                    feraVar.a(e.a);
                }
            } else {
                feraVar.a(Status.j.withDescription("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ".concat(fecqVar.toString())));
            }
        } catch (Throwable th) {
            feraVar.a(Status.j.withDescription("Credentials should use fail() instead of throwing exceptions").d(th));
        }
        synchronized (feraVar.g) {
            fejsVar = feraVar.h;
            if (fejsVar == null) {
                feraVar.j = new fema();
                fejsVar = feraVar.j;
                feraVar.h = fejsVar;
            }
        }
        return fejsVar;
    }

    @Override // defpackage.femr, defpackage.feqr
    public final void n(Status status) {
        status.getClass();
        synchronized (this) {
            if (this.c.get() < 0) {
                this.e = status;
                this.c.addAndGet(Alert.DURATION_SHOW_INDEFINITELY);
                if (this.c.get() != 0) {
                    this.f = status;
                } else {
                    super.n(status);
                }
            }
        }
    }
}
