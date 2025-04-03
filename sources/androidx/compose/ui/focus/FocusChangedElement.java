package androidx.compose.ui.focus;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.hyg;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusChangedElement extends ivp<hyg> {
    private final ffji a;

    public FocusChangedElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new hyg(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((hyg) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && this.a == ((FocusChangedElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
