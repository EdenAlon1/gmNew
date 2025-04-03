package androidx.compose.foundation.layout;

import defpackage.eay;
import defpackage.ffji;
import defpackage.hvh;
import defpackage.itz;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OffsetPxElement extends ivp<eay> {
    private final ffji a;
    private final boolean b;

    public OffsetPxElement(ffji ffjiVar, boolean z) {
        this.a = ffjiVar;
        this.b = z;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new eay(this.a, this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        eay eayVar = (eay) hvhVar;
        ffji ffjiVar = eayVar.a;
        boolean z = this.b;
        ffji ffjiVar2 = this.a;
        if (ffjiVar != ffjiVar2 || eayVar.b != z) {
            itz.c(eayVar);
        }
        eayVar.a = ffjiVar2;
        eayVar.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.a == offsetPxElement.a && this.b == offsetPxElement.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=" + this.b + ')';
    }
}
