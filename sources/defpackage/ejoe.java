package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejoe {
    public abstract ejoi a();

    public abstract void b(emxc emxcVar);

    public abstract void c(emxc emxcVar);

    public abstract void d(poj pojVar);

    public abstract void e(ejof ejofVar);

    public abstract void f(Set set);

    public abstract void g(ejoh ejohVar);

    public final ejoi h() {
        ejoi a = a();
        if (((ejnu) a).l.g()) {
            emxf.b(!((String) r1.l.c()).contains(":"), "Worker target process must either be a custom process like 'my_process' or the empty String '' for the Android default process.");
        }
        return a;
    }

    public final void i(poa poaVar, ejog ejogVar) {
        b(emxc.j(ejogVar));
        c(emxc.j(poaVar));
    }
}
