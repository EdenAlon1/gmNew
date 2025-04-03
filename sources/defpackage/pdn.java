package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pdn {
    public peh a;
    public vm b;
    public lkp c;
    public ViewPager2 d;
    final /* synthetic */ pdq e;
    private long f = -1;

    public pdn(pdq pdqVar) {
        this.e = pdqVar;
    }

    public static final ViewPager2 b(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        Objects.toString(parent);
        throw new IllegalStateException("Expected ViewPager2 instance. Got: ".concat(String.valueOf(parent)));
    }

    final void a(boolean z) {
        ea eaVar;
        if (this.e.J() || this.d.b() != 0 || this.e.e.k()) {
            return;
        }
        pdq pdqVar = this.e;
        int i = this.d.b;
        if (i < 2) {
            long j = i;
            if ((j != this.f || z) && (eaVar = (ea) pdqVar.e.d(j)) != null && eaVar.aF()) {
                this.f = j;
                cg cgVar = new cg(this.e.d);
                ArrayList arrayList = new ArrayList();
                ea eaVar2 = null;
                for (int i2 = 0; i2 < this.e.e.b(); i2++) {
                    pdq pdqVar2 = this.e;
                    long c = pdqVar2.e.c(i2);
                    ea eaVar3 = (ea) pdqVar2.e.e(i2);
                    if (eaVar3.aF()) {
                        if (c != this.f) {
                            cgVar.o(eaVar3, lkj.STARTED);
                            arrayList.add(this.e.f.b());
                        } else {
                            eaVar2 = eaVar3;
                        }
                        eaVar3.ax(c == this.f);
                    }
                }
                if (eaVar2 != null) {
                    cgVar.o(eaVar2, lkj.RESUMED);
                    arrayList.add(this.e.f.b());
                }
                if (cgVar.i()) {
                    return;
                }
                cgVar.c();
                Collections.reverse(arrayList);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    pdj.a((List) arrayList.get(i3));
                }
            }
        }
    }
}
