package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcyp implements ajhy {
    public final ea a;
    public final dcxs b;
    private final ffbr c;
    private final ffsk d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private ajid h;

    public dcyp(ea eaVar, ffbr ffbrVar, ffsk ffskVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ajid ajidVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        ffbrVar4.getClass();
        ajidVar.getClass();
        this.a = eaVar;
        this.c = ffbrVar;
        this.d = ffskVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ajidVar;
        this.b = ((dcxt) ffbrVar2.b()).a(epgt.PROVISIONING_UI_TYPE_LEGAL_FYI, 5);
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        elfl c;
        dcyg dcygVar = (dcyg) this.c.b();
        c = axol.c(dcygVar.c, ffhe.a, ffsm.a, new dcyf(dcygVar, null));
        return c;
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        this.h = ajidVar;
    }

    @Override // defpackage.ajhy
    public final void d() {
        ((cmfb) this.f.b()).c(epgr.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_DISMISSED);
        this.h.b();
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (z) {
            return true;
        }
        ((altk) this.g.b()).U(epgr.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_SEEN, epgt.PROVISIONING_UI_TYPE_LEGAL_FYI);
        axol.k(this.d, null, new dcyo(this, null), 3);
        String str = true != ((ctyx) ((dcyg) this.c.b()).d.b()).q("fast_track_prompt_dismissed", false) ? "NEW_USERS_UI" : "DECLINED_TOS_UI";
        dcyi dcyiVar = new dcyi();
        fbae.e(dcyiVar);
        ekku.b(dcyiVar, str);
        dcyiVar.t(this.a.I(), "RcsDefaultOnBottomSheetFragmentPeer");
        dcyiVar.H().f = this;
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 15;
    }

    @Override // defpackage.ajhy
    public final void g() {
        d();
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }
}
