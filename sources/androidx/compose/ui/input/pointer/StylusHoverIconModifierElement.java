package androidx.compose.ui.input.pointer;

import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ijs;
import defpackage.ikc;
import defpackage.ikq;
import defpackage.ilt;
import defpackage.itf;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StylusHoverIconModifierElement extends ivp<ilt> {
    private final ikq a;
    private final boolean b = false;
    private final itf c;

    public StylusHoverIconModifierElement(ikq ikqVar, itf itfVar) {
        this.a = ikqVar;
        this.c = itfVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ilt(this.a, this.c);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ilt iltVar = (ilt) hvhVar;
        iltVar.f(this.a);
        ((ikc) iltVar).a = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        if (!ffkj.e(this.a, stylusHoverIconModifierElement.a)) {
            return false;
        }
        boolean z = stylusHoverIconModifierElement.b;
        return ffkj.e(this.c, stylusHoverIconModifierElement.c);
    }

    public final int hashCode() {
        ikq ikqVar = this.a;
        return (((((ijs) ikqVar).a * 31) + 1237) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false, touchBoundsExpansion=" + this.c + ')';
    }
}
