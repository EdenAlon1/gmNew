package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pdq extends vk implements pds {
    final lkk a;
    final fr d;
    final cno e;
    public final pdj f;
    boolean g;
    private final cno h;
    private final cno i;
    private pdn j;
    private boolean k;

    public pdq(eg egVar) {
        fr a = egVar.a();
        lkk P = egVar.P();
        this.e = new cno();
        this.h = new cno();
        this.i = new cno();
        this.f = new pdj();
        this.g = false;
        this.k = false;
        this.d = a;
        this.a = P;
        super.B(true);
    }

    public static final void K(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public static final boolean L(long j) {
        return j >= 0 && j < 2;
    }

    private static long M(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private final Long N(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.i.b(); i2++) {
            if (((Integer) this.i.e(i2)).intValue() == i) {
                if (l != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l = Long.valueOf(this.i.c(i2));
            }
        }
        return l;
    }

    private static String O(String str, long j) {
        return str + j;
    }

    private final void P(long j) {
        ViewParent parent;
        ea eaVar = (ea) this.e.d(j);
        if (eaVar == null) {
            return;
        }
        View view = eaVar.Q;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!L(j)) {
            this.h.i(j);
        }
        if (!eaVar.aF()) {
            this.e.i(j);
            return;
        }
        if (J()) {
            this.k = true;
            return;
        }
        if (eaVar.aF() && L(j)) {
            pdj pdjVar = this.f;
            ArrayList arrayList = new ArrayList();
            Iterator it = pdjVar.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((pdp) it.next()).d());
            }
            dz d = this.d.d(eaVar);
            pdj.a(arrayList);
            this.h.h(j, d);
        }
        pdj pdjVar2 = this.f;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = pdjVar2.a.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((pdp) it2.next()).c());
        }
        try {
            cg cgVar = new cg(this.d);
            cgVar.n(eaVar);
            cgVar.c();
            this.e.i(j);
        } finally {
            pdj.a(arrayList2);
        }
    }

    private final void Q(ea eaVar, FrameLayout frameLayout) {
        this.d.l.a.add(new eq(new pdf(eaVar, frameLayout)));
    }

    private static boolean R(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    public abstract ea F(int i);

    final void G() {
        ea eaVar;
        View view;
        if (!this.k || J()) {
            return;
        }
        cmj cmjVar = new cmj();
        for (int i = 0; i < this.e.b(); i++) {
            long c = this.e.c(i);
            if (!L(c)) {
                cmjVar.add(Long.valueOf(c));
                this.i.i(c);
            }
        }
        if (!this.g) {
            this.k = false;
            for (int i2 = 0; i2 < this.e.b(); i2++) {
                cno cnoVar = this.e;
                cno cnoVar2 = this.i;
                long c2 = cnoVar.c(i2);
                if (!cnoVar2.j(c2) && ((eaVar = (ea) this.e.d(c2)) == null || (view = eaVar.Q) == null || view.getParent() == null)) {
                    cmjVar.add(Long.valueOf(c2));
                }
            }
        }
        cmi cmiVar = new cmi(cmjVar);
        while (cmiVar.hasNext()) {
            P(((Long) cmiVar.next()).longValue());
        }
    }

    final void H(pdr pdrVar) {
        ea eaVar = (ea) this.e.d(pdrVar.e);
        if (eaVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout C = pdrVar.C();
        View view = eaVar.Q;
        if (!eaVar.aF() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (eaVar.aF() && view == null) {
            Q(eaVar, C);
            return;
        }
        if (eaVar.aF() && view.getParent() != null) {
            if (view.getParent() != C) {
                K(view, C);
                return;
            }
            return;
        }
        if (eaVar.aF()) {
            K(view, C);
            return;
        }
        if (J()) {
            if (this.d.x) {
                return;
            }
            this.a.c(new pde(this, pdrVar));
            return;
        }
        Q(eaVar, C);
        pdj pdjVar = this.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = pdjVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((pdp) it.next()).b());
        }
        try {
            eaVar.ax(false);
            cg cgVar = new cg(this.d);
            cgVar.u(eaVar, "f" + pdrVar.e);
            cgVar.o(eaVar, lkj.STARTED);
            cgVar.c();
            this.j.a(false);
        } finally {
            pdj.a(arrayList);
        }
    }

    @Override // defpackage.pds
    public final void I(Parcelable parcelable) {
        if (!this.h.k() || !this.e.k()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (R(str, "f#")) {
                this.e.h(M(str, "f#"), this.d.j(bundle, str));
            } else {
                if (!R(str, "s#")) {
                    throw new IllegalArgumentException("Unexpected key in savedState: ".concat(String.valueOf(str)));
                }
                long M = M(str, "s#");
                dz dzVar = (dz) bundle.getParcelable(str);
                if (L(M)) {
                    this.h.h(M, dzVar);
                }
            }
        }
        if (this.e.k()) {
            return;
        }
        this.k = true;
        this.g = true;
        G();
        Handler handler = new Handler(Looper.getMainLooper());
        pdg pdgVar = new pdg(this);
        this.a.c(new pdh(handler, pdgVar));
        handler.postDelayed(pdgVar, 10000L);
    }

    final boolean J() {
        return this.d.ai();
    }

    @Override // defpackage.vk
    public final /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        int i2 = pdr.s;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new pdr(frameLayout);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        pdr pdrVar = (pdr) wrVar;
        long j = pdrVar.e;
        int id = pdrVar.C().getId();
        Long N = N(id);
        if (N != null && N.longValue() != j) {
            P(N.longValue());
            this.i.i(N.longValue());
        }
        this.i.h(j, Integer.valueOf(id));
        long j2 = i;
        if (!this.e.j(j2)) {
            ea F = F(i);
            F.aw((dz) this.h.d(j2));
            this.e.h(j2, F);
        }
        if (pdrVar.C().isAttachedToWindow()) {
            H(pdrVar);
        }
        G();
    }

    @Override // defpackage.vk
    public final void h(RecyclerView recyclerView) {
        pdn pdnVar = this.j;
        ViewPager2 b = pdn.b(recyclerView);
        b.a.a.remove(pdnVar.a);
        pdnVar.e.C(pdnVar.b);
        pdnVar.e.a.d(pdnVar.c);
        pdnVar.d = null;
        this.j = null;
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return i;
    }

    @Override // defpackage.vk
    public final void hc(RecyclerView recyclerView) {
        ksw.a(this.j == null);
        pdn pdnVar = new pdn(this);
        this.j = pdnVar;
        pdnVar.d = pdn.b(recyclerView);
        pdnVar.a = new pdk(pdnVar);
        pdnVar.d.d(pdnVar.a);
        pdnVar.b = new pdl(pdnVar);
        pdnVar.e.A(pdnVar.b);
        pdnVar.c = new pdm(pdnVar);
        pdnVar.e.a.c(pdnVar.c);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void i(wr wrVar) {
        H((pdr) wrVar);
        G();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void k(wr wrVar) {
        Long N = N(((pdr) wrVar).C().getId());
        if (N != null) {
            P(N.longValue());
            this.i.i(N.longValue());
        }
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ boolean l(wr wrVar) {
        return true;
    }

    @Override // defpackage.pds
    public final Parcelable m() {
        Bundle bundle = new Bundle(this.e.b() + this.h.b());
        for (int i = 0; i < this.e.b(); i++) {
            cno cnoVar = this.e;
            long c = cnoVar.c(i);
            ea eaVar = (ea) cnoVar.d(c);
            if (eaVar != null && eaVar.aF()) {
                this.d.T(bundle, O("f#", c), eaVar);
            }
        }
        for (int i2 = 0; i2 < this.h.b(); i2++) {
            long c2 = this.h.c(i2);
            if (L(c2)) {
                bundle.putParcelable(O("s#", c2), (Parcelable) this.h.d(c2));
            }
        }
        return bundle;
    }
}
