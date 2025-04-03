package androidx.compose.animation;

import defpackage.cws;
import defpackage.cyq;
import defpackage.ffjm;
import defpackage.ffkj;
import defpackage.huo;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SizeAnimationModifierElement extends ivp<cws> {
    private final cyq a;
    private final huo b;
    private final ffjm c = null;

    public SizeAnimationModifierElement(cyq cyqVar, huo huoVar) {
        this.a = cyqVar;
        this.b = huoVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new cws(this.a, this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        cws cwsVar = (cws) hvhVar;
        cwsVar.a = this.a;
        cwsVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        if (!ffkj.e(this.a, sizeAnimationModifierElement.a) || !ffkj.e(this.b, sizeAnimationModifierElement.b)) {
            return false;
        }
        ffjm ffjmVar = sizeAnimationModifierElement.c;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.a + ", alignment=" + this.b + ", finishedListener=null)";
    }
}
