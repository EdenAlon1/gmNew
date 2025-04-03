package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MenuInflater;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ehku extends FrameLayout {
    public final ehki a;
    public final ehkm b;
    public final ehkp c;
    public obu d;
    private MenuInflater e;

    public ehku(Context context, AttributeSet attributeSet, int i, int i2) {
        super(ehua.a(context, attributeSet, i, i2), attributeSet, i);
        ehkp ehkpVar = new ehkp();
        this.c = ehkpVar;
        Context context2 = getContext();
        yt b = ehiz.b(context2, attributeSet, ehkv.b, i, i2, 17, 15);
        ehki ehkiVar = new ehki(context2, getClass());
        this.a = ehkiVar;
        ehkm a = a(context2);
        this.b = a;
        a.setMinimumHeight(getSuggestedMinimumHeight());
        a.K = 6;
        ehkpVar.a = a;
        ehkpVar.c = 1;
        a.F = ehkpVar;
        ehkiVar.g(ehkpVar);
        ehkpVar.c(getContext(), ehkiVar);
        if (b.q(11)) {
            a.g(b.g(11));
        } else {
            a.g(a.i());
        }
        int b2 = b.b(10, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size));
        a.h = b2;
        ehkk[] ehkkVarArr = a.e;
        if (ehkkVarArr != null) {
            for (ehkk ehkkVar : ehkkVarArr) {
                if (ehkkVar instanceof ehkh) {
                    ((ehkh) ehkkVar).u(b2);
                }
            }
        }
        if (b.q(17)) {
            int f = b.f(17, 0);
            ehkm ehkmVar = this.b;
            ehkmVar.j = f;
            ehkk[] ehkkVarArr2 = ehkmVar.e;
            if (ehkkVarArr2 != null) {
                for (ehkk ehkkVar2 : ehkkVarArr2) {
                    if (ehkkVar2 instanceof ehkh) {
                        ((ehkh) ehkkVar2).J(f);
                    }
                }
            }
        }
        if (b.q(15)) {
            int f2 = b.f(15, 0);
            ehkm ehkmVar2 = this.b;
            ehkmVar2.k = f2;
            ehkk[] ehkkVarArr3 = ehkmVar2.e;
            if (ehkkVarArr3 != null) {
                for (ehkk ehkkVar3 : ehkkVarArr3) {
                    if (ehkkVar3 instanceof ehkh) {
                        ((ehkh) ehkkVar3).H(f2);
                    }
                }
            }
        }
        if (b.q(4)) {
            int f3 = b.f(4, 0);
            ehkm ehkmVar3 = this.b;
            ehkmVar3.l = f3;
            ehkk[] ehkkVarArr4 = ehkmVar3.e;
            if (ehkkVarArr4 != null) {
                for (ehkk ehkkVar4 : ehkkVarArr4) {
                    if (ehkkVar4 instanceof ehkh) {
                        ((ehkh) ehkkVar4).s(f3);
                    }
                }
            }
        }
        if (b.q(3)) {
            int f4 = b.f(3, 0);
            ehkm ehkmVar4 = this.b;
            ehkmVar4.m = f4;
            ehkk[] ehkkVarArr5 = ehkmVar4.e;
            if (ehkkVarArr5 != null) {
                for (ehkk ehkkVar5 : ehkkVarArr5) {
                    if (ehkkVar5 instanceof ehkh) {
                        ((ehkh) ehkkVar5).r(f4);
                    }
                }
            }
        }
        boolean p = b.p(16, true);
        ehkm ehkmVar5 = this.b;
        ehkmVar5.n = p;
        ehkk[] ehkkVarArr6 = ehkmVar5.e;
        if (ehkkVarArr6 != null) {
            for (ehkk ehkkVar6 : ehkkVarArr6) {
                if (ehkkVar6 instanceof ehkh) {
                    ((ehkh) ehkkVar6).I(p);
                }
            }
        }
        if (b.q(18)) {
            ColorStateList g = b.g(18);
            ehkm ehkmVar6 = this.b;
            ehkmVar6.i = g;
            ehkk[] ehkkVarArr7 = ehkmVar6.e;
            if (ehkkVarArr7 != null) {
                for (ehkk ehkkVar7 : ehkkVarArr7) {
                    if (ehkkVar7 instanceof ehkh) {
                        ((ehkh) ehkkVar7).K(g);
                    }
                }
            }
        }
        Drawable background = getBackground();
        ColorStateList a2 = ehfy.a(background);
        if (background == null || a2 != null) {
            ehop ehopVar = new ehop(new ehow(ehow.h(context2, attributeSet, i, i2)));
            if (a2 != null) {
                ehopVar.O(a2);
            }
            ehopVar.K(context2);
            setBackground(ehopVar);
        }
        if (b.q(13)) {
            int b3 = b.b(13, 0);
            ehkm ehkmVar7 = this.b;
            ehkmVar7.r = b3;
            ehkk[] ehkkVarArr8 = ehkmVar7.e;
            if (ehkkVarArr8 != null) {
                for (ehkk ehkkVar8 : ehkkVarArr8) {
                    if (ehkkVar8 instanceof ehkh) {
                        ((ehkh) ehkkVar8).A(b3);
                    }
                }
            }
        }
        if (b.q(12)) {
            int b4 = b.b(12, 0);
            ehkm ehkmVar8 = this.b;
            ehkmVar8.s = b4;
            ehkk[] ehkkVarArr9 = ehkmVar8.e;
            if (ehkkVarArr9 != null) {
                for (ehkk ehkkVar9 : ehkkVarArr9) {
                    if (ehkkVar9 instanceof ehkh) {
                        ((ehkh) ehkkVar9).z(ehkmVar8.s);
                    }
                }
            }
        }
        if (b.q(0)) {
            int b5 = b.b(0, 0);
            ehkm ehkmVar9 = this.b;
            ehkmVar9.t = b5;
            ehkk[] ehkkVarArr10 = ehkmVar9.e;
            if (ehkkVarArr10 != null) {
                for (ehkk ehkkVar10 : ehkkVarArr10) {
                    if (ehkkVar10 instanceof ehkh) {
                        ((ehkh) ehkkVar10).l(b5);
                    }
                }
            }
        }
        if (b.q(5)) {
            int b6 = b.b(5, 0);
            ehkm ehkmVar10 = this.b;
            ehkmVar10.u = b6;
            ehkk[] ehkkVarArr11 = ehkmVar10.e;
            if (ehkkVarArr11 != null) {
                for (ehkk ehkkVar11 : ehkkVarArr11) {
                    if (ehkkVar11 instanceof ehkh) {
                        ((ehkh) ehkkVar11).t(b6);
                    }
                }
            }
        }
        if (b.q(2)) {
            setElevation(b.b(2, 0));
        }
        getBackground().mutate().setTintList(ehmq.d(context2, b, 1));
        int d = b.d(21, -1);
        ehkm ehkmVar11 = this.b;
        if (ehkmVar11.c != d) {
            ehkmVar11.c = d;
            this.c.f(false);
        }
        int d2 = b.d(9, 0);
        ehkm ehkmVar12 = this.b;
        if (ehkmVar12.d != d2) {
            ehkmVar12.d = d2;
            ehkk[] ehkkVarArr12 = ehkmVar12.e;
            if (ehkkVarArr12 != null) {
                for (ehkk ehkkVar12 : ehkkVarArr12) {
                    if (ehkkVar12 instanceof ehkh) {
                        ((ehkh) ehkkVar12).y(d2);
                    }
                }
            }
            this.c.f(false);
        }
        int d3 = b.d(8, 49);
        ehkm ehkmVar13 = this.b;
        if (ehkmVar13.C != d3) {
            ehkmVar13.C = d3;
            ehkk[] ehkkVarArr13 = ehkmVar13.e;
            if (ehkkVarArr13 != null) {
                for (ehkk ehkkVar13 : ehkkVarArr13) {
                    if (ehkkVar13 instanceof ehkh) {
                        ((ehkh) ehkkVar13).x(d3);
                    }
                }
            }
            this.c.f(false);
        }
        int f5 = b.f(7, 0);
        if (f5 != 0) {
            ehkm ehkmVar14 = this.b;
            ehkmVar14.p = f5;
            ehkk[] ehkkVarArr14 = ehkmVar14.e;
            if (ehkkVarArr14 != null) {
                for (ehkk ehkkVar14 : ehkkVarArr14) {
                    if (ehkkVar14 instanceof ehkh) {
                        ((ehkh) ehkkVar14).w(f5);
                    }
                }
            }
        } else {
            ColorStateList d4 = ehmq.d(context2, b, 14);
            ehkm ehkmVar15 = this.b;
            ehkmVar15.o = d4;
            ehkk[] ehkkVarArr15 = ehkmVar15.e;
            if (ehkkVarArr15 != null) {
                for (ehkk ehkkVar15 : ehkkVarArr15) {
                    if (ehkkVar15 instanceof ehkh) {
                        ((ehkh) ehkkVar15).B(d4);
                    }
                }
            }
        }
        boolean p2 = b.p(22, true);
        ehkm ehkmVar16 = this.b;
        ehkmVar16.H = p2;
        ehkk[] ehkkVarArr16 = ehkmVar16.e;
        if (ehkkVarArr16 != null) {
            for (ehkk ehkkVar16 : ehkkVarArr16) {
                if (ehkkVar16 instanceof ehkh) {
                    ((ehkh) ehkkVar16).F(p2);
                }
            }
        }
        boolean p3 = b.p(19, false);
        ehkm ehkmVar17 = this.b;
        ehkmVar17.I = p3;
        ehkk[] ehkkVarArr17 = ehkmVar17.e;
        if (ehkkVarArr17 != null) {
            for (ehkk ehkkVar17 : ehkkVarArr17) {
                if (ehkkVar17 instanceof ehkh) {
                    ((ehkh) ehkkVar17).C(p3);
                }
            }
        }
        int d5 = b.d(20, 1);
        ehkm ehkmVar18 = this.b;
        ehkmVar18.J = d5;
        ehkk[] ehkkVarArr18 = ehkmVar18.e;
        if (ehkkVarArr18 != null) {
            for (ehkk ehkkVar18 : ehkkVarArr18) {
                if (ehkkVar18 instanceof ehkh) {
                    ((ehkh) ehkkVar18).D(d5);
                }
            }
        }
        int f6 = b.f(6, 0);
        if (f6 != 0) {
            ehkm ehkmVar19 = this.b;
            ehkmVar19.v = true;
            ehkk[] ehkkVarArr19 = ehkmVar19.e;
            if (ehkkVarArr19 != null) {
                for (ehkk ehkkVar19 : ehkkVarArr19) {
                    if (ehkkVar19 instanceof ehkh) {
                        ((ehkh) ehkkVar19).g(true);
                    }
                }
            }
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(f6, ehkv.a);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            ehkm ehkmVar20 = this.b;
            ehkmVar20.w = dimensionPixelSize;
            ehkk[] ehkkVarArr20 = ehkmVar20.e;
            if (ehkkVarArr20 != null) {
                for (ehkk ehkkVar20 : ehkkVarArr20) {
                    if (ehkkVar20 instanceof ehkh) {
                        ((ehkh) ehkkVar20).o(dimensionPixelSize);
                    }
                }
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            ehkm ehkmVar21 = this.b;
            ehkmVar21.x = dimensionPixelSize2;
            ehkk[] ehkkVarArr21 = ehkmVar21.e;
            if (ehkkVarArr21 != null) {
                for (ehkk ehkkVar21 : ehkkVarArr21) {
                    if (ehkkVar21 instanceof ehkh) {
                        ((ehkh) ehkkVar21).k(dimensionPixelSize2);
                    }
                }
            }
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(10, 0);
            ehkm ehkmVar22 = this.b;
            ehkmVar22.A = dimensionPixelOffset;
            ehkk[] ehkkVarArr22 = ehkmVar22.e;
            if (ehkkVarArr22 != null) {
                for (ehkk ehkkVar22 : ehkkVarArr22) {
                    if (ehkkVar22 instanceof ehkh) {
                        ((ehkh) ehkkVar22).m(dimensionPixelOffset);
                    }
                }
            }
            String string = obtainStyledAttributes.getString(9);
            int i3 = -2;
            if (string != null) {
                if ("-1".equals(string)) {
                    i3 = -1;
                } else if (!"-2".equals(string)) {
                    i3 = obtainStyledAttributes.getDimensionPixelSize(9, -2);
                }
            }
            ehkm ehkmVar23 = this.b;
            ehkmVar23.y = i3;
            ehkk[] ehkkVarArr23 = ehkmVar23.e;
            if (ehkkVarArr23 != null) {
                for (ehkk ehkkVar23 : ehkkVarArr23) {
                    if (ehkkVar23 instanceof ehkh) {
                        ((ehkh) ehkkVar23).j(i3);
                    }
                }
            }
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize);
            ehkm ehkmVar24 = this.b;
            ehkmVar24.z = dimensionPixelSize3;
            ehkk[] ehkkVarArr24 = ehkmVar24.e;
            if (ehkkVarArr24 != null) {
                for (ehkk ehkkVar24 : ehkkVarArr24) {
                    if (ehkkVar24 instanceof ehkh) {
                        ((ehkh) ehkkVar24).h(dimensionPixelSize3);
                    }
                }
            }
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset);
            ehkm ehkmVar25 = this.b;
            ehkmVar25.B = dimensionPixelOffset2;
            ehkk[] ehkkVarArr25 = ehkmVar25.e;
            if (ehkkVarArr25 != null) {
                for (ehkk ehkkVar25 : ehkkVarArr25) {
                    if (ehkkVar25 instanceof ehkh) {
                        ((ehkh) ehkkVar25).i(dimensionPixelOffset2);
                    }
                }
            }
            int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize4);
            int dimensionPixelOffset4 = obtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize4);
            int i4 = getLayoutDirection() == 1 ? dimensionPixelOffset4 : dimensionPixelOffset3;
            int dimensionPixelOffset5 = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset3 = getLayoutDirection() != 1 ? dimensionPixelOffset4 : dimensionPixelOffset3;
            int dimensionPixelOffset6 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            ehkm ehkmVar26 = this.b;
            ehkmVar26.L.left = i4;
            ehkmVar26.L.top = dimensionPixelOffset5;
            ehkmVar26.L.right = dimensionPixelOffset3;
            ehkmVar26.L.bottom = dimensionPixelOffset6;
            ehkk[] ehkkVarArr26 = ehkmVar26.e;
            if (ehkkVarArr26 != null) {
                for (ehkk ehkkVar26 : ehkkVarArr26) {
                    if (ehkkVar26 instanceof ehkh) {
                        ((ehkh) ehkkVar26).n = ehkmVar26.L;
                    }
                }
            }
            ColorStateList c = ehmq.c(context2, obtainStyledAttributes, 2);
            ehkm ehkmVar27 = this.b;
            ehkmVar27.E = c;
            ehkk[] ehkkVarArr27 = ehkmVar27.e;
            if (ehkkVarArr27 != null) {
                for (ehkk ehkkVar27 : ehkkVarArr27) {
                    if (ehkkVar27 instanceof ehkh) {
                        ((ehkh) ehkkVar27).d(ehkmVar27.d());
                    }
                }
            }
            ehow ehowVar = new ehow(ehow.b(context2, obtainStyledAttributes.getResourceId(11, 0), 0));
            ehkm ehkmVar28 = this.b;
            ehkmVar28.D = ehowVar;
            ehkk[] ehkkVarArr28 = ehkmVar28.e;
            if (ehkkVarArr28 != null) {
                for (ehkk ehkkVar28 : ehkkVarArr28) {
                    if (ehkkVar28 instanceof ehkh) {
                        ((ehkh) ehkkVar28).d(ehkmVar28.d());
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (b.q(23)) {
            int f7 = b.f(23, 0);
            this.c.b = true;
            if (this.e == null) {
                this.e = new nj(getContext());
            }
            this.e.inflate(f7, this.a);
            ehkp ehkpVar2 = this.c;
            ehkpVar2.b = false;
            ehkpVar2.f(true);
        }
        b.o();
        addView(this.b);
        this.a.b = new ehkr(this);
    }

    protected abstract ehkm a(Context context);

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ehoq.c(this);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof ehkt)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ehkt ehktVar = (ehkt) parcelable;
        super.onRestoreInstanceState(ehktVar.d);
        ehki ehkiVar = this.a;
        SparseArray sparseParcelableArray = ehktVar.a.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || ehkiVar.i.isEmpty()) {
            return;
        }
        Iterator it = ehkiVar.i.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            oq oqVar = (oq) weakReference.get();
            if (oqVar == null) {
                ehkiVar.i.remove(weakReference);
            } else {
                int a = oqVar.a();
                if (a > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(a)) != null) {
                    oqVar.n(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable dF;
        ehkt ehktVar = new ehkt(super.onSaveInstanceState());
        ehktVar.a = new Bundle();
        Bundle bundle = ehktVar.a;
        ehki ehkiVar = this.a;
        if (ehkiVar.i.isEmpty()) {
            return ehktVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = ehkiVar.i.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            oq oqVar = (oq) weakReference.get();
            if (oqVar == null) {
                ehkiVar.i.remove(weakReference);
            } else {
                int a = oqVar.a();
                if (a > 0 && (dF = oqVar.dF()) != null) {
                    sparseArray.put(a, dF);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return ehktVar;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ehoq.b(this, f);
    }
}
