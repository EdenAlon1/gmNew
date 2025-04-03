package defpackage;

import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pla {
    public final pgp a;
    public final pgj b;
    private final ClassLoader c;
    private final WindowExtensions d;

    public pla(ClassLoader classLoader, pgp pgpVar, WindowExtensions windowExtensions) {
        this.c = classLoader;
        this.a = pgpVar;
        this.d = windowExtensions;
        this.b = new pgj(classLoader);
    }

    public final ActivityEmbeddingComponent a() {
        ActivityEmbeddingComponent activityEmbeddingComponent;
        if (this.b.b() && pnz.a("WindowExtensions#getActivityEmbeddingComponent is not valid", new piy(this))) {
            int i = new pgk().a;
            if (i == 1 ? c() : i == 2 ? d() : (i < 3 || i >= 5) ? i == 5 ? f() : i == 6 ? g() : i == 7 ? h() : i >= 8 ? h() : false : e()) {
                try {
                    activityEmbeddingComponent = this.d.getActivityEmbeddingComponent();
                    return activityEmbeddingComponent;
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        return null;
    }

    public final Class b() {
        Class<?> loadClass = this.c.loadClass("androidx.window.extensions.embedding.ActivityEmbeddingComponent");
        loadClass.getClass();
        return loadClass;
    }

    public final boolean c() {
        return pnz.a("ActivityEmbeddingComponent#setEmbeddingRules is not valid", new pks(this)) && pnz.a("ActivityEmbeddingComponent#isActivityEmbedded is not valid", new pkk(this)) && pnz.a("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new pkt(this)) && pnz.a("SplitRule#getSplitRatio is not valid", pki.a) && pnz.a("SplitRule#getLayoutDirection is not valid", pkf.a) && pnz.a("Class ActivityRule is not valid", pjc.a) && pnz.a("Class ActivityRule.Builder is not valid", pja.a) && pnz.a("Class SplitInfo is not valid", pjp.a) && pnz.a("Class SplitPairRule is not valid", pjs.a) && pnz.a("Class SplitPairRule.Builder is not valid", pjq.a) && pnz.a("Class SplitPlaceholderRule is not valid", pjv.a) && pnz.a("Class SplitPlaceholderRule.Builder is not valid", pjt.a);
    }

    public final boolean d() {
        return c() && pnz.a("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new pku(this)) && pnz.a("ActivityEmbeddingComponent#clearSplitInfoCallback is not valid", new pjz(this)) && pnz.a("ActivityEmbeddingComponent#setSplitAttributesCalculator is not valid", new pkv(this)) && pnz.a("SplitInfo#getSplitAttributes is not valid", pkg.a) && pnz.a("SplitPlaceholderRule#getFinishPrimaryWithPlaceholder is not valid", pke.a) && pnz.a("SplitRule#getDefaultSplitAttributes is not valid", pkb.a) && pnz.a("Class ActivityRule.Builder is not valid", pjb.a) && pnz.a("Class EmbeddingRule is not valid", pjl.a) && pnz.a("Class SplitAttributes is not valid", pjn.a) && pnz.a("Class SplitAttributesCalculatorParams is not valid", pjm.a) && pnz.a("Class SplitAttributes.SplitType is not valid", pjw.a) && pnz.a("Class SplitPairRule.Builder is not valid", pjr.a) && pnz.a("Class SplitPlaceholderRule.Builder is not valid", pju.a);
    }

    public final boolean e() {
        return d() && pnz.a("#invalidateTopVisibleSplitAttributes is not valid", new pkj(this)) && pnz.a("#updateSplitAttributes is not valid", new pky(this)) && pnz.a("SplitInfo#getToken is not valid", pkw.a);
    }

    public final boolean f() {
        return e() && pnz.a("ActivityStack#getActivityToken is not valid", piz.a) && pnz.a("registerActivityStackCallback is not valid", new pkn(this)) && pnz.a("unregisterActivityStackCallback is not valid", new pkx(this)) && pnz.a("#pin(unPin)TopActivityStack is not valid", new pkm(this)) && pnz.a("updateSplitAttributes is not valid", new pkz(this)) && pnz.a("SplitInfo#getSplitInfoToken is not valid", pkh.a) && pnz.a("Class AnimationBackground is not valid", pje.a) && pnz.a("Class ActivityStack.Token is not valid", pjd.a) && pnz.a("Class WindowAttributes is not valid", pjx.a) && pnz.a("SplitInfo.Token is not valid", pjo.a) && pnz.a("Class EmbeddingConfiguration.Builder is not valid", pjk.a);
    }

    public final boolean g() {
        return f() && pnz.a("ActivityEmbeddingComponent#getEmbeddedActivityWindowInfo is not valid", new pkd(this)) && pnz.a("ActivityEmbeddingComponent#setEmbeddedActivityWindowInfoCallback is not valid", new pkr(this)) && pnz.a("ActivityEmbeddingComponent#clearEmbeddedActivityWindowInfoCallback is not valid", new pjy(this)) && pnz.a("SplitAttributes#getDividerAttributes is not valid", pkc.a) && pnz.a("SplitAttributes#setDividerAttributes is not valid", pkp.a) && pnz.a("Class EmbeddedActivityWindowInfo is not valid", pjj.a) && pnz.a("Class DividerAttributes is not valid", pji.a) && pnz.a("Class DividerAttributes.Builder is not valid", pjh.a);
    }

    public final boolean h() {
        return g() && pnz.a("SplitAttributes#getAnimationParams is not valid", pka.a) && pnz.a("SplitAttributes#setAnimationParams is not valid", pko.a) && pnz.a("DividerAttributes#isDraggingToFullscreenAllowed is not valid", pkl.a) && pnz.a("DividerAttributes.Builder#setDraggingToFullscreenAllowed is not valid", pkq.a) && pnz.a("Class AnimationParams is not valid", pjg.a) && pnz.a("Class AnimationParams.Builder is not valid", pjf.a);
    }
}
