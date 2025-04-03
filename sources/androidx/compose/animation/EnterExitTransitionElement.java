package androidx.compose.animation;

import defpackage.csu;
import defpackage.cud;
import defpackage.cue;
import defpackage.cug;
import defpackage.das;
import defpackage.dbe;
import defpackage.ffix;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EnterExitTransitionElement extends ivp<cud> {
    private final dbe a;
    private final das b;
    private final das c;
    private final das d;
    private final cue f;
    private final cug g;
    private final ffix h;
    private final csu i;

    public EnterExitTransitionElement(dbe dbeVar, das dasVar, das dasVar2, das dasVar3, cue cueVar, cug cugVar, ffix ffixVar, csu csuVar) {
        this.a = dbeVar;
        this.b = dasVar;
        this.c = dasVar2;
        this.d = dasVar3;
        this.f = cueVar;
        this.g = cugVar;
        this.h = ffixVar;
        this.i = csuVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new cud(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        cud cudVar = (cud) hvhVar;
        cudVar.a = this.a;
        cudVar.b = this.b;
        cudVar.c = this.c;
        cudVar.d = this.d;
        cudVar.e = this.f;
        cudVar.f = this.g;
        cudVar.g = this.h;
        cudVar.i = this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return ffkj.e(this.a, enterExitTransitionElement.a) && ffkj.e(this.b, enterExitTransitionElement.b) && ffkj.e(this.c, enterExitTransitionElement.c) && ffkj.e(this.d, enterExitTransitionElement.d) && ffkj.e(this.f, enterExitTransitionElement.f) && ffkj.e(this.g, enterExitTransitionElement.g) && ffkj.e(this.h, enterExitTransitionElement.h) && ffkj.e(this.i, enterExitTransitionElement.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        das dasVar = this.b;
        int hashCode2 = (hashCode + (dasVar == null ? 0 : dasVar.hashCode())) * 31;
        das dasVar2 = this.c;
        int hashCode3 = (hashCode2 + (dasVar2 == null ? 0 : dasVar2.hashCode())) * 31;
        das dasVar3 = this.d;
        return ((((((((hashCode3 + (dasVar3 != null ? dasVar3.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.a + ", sizeAnimation=" + this.b + ", offsetAnimation=" + this.c + ", slideAnimation=" + this.d + ", enter=" + this.f + ", exit=" + this.g + ", isEnabled=" + this.h + ", graphicsLayerBlock=" + this.i + ')';
    }
}
