package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class de extends hd {
    public final List a;
    public final hi b;
    public final hi c;
    public final gp d;
    public final cmh e;
    public Object f;
    private final Object i;
    private final ArrayList j;
    private final ArrayList k;
    private final cmh l;
    private final ArrayList m;
    private final ArrayList n;
    private final cmh o;
    private final kqs p = new kqs();

    public de(List list, hi hiVar, hi hiVar2, gp gpVar, Object obj, ArrayList arrayList, ArrayList arrayList2, cmh cmhVar, ArrayList arrayList3, ArrayList arrayList4, cmh cmhVar2, cmh cmhVar3) {
        this.a = list;
        this.b = hiVar;
        this.c = hiVar2;
        this.d = gpVar;
        this.i = obj;
        this.j = arrayList;
        this.k = arrayList2;
        this.l = cmhVar;
        this.m = arrayList3;
        this.n = arrayList4;
        this.o = cmhVar2;
        this.e = cmhVar3;
    }

    private final ffcf g(ViewGroup viewGroup, hi hiVar, hi hiVar2) {
        final ArrayList arrayList;
        hi hiVar3 = hiVar;
        hi hiVar4 = hiVar2;
        View view = new View(viewGroup.getContext());
        final Rect rect = new Rect();
        Iterator it = this.a.iterator();
        Object obj = null;
        boolean z = false;
        View view2 = null;
        while (it.hasNext()) {
            if (((df) it.next()).c() && hiVar4 != null && hiVar3 != null && !this.l.isEmpty() && this.i != null) {
                gp gpVar = gh.a;
                kug.b(viewGroup, new Runnable() { // from class: ct
                    @Override // java.lang.Runnable
                    public final void run() {
                        gp gpVar2 = gh.a;
                    }
                });
                this.j.addAll(this.o.values());
                if (!this.n.isEmpty()) {
                    Object obj2 = this.n.get(0);
                    obj2.getClass();
                    view2 = (View) this.o.get((String) obj2);
                    this.d.i(this.i, view2);
                }
                this.k.addAll(this.e.values());
                if (!this.m.isEmpty()) {
                    Object obj3 = this.m.get(0);
                    obj3.getClass();
                    final View view3 = (View) this.e.get((String) obj3);
                    if (view3 != null) {
                        kug.b(viewGroup, new Runnable() { // from class: cu
                            @Override // java.lang.Runnable
                            public final void run() {
                                gp.y(view3, rect);
                            }
                        });
                        z = true;
                    }
                }
                this.d.j(this.i, view, this.j);
                gp gpVar2 = this.d;
                Object obj4 = this.i;
                gpVar2.p(obj4, null, null, obj4, this.k);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (df dfVar : this.a) {
            hi hiVar5 = dfVar.a;
            Object a = this.d.a(dfVar.b);
            if (a != null) {
                ArrayList arrayList3 = new ArrayList();
                boolean z2 = z;
                View view4 = hiVar5.a.Q;
                view4.getClass();
                h(arrayList3, view4);
                if (this.i != null && (hiVar5 == hiVar4 || hiVar5 == hiVar3)) {
                    if (hiVar5 == hiVar4) {
                        arrayList3.removeAll(ffdx.ar(this.j));
                    } else {
                        arrayList3.removeAll(ffdx.ar(this.k));
                    }
                }
                if (arrayList3.isEmpty()) {
                    this.d.c(a, view);
                    arrayList = arrayList3;
                } else {
                    this.d.d(a, arrayList3);
                    this.d.p(a, a, arrayList3, null, null);
                    arrayList = arrayList3;
                    if (hiVar5.h == 3) {
                        hiVar5.h();
                        ArrayList arrayList4 = new ArrayList(arrayList);
                        arrayList4.remove(hiVar5.a.Q);
                        this.d.g(a, hiVar5.a.Q, arrayList4);
                        kug.b(viewGroup, new Runnable() { // from class: cv
                            @Override // java.lang.Runnable
                            public final void run() {
                                gh.a(arrayList, 4);
                            }
                        });
                    }
                }
                if (hiVar5.h == 2) {
                    arrayList2.addAll(arrayList);
                    if (z2) {
                        this.d.h(a, rect);
                    }
                    if (fr.af(2)) {
                        Objects.toString(a);
                        Log.v("FragmentManager", "Entering Transition: ".concat(a.toString()));
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            Object obj5 = arrayList.get(i);
                            obj5.getClass();
                            View view5 = (View) obj5;
                            Objects.toString(view5);
                            Log.v("FragmentManager", "View: ".concat(view5.toString()));
                        }
                    }
                } else {
                    this.d.i(a, view2);
                    if (fr.af(2)) {
                        Objects.toString(a);
                        Log.v("FragmentManager", "Exiting Transition: ".concat(a.toString()));
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        int size2 = arrayList.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            Object obj6 = arrayList.get(i2);
                            obj6.getClass();
                            View view6 = (View) obj6;
                            Objects.toString(view6);
                            Log.v("FragmentManager", "View: ".concat(view6.toString()));
                        }
                    }
                }
                boolean z3 = dfVar.c;
                obj = this.d.o(obj, a);
                hiVar3 = hiVar;
                hiVar4 = hiVar2;
                z = z2;
            } else {
                hiVar3 = hiVar;
                hiVar4 = hiVar2;
            }
        }
        Object r = this.d.r(obj, this.i);
        if (fr.af(2)) {
            Objects.toString(r);
            Log.v("FragmentManager", "Final merged transition: ".concat(String.valueOf(r)));
        }
        return new ffcf(arrayList2, r);
    }

    private final void h(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = kvs.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                childAt.getClass();
                h(arrayList, childAt);
            }
        }
    }

    private final void i(ArrayList arrayList, ViewGroup viewGroup, ffix ffixVar) {
        gh.a(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.k;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            int[] iArr = kvo.a;
            arrayList2.add(kvd.f(view));
            kvd.l(view, null);
        }
        if (fr.af(2)) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            ArrayList arrayList4 = this.j;
            int size2 = arrayList4.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj = arrayList4.get(i2);
                obj.getClass();
                View view2 = (View) obj;
                StringBuilder sb = new StringBuilder("View: ");
                sb.append(view2);
                sb.append(" Name: ");
                int[] iArr2 = kvo.a;
                sb.append(kvd.f(view2));
                Log.v("FragmentManager", sb.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            ArrayList arrayList5 = this.k;
            int size3 = arrayList5.size();
            for (int i3 = 0; i3 < size3; i3++) {
                Object obj2 = arrayList5.get(i3);
                obj2.getClass();
                View view3 = (View) obj2;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view3);
                sb2.append(" Name: ");
                int[] iArr3 = kvo.a;
                sb2.append(kvd.f(view3));
                Log.v("FragmentManager", sb2.toString());
            }
        }
        ffixVar.invoke();
        ArrayList arrayList6 = this.j;
        ArrayList arrayList7 = this.k;
        cmh cmhVar = this.l;
        int size4 = arrayList7.size();
        ArrayList arrayList8 = new ArrayList();
        for (int i4 = 0; i4 < size4; i4++) {
            View view4 = (View) arrayList6.get(i4);
            int[] iArr4 = kvo.a;
            String f = kvd.f(view4);
            arrayList8.add(f);
            if (f != null) {
                kvd.l(view4, null);
                String str = (String) cmhVar.get(f);
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i5))) {
                        kvd.l((View) arrayList7.get(i5), f);
                        break;
                    }
                    i5++;
                }
            }
        }
        kug.b(viewGroup, new go(size4, arrayList7, arrayList2, arrayList6, arrayList8));
        gh.a(arrayList, 0);
        this.d.k(this.i, this.j, this.k);
    }

    @Override // defpackage.hd
    public final void a(ViewGroup viewGroup) {
        this.p.a();
    }

    @Override // defpackage.hd
    public final void b(ViewGroup viewGroup) {
        if (!viewGroup.isLaidOut()) {
            for (df dfVar : this.a) {
                hi hiVar = dfVar.a;
                if (fr.af(2)) {
                    Log.v("FragmentManager", a.j(hiVar, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Completing operation "));
                }
                dfVar.a.f(this);
            }
            return;
        }
        Object obj = this.f;
        if (obj != null) {
            this.d.t(obj);
            if (fr.af(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + this.b + " to " + this.c);
                return;
            }
            return;
        }
        ffcf g = g(viewGroup, this.c, this.b);
        Object obj2 = g.a;
        Object obj3 = g.b;
        List list = this.a;
        ArrayList arrayList = (ArrayList) obj2;
        ArrayList<hi> arrayList2 = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((df) it.next()).a);
        }
        for (final hi hiVar2 : arrayList2) {
            gp gpVar = this.d;
            ea eaVar = hiVar2.a;
            gpVar.q(obj3, this.p, new Runnable() { // from class: cw
                @Override // java.lang.Runnable
                public final void run() {
                    hi hiVar3 = hi.this;
                    if (fr.af(2)) {
                        Log.v("FragmentManager", a.i(hiVar3, "Transition for operation ", " has completed"));
                    }
                    hiVar3.f(this);
                }
            });
        }
        i(arrayList, viewGroup, new cz(this, viewGroup, obj3));
        if (fr.af(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + this.b + " to " + this.c);
        }
    }

    @Override // defpackage.hd
    public final void c(ViewGroup viewGroup) {
        if (!viewGroup.isLaidOut()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                hi hiVar = ((df) it.next()).a;
                if (fr.af(2)) {
                    Log.v("FragmentManager", a.j(hiVar, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Skipping onStart for operation "));
                }
            }
            return;
        }
        if (f() && this.i != null && !d()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + this.i + " between " + this.b + " and " + this.c + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (d() && f()) {
            final fflb fflbVar = new fflb();
            ffcf g = g(viewGroup, this.c, this.b);
            Object obj = g.a;
            Object obj2 = g.b;
            List list = this.a;
            ArrayList arrayList = (ArrayList) obj;
            ArrayList<hi> arrayList2 = new ArrayList(ffdx.n(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((df) it2.next()).a);
            }
            for (final hi hiVar2 : arrayList2) {
                Runnable runnable = new Runnable() { // from class: cx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ffix ffixVar = (ffix) fflb.this.a;
                        if (ffixVar != null) {
                            ffixVar.invoke();
                        }
                    }
                };
                gp gpVar = this.d;
                ea eaVar = hiVar2.a;
                gpVar.z(obj2, this.p, runnable, new Runnable() { // from class: cy
                    @Override // java.lang.Runnable
                    public final void run() {
                        hi hiVar3 = hi.this;
                        if (fr.af(2)) {
                            Log.v("FragmentManager", a.i(hiVar3, "Transition for operation ", " has completed"));
                        }
                        hiVar3.f(this);
                    }
                });
            }
            i(arrayList, viewGroup, new dd(this, viewGroup, obj2, fflbVar));
        }
    }

    @Override // defpackage.hd
    public final boolean d() {
        Object obj;
        if (!this.d.m()) {
            return false;
        }
        List<df> list = this.a;
        if (!list.isEmpty()) {
            for (df dfVar : list) {
                if (Build.VERSION.SDK_INT < 34 || (obj = dfVar.b) == null || !this.d.n(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.i;
        return obj2 == null || this.d.n(obj2);
    }

    @Override // defpackage.hd
    public final void e(aak aakVar) {
        Object obj = this.f;
        if (obj != null) {
            this.d.w(obj, aakVar.b);
        }
    }

    public final boolean f() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((df) it.next()).a.a.t) {
                return false;
            }
        }
        return true;
    }
}
