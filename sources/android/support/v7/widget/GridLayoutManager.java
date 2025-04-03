package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.android.vcard.VCardConfig;
import defpackage.a;
import defpackage.kxr;
import defpackage.kxt;
import defpackage.kxu;
import defpackage.ts;
import defpackage.tv;
import defpackage.tw;
import defpackage.tx;
import defpackage.ub;
import defpackage.ud;
import defpackage.vk;
import defpackage.vx;
import defpackage.vy;
import defpackage.wf;
import defpackage.wo;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set J = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    private int K;
    boolean a;
    public int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    public tx g;
    final Rect h;
    int i;
    int j;

    public GridLayoutManager(int i) {
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new tv();
        this.h = new Rect();
        this.K = -1;
        this.i = -1;
        this.j = -1;
        r(i);
    }

    private final int bM(int i) {
        if (this.k == 0) {
            RecyclerView recyclerView = this.u;
            return bO(recyclerView.e, recyclerView.O, i);
        }
        RecyclerView recyclerView2 = this.u;
        return bP(recyclerView2.e, recyclerView2.O, i);
    }

    private final int bN(int i) {
        if (this.k == 1) {
            RecyclerView recyclerView = this.u;
            return bO(recyclerView.e, recyclerView.O, i);
        }
        RecyclerView recyclerView2 = this.u;
        return bP(recyclerView2.e, recyclerView2.O, i);
    }

    private final int bO(wf wfVar, wo woVar, int i) {
        if (!woVar.g) {
            return this.g.c(i, this.b);
        }
        int a = wfVar.a(i);
        if (a != -1) {
            return this.g.c(a, this.b);
        }
        Log.w("GridLayoutManager", a.h(i, "Cannot find span size for pre layout position. "));
        return 0;
    }

    private final int bP(wf wfVar, wo woVar, int i) {
        if (!woVar.g) {
            return this.g.a(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = wfVar.a(i);
        if (a != -1) {
            return this.g.a(a, this.b);
        }
        Log.w("GridLayoutManager", a.h(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 0;
    }

    private final int bQ(wf wfVar, wo woVar, int i) {
        if (!woVar.g) {
            return this.g.b(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = wfVar.a(i);
        if (a != -1) {
            return this.g.b(a);
        }
        Log.w("GridLayoutManager", a.h(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 1;
    }

    private final Set bR(int i) {
        return bT(bM(i), i);
    }

    private final Set bS(int i) {
        return bT(bN(i), i);
    }

    private final Set bT(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.u;
        int bQ = bQ(recyclerView.e, recyclerView.O, i2);
        for (int i3 = i; i3 < i + bQ; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void bU(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 <= 0 || i3 - i5 >= i7) {
                i2 = i6;
            } else {
                i2 = i6 + 1;
                i5 -= i3;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void bV() {
        View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new View[this.b];
    }

    private final void bW(View view, int i, boolean z) {
        int i2;
        int i3;
        tw twVar = (tw) view.getLayoutParams();
        Rect rect = twVar.d;
        int i4 = rect.top + rect.bottom + twVar.topMargin + twVar.bottomMargin;
        int i5 = rect.left + rect.right + twVar.leftMargin + twVar.rightMargin;
        int c = c(twVar.a, twVar.b);
        if (this.k == 1) {
            i3 = au(c, i, i5, twVar.width, false);
            i2 = au(this.l.k(), this.G, i4, twVar.height, true);
        } else {
            int au = au(c, i, i4, twVar.height, false);
            int au2 = au(this.l.k(), this.F, i5, twVar.width, true);
            i2 = au;
            i3 = au2;
        }
        bX(view, i3, i2, z);
    }

    private final void bX(View view, int i, int i2, boolean z) {
        boolean bq;
        vy vyVar = (vy) view.getLayoutParams();
        if (z) {
            bq = true;
            if (this.B && vx.bn(view.getMeasuredWidth(), i, vyVar.width) && vx.bn(view.getMeasuredHeight(), i2, vyVar.height)) {
                bq = false;
            }
        } else {
            bq = bq(view, i, i2, vyVar);
        }
        if (bq) {
            view.measure(i, i2);
        }
    }

    private final void bY() {
        int az;
        int aE;
        if (this.k == 1) {
            az = this.H - aC();
            aE = aB();
        } else {
            az = this.I - az();
            aE = aE();
        }
        bU(az - aE);
    }

    @Override // defpackage.vx
    public final void A(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.vx
    public final void B(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    final int c(int i, int i2) {
        if (this.k != 1 || !ai()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // defpackage.vx
    public final int cb(wf wfVar, wo woVar) {
        if (this.k == 1) {
            return Math.min(this.b, av());
        }
        if (woVar.a() <= 0) {
            return 0;
        }
        return bO(wfVar, woVar, woVar.a() - 1) + 1;
    }

    @Override // defpackage.vx
    public final int cc(wf wfVar, wo woVar) {
        if (this.k == 0) {
            return Math.min(this.b, av());
        }
        if (woVar.a() <= 0) {
            return 0;
        }
        return bO(wfVar, woVar, woVar.a() - 1) + 1;
    }

    @Override // defpackage.vx
    public final vy cd(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new tw((ViewGroup.MarginLayoutParams) layoutParams) : new tw(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        if (r13 == (r2 > r11)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ed, code lost:
    
        if (r13 == (r2 > r15)) goto L69;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View ce(android.view.View r23, int r24, defpackage.wf r25, defpackage.wo r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.ce(android.view.View, int, wf, wo):android.view.View");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final void cf(wf wfVar, wo woVar, kxu kxuVar) {
        super.cf(wfVar, woVar, kxuVar);
        kxuVar.r(GridView.class.getName());
        vk vkVar = this.u.n;
        if (vkVar == null || vkVar.a() <= 1) {
            return;
        }
        kxuVar.i(kxr.n);
    }

    @Override // defpackage.vx
    public final void cg(wf wfVar, wo woVar, View view, kxu kxuVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof tw)) {
            super.aW(view, kxuVar);
            return;
        }
        tw twVar = (tw) layoutParams;
        int bO = bO(wfVar, woVar, twVar.a());
        if (this.k == 0) {
            kxuVar.u(kxt.a(twVar.a, twVar.b, bO, 1, false));
        } else {
            kxuVar.u(kxt.a(bO, 1, twVar.a, twVar.b, false));
        }
    }

    @Override // defpackage.vx
    public final void ch(Rect rect, int i, int i2) {
        int as;
        int as2;
        if (this.c == null) {
            super.ch(rect, i, i2);
        }
        int aB = aB() + aC();
        int aE = aE() + az();
        if (this.k == 1) {
            as2 = as(i2, rect.height() + aE, ax());
            as = as(i, this.c[r7.length - 1] + aB, ay());
        } else {
            as = as(i, rect.width() + aB, ay());
            as2 = as(i2, this.c[r5.length - 1] + aE, ax());
        }
        bi(as, as2);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ci(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.ci(int, android.os.Bundle):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final boolean cj() {
        return this.r == null && !this.a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final int d(int i, wf wfVar, wo woVar) {
        bY();
        bV();
        return super.d(i, wfVar, woVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final int e(int i, wf wfVar, wo woVar) {
        bY();
        bV();
        return super.e(i, wfVar, woVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final vy f() {
        return this.k == 0 ? new tw(-2, -1) : new tw(-1, -2);
    }

    @Override // defpackage.vx
    public final vy h(Context context, AttributeSet attributeSet) {
        return new tw(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(wf wfVar, wo woVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int at = at();
        if (z2) {
            i = -1;
            i2 = at() - 1;
            i3 = -1;
        } else {
            i = at;
            i2 = 0;
            i3 = 1;
        }
        int a = woVar.a();
        X();
        int j = this.l.j();
        int f = this.l.f();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View aH = aH(i2);
            int bv = bv(aH);
            if (bv >= 0 && bv < a && bP(wfVar, woVar, bv) == 0) {
                if (((vy) aH.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = aH;
                    }
                } else {
                    if (this.l.d(aH) < f && this.l.a(aH) >= j) {
                        return aH;
                    }
                    if (view == null) {
                        view = aH;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0202, code lost:
    
        r2 = aB() + r18.c[r6.a];
        r3 = r18.l.c(r5) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0215, code lost:
    
        r1 = aE() + r18.c[r6.a];
        r12 = r1;
        r1 = r18.l.c(r5) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0247, code lost:
    
        java.util.Arrays.fill(r18.d, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x024d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b2, code lost:
    
        r12 = r21.b;
        r1 = r12 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bc, code lost:
    
        if (r21.f != (-1)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01be, code lost:
    
        r12 = r21.b;
        r2 = r12 - r7;
        r1 = 0;
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01cd, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c6, code lost:
    
        r12 = r21.b;
        r3 = r12 + r7;
        r1 = 0;
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x009b, code lost:
    
        r12 = r13 - 1;
        r14 = -1;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r11 != 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        r15 = 1;
        r14 = r13;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r12 == r14) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r7 = r18.d[r12];
        r9 = (defpackage.tw) r7.getLayoutParams();
        r7 = bQ(r19, r20, bv(r7));
        r9.b = r7;
        r9.a = r8;
        r8 = r8 + r7;
        r12 = r12 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        r1 = 0.0f;
        r2 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (r2 >= r13) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        r8 = r18.d[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if (r21.l != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        if (r11 != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        aL(r8);
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        aN(r8, r18.h);
        bW(r8, r5, r12);
        r9 = r18.l.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
    
        if (r9 <= r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
    
        r8 = r18.l.c(r8) / ((defpackage.tw) r8.getLayoutParams()).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0107, code lost:
    
        if (r8 <= r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0109, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
    
        r12 = false;
        aM(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if (r11 != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        aJ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        aK(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010d, code lost:
    
        if (r10 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:
    
        bU(java.lang.Math.max(java.lang.Math.round(r1 * r18.b), r6));
        r7 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
    
        if (r12 >= r13) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0122, code lost:
    
        r1 = r18.d[r12];
        bW(r1, 1073741824, true);
        r1 = r18.l.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        if (r1 <= r7) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0134, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0135, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0138, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0139, code lost:
    
        if (r12 >= r13) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013b, code lost:
    
        r1 = r18.d[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0145, code lost:
    
        if (r18.l.b(r1) == r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0147, code lost:
    
        r2 = (defpackage.tw) r1.getLayoutParams();
        r5 = r2.d;
        r6 = ((r5.top + r5.bottom) + r2.topMargin) + r2.bottomMargin;
        r8 = ((r5.left + r5.right) + r2.leftMargin) + r2.rightMargin;
        r5 = c(r2.a, r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0170, code lost:
    
        if (r18.k != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
    
        r2 = au(r5, 1073741824, r8, r2.width, false);
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r6, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0192, code lost:
    
        bX(r1, r2, r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019a, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
    
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r8, 1073741824);
        r5 = au(r5, 1073741824, r6, r2.height, false);
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019d, code lost:
    
        r22.a = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a3, code lost:
    
        if (r18.k != 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a8, code lost:
    
        if (r21.f != (-1)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01aa, code lost:
    
        r12 = r21.b;
        r12 = r12 - r7;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
    
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ce, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01cf, code lost:
    
        if (r7 >= r13) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d1, code lost:
    
        r5 = r18.d[r7];
        r6 = (defpackage.tw) r5.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01de, code lost:
    
        if (r18.k != 1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e4, code lost:
    
        if (ai() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e6, code lost:
    
        r2 = aB() + r18.c[r18.b - r6.a];
        r3 = r2;
        r2 = r2 - r18.l.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0229, code lost:
    
        bA(r5, r2, r12, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0230, code lost:
    
        if (r6.c() != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0236, code lost:
    
        if (r6.b() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023b, code lost:
    
        r22.d = r5.hasFocusable() | r22.d;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0238, code lost:
    
        r22.c = true;
     */
    @Override // android.support.v7.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.wf r19, defpackage.wo r20, defpackage.ud r21, defpackage.uc r22) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.k(wf, wo, ud, uc):void");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void l(wf wfVar, wo woVar, ub ubVar, int i) {
        bY();
        if (woVar.a() > 0 && !woVar.g) {
            int bP = bP(wfVar, woVar, ubVar.b);
            if (i == 1) {
                while (bP > 0) {
                    int i2 = ubVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    ubVar.b = i3;
                    bP = bP(wfVar, woVar, i3);
                }
            } else {
                int a = woVar.a() - 1;
                int i4 = ubVar.b;
                while (i4 < a) {
                    int i5 = i4 + 1;
                    int bP2 = bP(wfVar, woVar, i5);
                    if (bP2 <= bP) {
                        break;
                    }
                    i4 = i5;
                    bP = bP2;
                }
                ubVar.b = i4;
            }
        }
        bV();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final void o(wf wfVar, wo woVar) {
        if (woVar.g) {
            int at = at();
            for (int i = 0; i < at; i++) {
                tw twVar = (tw) aH(i).getLayoutParams();
                int a = twVar.a();
                this.e.put(a, twVar.b);
                this.f.put(a, twVar.a);
            }
        }
        super.o(wfVar, woVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final void p(wo woVar) {
        View U;
        super.p(woVar);
        this.a = false;
        int i = this.K;
        if (i == -1 || (U = U(i)) == null) {
            return;
        }
        U.sendAccessibilityEvent(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        this.K = -1;
    }

    public final void r(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i <= 0) {
            throw new IllegalArgumentException(a.h(i, "Span count should be at least 1. Provided "));
        }
        this.b = i;
        this.g.e();
        be();
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void s(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.s(false);
    }

    @Override // defpackage.vx
    public final boolean t(vy vyVar) {
        return vyVar instanceof tw;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void w(wo woVar, ud udVar, ts tsVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && udVar.d(woVar) && i > 0; i2++) {
            int i3 = udVar.d;
            tsVar.a(i3, Math.max(0, udVar.g));
            i -= this.g.b(i3);
            udVar.d += udVar.e;
        }
    }

    @Override // defpackage.vx
    public final void x(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.vx
    public final void y() {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.vx
    public final void z(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    public GridLayoutManager(int i, int i2) {
        super(i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new tv();
        this.h = new Rect();
        this.K = -1;
        this.i = -1;
        this.j = -1;
        r(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new tv();
        this.h = new Rect();
        this.K = -1;
        this.i = -1;
        this.j = -1;
        r(aF(context, attributeSet, i, i2).b);
    }
}
