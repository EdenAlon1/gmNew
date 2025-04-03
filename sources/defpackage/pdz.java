package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdz extends wc {
    public peh a;
    public int b;
    public int c;
    public final pdy d;
    public int e;
    public boolean f;
    private final ViewPager2 g;
    private final RecyclerView h;
    private final LinearLayoutManager i;
    private int j;
    private boolean k;
    private boolean l;

    public pdz(ViewPager2 viewPager2) {
        this.g = viewPager2;
        RecyclerView recyclerView = viewPager2.f;
        this.h = recyclerView;
        this.i = (LinearLayoutManager) recyclerView.o;
        this.d = new pdy();
        h();
    }

    private final void g(int i, float f, int i2) {
        peh pehVar = this.a;
        if (pehVar != null) {
            pehVar.d(i, f, i2);
        }
    }

    private final void h() {
        this.b = 0;
        this.c = 0;
        this.d.a();
        this.j = -1;
        this.e = -1;
        this.k = false;
        this.l = false;
        this.f = false;
    }

    private final boolean i() {
        return this.b == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r5 < 0) == r3.g.g()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // defpackage.wc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.support.v7.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.l = r4
            r3.e()
            boolean r0 = r3.k
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.k = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 < 0) goto L16
            r5 = r2
            goto L17
        L16:
            r5 = r4
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.g
            boolean r6 = r6.g()
            if (r5 != r6) goto L29
        L1f:
            pdy r5 = r3.d
            int r6 = r5.c
            if (r6 == 0) goto L29
            int r5 = r5.a
            int r5 = r5 + r4
            goto L2d
        L29:
            pdy r5 = r3.d
            int r5 = r5.a
        L2d:
            r3.e = r5
            int r6 = r3.j
            if (r6 == r5) goto L45
            r3.c(r5)
            goto L45
        L37:
            int r5 = r3.b
            if (r5 != 0) goto L45
            pdy r5 = r3.d
            int r5 = r5.a
            if (r5 != r1) goto L42
            r5 = r2
        L42:
            r3.c(r5)
        L45:
            pdy r5 = r3.d
            int r6 = r5.a
            if (r6 != r1) goto L4c
            r6 = r2
        L4c:
            float r0 = r5.b
            int r5 = r5.c
            r3.g(r6, r0, r5)
            pdy r5 = r3.d
            int r6 = r5.a
            int r0 = r3.e
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.c
            if (r5 != 0) goto L6b
            int r5 = r3.c
            if (r5 == r4) goto L6b
            r3.d(r2)
            r3.h()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdz.a(android.support.v7.widget.RecyclerView, int, int):void");
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
        if (!(this.b == 1 && this.c == 1) && i == 1) {
            this.b = 1;
            int i2 = this.e;
            if (i2 != -1) {
                this.j = i2;
                this.e = -1;
            } else if (this.j == -1) {
                this.j = this.i.L();
            }
            d(1);
            return;
        }
        if (i() && i == 2) {
            if (this.l) {
                d(2);
                this.k = true;
                return;
            }
            return;
        }
        if (i() && i == 0) {
            e();
            if (this.l) {
                pdy pdyVar = this.d;
                if (pdyVar.c == 0) {
                    int i3 = this.j;
                    int i4 = pdyVar.a;
                    if (i3 != i4) {
                        c(i4);
                    }
                }
            } else {
                int i5 = this.d.a;
                if (i5 != -1) {
                    g(i5, 0.0f, 0);
                }
            }
            d(0);
            h();
        }
        if (this.b == 2 && i == 0 && this.f) {
            e();
            pdy pdyVar2 = this.d;
            if (pdyVar2.c == 0) {
                int i6 = this.e;
                int i7 = pdyVar2.a;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    c(i7);
                }
                d(0);
                h();
            }
        }
    }

    public final void c(int i) {
        peh pehVar = this.a;
        if (pehVar != null) {
            pehVar.b(i);
        }
    }

    public final void d(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        peh pehVar = this.a;
        if (pehVar != null) {
            pehVar.a(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0117, code lost:
    
        r2 = r1.at();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (r3 >= r2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0126, code lost:
    
        if (defpackage.pdu.a(r1.aH(r3)) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0128, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0132, code lost:
    
        throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014a, code lost:
    
        throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "Page can only be offset by a positive amount, not by %d", java.lang.Integer.valueOf(r0.c)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010e, code lost:
    
        if (r7[r3 - 1][1] >= r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0115, code lost:
    
        if (r1.at() <= 1) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdz.e():void");
    }

    public final boolean f() {
        return this.c == 0;
    }
}
