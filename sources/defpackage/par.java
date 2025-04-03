package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class par implements Cloneable {
    private static final Animator[] v = new Animator[0];
    private static final int[] w = {2, 1, 3, 4};
    private static final paa x = new pac();
    private static final ThreadLocal y = new ThreadLocal();
    private pak[] B;
    public ArrayList j;
    public ArrayList k;
    public pag q;
    long s;
    public pai t;
    long u;
    private final String z = getClass().getName();
    public long a = -1;
    public long b = -1;
    public TimeInterpolator c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    private ArrayList A = null;
    public pbc f = new pbc();
    public pbc g = new pbc();
    paz h = null;
    public final int[] i = w;
    final ArrayList l = new ArrayList();
    private Animator[] C = v;
    int m = 0;
    private boolean D = false;
    boolean n = false;
    public par o = null;
    private ArrayList E = null;
    public ArrayList p = new ArrayList();
    public paa r = x;

    private static boolean O(pbb pbbVar, pbb pbbVar2, String str) {
        Map map = pbbVar2.a;
        Object obj = pbbVar.a.get(str);
        Object obj2 = map.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private static void f(pbc pbcVar, View view, pbb pbbVar) {
        pbcVar.a.put(view, pbbVar);
        int id = view.getId();
        if (id >= 0) {
            if (pbcVar.b.indexOfKey(id) >= 0) {
                pbcVar.b.put(id, null);
            } else {
                pbcVar.b.put(id, view);
            }
        }
        int[] iArr = kvo.a;
        String f = kvd.f(view);
        if (f != null) {
            if (pbcVar.d.containsKey(f)) {
                pbcVar.d.put(f, null);
            } else {
                pbcVar.d.put(f, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (pbcVar.c.a(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    pbcVar.c.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) pbcVar.c.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    pbcVar.c.h(itemIdAtPosition, null);
                }
            }
        }
    }

    private final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.A.get(i)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            pbb pbbVar = new pbb(view);
            if (z) {
                c(pbbVar);
            } else {
                b(pbbVar);
            }
            pbbVar.c.add(this);
            o(pbbVar);
            if (z) {
                f(this.f, view, pbbVar);
            } else {
                f(this.g, view, pbbVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), z);
            }
        }
    }

    public static cmh h() {
        ThreadLocal threadLocal = y;
        cmh cmhVar = (cmh) threadLocal.get();
        if (cmhVar != null) {
            return cmhVar;
        }
        cmh cmhVar2 = new cmh();
        threadLocal.set(cmhVar2);
        return cmhVar2;
    }

    public void A(paa paaVar) {
        if (paaVar == null) {
            this.r = x;
        } else {
            this.r = paaVar;
        }
    }

    protected final void B() {
        if (this.m == 0) {
            t(this, paq.a, false);
            this.n = false;
        }
        this.m++;
    }

    public boolean C() {
        return !this.l.isEmpty();
    }

    public boolean D(pbb pbbVar, pbb pbbVar2) {
        if (pbbVar != null && pbbVar2 != null) {
            String[] e = e();
            if (e != null) {
                for (String str : e) {
                    if (O(pbbVar, pbbVar2, str)) {
                        return true;
                    }
                }
                return false;
            }
            Iterator it = pbbVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (O(pbbVar, pbbVar2, (String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean E(View view) {
        int id = view.getId();
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.A.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        return (this.d.size() == 0 && this.e.size() == 0) || this.d.contains(Integer.valueOf(id)) || this.e.contains(view);
    }

    public final void F(pak pakVar) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add(pakVar);
    }

    public void G(View view) {
        this.e.add(view);
    }

    public void H(Class cls) {
        ArrayList arrayList = this.A;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(cls)) {
            arrayList.add(cls);
        }
        this.A = arrayList;
    }

    public final void I(pak pakVar) {
        par parVar;
        ArrayList arrayList = this.E;
        if (arrayList == null) {
            return;
        }
        if (!arrayList.remove(pakVar) && (parVar = this.o) != null) {
            parVar.I(pakVar);
        }
        if (this.E.size() == 0) {
            this.E = null;
        }
    }

    public void J(View view) {
        this.e.remove(view);
    }

    public void K(long j) {
        this.b = j;
    }

    public void L(TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
    }

    public void N(long j) {
        this.a = j;
    }

    public Animator a(ViewGroup viewGroup, pbb pbbVar, pbb pbbVar2) {
        return null;
    }

    public abstract void b(pbb pbbVar);

    public abstract void c(pbb pbbVar);

    public boolean d() {
        return false;
    }

    public String[] e() {
        return null;
    }

    @Override // 
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public par clone() {
        try {
            par parVar = (par) super.clone();
            parVar.p = new ArrayList();
            parVar.f = new pbc();
            parVar.g = new pbc();
            parVar.j = null;
            parVar.k = null;
            parVar.t = null;
            parVar.o = this;
            parVar.E = null;
            return parVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final par j() {
        paz pazVar = this.h;
        return pazVar != null ? pazVar.j() : this;
    }

    final pbb k(View view, boolean z) {
        paz pazVar = this.h;
        if (pazVar != null) {
            return pazVar.k(view, z);
        }
        ArrayList arrayList = z ? this.j : this.k;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            pbb pbbVar = (pbb) arrayList.get(i);
            if (pbbVar == null) {
                return null;
            }
            if (pbbVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (pbb) (z ? this.k : this.j).get(i);
        }
        return null;
    }

    public final pbb l(View view, boolean z) {
        paz pazVar = this.h;
        if (pazVar != null) {
            return pazVar.l(view, z);
        }
        return (pbb) (z ? this.f : this.g).a.get(view);
    }

    public String m(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.b != -1) {
            sb.append("dur(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.a != -1) {
            sb.append("dly(");
            sb.append(this.a);
            sb.append(") ");
        }
        if (this.c != null) {
            sb.append("interp(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.d.size() > 0 || this.e.size() > 0) {
            sb.append("tgts(");
            if (this.d.size() > 0) {
                for (int i = 0; i < this.d.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.d.get(i));
                }
            }
            if (this.e.size() > 0) {
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.e.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    protected void n() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
        this.C = v;
        while (true) {
            size--;
            if (size < 0) {
                this.C = animatorArr;
                t(this, paq.c, false);
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            }
        }
    }

    final void p(ViewGroup viewGroup, boolean z) {
        boolean z2;
        q(z);
        if (this.d.size() <= 0 && this.e.size() <= 0) {
            g(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= this.d.size()) {
                break;
            }
            View findViewById = viewGroup.findViewById(((Integer) this.d.get(i)).intValue());
            if (findViewById != null) {
                pbb pbbVar = new pbb(findViewById);
                if (z) {
                    c(pbbVar);
                } else {
                    b(pbbVar);
                    z3 = false;
                }
                pbbVar.c.add(this);
                o(pbbVar);
                if (z3) {
                    f(this.f, findViewById, pbbVar);
                } else {
                    f(this.g, findViewById, pbbVar);
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            View view = (View) this.e.get(i2);
            pbb pbbVar2 = new pbb(view);
            if (z) {
                c(pbbVar2);
                z2 = true;
            } else {
                b(pbbVar2);
                z2 = false;
            }
            pbbVar2.c.add(this);
            o(pbbVar2);
            if (z2) {
                f(this.f, view, pbbVar2);
            } else {
                f(this.g, view, pbbVar2);
            }
        }
    }

    final void q(boolean z) {
        if (z) {
            this.f.a.clear();
            this.f.b.clear();
            this.f.c.g();
        } else {
            this.g.a.clear();
            this.g.b.clear();
            this.g.c.g();
        }
    }

    public void r(ViewGroup viewGroup, pbc pbcVar, pbc pbcVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animator;
        View view;
        pbb pbbVar;
        pbb pbbVar2;
        cmh h = h();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        pai paiVar = j().t;
        for (int i = 0; i < size; i++) {
            pbb pbbVar3 = (pbb) arrayList.get(i);
            pbb pbbVar4 = (pbb) arrayList2.get(i);
            if (pbbVar3 != null && !pbbVar3.c.contains(this)) {
                pbbVar3 = null;
            }
            if (pbbVar4 != null && !pbbVar4.c.contains(this)) {
                pbbVar4 = null;
            }
            if ((pbbVar3 != null || pbbVar4 != null) && (pbbVar3 == null || pbbVar4 == null || D(pbbVar3, pbbVar4))) {
                Animator a = a(viewGroup, pbbVar3, pbbVar4);
                if (a != null) {
                    if (pbbVar4 != null) {
                        view = pbbVar4.b;
                        String[] e = e();
                        if (e != null) {
                            pbb pbbVar5 = new pbb(view);
                            pbb pbbVar6 = (pbb) pbcVar2.a.get(view);
                            animator = a;
                            if (pbbVar6 != null) {
                                int i2 = 0;
                                while (i2 < e.length) {
                                    Map map = pbbVar5.a;
                                    String[] strArr = e;
                                    String str = strArr[i2];
                                    map.put(str, pbbVar6.a.get(str));
                                    i2++;
                                    e = strArr;
                                }
                            }
                            int i3 = h.d;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    pbbVar2 = pbbVar5;
                                    break;
                                }
                                paf pafVar = (paf) h.get((Animator) h.d(i4));
                                if (pafVar.c != null && pafVar.a == view && pafVar.b.equals(this.z) && pafVar.c.equals(pbbVar5)) {
                                    pbbVar2 = pbbVar5;
                                    animator = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            animator = a;
                            pbbVar2 = null;
                        }
                        pbbVar = pbbVar2;
                    } else {
                        animator = a;
                        view = pbbVar3.b;
                        pbbVar = null;
                    }
                    View view2 = view;
                    Animator animator2 = animator;
                    if (animator2 != null) {
                        paf pafVar2 = new paf(view2, this.z, this, viewGroup.getWindowId(), pbbVar, animator2);
                        if (paiVar != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator2);
                            animator2 = animatorSet;
                        }
                        h.put(animator2, pafVar2);
                        this.p.add(animator2);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                paf pafVar3 = (paf) h.get((Animator) this.p.get(sparseIntArray.keyAt(i5)));
                pafVar3.f.setStartDelay((sparseIntArray.valueAt(i5) - Long.MAX_VALUE) + pafVar3.f.getStartDelay());
            }
        }
    }

    protected final void s() {
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            t(this, paq.b, false);
            for (int i2 = 0; i2 < this.f.c.b(); i2++) {
                View view = (View) this.f.c.e(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.g.c.b(); i3++) {
                View view2 = (View) this.g.c.e(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.n = true;
        }
    }

    public final void t(par parVar, paq paqVar, boolean z) {
        par parVar2 = this.o;
        if (parVar2 != null) {
            parVar2.t(parVar, paqVar, z);
        }
        ArrayList arrayList = this.E;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.E.size();
        pak[] pakVarArr = this.B;
        if (pakVarArr == null) {
            pakVarArr = new pak[size];
        }
        this.B = null;
        pak[] pakVarArr2 = (pak[]) this.E.toArray(pakVarArr);
        for (int i = 0; i < size; i++) {
            paqVar.a(pakVarArr2[i], parVar);
            pakVarArr2[i] = null;
        }
        this.B = pakVarArr2;
    }

    public final String toString() {
        return m("");
    }

    public void u(View view) {
        if (this.n) {
            return;
        }
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
        this.C = v;
        while (true) {
            size--;
            if (size < 0) {
                this.C = animatorArr;
                t(this, paq.d, false);
                this.D = true;
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    public void v() {
        long totalDuration;
        cmh h = h();
        this.s = 0L;
        for (int i = 0; i < this.p.size(); i++) {
            Animator animator = (Animator) this.p.get(i);
            paf pafVar = (paf) h.get(animator);
            if (animator != null && pafVar != null) {
                long j = this.b;
                if (j >= 0) {
                    pafVar.f.setDuration(j);
                }
                long j2 = this.a;
                if (j2 >= 0) {
                    Animator animator2 = pafVar.f;
                    animator2.setStartDelay(j2 + animator2.getStartDelay());
                }
                TimeInterpolator timeInterpolator = this.c;
                if (timeInterpolator != null) {
                    pafVar.f.setInterpolator(timeInterpolator);
                }
                this.l.add(animator);
                long j3 = this.s;
                totalDuration = animator.getTotalDuration();
                this.s = Math.max(j3, totalDuration);
            }
        }
        this.p.clear();
    }

    public void w(View view) {
        if (this.D) {
            if (!this.n) {
                ArrayList arrayList = this.l;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
                this.C = v;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.C = animatorArr;
                t(this, paq.e, false);
            }
            this.D = false;
        }
    }

    protected void x() {
        B();
        cmh h = h();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (h.containsKey(animator)) {
                B();
                if (animator != null) {
                    animator.addListener(new pad(this, h));
                    long j = this.b;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.a;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.c;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new pae(this));
                    animator.start();
                }
            }
        }
        this.p.clear();
        s();
    }

    public void y(long j, long j2) {
        long totalDuration;
        long j3 = this.s;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.n = false;
            t(this, paq.a, z);
        }
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
        this.C = v;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            totalDuration = animator.getTotalDuration();
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), totalDuration));
        }
        this.C = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.n = true;
        }
        t(this, paq.b, z);
    }

    public void z(pag pagVar) {
        this.q = pagVar;
    }

    public void M() {
    }

    public void o(pbb pbbVar) {
    }
}
