package androidx.compose.material3;

import defpackage.dwn;
import defpackage.ffkj;
import defpackage.ges;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class InteractionSourceModifierElement extends ivp<ges> {
    private final dwn a;

    public InteractionSourceModifierElement(dwn dwnVar) {
        this.a = dwnVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ges();
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InteractionSourceModifierElement) && ffkj.e(this.a, ((InteractionSourceModifierElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InteractionSourceModifierElement(interactionSource=" + this.a + ')';
    }
}
