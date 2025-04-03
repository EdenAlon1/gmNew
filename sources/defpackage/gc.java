package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gc {
    public final ea a;
    private final er c;
    private final ge d;
    private boolean e = false;
    public int b = -1;

    public gc(er erVar, ge geVar, ea eaVar) {
        this.c = erVar;
        this.d = geVar;
        this.a = eaVar;
    }

    final Bundle a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ea eaVar = this.a;
        if (eaVar.g == -1 && (bundle = eaVar.h) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new ga(this.a));
        if (this.a.g >= 0) {
            Bundle bundle3 = new Bundle();
            this.a.k(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.c.j(this.a, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.a.ad.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle c = this.a.D.c();
            if (!c.isEmpty()) {
                bundle2.putBundle("childFragmentManager", c);
            }
            if (this.a.Q != null) {
                g();
            }
            SparseArray<? extends Parcelable> sparseArray = this.a.i;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.a.j;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.a.m;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    final void b() {
        View view;
        View view2;
        ea i = fr.i(this.a.P);
        ea eaVar = this.a.E;
        if (i != null && !i.equals(eaVar)) {
            ea eaVar2 = this.a;
            int i2 = eaVar2.G;
            int i3 = lin.a;
            eaVar2.getClass();
            liz lizVar = new liz(eaVar2, i, i2);
            lin.d(lizVar);
            lim b = lin.b(eaVar2);
            if (b.b.contains(lil.DETECT_WRONG_NESTED_HIERARCHY) && lin.e(b, eaVar2.getClass(), lizVar.getClass())) {
                lin.c(b, lizVar);
            }
        }
        ge geVar = this.d;
        ea eaVar3 = this.a;
        ViewGroup viewGroup = eaVar3.P;
        int i4 = -1;
        if (viewGroup != null) {
            int indexOf = geVar.a.indexOf(eaVar3);
            int i5 = indexOf - 1;
            while (true) {
                if (i5 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= geVar.a.size()) {
                            break;
                        }
                        ea eaVar4 = (ea) geVar.a.get(indexOf);
                        if (eaVar4.P == viewGroup && (view = eaVar4.Q) != null) {
                            i4 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ea eaVar5 = (ea) geVar.a.get(i5);
                    if (eaVar5.P == viewGroup && (view2 = eaVar5.Q) != null) {
                        i4 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i5--;
                }
            }
        }
        ea eaVar6 = this.a;
        eaVar6.P.addView(eaVar6.Q, i4);
    }

    final void c() {
        String str;
        if (this.a.v) {
            return;
        }
        if (fr.af(3)) {
            ea eaVar = this.a;
            Objects.toString(eaVar);
            Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(eaVar)));
        }
        Bundle bundle = this.a.h;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        ea eaVar2 = this.a;
        LayoutInflater L = eaVar2.L(bundle2);
        ViewGroup viewGroup2 = eaVar2.P;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = eaVar2.G;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.a + " for a container view with no id");
                }
                viewGroup = (ViewGroup) eaVar2.B.p.a(i);
                if (viewGroup == null) {
                    ea eaVar3 = this.a;
                    if (!eaVar3.y && !eaVar3.x) {
                        try {
                            str = eaVar3.B().getResourceName(this.a.G);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.a.G) + " (" + str + ") for fragment " + this.a);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    ea eaVar4 = this.a;
                    int i2 = lin.a;
                    eaVar4.getClass();
                    liy liyVar = new liy(eaVar4, viewGroup);
                    lin.d(liyVar);
                    lim b = lin.b(eaVar4);
                    if (b.b.contains(lil.DETECT_WRONG_FRAGMENT_CONTAINER) && lin.e(b, eaVar4.getClass(), liyVar.getClass())) {
                        lin.c(b, liyVar);
                    }
                }
            }
        }
        ea eaVar5 = this.a;
        eaVar5.P = viewGroup;
        eaVar5.o(L, viewGroup, bundle2);
        if (this.a.Q != null) {
            if (fr.af(3)) {
                ea eaVar6 = this.a;
                Objects.toString(eaVar6);
                Log.d("FragmentManager", "moveto VIEW_CREATED: ".concat(String.valueOf(eaVar6)));
            }
            this.a.Q.setSaveFromParentEnabled(false);
            ea eaVar7 = this.a;
            eaVar7.Q.setTag(R.id.fragment_container_view_tag, eaVar7);
            if (viewGroup != null) {
                b();
            }
            ea eaVar8 = this.a;
            if (eaVar8.I) {
                eaVar8.Q.setVisibility(8);
            }
            if (this.a.Q.isAttachedToWindow()) {
                View view = this.a.Q;
                int[] iArr = kvo.a;
                kvb.c(view);
            } else {
                View view2 = this.a.Q;
                view2.addOnAttachStateChangeListener(new gb(view2));
            }
            this.a.aq();
            er erVar = this.c;
            ea eaVar9 = this.a;
            erVar.m(eaVar9, eaVar9.Q, bundle2, false);
            int visibility = this.a.Q.getVisibility();
            this.a.D().n = this.a.Q.getAlpha();
            ea eaVar10 = this.a;
            if (eaVar10.P != null && visibility == 0) {
                View findFocus = eaVar10.Q.findFocus();
                if (findFocus != null) {
                    this.a.au(findFocus);
                    if (fr.af(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.a);
                    }
                }
                this.a.Q.setAlpha(0.0f);
            }
        }
        this.a.g = 2;
    }

    final void d() {
        ea eaVar = this.a;
        if (eaVar.v && eaVar.w && !eaVar.z) {
            if (fr.af(3)) {
                ea eaVar2 = this.a;
                Objects.toString(eaVar2);
                Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(eaVar2)));
            }
            Bundle bundle = this.a.h;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            ea eaVar3 = this.a;
            eaVar3.o(eaVar3.L(bundle2), null, bundle2);
            View view = this.a.Q;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                ea eaVar4 = this.a;
                eaVar4.Q.setTag(R.id.fragment_container_view_tag, eaVar4);
                ea eaVar5 = this.a;
                if (eaVar5.I) {
                    eaVar5.Q.setVisibility(8);
                }
                this.a.aq();
                er erVar = this.c;
                ea eaVar6 = this.a;
                erVar.m(eaVar6, eaVar6.Q, bundle2, false);
                this.a.g = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0465, code lost:
    
        r14.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04ed, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x04ed, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void e() {
        /*
            Method dump skipped, instructions count: 2372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc.e():void");
    }

    final void f(ClassLoader classLoader) {
        Bundle bundle = this.a.h;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.a.h.getBundle("savedInstanceState") == null) {
            this.a.h.putBundle("savedInstanceState", new Bundle());
        }
        try {
            ea eaVar = this.a;
            eaVar.i = eaVar.h.getSparseParcelableArray("viewState");
            ea eaVar2 = this.a;
            eaVar2.j = eaVar2.h.getBundle("viewRegistryState");
            ga gaVar = (ga) this.a.h.getParcelable("state");
            if (gaVar != null) {
                ea eaVar3 = this.a;
                eaVar3.o = gaVar.m;
                eaVar3.p = gaVar.n;
                Boolean bool = eaVar3.k;
                if (bool != null) {
                    eaVar3.S = bool.booleanValue();
                    this.a.k = null;
                } else {
                    eaVar3.S = gaVar.o;
                }
            }
            ea eaVar4 = this.a;
            if (eaVar4.S) {
                return;
            }
            eaVar4.R = true;
        } catch (BadParcelableException e) {
            ea eaVar5 = this.a;
            Objects.toString(eaVar5);
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(eaVar5)), e);
        }
    }

    final void g() {
        if (this.a.Q == null) {
            return;
        }
        if (fr.af(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.a + " with view " + this.a.Q);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.a.Q.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.a.i = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.a.aa.b.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.a.j = bundle;
    }

    public gc(er erVar, ge geVar, ea eaVar, Bundle bundle) {
        this.c = erVar;
        this.d = geVar;
        this.a = eaVar;
        eaVar.i = null;
        eaVar.j = null;
        eaVar.A = 0;
        eaVar.w = false;
        eaVar.r = false;
        ea eaVar2 = eaVar.n;
        eaVar.o = eaVar2 != null ? eaVar2.l : null;
        eaVar.n = null;
        eaVar.h = bundle;
        eaVar.m = bundle.getBundle("arguments");
    }

    public gc(er erVar, ge geVar, ClassLoader classLoader, em emVar, Bundle bundle) {
        this.c = erVar;
        this.d = geVar;
        ea a = ((ga) bundle.getParcelable("state")).a(emVar);
        this.a = a;
        a.h = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a.at(bundle2);
        if (fr.af(2)) {
            Objects.toString(a);
            Log.v("FragmentManager", "Instantiated fragment ".concat(String.valueOf(a)));
        }
    }
}
