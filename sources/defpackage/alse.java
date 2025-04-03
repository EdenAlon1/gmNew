package defpackage;

import android.os.Trace;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alse {
    public final ecrj a;
    private final Set b = enpw.i();

    public alse(ecrj ecrjVar) {
        this.a = ecrjVar;
    }

    public final void a(ecda ecdaVar, int i) {
        this.a.e(ecdaVar);
        b(ecdaVar, i);
    }

    public final void b(ecda ecdaVar, int i) {
        if (ctid.c && this.b.add(new alqq(ecdaVar, i))) {
            Trace.beginAsyncSection(ecdaVar.a, i);
        }
    }

    public final void c(ecda ecdaVar, int i) {
        d(ecdaVar, i, null);
    }

    public final void d(ecda ecdaVar, int i, fgmh fgmhVar) {
        e(ecdaVar, i, fgmhVar, ecrh.SUCCESS);
    }

    public final void e(ecda ecdaVar, int i, fgmh fgmhVar, ecrh ecrhVar) {
        f(ecdaVar, i);
        this.a.g(ecdaVar, null, fgmhVar, ecrhVar);
    }

    public final void f(ecda ecdaVar, int i) {
        if (ctid.c && this.b.remove(new alqq(ecdaVar, i))) {
            Trace.endAsyncSection(ecdaVar.a, i);
        }
    }
}
