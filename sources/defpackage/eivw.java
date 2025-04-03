package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eivw {
    private final Set b;
    private final Random c = new Random();
    public final ArrayList a = new ArrayList(2);

    public eivw(Set set) {
        this.b = set;
    }

    public final void a(eivv eivvVar) {
        this.a.add(eivvVar);
        Collections.shuffle(this.a, this.c);
    }

    public final void b(eixz eixzVar) {
        emxf.l(eixzVar != null);
        emxf.l(!eixzVar.equals(eixz.a));
        emxf.l((eixzVar.b & 256) != 0);
        String str = eixzVar.k;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((eivv) it.next()).d();
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((eivv) arrayList.get(i)).d();
        }
    }

    public final void c(eixz eixzVar) {
        ekzz f = eleg.f("onBeforeActivityAccountReady");
        try {
            String str = eixzVar.k;
            for (eivv eivvVar : this.b) {
                if (eivvVar instanceof eivx) {
                    ((eivx) eivvVar).g();
                }
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                eivv eivvVar2 = (eivv) it.next();
                if (eivvVar2 instanceof eivx) {
                    ((eivx) eivvVar2).g();
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d() {
        ekzz f = eleg.f("onBeforeNoAccountAvailable");
        try {
            for (eivv eivvVar : this.b) {
                if (eivvVar instanceof eivx) {
                    ((eivx) eivvVar).f();
                }
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                eivv eivvVar2 = (eivv) it.next();
                if (eivvVar2 instanceof eivx) {
                    ((eivx) eivvVar2).f();
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        ekzz f = eleg.f("onBeforeAccountLoading");
        try {
            for (eivv eivvVar : this.b) {
                if (eivvVar instanceof eivx) {
                    ((eivx) eivvVar).e();
                }
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                eivv eivvVar2 = (eivv) it.next();
                if (eivvVar2 instanceof eivx) {
                    ((eivx) eivvVar2).e();
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(eiup eiupVar) {
        ekzz f = eleg.f("onNoAccountAvailable");
        try {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((eivv) it.next()).ac(eiupVar);
            }
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((eivv) it2.next()).ac(eiupVar);
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g() {
        ekzz f = eleg.f("onAccountLoading");
        try {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((eivv) it.next()).ab();
            }
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((eivv) it2.next()).ab();
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(eisx eisxVar, eixz eixzVar) {
        emxf.l(eixzVar != null);
        emxf.l(!eixzVar.equals(eixz.a));
        emxf.l((eixzVar.b & 256) != 0);
        ekzz f = eleg.f("onAccountReady");
        try {
            eivt eivtVar = new eivt(new eivu(eisxVar, eixzVar.k));
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((eivv) it.next()).aa(eivtVar);
            }
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((eivv) it2.next()).aa(eivtVar);
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
