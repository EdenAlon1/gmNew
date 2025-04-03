package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyem implements eyie {
    public final eyel a;
    public int b;
    public int c = 0;
    private int d;

    private eyem(eyel eyelVar) {
        eygs.e(eyelVar, "input");
        this.a = eyelVar;
        eyelVar.f = this;
    }

    private final void Q(Object obj, eyik eyikVar, eyfc eyfcVar) {
        int i = this.d;
        this.d = eyjt.c(eyjt.a(this.b), 4);
        try {
            eyikVar.i(obj, this, eyfcVar);
            if (this.b == this.d) {
            } else {
                throw new eygu("Failed to parse the message.");
            }
        } finally {
            this.d = i;
        }
    }

    private final void R(Object obj, eyik eyikVar, eyfc eyfcVar) {
        eyel eyelVar = this.a;
        int n = eyelVar.n();
        eyelVar.O();
        int e = this.a.e(n);
        this.a.b++;
        eyikVar.i(obj, this, eyfcVar);
        this.a.z(0);
        r4.b--;
        this.a.A(e);
    }

    private final void S(int i) {
        if (this.a.d() != i) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void T(int i) {
        if ((i & 3) != 0) {
            throw new eygu("Failed to parse the message.");
        }
    }

    private static final void U(int i) {
        if ((i & 7) != 0) {
            throw new eygu("Failed to parse the message.");
        }
    }

    public static eyem p(eyel eyelVar) {
        eyem eyemVar = eyelVar.f;
        return eyemVar != null ? eyemVar : new eyem(eyelVar);
    }

    @Override // defpackage.eyie
    public final void A(List list) {
        int m;
        int i;
        if (list instanceof eygb) {
            eygb eygbVar = (eygb) list;
            int b = eyjt.b(this.b);
            if (b != 0) {
                if (b != 2) {
                    throw new eygt();
                }
                eyel eyelVar = this.a;
                int d = eyelVar.d() + eyelVar.n();
                do {
                    eygbVar.h(this.a.f());
                } while (this.a.d() < d);
                S(d);
                return;
            }
            do {
                eygbVar.h(this.a.f());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw new eygt();
                }
                eyel eyelVar2 = this.a;
                int d2 = eyelVar2.d() + eyelVar2.n();
                do {
                    list.add(Integer.valueOf(this.a.f()));
                } while (this.a.d() < d2);
                S(d2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.a.f()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void B(List list) {
        int m;
        int i;
        if (list instanceof eygb) {
            eygb eygbVar = (eygb) list;
            int b = eyjt.b(this.b);
            if (b == 2) {
                int n = this.a.n();
                T(n);
                int d = this.a.d() + n;
                do {
                    eygbVar.h(this.a.g());
                } while (this.a.d() < d);
                return;
            }
            if (b != 5) {
                throw new eygt();
            }
            do {
                eygbVar.h(this.a.g());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 == 2) {
                int n2 = this.a.n();
                T(n2);
                int d2 = this.a.d() + n2;
                do {
                    list.add(Integer.valueOf(this.a.g()));
                } while (this.a.d() < d2);
                return;
            }
            if (b2 != 5) {
                throw new eygt();
            }
            do {
                list.add(Integer.valueOf(this.a.g()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void C(List list) {
        int m;
        int i;
        if (list instanceof eyhg) {
            eyhg eyhgVar = (eyhg) list;
            int b = eyjt.b(this.b);
            if (b != 1) {
                if (b != 2) {
                    throw new eygt();
                }
                int n = this.a.n();
                U(n);
                int d = this.a.d() + n;
                do {
                    eyhgVar.g(this.a.o());
                } while (this.a.d() < d);
                return;
            }
            do {
                eyhgVar.g(this.a.o());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 != 1) {
                if (b2 != 2) {
                    throw new eygt();
                }
                int n2 = this.a.n();
                U(n2);
                int d2 = this.a.d() + n2;
                do {
                    list.add(Long.valueOf(this.a.o()));
                } while (this.a.d() < d2);
                return;
            }
            do {
                list.add(Long.valueOf(this.a.o()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void D(List list) {
        int m;
        int i;
        if (list instanceof eyfl) {
            eyfl eyflVar = (eyfl) list;
            int b = eyjt.b(this.b);
            if (b == 2) {
                int n = this.a.n();
                T(n);
                int d = this.a.d() + n;
                do {
                    eyflVar.h(this.a.c());
                } while (this.a.d() < d);
                return;
            }
            if (b != 5) {
                throw new eygt();
            }
            do {
                eyflVar.h(this.a.c());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 == 2) {
                int n2 = this.a.n();
                T(n2);
                int d2 = this.a.d() + n2;
                do {
                    list.add(Float.valueOf(this.a.c()));
                } while (this.a.d() < d2);
                return;
            }
            if (b2 != 5) {
                throw new eygt();
            }
            do {
                list.add(Float.valueOf(this.a.c()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void E(List list) {
        int m;
        int i;
        if (list instanceof eygb) {
            eygb eygbVar = (eygb) list;
            int b = eyjt.b(this.b);
            if (b != 0) {
                if (b != 2) {
                    throw new eygt();
                }
                eyel eyelVar = this.a;
                int d = eyelVar.d() + eyelVar.n();
                do {
                    eygbVar.h(this.a.h());
                } while (this.a.d() < d);
                S(d);
                return;
            }
            do {
                eygbVar.h(this.a.h());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw new eygt();
                }
                eyel eyelVar2 = this.a;
                int d2 = eyelVar2.d() + eyelVar2.n();
                do {
                    list.add(Integer.valueOf(this.a.h()));
                } while (this.a.d() < d2);
                S(d2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.a.h()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void F(List list) {
        int m;
        int i;
        if (list instanceof eyhg) {
            eyhg eyhgVar = (eyhg) list;
            int b = eyjt.b(this.b);
            if (b != 0) {
                if (b != 2) {
                    throw new eygt();
                }
                eyel eyelVar = this.a;
                int d = eyelVar.d() + eyelVar.n();
                do {
                    eyhgVar.g(this.a.p());
                } while (this.a.d() < d);
                S(d);
                return;
            }
            do {
                eyhgVar.g(this.a.p());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw new eygt();
                }
                eyel eyelVar2 = this.a;
                int d2 = eyelVar2.d() + eyelVar2.n();
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.d() < d2);
                S(d2);
                return;
            }
            do {
                list.add(Long.valueOf(this.a.p()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void G(List list) {
        int m;
        int i;
        if (list instanceof eygb) {
            eygb eygbVar = (eygb) list;
            int b = eyjt.b(this.b);
            if (b == 2) {
                int n = this.a.n();
                T(n);
                int d = this.a.d() + n;
                do {
                    eygbVar.h(this.a.k());
                } while (this.a.d() < d);
                return;
            }
            if (b != 5) {
                throw new eygt();
            }
            do {
                eygbVar.h(this.a.k());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 == 2) {
                int n2 = this.a.n();
                T(n2);
                int d2 = this.a.d() + n2;
                do {
                    list.add(Integer.valueOf(this.a.k()));
                } while (this.a.d() < d2);
                return;
            }
            if (b2 != 5) {
                throw new eygt();
            }
            do {
                list.add(Integer.valueOf(this.a.k()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void H(List list) {
        int m;
        int i;
        if (list instanceof eyhg) {
            eyhg eyhgVar = (eyhg) list;
            int b = eyjt.b(this.b);
            if (b != 1) {
                if (b != 2) {
                    throw new eygt();
                }
                int n = this.a.n();
                U(n);
                int d = this.a.d() + n;
                do {
                    eyhgVar.g(this.a.t());
                } while (this.a.d() < d);
                return;
            }
            do {
                eyhgVar.g(this.a.t());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 != 1) {
                if (b2 != 2) {
                    throw new eygt();
                }
                int n2 = this.a.n();
                U(n2);
                int d2 = this.a.d() + n2;
                do {
                    list.add(Long.valueOf(this.a.t()));
                } while (this.a.d() < d2);
                return;
            }
            do {
                list.add(Long.valueOf(this.a.t()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void I(List list) {
        int m;
        int i;
        if (list instanceof eygb) {
            eygb eygbVar = (eygb) list;
            int b = eyjt.b(this.b);
            if (b != 0) {
                if (b != 2) {
                    throw new eygt();
                }
                eyel eyelVar = this.a;
                int d = eyelVar.d() + eyelVar.n();
                do {
                    eygbVar.h(this.a.l());
                } while (this.a.d() < d);
                S(d);
                return;
            }
            do {
                eygbVar.h(this.a.l());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw new eygt();
                }
                eyel eyelVar2 = this.a;
                int d2 = eyelVar2.d() + eyelVar2.n();
                do {
                    list.add(Integer.valueOf(this.a.l()));
                } while (this.a.d() < d2);
                S(d2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.a.l()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void J(List list) {
        int m;
        int i;
        if (list instanceof eyhg) {
            eyhg eyhgVar = (eyhg) list;
            int b = eyjt.b(this.b);
            if (b != 0) {
                if (b != 2) {
                    throw new eygt();
                }
                eyel eyelVar = this.a;
                int d = eyelVar.d() + eyelVar.n();
                do {
                    eyhgVar.g(this.a.u());
                } while (this.a.d() < d);
                S(d);
                return;
            }
            do {
                eyhgVar.g(this.a.u());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw new eygt();
                }
                eyel eyelVar2 = this.a;
                int d2 = eyelVar2.d() + eyelVar2.n();
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.d() < d2);
                S(d2);
                return;
            }
            do {
                list.add(Long.valueOf(this.a.u()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    public final void K(List list, boolean z) {
        int m;
        int i;
        if (eyjt.b(this.b) != 2) {
            throw new eygt();
        }
        if ((list instanceof eyhb) && !z) {
            eyhb eyhbVar = (eyhb) list;
            do {
                o();
                eyhbVar.b();
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            do {
                list.add(z ? v() : u());
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void L(List list) {
        int m;
        int i;
        if (list instanceof eygb) {
            eygb eygbVar = (eygb) list;
            int b = eyjt.b(this.b);
            if (b != 0) {
                if (b != 2) {
                    throw new eygt();
                }
                eyel eyelVar = this.a;
                int d = eyelVar.d() + eyelVar.n();
                do {
                    eygbVar.h(this.a.n());
                } while (this.a.d() < d);
                S(d);
                return;
            }
            do {
                eygbVar.h(this.a.n());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw new eygt();
                }
                eyel eyelVar2 = this.a;
                int d2 = eyelVar2.d() + eyelVar2.n();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.d() < d2);
                S(d2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.a.n()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void M(List list) {
        int m;
        int i;
        if (list instanceof eyhg) {
            eyhg eyhgVar = (eyhg) list;
            int b = eyjt.b(this.b);
            if (b != 0) {
                if (b != 2) {
                    throw new eygt();
                }
                eyel eyelVar = this.a;
                int d = eyelVar.d() + eyelVar.n();
                do {
                    eyhgVar.g(this.a.v());
                } while (this.a.d() < d);
                S(d);
                return;
            }
            do {
                eyhgVar.g(this.a.v());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw new eygt();
                }
                eyel eyelVar2 = this.a;
                int d2 = eyelVar2.d() + eyelVar2.n();
                do {
                    list.add(Long.valueOf(this.a.v()));
                } while (this.a.d() < d2);
                S(d2);
                return;
            }
            do {
                list.add(Long.valueOf(this.a.v()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    public final void N(int i) {
        if (eyjt.b(this.b) != i) {
            throw new eygt();
        }
    }

    @Override // defpackage.eyie
    public final boolean O() {
        N(0);
        return this.a.D();
    }

    @Override // defpackage.eyie
    public final boolean P() {
        int i;
        if (this.a.C() || (i = this.b) == this.d) {
            return false;
        }
        return this.a.E(i);
    }

    @Override // defpackage.eyie
    public final double a() {
        N(1);
        return this.a.b();
    }

    @Override // defpackage.eyie
    public final float b() {
        N(5);
        return this.a.c();
    }

    @Override // defpackage.eyie
    public final int c() {
        int i = this.c;
        if (i != 0) {
            this.b = i;
            this.c = 0;
        } else {
            i = this.a.m();
            this.b = i;
        }
        return (i == 0 || i == this.d) ? Alert.DURATION_SHOW_INDEFINITELY : eyjt.a(i);
    }

    @Override // defpackage.eyie
    public final int d() {
        N(0);
        return this.a.f();
    }

    @Override // defpackage.eyie
    public final int e() {
        N(5);
        return this.a.g();
    }

    @Override // defpackage.eyie
    public final int f() {
        N(0);
        return this.a.h();
    }

    @Override // defpackage.eyie
    public final int g() {
        N(5);
        return this.a.k();
    }

    @Override // defpackage.eyie
    public final int h() {
        N(0);
        return this.a.l();
    }

    @Override // defpackage.eyie
    public final int i() {
        N(0);
        return this.a.n();
    }

    @Override // defpackage.eyie
    public final long j() {
        N(1);
        return this.a.o();
    }

    @Override // defpackage.eyie
    public final long k() {
        N(0);
        return this.a.p();
    }

    @Override // defpackage.eyie
    public final long l() {
        N(1);
        return this.a.t();
    }

    @Override // defpackage.eyie
    public final long m() {
        N(0);
        return this.a.u();
    }

    @Override // defpackage.eyie
    public final long n() {
        N(0);
        return this.a.v();
    }

    @Override // defpackage.eyie
    public final eyee o() {
        N(2);
        return this.a.w();
    }

    public final Object q(eyjr eyjrVar, Class cls, eyfc eyfcVar) {
        eyjr eyjrVar2 = eyjr.DOUBLE;
        switch (eyjrVar) {
            case DOUBLE:
                return Double.valueOf(a());
            case FLOAT:
                return Float.valueOf(b());
            case INT64:
                return Long.valueOf(k());
            case UINT64:
                return Long.valueOf(n());
            case INT32:
                return Integer.valueOf(f());
            case FIXED64:
                return Long.valueOf(j());
            case FIXED32:
                return Integer.valueOf(e());
            case BOOL:
                return Boolean.valueOf(O());
            case STRING:
                return v();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                return t(cls, eyfcVar);
            case BYTES:
                return o();
            case UINT32:
                return Integer.valueOf(i());
            case ENUM:
                return Integer.valueOf(d());
            case SFIXED32:
                return Integer.valueOf(g());
            case SFIXED64:
                return Long.valueOf(l());
            case SINT32:
                return Integer.valueOf(h());
            case SINT64:
                return Long.valueOf(m());
        }
    }

    public final Object r(eyik eyikVar, eyfc eyfcVar) {
        Object e = eyikVar.e();
        Q(e, eyikVar, eyfcVar);
        eyikVar.g(e);
        return e;
    }

    public final Object s(eyik eyikVar, eyfc eyfcVar) {
        Object e = eyikVar.e();
        R(e, eyikVar, eyfcVar);
        eyikVar.g(e);
        return e;
    }

    @Override // defpackage.eyie
    public final Object t(Class cls, eyfc eyfcVar) {
        N(2);
        return s(eyib.a.a(cls), eyfcVar);
    }

    @Override // defpackage.eyie
    public final String u() {
        N(2);
        return this.a.x();
    }

    @Override // defpackage.eyie
    public final String v() {
        N(2);
        return this.a.y();
    }

    @Override // defpackage.eyie
    public final void w(Object obj, eyik eyikVar, eyfc eyfcVar) {
        N(3);
        Q(obj, eyikVar, eyfcVar);
    }

    @Override // defpackage.eyie
    public final void x(Object obj, eyik eyikVar, eyfc eyfcVar) {
        N(2);
        R(obj, eyikVar, eyfcVar);
    }

    @Override // defpackage.eyie
    public final void y(List list) {
        int m;
        int i;
        if (list instanceof eydu) {
            eydu eyduVar = (eydu) list;
            int b = eyjt.b(this.b);
            if (b != 0) {
                if (b != 2) {
                    throw new eygt();
                }
                eyel eyelVar = this.a;
                int d = eyelVar.d() + eyelVar.n();
                do {
                    eyduVar.f(this.a.D());
                } while (this.a.d() < d);
                S(d);
                return;
            }
            do {
                eyduVar.f(this.a.D());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw new eygt();
                }
                eyel eyelVar2 = this.a;
                int d2 = eyelVar2.d() + eyelVar2.n();
                do {
                    list.add(Boolean.valueOf(this.a.D()));
                } while (this.a.d() < d2);
                S(d2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.a.D()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }

    @Override // defpackage.eyie
    public final void z(List list) {
        int m;
        int i;
        if (list instanceof eyet) {
            eyet eyetVar = (eyet) list;
            int b = eyjt.b(this.b);
            if (b != 1) {
                if (b != 2) {
                    throw new eygt();
                }
                int n = this.a.n();
                U(n);
                int d = this.a.d() + n;
                do {
                    eyetVar.h(this.a.b());
                } while (this.a.d() < d);
                return;
            }
            do {
                eyetVar.h(this.a.b());
                if (this.a.C()) {
                    return;
                } else {
                    i = this.a.m();
                }
            } while (i == this.b);
        } else {
            int b2 = eyjt.b(this.b);
            if (b2 != 1) {
                if (b2 != 2) {
                    throw new eygt();
                }
                int n2 = this.a.n();
                U(n2);
                int d2 = this.a.d() + n2;
                do {
                    list.add(Double.valueOf(this.a.b()));
                } while (this.a.d() < d2);
                return;
            }
            do {
                list.add(Double.valueOf(this.a.b()));
                if (this.a.C()) {
                    return;
                } else {
                    m = this.a.m();
                }
            } while (m == this.b);
            i = m;
        }
        this.c = i;
    }
}
