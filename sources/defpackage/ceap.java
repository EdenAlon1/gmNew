package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceap extends ceut {
    public static final cskc a = cskc.g("BugleCms", "CmsOptOutWorkHandler");
    static final emwl b = new cebz();
    public final axdf c;
    public final cqoh d;
    public final akzt e;
    private final cebg f;
    private final axkm g;

    public ceap(cebg cebgVar, axkm axkmVar, axdf axdfVar, cqoh cqohVar, akzt akztVar) {
        this.f = cebgVar;
        this.g = axkmVar;
        this.c = axdfVar;
        this.d = cqohVar;
        this.e = akztVar;
    }

    public static String k(ceal cealVar) {
        if (csgj.a()) {
            ceah b2 = ceah.b(cealVar.h);
            if (b2 == null) {
                b2 = ceah.UNSPECIFIED_FLOW;
            }
            if (b2 == ceah.BNR_OPT_OUT) {
                return "Backup and Restore";
            }
        }
        if (!csgj.a()) {
            return "Multi Device";
        }
        ceah b3 = ceah.b(cealVar.h);
        if (b3 == null) {
            b3 = ceah.UNSPECIFIED_FLOW;
        }
        return b3 == ceah.BNR_AND_MD_OPT_OUT ? "Backup and Restore with Multi Device" : "Multi Device";
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        l.b(cevc.WAKELOCK);
        l.f(poa.EXPONENTIAL);
        l.e(true);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CmsOptOutWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ceal.b.getParserForType();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    @Override // defpackage.ceut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ defpackage.elfl j(defpackage.ceuw r11, defpackage.eyhs r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceap.j(ceuw, eyhs):elfl");
    }

    public final void l(ceal cealVar) {
        if (!csgj.a()) {
            this.g.af(axeu.DISABLE_FAILED);
            return;
        }
        ceah b2 = ceah.b(cealVar.h);
        if (b2 == null) {
            b2 = ceah.UNSPECIFIED_FLOW;
        }
        int ordinal = b2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.g.S(axeu.DISABLE_FAILED);
                return;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    return;
                }
                this.g.S(axeu.DISABLE_FAILED);
                this.g.af(axeu.DISABLE_FAILED);
                return;
            }
        }
        this.g.af(axeu.DISABLE_FAILED);
    }

    public final void m(ceal cealVar, int i) {
        if ((cealVar.c & 16) != 0) {
            axdf axdfVar = this.c;
            emwl emwlVar = b;
            ceaj b2 = ceaj.b(cealVar.e);
            if (b2 == null) {
                b2 = ceaj.UNSPECIFIED_STEP;
            }
            Object apply = emwlVar.apply(b2);
            eyja eyjaVar = cealVar.i;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            axdfVar.v((epfi) apply, eyjaVar, eykm.d(this.d.f().toEpochMilli()), i);
        }
    }
}
