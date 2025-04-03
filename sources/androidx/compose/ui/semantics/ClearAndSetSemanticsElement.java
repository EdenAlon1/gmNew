package androidx.compose.ui.semantics;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.jje;
import defpackage.jjn;
import defpackage.jjr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends ivp<jje> implements jjr {
    private final ffji a;

    public ClearAndSetSemanticsElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new jje(false, true, this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((jje) hvhVar).b = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && this.a == ((ClearAndSetSemanticsElement) obj).a;
    }

    @Override // defpackage.jjr
    public final jjn f() {
        jjn jjnVar = new jjn();
        jjnVar.b = false;
        jjnVar.c = true;
        this.a.invoke(jjnVar);
        return jjnVar;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
