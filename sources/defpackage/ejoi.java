package defpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejoi {
    public static ejoe n(Class cls) {
        ejnt ejntVar = new ejnt();
        ejntVar.a = cls;
        ejntVar.d(poj.a);
        ejntVar.c = new ejnw(0L, TimeUnit.SECONDS);
        ejntVar.f(enpd.a);
        ejntVar.e = new pon().a();
        return ejntVar;
    }

    public abstract poj a();

    public abstract pot b();

    public abstract ejoe c();

    public abstract ejog d();

    public abstract emxc e();

    public abstract emxc f();

    public abstract emxc g();

    public abstract emxc h();

    public abstract emxc i();

    public abstract emxc j();

    public abstract emxc k();

    public abstract enip l();

    public abstract Class m();

    public final ejoi o(Set set) {
        ejoe c = c();
        c.f(enpw.d(l(), set));
        return c.h();
    }
}
