package androidx.compose.material3.internal;

import defpackage.dqs;
import defpackage.ffjm;
import defpackage.ffkj;
import defpackage.gzl;
import defpackage.hbb;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DraggableAnchorsElement<T> extends ivp<hbb<T>> {
    private final gzl a;
    private final ffjm b;
    private final dqs c;

    public DraggableAnchorsElement(gzl gzlVar, ffjm ffjmVar, dqs dqsVar) {
        this.a = gzlVar;
        this.b = ffjmVar;
        this.c = dqsVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new hbb(this.a, this.b, this.c);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        hbb hbbVar = (hbb) hvhVar;
        hbbVar.a = this.a;
        hbbVar.b = this.b;
        hbbVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return ffkj.e(this.a, draggableAnchorsElement.a) && this.b == draggableAnchorsElement.b && this.c == draggableAnchorsElement.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
