package defpackage;

import defpackage.cfvl;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class cfvl {
    public static final ecwh a = new ecwh().c().a();
    public static final ecwh b = new ecwh().c().a().d("bugle_phenotype__");
    public static final emyl c = emys.a(new emyl() { // from class: cfvg
        @Override // defpackage.emyl
        public final Object get() {
            ecwh ecwhVar = cfvl.a;
            return ((cfvl.a) ctba.a(cfvl.a.class)).ix();
        }
    });
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    /* compiled from: PG */
    public interface a {
        cfuj ix();
    }

    static void A(StringBuilder sb, boolean z, String str, Object obj) {
        sb.append(String.format(Locale.US, "%s: %s\n", str, obj));
        if (z) {
            sb.append("\n");
        }
    }

    public static void B(String str, double d2) {
        c(b, str, d2);
    }

    public static cfup a(String str, long j) {
        return f(b, str, j);
    }

    public static cfup b(String str, boolean z) {
        return i(b, str, z);
    }

    public static cfup c(ecwh ecwhVar, String str, double d2) {
        cfun cfunVar;
        synchronized (d) {
            cfunVar = new cfun(ecwhVar.e(str, d2), Double.valueOf(d2));
            e.add(cfunVar);
        }
        return cfunVar;
    }

    public static cfup d(ecwh ecwhVar, String str, float f) {
        cfun cfunVar;
        synchronized (d) {
            cfunVar = new cfun(ecwhVar.q(str, f), Float.valueOf(f));
            e.add(cfunVar);
        }
        return cfunVar;
    }

    public static cfup e(ecwh ecwhVar, String str, int i) {
        cfun cfunVar;
        synchronized (d) {
            cfunVar = new cfun(ecwhVar.f(str, i), Integer.valueOf(i));
            e.add(cfunVar);
        }
        return cfunVar;
    }

    public static cfup f(ecwh ecwhVar, String str, long j) {
        cfun cfunVar;
        synchronized (d) {
            cfunVar = new cfun(ecwhVar.g(str, j), Long.valueOf(j));
            e.add(cfunVar);
        }
        return cfunVar;
    }

    public static cfup g(ecwh ecwhVar, String str, eymw eymwVar) {
        cfun cfunVar;
        synchronized (d) {
            cfunVar = new cfun(ecwhVar.k(str, eymwVar, new ecwg() { // from class: cfve
                @Override // defpackage.ecwg
                public final Object a(byte[] bArr) {
                    return (eymw) eyfy.parseFrom(eymw.a, bArr);
                }
            }), eymwVar);
            e.add(cfunVar);
        }
        return cfunVar;
    }

    public static cfup h(ecwh ecwhVar, String str, String str2) {
        cfun cfunVar;
        synchronized (d) {
            cfunVar = new cfun(ecwhVar.h(str, str2), str2);
            e.add(cfunVar);
        }
        return cfunVar;
    }

    public static cfup i(ecwh ecwhVar, String str, boolean z) {
        cfun cfunVar;
        synchronized (d) {
            cfunVar = new cfun(ecwhVar.i(str, z), Boolean.valueOf(z));
            e.add(cfunVar);
        }
        return cfunVar;
    }

    public static cfup j(ecwh ecwhVar, String str, float f) {
        cfuy cfuyVar;
        synchronized (d) {
            cfuyVar = new cfuy(ecwhVar.q(str, f), Float.valueOf(f));
            e.add(cfuyVar);
        }
        return cfuyVar;
    }

    public static cfup k(ecwh ecwhVar, String str, int i) {
        cfuy cfuyVar;
        synchronized (d) {
            cfuyVar = new cfuy(ecwhVar.f(str, i), Integer.valueOf(i));
            e.add(cfuyVar);
        }
        return cfuyVar;
    }

    public static cfup l(ecwh ecwhVar, String str, long j) {
        cfuy cfuyVar;
        synchronized (d) {
            cfuyVar = new cfuy(ecwhVar.g(str, j), Long.valueOf(j));
            e.add(cfuyVar);
        }
        return cfuyVar;
    }

    public static cfup m(ecwh ecwhVar, String str, String str2) {
        cfuy cfuyVar;
        synchronized (d) {
            cfuyVar = new cfuy(ecwhVar.h(str, str2), str2);
            e.add(cfuyVar);
        }
        return cfuyVar;
    }

    public static cfup n(ecwh ecwhVar, String str, boolean z) {
        cfuy cfuyVar;
        synchronized (d) {
            cfuyVar = new cfuy(ecwhVar.i(str, z), Boolean.valueOf(z));
            e.add(cfuyVar);
        }
        return cfuyVar;
    }

    @Deprecated
    public static cfup o(int i) {
        return n(b, defpackage.a.h(i, "bug_"), true);
    }

    @Deprecated
    public static cfup p(int i, String str) {
        return n(b, "bug_" + i + "_" + str, true);
    }

    @Deprecated
    public static cfup q(int i) {
        return i(b, defpackage.a.h(i, "bug_"), true);
    }

    @Deprecated
    public static cfup r(int i, String str) {
        return i(b, "bug_" + i + "_" + str, true);
    }

    public static cfuz s(final ecwh ecwhVar, final String str, final emyl emylVar) {
        cfuz cfuzVar;
        synchronized (d) {
            cfuzVar = new cfuz(new Supplier() { // from class: cfvd
                @Override // java.util.function.Supplier
                public final Object get() {
                    ecwh ecwhVar2 = cfvl.a;
                    return ecwh.this.j(str, (byte[]) emylVar.get());
                }
            });
            e.add(cfuzVar);
        }
        return cfuzVar;
    }

    public static cfva t(ecwh ecwhVar, String str, byte[] bArr) {
        cfuy cfuyVar;
        synchronized (d) {
            cfuyVar = new cfuy(ecwhVar.j(str, bArr), bArr);
            e.add(cfuyVar);
        }
        return cfuyVar;
    }

    public static cfva u(ecwh ecwhVar, String str, Object obj, ecwg ecwgVar) {
        cfuy cfuyVar;
        synchronized (d) {
            cfuyVar = new cfuy(ecwhVar.k(str, obj, ecwgVar), obj);
            e.add(cfuyVar);
        }
        return cfuyVar;
    }

    public static emyl v(final int i) {
        return emys.a(new emyl() { // from class: cfvc
            @Override // defpackage.emyl
            public final Object get() {
                return cfuj.a("bug_" + i);
            }
        });
    }

    public static emyl w(final String str) {
        return emys.a(new emyl() { // from class: cfvh
            @Override // defpackage.emyl
            public final Object get() {
                return cfuj.a(str);
            }
        });
    }

    public static emyl x(final int i, final String str) {
        return emys.a(new emyl() { // from class: cfvi
            @Override // defpackage.emyl
            public final Object get() {
                return cfuj.a("bug_" + i + "_" + str);
            }
        });
    }

    public static emyl y(final String str) {
        return emys.a(new emyl() { // from class: cfvj
            @Override // defpackage.emyl
            public final Object get() {
                return cfuj.b(str);
            }
        });
    }

    public static emyl z(final int i, final String str) {
        return emys.a(new emyl() { // from class: cfvf
            @Override // defpackage.emyl
            public final Object get() {
                return cfuj.b("bug_" + i + "_" + str);
            }
        });
    }
}
