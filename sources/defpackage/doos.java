package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doos {
    public final cyq a;
    public final cyq b;
    public final cyq c;
    public final cyq d;
    public final cyz e;
    public final ffji f;
    public final cyz g;
    public final cyq h;
    public final cyq i;
    public final cyq j;
    public final cyq k;
    public final cyq l;
    public final cyl m;
    public final cyl n;
    public final cue o;
    public final cyl p;
    public final dooq q;
    public final door r;
    private final cyq s;
    private final cyq t;
    private final cug u;

    public doos(cyq cyqVar, cyq cyqVar2, cyq cyqVar3, cyq cyqVar4, cyq cyqVar5, cyq cyqVar6, cyz cyzVar, ffji ffjiVar, cyz cyzVar2, cyq cyqVar7, cyq cyqVar8, cyq cyqVar9, cyq cyqVar10, cyq cyqVar11, cyl cylVar, cyl cylVar2, cue cueVar, cug cugVar, cyl cylVar3, dooq dooqVar, door doorVar) {
        this.a = cyqVar;
        this.b = cyqVar2;
        this.s = cyqVar3;
        this.t = cyqVar4;
        this.c = cyqVar5;
        this.d = cyqVar6;
        this.e = cyzVar;
        this.f = ffjiVar;
        this.g = cyzVar2;
        this.h = cyqVar7;
        this.i = cyqVar8;
        this.j = cyqVar9;
        this.k = cyqVar10;
        this.l = cyqVar11;
        this.m = cylVar;
        this.n = cylVar2;
        this.o = cueVar;
        this.u = cugVar;
        this.p = cylVar3;
        this.q = dooqVar;
        this.r = doorVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doos)) {
            return false;
        }
        doos doosVar = (doos) obj;
        return ffkj.e(this.a, doosVar.a) && ffkj.e(this.b, doosVar.b) && ffkj.e(this.s, doosVar.s) && ffkj.e(this.t, doosVar.t) && ffkj.e(this.c, doosVar.c) && ffkj.e(this.d, doosVar.d) && ffkj.e(this.e, doosVar.e) && ffkj.e(this.f, doosVar.f) && ffkj.e(this.g, doosVar.g) && ffkj.e(this.h, doosVar.h) && ffkj.e(this.i, doosVar.i) && ffkj.e(this.j, doosVar.j) && ffkj.e(this.k, doosVar.k) && ffkj.e(this.l, doosVar.l) && ffkj.e(this.m, doosVar.m) && ffkj.e(this.n, doosVar.n) && ffkj.e(this.o, doosVar.o) && ffkj.e(this.u, doosVar.u) && ffkj.e(this.p, doosVar.p) && ffkj.e(this.q, doosVar.q) && ffkj.e(this.r, doosVar.r);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.u.hashCode()) * 31) + this.p.hashCode()) * 31) - 566205836) * 31) + this.r.hashCode();
    }

    public final String toString() {
        return "AbcMotionScheme(bannerSlideInAnimationSpec=" + this.a + ", bannerSlideOutAnimationSpec=" + this.b + ", composeAiIconScaleInSpec=" + this.s + ", composeAiIconScaleOutSpec=" + this.t + ", textResultsBarSlideInAnimationSpec=" + this.c + ", reactionsBarFadeOutAnimationSpec=" + this.d + ", timerDotAnimationSpec=" + this.e + ", recordingDotAnimationSpec=" + this.f + ", recordingDotIndicatorAnimationSpec=" + this.g + ", swipeUpToLockPillZIndexAnimationSpec=" + this.h + ", topAppBarFadeInAnimationSpec=" + this.i + ", topAppBarFadeOutAnimationSpec=" + this.j + ", conversationBackgroundFadeInAnimationSpec=" + this.k + ", conversationBackgroundFadeOutAnimationSpec=" + this.l + ", topAppBarHighlightAnimationSpec=" + this.m + ", aiButtonBackgroundAnimationSpec=" + this.n + ", animatedLinkPreviewEnterTransitionSpec=" + this.o + ", animatedLinkPreviewExitTransitionSpec=" + this.u + ", swipeButtonSnapAnimationSpec=" + this.p + ", duration=" + this.q + ", easing=" + this.r + ")";
    }
}
