package androidx.compose.foundation.layout;

import defpackage.dxy;
import defpackage.ffkj;
import defpackage.huo;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BoxChildDataElement extends ivp<dxy> {
    private final huo a;
    private final boolean b;

    public BoxChildDataElement(huo huoVar, boolean z) {
        this.a = huoVar;
        this.b = z;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dxy(this.a, this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        dxy dxyVar = (dxy) hvhVar;
        dxyVar.a = this.a;
        dxyVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && ffkj.e(this.a, boxChildDataElement.a) && this.b == boxChildDataElement.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }
}
