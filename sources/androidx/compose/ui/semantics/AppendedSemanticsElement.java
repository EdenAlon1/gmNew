package androidx.compose.ui.semantics;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.jje;
import defpackage.jjn;
import defpackage.jjr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends ivp<jje> implements jjr {
    private final boolean a;
    private final ffji b;

    public AppendedSemanticsElement(boolean z, ffji ffjiVar) {
        this.a = z;
        this.b = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new jje(this.a, false, this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        jje jjeVar = (jje) hvhVar;
        jjeVar.a = this.a;
        jjeVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.a == appendedSemanticsElement.a && this.b == appendedSemanticsElement.b;
    }

    @Override // defpackage.jjr
    public final jjn f() {
        jjn jjnVar = new jjn();
        jjnVar.b = this.a;
        this.b.invoke(jjnVar);
        return jjnVar;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }
}
