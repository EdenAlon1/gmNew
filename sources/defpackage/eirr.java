package defpackage;

import android.util.SparseArray;
import android.view.View;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;
import j$.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eirr {
    public final int a;
    final SparseArray b = new SparseArray();
    final List c = new ArrayList();
    final /* synthetic */ SpannedGridLayoutManager d;
    private final int[] e;
    private final wf f;

    public eirr(SpannedGridLayoutManager spannedGridLayoutManager, wf wfVar, int i) {
        this.d = spannedGridLayoutManager;
        this.e = new int[spannedGridLayoutManager.b.a];
        this.f = wfVar;
        this.a = i;
    }

    private final void g(int i, int i2) {
        if (this.c.size() < i + 1) {
            this.c.add(Integer.valueOf(i2));
        }
    }

    private final void h() {
        eirs eirsVar;
        int size = this.c.size();
        int size2 = this.b.size();
        g(size, size2);
        int i = size2;
        int i2 = 0;
        while (i < this.a) {
            int a = this.f.a(i);
            if (a == -1) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.d.at()) {
                        eirsVar = eirs.a;
                        break;
                    }
                    View aH = this.d.aH(i3);
                    if (i == SpannedGridLayoutManager.bv(aH)) {
                        eiro eiroVar = (eiro) aH.getLayoutParams();
                        eirsVar = new eirs(eiroVar.a, eiroVar.b);
                        break;
                    }
                    i3++;
                }
            } else {
                eirsVar = (eirs) Map.EL.getOrDefault(this.d.n.e, Integer.valueOf(a), new eirs(2, 1));
            }
            SpannedGridLayoutManager spannedGridLayoutManager = this.d;
            int i4 = eirsVar.b;
            int i5 = spannedGridLayoutManager.b.a;
            if (i4 > i5) {
                eirsVar.b = i5;
                i4 = i5;
            }
            if (i4 + i2 > i5) {
                size++;
                g(size, size2);
                i2 = 0;
            }
            while (this.e[i2] > size) {
                i2++;
                if (eirsVar.b + i2 > this.d.b.a) {
                    size++;
                    g(size, size2);
                    i2 = 0;
                }
            }
            this.b.put(i, new eirn(size, eirsVar.c, i2, eirsVar.b));
            int i6 = eirsVar.c + size;
            for (int i7 = 0; i7 < eirsVar.b; i7++) {
                this.e[i2 + i7] = i6;
            }
            if (eirsVar.c > 1) {
                for (int i8 = 1; i8 < eirsVar.c; i8++) {
                    g(size + i8, size2);
                }
            }
            i2 += eirsVar.b;
            i++;
            int i9 = this.e[0];
            for (int i10 = 1; i10 < this.d.b.a; i10++) {
                if (i9 != this.e[i10]) {
                    break;
                }
            }
            return;
        }
    }

    private final void i(int i) {
        while (i >= this.c.size()) {
            SparseArray sparseArray = this.b;
            if (sparseArray.size() >= this.a) {
                return;
            } else {
                h();
            }
        }
    }

    public final int a(int i) {
        if (i >= this.c.size()) {
            i(i);
        }
        if (this.c.isEmpty()) {
            return 0;
        }
        return ((Integer) this.c.get(i)).intValue();
    }

    public final int b(int i) {
        return (f(c(i)) ? a(r2) : this.a) - 1;
    }

    public final int c(int i) {
        int i2 = i + 1;
        int a = a(i);
        while (f(i2) && a(i2) == a) {
            i2++;
        }
        return i2;
    }

    public final int d(int i) {
        if (i < this.a) {
            return e(i).a;
        }
        return -1;
    }

    public final eirn e(int i) {
        if (i >= this.a) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, "index: %d out of range.", Integer.valueOf(i)));
        }
        if (i >= this.b.size()) {
            while (i >= this.b.size()) {
                h();
            }
        }
        return (eirn) this.b.get(i);
    }

    public final boolean f(int i) {
        if (i >= this.c.size()) {
            i(i);
        }
        return i >= 0 && i < this.c.size();
    }
}
