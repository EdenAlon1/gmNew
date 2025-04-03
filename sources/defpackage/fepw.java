package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepw extends fdxk {
    public final String b;
    final /* synthetic */ feqc c;
    public final AtomicReference a = new AtomicReference(feqc.e);
    private final fdxk d = new fepo(this);

    public fepw(feqc feqcVar, String str) {
        this.c = feqcVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.fdxk
    public final fdxo a(febs febsVar, fdxj fdxjVar) {
        if (this.a.get() != feqc.e) {
            return c(febsVar, fdxjVar);
        }
        feqc feqcVar = this.c;
        feqcVar.m.execute(new fepq(this));
        if (this.a.get() != feqc.e) {
            return c(febsVar, fdxjVar);
        }
        if (this.c.B.get()) {
            return new fepr();
        }
        fepv fepvVar = new fepv(this, fdyn.k(), febsVar, fdxjVar);
        feqc feqcVar2 = this.c;
        feqcVar2.m.execute(new feps(this, fepvVar));
        return fepvVar;
    }

    @Override // defpackage.fdxk
    public final String b() {
        return this.b;
    }

    public final fdxo c(febs febsVar, fdxj fdxjVar) {
        fdzs fdzsVar = (fdzs) this.a.get();
        if (fdzsVar == null) {
            return this.d.a(febsVar, fdxjVar);
        }
        if (!(fdzsVar instanceof feqo)) {
            return new fepe(fdzsVar, this.d, this.c.k, febsVar, fdxjVar);
        }
        feqn b = ((feqo) fdzsVar).b.b(febsVar);
        if (b != null) {
            fdxjVar = fdxjVar.f(feqn.a, b);
        }
        return this.d.a(febsVar, fdxjVar);
    }

    final void d(fdzs fdzsVar) {
        Collection collection;
        fdzs fdzsVar2 = (fdzs) this.a.get();
        this.a.set(fdzsVar);
        if (fdzsVar2 != feqc.e || (collection = this.c.x) == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((fepv) it.next()).j();
        }
    }
}
