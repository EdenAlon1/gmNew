package androidx.compose.animation;

import defpackage.cuq;
import defpackage.cww;
import defpackage.cwz;
import defpackage.ffix;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SkipToLookaheadElement extends ivp<cww> {
    private final cuq a;
    private final ffix b;

    public SkipToLookaheadElement(cuq cuqVar, ffix ffixVar) {
        this.a = cuqVar;
        this.b = ffixVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new cww(this.a, this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        cww cwwVar = (cww) hvhVar;
        cwwVar.a.b(this.a);
        cwwVar.b.b(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipToLookaheadElement)) {
            return false;
        }
        SkipToLookaheadElement skipToLookaheadElement = (SkipToLookaheadElement) obj;
        return ffkj.e(this.a, skipToLookaheadElement.a) && ffkj.e(this.b, skipToLookaheadElement.b);
    }

    public final int hashCode() {
        cuq cuqVar = this.a;
        return ((cuqVar == null ? 0 : cuqVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SkipToLookaheadElement(scaleToBounds=" + this.a + ", isEnabled=" + this.b + ')';
    }

    public SkipToLookaheadElement() {
        this(null, cwz.a);
    }
}
