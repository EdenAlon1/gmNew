package androidx.compose.foundation;

import defpackage.dgs;
import defpackage.dwn;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HoverableElement extends ivp<dgs> {
    private final dwn a;

    public HoverableElement(dwn dwnVar) {
        this.a = dwnVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dgs(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        dgs dgsVar = (dgs) hvhVar;
        dwn dwnVar = dgsVar.a;
        dwn dwnVar2 = this.a;
        if (ffkj.e(dwnVar, dwnVar2)) {
            return;
        }
        dgsVar.f();
        dgsVar.a = dwnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && ffkj.e(((HoverableElement) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
