package androidx.compose.foundation.text.input.internal;

import defpackage.eva;
import defpackage.ezh;
import defpackage.ezu;
import defpackage.ezv;
import defpackage.ffkj;
import defpackage.fhi;
import defpackage.hvh;
import defpackage.hzi;
import defpackage.ivp;
import defpackage.ixo;
import defpackage.jpm;
import defpackage.juw;
import defpackage.jvj;
import defpackage.jvu;
import defpackage.jwk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifier extends ivp<ezv> {
    private final jwk a;
    private final jvu b;
    private final eva c;
    private final boolean d = false;
    private final boolean f;
    private final boolean g;
    private final jvj h;
    private final fhi i;
    private final juw j;
    private final hzi k;

    public CoreTextFieldSemanticsModifier(jwk jwkVar, jvu jvuVar, eva evaVar, boolean z, boolean z2, jvj jvjVar, fhi fhiVar, juw juwVar, hzi hziVar) {
        this.a = jwkVar;
        this.b = jvuVar;
        this.c = evaVar;
        this.f = z;
        this.g = z2;
        this.h = jvjVar;
        this.i = fhiVar;
        this.j = juwVar;
        this.k = hziVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ezv(this.a, this.b, this.c, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ezv ezvVar = (ezv) hvhVar;
        boolean z = ezvVar.d;
        boolean z2 = ezvVar.e;
        juw juwVar = ezvVar.h;
        fhi fhiVar = ezvVar.g;
        ezvVar.a = this.a;
        jvu jvuVar = this.b;
        ezvVar.b = jvuVar;
        ezvVar.c = this.c;
        boolean z3 = this.f;
        ezvVar.d = z3;
        ezvVar.f = this.h;
        fhi fhiVar2 = this.i;
        ezvVar.g = fhiVar2;
        juw juwVar2 = this.j;
        ezvVar.h = juwVar2;
        ezvVar.i = this.k;
        if (z3 != z || !ffkj.e(juwVar2, juwVar) || this.g != z2 || !jpm.i(jvuVar.c)) {
            ixo.a(ezvVar);
        }
        if (ffkj.e(fhiVar2, fhiVar)) {
            return;
        }
        fhiVar2.g = new ezu(ezvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        if (!ffkj.e(this.a, coreTextFieldSemanticsModifier.a) || !ffkj.e(this.b, coreTextFieldSemanticsModifier.b) || !ffkj.e(this.c, coreTextFieldSemanticsModifier.c)) {
            return false;
        }
        boolean z = coreTextFieldSemanticsModifier.d;
        return this.f == coreTextFieldSemanticsModifier.f && this.g == coreTextFieldSemanticsModifier.g && ffkj.e(this.h, coreTextFieldSemanticsModifier.h) && ffkj.e(this.i, coreTextFieldSemanticsModifier.i) && ffkj.e(this.j, coreTextFieldSemanticsModifier.j) && ffkj.e(this.k, coreTextFieldSemanticsModifier.k);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        jvj jvjVar = this.h;
        boolean z = this.g;
        return (((((((((((((hashCode * 31) + ezh.a(false)) * 31) + ezh.a(this.f)) * 31) + ezh.a(z)) * 31) + jvjVar.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=false, enabled=" + this.f + ", isPassword=" + this.g + ", offsetMapping=" + this.h + ", manager=" + this.i + ", imeOptions=" + this.j + ", focusRequester=" + this.k + ')';
    }
}
