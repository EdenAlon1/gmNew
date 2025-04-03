package androidx.compose.foundation.text.input.internal;

import defpackage.eva;
import defpackage.fai;
import defpackage.fal;
import defpackage.ffkj;
import defpackage.fhi;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LegacyAdaptingPlatformTextInputModifier extends ivp<fai> {
    private final fal a;
    private final eva b;
    private final fhi c;

    public LegacyAdaptingPlatformTextInputModifier(fal falVar, eva evaVar, fhi fhiVar) {
        this.a = falVar;
        this.b = evaVar;
        this.c = fhiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new fai(this.a, this.b, this.c);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        fai faiVar = (fai) hvhVar;
        if (faiVar.z) {
            faiVar.a.f();
            faiVar.a.l(faiVar);
        }
        faiVar.a = this.a;
        if (faiVar.z) {
            faiVar.a.k(faiVar);
        }
        faiVar.b = this.b;
        faiVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return ffkj.e(this.a, legacyAdaptingPlatformTextInputModifier.a) && ffkj.e(this.b, legacyAdaptingPlatformTextInputModifier.b) && ffkj.e(this.c, legacyAdaptingPlatformTextInputModifier.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
