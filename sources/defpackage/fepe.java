package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepe extends fdza {
    public final fdyn a;
    private final fdzs b;
    private final fdxk c;
    private final Executor d;
    private final febs e;
    private fdxj f;
    private fdxo g;

    public fepe(fdzs fdzsVar, fdxk fdxkVar, Executor executor, febs febsVar, fdxj fdxjVar) {
        this.b = fdzsVar;
        this.c = fdxkVar;
        this.e = febsVar;
        Executor executor2 = fdxjVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        this.f = fdxjVar.c(executor);
        this.a = fdyn.k();
    }

    @Override // defpackage.fdza, defpackage.fdxo
    public final void a(fdxn fdxnVar, febo feboVar) {
        new fery(this.e, feboVar, this.f, feqc.f);
        fdzr a = this.b.a();
        Status status = a.a;
        if (!status.f()) {
            this.d.execute(new fepd(this, fdxnVar, fend.b(status)));
            this.g = feqc.g;
            return;
        }
        feqn b = ((feqp) a.b).b(this.e);
        if (b != null) {
            this.f = this.f.f(feqn.a, b);
        }
        fdxo a2 = this.c.a(this.e, this.f);
        this.g = a2;
        a2.a(fdxnVar, feboVar);
    }

    @Override // defpackage.fecg, defpackage.fdxo
    public final void c(String str, Throwable th) {
        fdxo fdxoVar = this.g;
        if (fdxoVar != null) {
            fdxoVar.c(str, th);
        }
    }

    @Override // defpackage.fdza, defpackage.fecg
    protected final fdxo g() {
        return this.g;
    }
}
