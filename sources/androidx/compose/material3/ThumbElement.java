package androidx.compose.material3;

import defpackage.cxk;
import defpackage.cyq;
import defpackage.dwn;
import defpackage.ffkj;
import defpackage.grr;
import defpackage.hvh;
import defpackage.itz;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ThumbElement extends ivp<grr> {
    private final boolean a;
    private final cyq b;
    private final dwn c;

    public ThumbElement(dwn dwnVar, boolean z, cyq cyqVar) {
        this.c = dwnVar;
        this.a = z;
        this.b = cyqVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new grr(this.c, this.a, this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        grr grrVar = (grr) hvhVar;
        grrVar.h = this.c;
        if (grrVar.a != this.a) {
            itz.b(grrVar);
        }
        grrVar.a = this.a;
        grrVar.b = this.b;
        if (grrVar.e == null && !Float.isNaN(grrVar.g)) {
            grrVar.e = cxk.a(grrVar.g);
        }
        if (grrVar.d != null || Float.isNaN(grrVar.f)) {
            return;
        }
        grrVar.d = cxk.a(grrVar.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return ffkj.e(this.c, thumbElement.c) && this.a == thumbElement.a && ffkj.e(this.b, thumbElement.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + (true != this.a ? 1237 : 1231)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.c + ", checked=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
