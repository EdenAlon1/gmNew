package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dczh {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragmentPeer");
    public dczk b;
    public final String c;
    public final dcze d;
    public final ffbr e;
    public final ffbr f;
    public final ejlq g;
    public final ejxn h;
    public final ffbr i;
    public final elbx j;
    public final ffbr k;
    public final ejlr l = new ejlr<Boolean, Void>() { // from class: dczh.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            dczk dczkVar;
            dczk dczkVar2;
            Boolean bool = (Boolean) obj;
            csjy.j("Bugle", "CarrierTos: successfully updated consent: %s", bool);
            if (bool.booleanValue()) {
                dczh dczhVar = dczh.this;
                dczhVar.a();
                ((cmne) dczhVar.f.b()).k(dczhVar.c, eqws.CARRIER_TOS_POPUP_BOTTOM_SHEET_DIALOG);
                if (dczhVar.d.G() == null || (dczkVar2 = dczhVar.b) == null) {
                    return;
                }
                dczkVar2.d();
                return;
            }
            dczh dczhVar2 = dczh.this;
            dczhVar2.a();
            ((altk) dczhVar2.e.b()).z();
            ((cmne) dczhVar2.f.b()).k(dczhVar2.c, eqws.CARRIER_TOS_POPUP_BOTTOM_SHEET_DIALOG);
            eg G = dczhVar2.d.G();
            if (G == 0 || (dczkVar = dczhVar2.b) == null) {
                return;
            }
            dczkVar.d();
            String string = G.getResources().getString(R.string.fast_track_popup_declined_snack_bar_text_v2);
            if ((G instanceof ddwh ? ((ddwh) G).l() : null) == null) {
                int i = engw.d;
                engw engwVar = enou.a;
            }
            aens.b(G, string);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            csjy.g("Bugle", "CarrierTos: failed to update consent: %s due to: %s", (Boolean) obj, th.getMessage());
            dczk dczkVar = dczh.this.b;
            if (dczkVar != null) {
                dczkVar.d();
            }
        }
    };
    private final ffbr m;

    public dczh(String str, dcze dczeVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ejlq ejlqVar, ejxn ejxnVar, ffbr ffbrVar4, elbx elbxVar, ffbr ffbrVar5) {
        this.c = str;
        this.d = dczeVar;
        this.e = ffbrVar;
        this.m = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ejlqVar;
        this.h = ejxnVar;
        this.i = ffbrVar4;
        this.j = elbxVar;
        this.k = ffbrVar5;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("CarrierTosPopupBottomSheetDialogFragment does not have a simId");
        }
        dczeVar.p(false);
    }

    public final void a() {
        ((cmfj) this.i.b()).f(new djro(this.c));
    }

    public final elfl b(int i) {
        return ((cmel) this.m.b()).m(this.c, i);
    }
}
