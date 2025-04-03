package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import defpackage.kiu;
import defpackage.kiv;
import defpackage.kiy;
import defpackage.kiz;
import defpackage.kjx;
import defpackage.kjz;
import defpackage.kka;
import defpackage.kkd;
import defpackage.kkk;
import defpackage.kkl;
import defpackage.kkm;
import defpackage.kko;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    public final ArrayList b;
    protected final kiv c;
    public int d;
    protected boolean e;
    public int f;
    public kkk g;
    final kka h;
    private int i;
    private int j;
    private int k;
    private int l;
    private HashMap m;
    private final SparseArray n;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new kiv();
        this.i = 0;
        this.d = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new kka(this, this);
        e(null, 0, 0);
    }

    private final void e(AttributeSet attributeSet, int i, int i2) {
        kiv kivVar = this.c;
        kivVar.aq = this;
        kivVar.af(this.h);
        this.a.put(getId(), this);
        this.g = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, kko.b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(16, this.i);
                } else if (index == 17) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(17, this.d);
                } else if (index == 14) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(14, this.j);
                } else if (index == 15) {
                    this.k = obtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 113) {
                    this.f = obtainStyledAttributes.getInt(113, this.f);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            kkd.a(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(34, 0);
                    try {
                        kkk kkkVar = new kkk();
                        this.g = kkkVar;
                        kkkVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.g = null;
                    }
                    this.l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.ag(this.f);
    }

    private final void f() {
        this.e = true;
    }

    private final void g() {
        int i;
        int i2;
        float f;
        kiu kiuVar;
        kiu kiuVar2;
        kiu kiuVar3;
        kiu kiuVar4;
        boolean z;
        String str;
        int d;
        kiu kiuVar5;
        ConstraintLayout constraintLayout = this;
        boolean isInEditMode = constraintLayout.isInEditMode();
        int childCount = constraintLayout.getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            kiu hk = constraintLayout.hk(constraintLayout.getChildAt(i3));
            if (hk != null) {
                hk.u();
            }
        }
        if (isInEditMode) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = constraintLayout.getChildAt(i4);
                try {
                    String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                    int id = childAt.getId();
                    Integer valueOf = Integer.valueOf(id);
                    if (resourceName instanceof String) {
                        if (constraintLayout.m == null) {
                            constraintLayout.m = new HashMap();
                        }
                        int indexOf = resourceName.indexOf("/");
                        String substring = indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName;
                        valueOf.getClass();
                        constraintLayout.m.put(substring, Integer.valueOf(id));
                    }
                    int indexOf2 = resourceName.indexOf(47);
                    if (indexOf2 != -1) {
                        resourceName = resourceName.substring(indexOf2 + 1);
                    }
                    int id2 = childAt.getId();
                    if (id2 == 0) {
                        kiuVar5 = constraintLayout.c;
                    } else {
                        View view = (View) constraintLayout.a.get(id2);
                        if (view == null && (view = constraintLayout.findViewById(id2)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                            constraintLayout.onViewAdded(view);
                        }
                        kiuVar5 = view == constraintLayout ? constraintLayout.c : view == null ? null : ((kjz) view.getLayoutParams()).av;
                    }
                    kiuVar5.as = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (constraintLayout.l != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = constraintLayout.getChildAt(i5);
                if (childAt2.getId() == constraintLayout.l && (childAt2 instanceof kkl)) {
                    throw null;
                }
            }
        }
        kkk kkkVar = constraintLayout.g;
        if (kkkVar != null) {
            kkkVar.n(constraintLayout);
        }
        constraintLayout.c.ao();
        int size = constraintLayout.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                kjx kjxVar = (kjx) constraintLayout.b.get(i6);
                if (kjxVar.isInEditMode()) {
                    kjxVar.h(kjxVar.f);
                }
                kiz kizVar = kjxVar.i;
                if (kizVar != null) {
                    kizVar.aM = 0;
                    Arrays.fill(kizVar.aL, (Object) null);
                    for (int i7 = 0; i7 < kjxVar.d; i7++) {
                        int i8 = kjxVar.c[i7];
                        View a = constraintLayout.a(i8);
                        if (a == null && (d = kjxVar.d(constraintLayout, (str = (String) kjxVar.h.get(Integer.valueOf(i8))))) != 0) {
                            kjxVar.c[i7] = d;
                            kjxVar.h.put(Integer.valueOf(d), str);
                            a = constraintLayout.a(d);
                        }
                        if (a != null) {
                            kjxVar.i.af(constraintLayout.hk(a));
                        }
                    }
                    kjxVar.i.ah();
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt3 = constraintLayout.getChildAt(i9);
            if (childAt3 instanceof kkm) {
                throw null;
            }
        }
        constraintLayout.n.clear();
        constraintLayout.n.put(0, constraintLayout.c);
        constraintLayout.n.put(constraintLayout.getId(), constraintLayout.c);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt4 = constraintLayout.getChildAt(i10);
            constraintLayout.n.put(childAt4.getId(), constraintLayout.hk(childAt4));
        }
        int i11 = 0;
        while (i11 < childCount) {
            View childAt5 = constraintLayout.getChildAt(i11);
            kiu hk2 = constraintLayout.hk(childAt5);
            if (hk2 != null) {
                kjz kjzVar = (kjz) childAt5.getLayoutParams();
                constraintLayout.c.am(hk2);
                SparseArray sparseArray = constraintLayout.n;
                kjzVar.a();
                kjzVar.aw = z2;
                hk2.ar = childAt5.getVisibility();
                boolean z3 = kjzVar.aj;
                hk2.aq = childAt5;
                if (childAt5 instanceof kjx) {
                    ((kjx) childAt5).c(hk2, constraintLayout.c.e);
                }
                if (kjzVar.ah) {
                    kiy kiyVar = (kiy) hk2;
                    int i12 = kjzVar.as;
                    int i13 = kjzVar.at;
                    float f2 = kjzVar.au;
                    if (f2 != -1.0f) {
                        kiyVar.af(f2);
                    } else if (i12 != -1) {
                        kiyVar.c(i12);
                    } else if (i13 != -1) {
                        kiyVar.ae(i13);
                    }
                } else {
                    int i14 = kjzVar.al;
                    int i15 = kjzVar.am;
                    int i16 = kjzVar.an;
                    int i17 = kjzVar.ao;
                    int i18 = kjzVar.ap;
                    int i19 = kjzVar.aq;
                    float f3 = kjzVar.ar;
                    int i20 = kjzVar.p;
                    if (i20 != -1) {
                        kiu kiuVar6 = (kiu) sparseArray.get(i20);
                        if (kiuVar6 != null) {
                            hk2.r(kiuVar6, kjzVar.r, kjzVar.q);
                        }
                    } else {
                        if (i14 != -1) {
                            kiu kiuVar7 = (kiu) sparseArray.get(i14);
                            if (kiuVar7 != null) {
                                f = f3;
                                i = i17;
                                i2 = i19;
                                hk2.aa(2, kiuVar7, 2, kjzVar.leftMargin, i18);
                            } else {
                                i = i17;
                                i2 = i19;
                                f = f3;
                            }
                        } else {
                            i = i17;
                            i2 = i19;
                            if (i15 == -1 || (kiuVar = (kiu) sparseArray.get(i15)) == null) {
                                f = f3;
                            } else {
                                f = f3;
                                hk2.aa(2, kiuVar, 4, kjzVar.leftMargin, i18);
                            }
                        }
                        if (i16 != -1) {
                            kiu kiuVar8 = (kiu) sparseArray.get(i16);
                            if (kiuVar8 != null) {
                                hk2.aa(4, kiuVar8, 2, kjzVar.rightMargin, i2);
                            }
                        } else {
                            int i21 = i2;
                            if (i != -1 && (kiuVar2 = (kiu) sparseArray.get(i)) != null) {
                                hk2.aa(4, kiuVar2, 4, kjzVar.rightMargin, i21);
                            }
                        }
                        int i22 = kjzVar.i;
                        if (i22 != -1) {
                            kiu kiuVar9 = (kiu) sparseArray.get(i22);
                            if (kiuVar9 != null) {
                                hk2.aa(3, kiuVar9, 3, kjzVar.topMargin, kjzVar.x);
                            }
                        } else {
                            int i23 = kjzVar.j;
                            if (i23 != -1 && (kiuVar3 = (kiu) sparseArray.get(i23)) != null) {
                                hk2.aa(3, kiuVar3, 5, kjzVar.topMargin, kjzVar.x);
                            }
                        }
                        int i24 = kjzVar.k;
                        if (i24 != -1) {
                            kiu kiuVar10 = (kiu) sparseArray.get(i24);
                            if (kiuVar10 != null) {
                                hk2.aa(5, kiuVar10, 3, kjzVar.bottomMargin, kjzVar.z);
                            }
                        } else {
                            int i25 = kjzVar.l;
                            if (i25 != -1 && (kiuVar4 = (kiu) sparseArray.get(i25)) != null) {
                                hk2.aa(5, kiuVar4, 5, kjzVar.bottomMargin, kjzVar.z);
                            }
                        }
                        float f4 = f;
                        int i26 = kjzVar.m;
                        if (i26 != -1) {
                            constraintLayout.h(hk2, kjzVar, sparseArray, i26, 6);
                        } else {
                            int i27 = kjzVar.n;
                            if (i27 != -1) {
                                h(hk2, kjzVar, sparseArray, i27, 3);
                            } else {
                                int i28 = kjzVar.o;
                                if (i28 != -1) {
                                    h(hk2, kjzVar, sparseArray, i28, 5);
                                }
                            }
                        }
                        if (f4 >= 0.0f) {
                            hk2.ao = f4;
                        }
                        float f5 = kjzVar.H;
                        if (f5 >= 0.0f) {
                            hk2.ap = f5;
                        }
                    }
                    if (isInEditMode) {
                        int i29 = kjzVar.X;
                        if (i29 == -1) {
                            if (kjzVar.Y != -1) {
                                i29 = -1;
                            }
                        }
                        int i30 = kjzVar.Y;
                        hk2.aj = i29;
                        hk2.ak = i30;
                    }
                    if (kjzVar.ae) {
                        hk2.ab(1);
                        hk2.N(kjzVar.width);
                        if (kjzVar.width == -2) {
                            hk2.ab(2);
                        }
                    } else if (kjzVar.width == -1) {
                        if (kjzVar.aa) {
                            hk2.ab(3);
                        } else {
                            hk2.ab(4);
                        }
                        hk2.V(2).f = kjzVar.leftMargin;
                        hk2.V(4).f = kjzVar.rightMargin;
                    } else {
                        hk2.ab(3);
                        hk2.N(0);
                    }
                    if (kjzVar.af) {
                        z = false;
                        hk2.ac(1);
                        hk2.C(kjzVar.height);
                        if (kjzVar.height == -2) {
                            hk2.ac(2);
                        }
                    } else if (kjzVar.height == -1) {
                        if (kjzVar.ab) {
                            hk2.ac(3);
                        } else {
                            hk2.ac(4);
                        }
                        hk2.V(3).f = kjzVar.topMargin;
                        hk2.V(5).f = kjzVar.bottomMargin;
                        z = false;
                    } else {
                        hk2.ac(3);
                        z = false;
                        hk2.C(0);
                    }
                    hk2.z(kjzVar.I);
                    hk2.E(kjzVar.L);
                    hk2.M(kjzVar.M);
                    hk2.at = kjzVar.N;
                    hk2.au = kjzVar.O;
                    int i31 = kjzVar.ad;
                    if (i31 >= 0 && i31 <= 3) {
                        hk2.B = i31;
                    }
                    hk2.D(kjzVar.P, kjzVar.R, kjzVar.T, kjzVar.V);
                    hk2.L(kjzVar.Q, kjzVar.S, kjzVar.U, kjzVar.W);
                    i11++;
                    z2 = z;
                    constraintLayout = this;
                }
            }
            z = z2;
            i11++;
            z2 = z;
            constraintLayout = this;
        }
    }

    private final void h(kiu kiuVar, kjz kjzVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        kiu kiuVar2 = (kiu) sparseArray.get(i);
        if (kiuVar2 == null || view == null || !(view.getLayoutParams() instanceof kjz)) {
            return;
        }
        kjzVar.ag = true;
        if (i2 == 6) {
            kjz kjzVar2 = (kjz) view.getLayoutParams();
            kjzVar2.ag = true;
            kjzVar2.av.P = true;
        }
        kiuVar.V(6).n(kiuVar2.V(i2), kjzVar.D, kjzVar.C, true);
        kiuVar.P = true;
        kiuVar.V(3).e();
        kiuVar.V(5).e();
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kjz;
    }

    public final Object d(Object obj) {
        HashMap hashMap;
        if ((obj instanceof String) && (hashMap = this.m) != null && hashMap.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i3 = (int) ((parseInt2 / 1920.0f) * height);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        float f = ((int) ((parseInt3 / 1080.0f) * width)) + i4;
                        float f2 = i4;
                        float f3 = i3;
                        canvas.drawLine(f2, f3, f, f3, paint);
                        float parseInt4 = i3 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f, f3, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        f();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kjz();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new kjz(getContext(), attributeSet);
    }

    public final kiu hk(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof kjz) {
            return ((kjz) view.getLayoutParams()).av;
        }
        view.setLayoutParams(new kjz(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof kjz) {
            return ((kjz) view.getLayoutParams()).av;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            kjz kjzVar = (kjz) childAt.getLayoutParams();
            kiu kiuVar = kjzVar.av;
            if (childAt.getVisibility() == 8 && !kjzVar.ah && !kjzVar.ai) {
                boolean z2 = kjzVar.ak;
                if (!isInEditMode) {
                    continue;
                }
            }
            boolean z3 = kjzVar.aj;
            int k = kiuVar.k();
            int l = kiuVar.l();
            childAt.layout(k, l, kiuVar.j() + k, kiuVar.h() + l);
            if (childAt instanceof kkm) {
                throw null;
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        kiu hk = hk(view);
        if (z && !(hk instanceof kiy)) {
            kjz kjzVar = (kjz) view.getLayoutParams();
            kjzVar.av = new kiy();
            kjzVar.ah = true;
            ((kiy) kjzVar.av).ag(kjzVar.Z);
        }
        if (view instanceof kjx) {
            kjx kjxVar = (kjx) view;
            kjxVar.k();
            ((kjz) view.getLayoutParams()).ai = true;
            if (!this.b.contains(kjxVar)) {
                this.b.add(kjxVar);
            }
        }
        this.a.put(view.getId(), view);
        this.e = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.an(hk(view));
        this.b.remove(view);
        this.e = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new kjz(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new kiv();
        this.i = 0;
        this.d = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new kka(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new kiv();
        this.i = 0;
        this.d = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new kka(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new kiv();
        this.i = 0;
        this.d = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new kka(this, this);
        e(attributeSet, i, i2);
    }
}
