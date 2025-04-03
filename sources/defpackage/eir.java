package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eir extends hvh implements itg {
    public LazyLayoutItemAnimator a;

    public eir(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
        this.a = lazyLayoutItemAnimator;
    }

    @Override // defpackage.hvh
    public final void dT() {
        this.a.b = this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eir) && ffkj.e(this.a, ((eir) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        List list = this.a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            eiq eiqVar = (eiq) list.get(i);
            iga igaVar = eiqVar.d;
            if (igaVar != null) {
                long j = eiqVar.c;
                int a = kaa.a(j);
                int b = kaa.b(j);
                float a2 = a - kaa.a(igaVar.m);
                float b2 = b - kaa.b(r6);
                ifoVar.t().c.e(a2, b2);
                float f = -a2;
                float f2 = -b2;
                try {
                    ige.a(ifoVar, igaVar);
                } finally {
                    ifoVar.t().c.e(f, f2);
                }
            }
        }
        ifoVar.p();
    }

    @Override // defpackage.hvh
    public final void t() {
        this.a.c();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.a + ')';
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }
}
