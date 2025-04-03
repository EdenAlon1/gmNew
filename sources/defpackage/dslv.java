package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dslv extends ea implements dsfw {
    static final /* synthetic */ ffmx[] aG;
    public static final enru aH;
    public static final dqgm aI;
    public final dslw aJ;
    public ernh aK;
    public ffbr aL;
    public ffsk aM;
    public Optional aN;
    public final ffbz aO;
    public ffix aP;
    public Instant aQ;
    protected ffix aR;
    private Instant ah;
    private final Integer sJ;
    private final ffls sK;
    private final ffbz sN;
    private final ffbz sO;
    private final ffbz sP;
    private final ffls sQ;

    static {
        ffko ffkoVar = new ffko(dslv.class, "configurationOverride", "getConfigurationOverride()Lcom/google/android/libraries/compose/ui/fragment/HugoFragmentConfiguration;", 0);
        int i = fflc.a;
        aG = new ffmx[]{ffkoVar, new ffko(dslv.class, "isUiReady", "isUiReady()Z", 0)};
        aH = enru.c("com/google/android/libraries/compose/ui/fragment/HugoFragment");
        aI = new dqgm(0L);
    }

    public dslv() {
        this(null, null);
    }

    @Override // defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.M(layoutInflater, viewGroup, bundle);
        Integer num = this.sJ;
        if (num == null) {
            throw new IllegalArgumentException("No layoutId provided despite no onCreateView override.");
        }
        View inflate = K().inflate(num.intValue(), viewGroup, false);
        inflate.getClass();
        return inflate;
    }

    public final dslw bA() {
        if (!gX()) {
            return (dslw) this.sN.a();
        }
        dslw bB = bB();
        return bB != null ? bB : bz();
    }

    public final dslw bB() {
        return (dslw) this.sK.c(aG[0]);
    }

    public final ernh bC() {
        ernh ernhVar = this.aK;
        if (ernhVar != null) {
            return ernhVar;
        }
        ffkj.c("timeSource");
        return null;
    }

    public final Duration bD() {
        Duration between = Duration.between(this.ah, this.aQ);
        between.getClass();
        return between;
    }

    public final ffix bE() {
        ffix ffixVar = this.aR;
        if (ffixVar != null) {
            return ffixVar;
        }
        ffkj.c("draftController");
        return null;
    }

    public final ffsk bF() {
        ffsk ffskVar = this.aM;
        if (ffskVar != null) {
            return ffskVar;
        }
        ffkj.c("uiScope");
        return null;
    }

    public final void bG(dslw dslwVar) {
        this.sK.d(aG[0], dslwVar);
    }

    public final void bH(Instant instant) {
        instant.getClass();
        this.aQ = instant;
    }

    public final boolean bI() {
        return ((Boolean) this.sQ.c(aG[1])).booleanValue();
    }

    public final void bJ() {
        this.sQ.d(aG[1], true);
    }

    public final dqkk by() {
        return (dqkk) this.sP.a();
    }

    public final dslw bz() {
        return (dslw) this.sO.a();
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        this.ah = bC().a();
    }

    public void gV(ffix ffixVar) {
        this.aR = ffixVar;
    }

    public void gW(dslw dslwVar) {
        enrr enrrVar = (enrr) aH.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment", "onConfigurationChangedAfterUiReady", 216, "HugoFragment.kt");
        int i = fflc.a;
        enrrVar.t("%s configuration has changed", new ffkb(getClass()).c());
    }

    public boolean gX() {
        return false;
    }

    public boolean gY() {
        return false;
    }

    public dslv(Integer num, dslw dslwVar) {
        this.sJ = num;
        this.aJ = dslwVar;
        this.sK = new dslt(this);
        this.aO = ffca.a(new ffix() { // from class: dsll
            @Override // defpackage.ffix
            public final Object invoke() {
                dslv dslvVar = dslv.this;
                if (dslvVar.gX()) {
                    return fgdm.a(dslvVar.bA());
                }
                throw new IllegalStateException("Check failed.");
            }
        });
        this.sN = ffca.a(new ffix() { // from class: dslm
            @Override // defpackage.ffix
            public final Object invoke() {
                dslv dslvVar = dslv.this;
                dslw bB = dslvVar.bB();
                return bB == null ? dslvVar.bz() : bB;
            }
        });
        this.sO = ffca.a(new ffix() { // from class: dsln
            @Override // defpackage.ffix
            public final Object invoke() {
                dslv dslvVar = dslv.this;
                Optional optional = dslvVar.aN;
                if (optional == null) {
                    ffkj.c("providedConfiguration");
                    optional = null;
                }
                final ffji ffjiVar = new ffji() { // from class: dslp
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ffbr ffbrVar = (ffbr) obj;
                        enru enruVar = dslv.aH;
                        ffbrVar.getClass();
                        return (dslw) ffbrVar.b();
                    }
                };
                Optional map = optional.map(new Function() { // from class: dslq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        enru enruVar = dslv.aH;
                        return ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                map.getClass();
                dslw dslwVar2 = (dslw) fflm.a(map, dslvVar.aJ);
                if (dslwVar2 != null) {
                    return dslwVar2;
                }
                Class<?> cls = dslvVar.getClass();
                int i = fflc.a;
                throw new IllegalStateException("Configuration wasn't provided for " + new ffkb(cls).c() + ", which had no default value");
            }
        });
        this.sP = ffca.a(new ffix() { // from class: dslo
            @Override // defpackage.ffix
            public final Object invoke() {
                ffbr ffbrVar = dslv.this.aL;
                if (ffbrVar == null) {
                    ffkj.c("tracingProvider");
                    ffbrVar = null;
                }
                return (dqkk) ffbrVar.b();
            }
        });
        this.sQ = new dslu(false, this);
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.ah = instant;
        Instant instant2 = Instant.EPOCH;
        instant2.getClass();
        this.aQ = instant2;
        P().c(new dslr());
    }
}
