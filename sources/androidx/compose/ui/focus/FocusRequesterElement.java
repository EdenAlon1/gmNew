package androidx.compose.ui.focus;

import defpackage.ffkj;
import defpackage.hvh;
import defpackage.hzi;
import defpackage.hzn;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusRequesterElement extends ivp<hzn> {
    private final hzi a;

    public FocusRequesterElement(hzi hziVar) {
        this.a = hziVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new hzn(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        hzn hznVar = (hzn) hvhVar;
        hznVar.a.d.m(hznVar);
        hznVar.a = this.a;
        hznVar.a.d.n(hznVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && ffkj.e(this.a, ((FocusRequesterElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
