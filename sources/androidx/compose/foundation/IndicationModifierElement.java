package androidx.compose.foundation;

import defpackage.dhe;
import defpackage.dhf;
import defpackage.dwn;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.isw;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IndicationModifierElement extends ivp<dhe> {
    private final dhf a;
    private final dwn b;

    public IndicationModifierElement(dwn dwnVar, dhf dhfVar) {
        this.b = dwnVar;
        this.a = dhfVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dhe(this.a.a(this.b));
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        dhe dheVar = (dhe) hvhVar;
        isw a = this.a.a(this.b);
        dheVar.L(dheVar.a);
        dheVar.a = a;
        dheVar.M(a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return ffkj.e(this.b, indicationModifierElement.b) && ffkj.e(this.a, indicationModifierElement.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
