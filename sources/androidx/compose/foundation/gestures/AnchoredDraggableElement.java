package androidx.compose.foundation.gestures;

import defpackage.dik;
import defpackage.dlq;
import defpackage.dly;
import defpackage.dpq;
import defpackage.dqs;
import defpackage.dwn;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AnchoredDraggableElement<T> extends ivp<dlq<T>> {
    private final dly a;
    private final dqs b;
    private final dpq h;
    private final boolean c = true;
    private final Boolean d = null;
    private final dwn i = null;
    private final Boolean f = null;
    private final dik g = null;

    public AnchoredDraggableElement(dly dlyVar, dqs dqsVar, dpq dpqVar) {
        this.a = dlyVar;
        this.b = dqsVar;
        this.h = dpqVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dlq(this.a, this.b, this.h);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        boolean z;
        dlq dlqVar = (dlq) hvhVar;
        dpq dpqVar = this.h;
        dlqVar.c = dpqVar;
        dly dlyVar = dlqVar.a;
        dly dlyVar2 = this.a;
        if (ffkj.e(dlyVar, dlyVar2)) {
            z = false;
        } else {
            dlqVar.a = dlyVar2;
            dlqVar.i(dpqVar);
            z = true;
        }
        dqs dqsVar = this.b;
        if (dlqVar.b != dqsVar) {
            dlqVar.b = dqsVar;
            z = true;
        }
        dlqVar.B(dlqVar.f, true, null, dqsVar, (!ffkj.e(null, null)) | z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        if (!ffkj.e(this.a, anchoredDraggableElement.a) || this.b != anchoredDraggableElement.b) {
            return false;
        }
        boolean z = anchoredDraggableElement.c;
        Boolean bool = anchoredDraggableElement.d;
        if (!ffkj.e(null, null)) {
            return false;
        }
        dwn dwnVar = anchoredDraggableElement.i;
        if (!ffkj.e(null, null)) {
            return false;
        }
        Boolean bool2 = anchoredDraggableElement.f;
        if (!ffkj.e(null, null)) {
            return false;
        }
        dik dikVar = anchoredDraggableElement.g;
        return ffkj.e(null, null) && ffkj.e(this.h, anchoredDraggableElement.h);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dpq dpqVar = this.h;
        return (((hashCode * 31) + 1231) * 28629151) + (dpqVar != null ? dpqVar.hashCode() : 0);
    }
}
