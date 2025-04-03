package androidx.compose.foundation;

import defpackage.djc;
import defpackage.dji;
import defpackage.djn;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends ivp<djc> {
    private final dji a;
    private final boolean b;
    private final boolean c;

    public ScrollingLayoutElement(dji djiVar, boolean z, boolean z2) {
        this.a = djiVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new djc(this.a, this.b, this.c);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        djc djcVar = (djc) hvhVar;
        djcVar.a = this.a;
        djcVar.b = this.b;
        djcVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return ffkj.e(this.a, scrollingLayoutElement.a) && this.b == scrollingLayoutElement.b && this.c == scrollingLayoutElement.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + djn.a(this.b)) * 31) + djn.a(this.c);
    }
}
