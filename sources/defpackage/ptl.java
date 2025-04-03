package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ptl extends ffkk implements ffix {
    final /* synthetic */ pte a;
    final /* synthetic */ String b;
    final /* synthetic */ pqv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptl(pte pteVar, String str, pqv pqvVar) {
        super(0);
        this.a = pteVar;
        this.b = str;
        this.c = pqvVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        pqv pqvVar = this.c;
        pte pteVar = this.a;
        ptk ptkVar = new ptk(pqvVar, pteVar, this.b);
        pyk D = pteVar.e.D();
        List e = D.e(this.b);
        if (e.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        pyg pygVar = (pyg) ffdx.M(e);
        if (pygVar == null) {
            ptkVar.invoke();
        } else {
            pyj b = D.b(pygVar.a);
            if (b == null) {
                throw new IllegalStateException("WorkSpec with " + pygVar.a + ", that matches a name \"" + this.b + "\", wasn't found");
            }
            if (!b.f()) {
                throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            }
            if (pygVar.b == pqp.CANCELLED) {
                D.f(pygVar.a);
                ptkVar.invoke();
            } else {
                pqv pqvVar2 = this.c;
                String str = pygVar.a;
                pte pteVar2 = this.a;
                final pyj g = pyj.g(pqvVar2.b, str, null, null, null, 0, 0L, 0, 0, 0L, 0, 16777214);
                prv prvVar = pteVar2.g;
                prvVar.getClass();
                final WorkDatabase workDatabase = pteVar2.e;
                workDatabase.getClass();
                pod podVar = pteVar2.d;
                podVar.getClass();
                final List list = pteVar2.f;
                list.getClass();
                pqv pqvVar3 = this.c;
                final String str2 = g.c;
                final pyj b2 = workDatabase.D().b(str2);
                if (b2 == null) {
                    throw new IllegalArgumentException(a.a(str2, "Worker with ", " doesn't exist"));
                }
                if (!b2.d.a()) {
                    if (b2.f() ^ g.f()) {
                        ptm ptmVar = ptm.a;
                        throw new UnsupportedOperationException("Can't update " + ((String) ptmVar.invoke(b2)) + " Worker to " + ((String) ptmVar.invoke(g)) + " Worker. Update operation must preserve worker's type.");
                    }
                    final boolean f = prvVar.f(str2);
                    if (!f) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((prx) it.next()).b(str2);
                        }
                    }
                    final Set set = pqvVar3.c;
                    workDatabase.p(new Runnable() { // from class: ptj
                        /* JADX WARN: Finally extract failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            pyj pyjVar = g;
                            pyj pyjVar2 = b2;
                            int i = pyjVar2.v;
                            WorkDatabase workDatabase2 = WorkDatabase.this;
                            pyk D2 = workDatabase2.D();
                            pzj E = workDatabase2.E();
                            pyj g2 = pyj.g(pyjVar, null, pyjVar2.d, null, null, pyjVar2.m, pyjVar2.p, pyjVar2.u, i + 1, pyjVar2.w, pyjVar2.x, 12835837);
                            if (pyjVar.x == 1) {
                                g2.w = pyjVar.w;
                                g2.x++;
                            }
                            pyj a = pzw.a(list, g2);
                            pzg pzgVar = (pzg) D2;
                            pzgVar.a.m();
                            pzgVar.a.n();
                            try {
                                ors orsVar = ((pzg) D2).c;
                                oyf d = orsVar.d();
                                try {
                                    d.g(1, a.c);
                                    d.e(2, pzn.c(a.d));
                                    d.g(3, a.e);
                                    d.g(4, a.f);
                                    pot potVar = a.g;
                                    pot potVar2 = pot.a;
                                    d.c(5, poo.a(potVar));
                                    d.c(6, poo.a(a.h));
                                    d.e(7, a.i);
                                    d.e(8, a.j);
                                    d.e(9, a.k);
                                    d.e(10, a.m);
                                    d.e(11, pzn.a(a.n));
                                    d.e(12, a.o);
                                    d.e(13, a.p);
                                    d.e(14, a.q);
                                    d.e(15, a.r);
                                    d.e(16, a.s ? 1L : 0L);
                                    d.e(17, pzn.b(a.t));
                                    d.e(18, a.u);
                                    d.e(19, a.v);
                                    d.e(20, a.w);
                                    d.e(21, a.x);
                                    d.e(22, a.y);
                                    String str3 = a.z;
                                    if (str3 == null) {
                                        d.f(23);
                                    } else {
                                        d.g(23, str3);
                                    }
                                    poj pojVar = a.l;
                                    d.e(24, pzn.k(pojVar.j));
                                    d.c(25, pzn.i(pojVar.b));
                                    d.e(26, pojVar.c ? 1L : 0L);
                                    d.e(27, pojVar.d ? 1L : 0L);
                                    d.e(28, pojVar.e ? 1L : 0L);
                                    d.e(29, pojVar.f ? 1L : 0L);
                                    d.e(30, pojVar.g);
                                    d.e(31, pojVar.h);
                                    d.c(32, pzn.j(pojVar.i));
                                    d.g(33, a.c);
                                    d.a();
                                    orsVar.f(d);
                                    ((pzg) D2).a.q();
                                    String str4 = str2;
                                    pzgVar.a.o();
                                    pzm pzmVar = (pzm) E;
                                    pzmVar.a.m();
                                    oyf d2 = pzmVar.c.d();
                                    d2.g(1, str4);
                                    try {
                                        ((pzm) E).a.n();
                                        try {
                                            d2.a();
                                            ((pzm) E).a.q();
                                            boolean z = f;
                                            Set set2 = set;
                                            pzmVar.c.f(d2);
                                            E.b(str4, set2);
                                            if (z) {
                                                return;
                                            }
                                            D2.l(str4, -1L);
                                            workDatabase2.C().a(str4);
                                        } finally {
                                            ((pzm) E).a.o();
                                        }
                                    } catch (Throwable th) {
                                        pzmVar.c.f(d2);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    orsVar.f(d);
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                pzgVar.a.o();
                                throw th3;
                            }
                        }
                    });
                    if (!f) {
                        psa.a(podVar, workDatabase, list);
                    }
                }
            }
        }
        return ffcu.a;
    }
}
