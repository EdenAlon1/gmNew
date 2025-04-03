package androidx.compose.foundation.layout;

import defpackage.dxa;
import defpackage.edc;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.imq;
import defpackage.ivp;
import defpackage.jzq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AlignmentLineOffsetDpElement extends ivp<dxa> {
    private final imq a;
    private final float b;
    private final float c;

    public AlignmentLineOffsetDpElement(imq imqVar, float f, float f2) {
        this.a = imqVar;
        this.b = f;
        this.c = f2;
        if (!(f >= 0.0f || Float.isNaN(f)) || !(f2 >= 0.0f || Float.isNaN(f2))) {
            edc.a("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dxa(this.a, this.b, this.c);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        dxa dxaVar = (dxa) hvhVar;
        dxaVar.a = this.a;
        dxaVar.b = this.b;
        dxaVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        return alignmentLineOffsetDpElement != null && ffkj.e(this.a, alignmentLineOffsetDpElement.a) && jzq.b(this.b, alignmentLineOffsetDpElement.b) && jzq.b(this.c, alignmentLineOffsetDpElement.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }
}
