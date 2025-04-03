package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hj {
    public final ViewGroup a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;
    public boolean e;
    public boolean f;

    public hj(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static final hj d(ViewGroup viewGroup, fr frVar) {
        viewGroup.getClass();
        fc am = frVar.am();
        am.getClass();
        return hc.a(viewGroup, am);
    }

    public abstract void a(List list, boolean z);

    public final hi b(ea eaVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            hi hiVar = (hi) obj;
            if (ffkj.e(hiVar.a, eaVar) && !hiVar.b) {
                break;
            }
        }
        return (hi) obj;
    }

    public final hi c(ea eaVar) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            hi hiVar = (hi) obj;
            if (ffkj.e(hiVar.a, eaVar) && !hiVar.b) {
                break;
            }
        }
        return (hi) obj;
    }

    public final void e(hi hiVar) {
        hiVar.getClass();
        if (hiVar.f) {
            int i = hiVar.h;
            ea eaVar = hiVar.a;
            hh.b(i, eaVar.N(), this.a);
            hiVar.h();
        }
    }

    public final void f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ffdx.w(arrayList, ((hi) it.next()).g);
        }
        List ak = ffdx.ak(ffdx.ar(arrayList));
        int size = ak.size();
        for (int i = 0; i < size; i++) {
            ((hd) ak.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            e((hi) list.get(i2));
        }
        List ak2 = ffdx.ak(list);
        int size3 = ak2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            hi hiVar = (hi) ak2.get(i3);
            if (hiVar.g.isEmpty()) {
                hiVar.a();
            }
        }
    }

    public final void g() {
        if (fr.af(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        List list = this.b;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (list) {
            i();
            h(this.b);
            List<hi> am = ffdx.am(this.c);
            Iterator it = am.iterator();
            while (it.hasNext()) {
                ((hi) it.next()).d = false;
            }
            for (hi hiVar : am) {
                if (fr.af(2)) {
                    Log.v("FragmentManager", a.o(hiVar, isAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ", "SpecialEffectsController: ", "Cancelling running operation "));
                }
                hiVar.e(this.a);
            }
            List<hi> am2 = ffdx.am(this.b);
            Iterator it2 = am2.iterator();
            while (it2.hasNext()) {
                ((hi) it2.next()).d = false;
            }
            for (hi hiVar2 : am2) {
                if (fr.af(2)) {
                    Log.v("FragmentManager", a.o(hiVar2, isAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ", "SpecialEffectsController: ", "Cancelling pending operation "));
                }
                hiVar2.e(this.a);
            }
        }
    }

    public final void h(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((hi) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ffdx.w(arrayList, ((hi) it.next()).g);
        }
        List ak = ffdx.ak(ffdx.ar(arrayList));
        int size2 = ak.size();
        for (int i2 = 0; i2 < size2; i2++) {
            hd hdVar = (hd) ak.get(i2);
            ViewGroup viewGroup = this.a;
            if (!hdVar.g) {
                hdVar.c(viewGroup);
            }
            hdVar.g = true;
        }
    }

    public final void i() {
        for (hi hiVar : this.b) {
            if (hiVar.i == 2) {
                hiVar.g(hg.a(hiVar.a.N().getVisibility()), 1);
            }
        }
    }

    public final void j(int i, int i2, gc gcVar) {
        synchronized (this.b) {
            ea eaVar = gcVar.a;
            eaVar.getClass();
            hi b = b(eaVar);
            if (b == null) {
                ea eaVar2 = gcVar.a;
                if (eaVar2.t) {
                    eaVar2.getClass();
                    b = c(eaVar2);
                } else {
                    b = null;
                }
            }
            if (b != null) {
                b.g(i, i2);
                return;
            }
            final he heVar = new he(i, i2, gcVar);
            this.b.add(heVar);
            heVar.c(new Runnable() { // from class: ha
                @Override // java.lang.Runnable
                public final void run() {
                    hj hjVar = hj.this;
                    List list = hjVar.b;
                    he heVar2 = heVar;
                    if (list.contains(heVar2)) {
                        int i3 = heVar2.h;
                        View view = heVar2.a.Q;
                        view.getClass();
                        hh.b(i3, view, hjVar.a);
                    }
                }
            });
            heVar.c(new Runnable() { // from class: hb
                @Override // java.lang.Runnable
                public final void run() {
                    hj hjVar = hj.this;
                    List list = hjVar.b;
                    he heVar2 = heVar;
                    list.remove(heVar2);
                    hjVar.c.remove(heVar2);
                }
            });
        }
    }
}
