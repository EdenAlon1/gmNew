package androidx.compose.foundation.gestures;

import defpackage.dik;
import defpackage.dmk;
import defpackage.dpq;
import defpackage.dqs;
import defpackage.drh;
import defpackage.dse;
import defpackage.dsg;
import defpackage.dwn;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollableElement extends ivp<dse> {
    private final dsg a;
    private final dqs b;
    private final boolean d;
    private final boolean f;
    private final dwn i;
    private final dik c = null;
    private final dpq g = null;
    private final dmk h = null;

    public ScrollableElement(dsg dsgVar, dqs dqsVar, boolean z, boolean z2, dwn dwnVar) {
        this.a = dsgVar;
        this.b = dqsVar;
        this.d = z;
        this.f = z2;
        this.i = dwnVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dse(this.a, null, null, this.b, this.d, this.f, this.i, null);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        dwn dwnVar = this.i;
        ((dse) hvhVar).f(this.a, this.b, null, this.d, this.f, null, dwnVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        if (!ffkj.e(this.a, scrollableElement.a) || this.b != scrollableElement.b) {
            return false;
        }
        dik dikVar = scrollableElement.c;
        if (!ffkj.e(null, null) || this.d != scrollableElement.d || this.f != scrollableElement.f) {
            return false;
        }
        dpq dpqVar = scrollableElement.g;
        if (!ffkj.e(null, null) || !ffkj.e(this.i, scrollableElement.i)) {
            return false;
        }
        dmk dmkVar = scrollableElement.h;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dwn dwnVar = this.i;
        return ((((((hashCode * 961) + drh.a(this.d)) * 31) + drh.a(this.f)) * 961) + (dwnVar != null ? dwnVar.hashCode() : 0)) * 31;
    }
}
