package androidx.compose.ui.layout;

import defpackage.ffjn;
import defpackage.hvh;
import defpackage.ioo;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LayoutElement extends ivp<ioo> {
    private final ffjn a;

    public LayoutElement(ffjn ffjnVar) {
        this.a = ffjnVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ioo(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((ioo) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && this.a == ((LayoutElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
