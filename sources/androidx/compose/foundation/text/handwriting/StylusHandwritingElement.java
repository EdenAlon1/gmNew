package androidx.compose.foundation.text.handwriting;

import defpackage.eyw;
import defpackage.ffix;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StylusHandwritingElement extends ivp<eyw> {
    private final ffix a;

    public StylusHandwritingElement(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new eyw(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((eyw) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && this.a == ((StylusHandwritingElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
