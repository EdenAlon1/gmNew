package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enks {
    boolean a;
    int b = -1;
    int c = -1;
    enlh d;
    enlh e;
    emwj f;

    final int a() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    final int b() {
        int i = this.b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    final enlh c() {
        return (enlh) emxa.c(this.d, enlh.STRONG);
    }

    final enlh d() {
        return (enlh) emxa.c(this.e, enlh.STRONG);
    }

    public final ConcurrentMap e() {
        if (!this.a) {
            return new ConcurrentHashMap(b(), 0.75f, a());
        }
        int i = enme.k;
        if (c() == enlh.STRONG && d() == enlh.STRONG) {
            return new enme(this, enli.a);
        }
        if (c() == enlh.STRONG && d() == enlh.WEAK) {
            return new enme(this, enlm.a);
        }
        if (c() == enlh.WEAK && d() == enlh.STRONG) {
            return new enme(this, enls.a);
        }
        if (c() == enlh.WEAK && d() == enlh.WEAK) {
            return new enme(this, enlw.a);
        }
        throw new AssertionError();
    }

    public final void f(enlh enlhVar) {
        enlh enlhVar2 = this.e;
        emxf.p(enlhVar2 == null, "Value strength was already set to %s", enlhVar2);
        enlhVar.getClass();
        this.e = enlhVar;
        if (enlhVar != enlh.STRONG) {
            this.a = true;
        }
    }

    public final String toString() {
        emwz b = emxa.b(this);
        int i = this.b;
        if (i != -1) {
            b.f("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            b.f("concurrencyLevel", i2);
        }
        enlh enlhVar = this.d;
        if (enlhVar != null) {
            b.b("keyStrength", emuz.c(enlhVar.toString()));
        }
        enlh enlhVar2 = this.e;
        if (enlhVar2 != null) {
            b.b("valueStrength", emuz.c(enlhVar2.toString()));
        }
        if (this.f != null) {
            b.a("keyEquivalence");
        }
        return b.toString();
    }
}
