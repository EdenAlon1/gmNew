package defpackage;

import android.util.Log;
import j$.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pqu {
    public boolean a;
    public UUID b;
    public pyj c;
    public final Set d;
    private final Class e;

    public pqu(Class cls) {
        this.e = cls;
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = this.b.toString();
        uuid.getClass();
        String name = cls.getName();
        name.getClass();
        this.c = new pyj(uuid, (pqp) null, name, (String) null, (pot) null, (pot) null, 0L, 0L, 0L, (poj) null, 0, (poa) null, 0L, 0L, 0L, 0L, false, (pqg) null, 0, 0L, 0, 0, (String) null, 16777210);
        String name2 = cls.getName();
        name2.getClass();
        this.d = fffi.c(name2);
    }

    public abstract pqv a();

    public final pqv b() {
        pqv a = a();
        poj pojVar = this.c.l;
        boolean z = pojVar.b() || pojVar.e || pojVar.c || pojVar.d;
        pyj pyjVar = this.c;
        if (pyjVar.s) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pyjVar.i > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        String str = pyjVar.z;
        if (str == null) {
            List V = ffpc.V(pyjVar.e, new String[]{"."}, 0, 6);
            String str2 = V.size() == 1 ? (String) V.get(0) : (String) ffdx.P(V);
            if (str2.length() > 127) {
                str2 = ffpc.ac(str2, 127);
            }
            pyjVar.z = str2;
        } else if (str.length() > 127) {
            pyjVar.z = ffpc.ac(str, 127);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        pyj pyjVar2 = this.c;
        pyjVar2.getClass();
        this.c = new pyj(uuid, pyjVar2.d, pyjVar2.e, pyjVar2.f, new pot(pyjVar2.g), new pot(pyjVar2.h), pyjVar2.i, pyjVar2.j, pyjVar2.k, new poj(pyjVar2.l), pyjVar2.m, pyjVar2.n, pyjVar2.o, pyjVar2.p, pyjVar2.q, pyjVar2.r, pyjVar2.s, pyjVar2.t, pyjVar2.u, pyjVar2.w, pyjVar2.x, pyjVar2.y, pyjVar2.z, 524288);
        return a;
    }

    public final void c(pqg pqgVar) {
        pqgVar.getClass();
        pyj pyjVar = this.c;
        pyjVar.s = true;
        pyjVar.t = pqgVar;
    }

    public final void d(String str) {
        str.getClass();
        this.d.add(str);
    }

    public final void e(TimeUnit timeUnit) {
        timeUnit.getClass();
        this.c.q = timeUnit.toMillis(14L);
    }

    public final void f(poa poaVar, long j, TimeUnit timeUnit) {
        poaVar.getClass();
        timeUnit.getClass();
        this.a = true;
        pyj pyjVar = this.c;
        pyjVar.n = poaVar;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            ppt.c();
            Log.w(pyj.a, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            ppt.c();
            Log.w(pyj.a, "Backoff delay duration less than minimum value");
        }
        pyjVar.o = ffmk.l(millis, 10000L, 18000000L);
    }

    public final void g(poj pojVar) {
        this.c.l = pojVar;
    }

    public final void h(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.c.i = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.c.i) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void i(Duration duration) {
        duration.getClass();
        this.c.i = duration.toMillis();
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.c.i) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void j(pot potVar) {
        potVar.getClass();
        this.c.g = potVar;
    }

    public final void k(String str) {
        this.c.z = str;
    }
}
