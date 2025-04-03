package androidx.compose.foundation;

import defpackage.dgh;
import defpackage.dwn;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusableElement extends ivp<dgh> {
    private final dwn a;

    public FocusableElement(dwn dwnVar) {
        this.a = dwnVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dgh(this.a, 1, null);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((dgh) hvhVar).k(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusableElement) && ffkj.e(this.a, ((FocusableElement) obj).a);
    }

    public final int hashCode() {
        dwn dwnVar = this.a;
        if (dwnVar != null) {
            return dwnVar.hashCode();
        }
        return 0;
    }
}
