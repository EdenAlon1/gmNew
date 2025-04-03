package defpackage;

import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dczl implements ejxk {
    final /* synthetic */ dczh a;

    public dczl(dczh dczhVar) {
        this.a = dczhVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        ensk j = dczh.a.j();
        j.Y(ente.a, "BugleRcs");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragmentPeer$TermsAndConditionsDataCallback", "onLoadError", (char) 145, "CarrierTosPopupBottomSheetDialogFragmentPeer.java")).q("Failed to load terms and conditions data");
        dczk dczkVar = this.a.b;
        if (dczkVar != null) {
            dczkVar.d();
        }
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cmgh cmghVar = (cmgh) ((Optional) obj).orElse(null);
        if (cmghVar == null) {
            ensk j = dczh.a.j();
            j.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragmentPeer$TermsAndConditionsDataCallback", "onLoaded", 118, "CarrierTosPopupBottomSheetDialogFragmentPeer.java")).q("TermsAndConditionsData is null");
            dczk dczkVar = this.a.b;
            if (dczkVar != null) {
                dczkVar.d();
                return;
            }
            return;
        }
        ((TextView) this.a.d.N().findViewById(R.id.carrier_tos_popup_title)).setText(cmghVar.d);
        TextView textView = (TextView) this.a.d.N().findViewById(R.id.carrier_tos_popup_text_paragraph);
        textView.setText(cmghVar.e);
        egyl.b(textView);
        egyl.c(textView);
        if (cmghVar.a >= 2) {
            TextView textView2 = (TextView) this.a.d.N().findViewById(R.id.carrier_tos_popup_text_sim_info);
            textView2.setText(this.a.d.Z(R.string.carrier_tos_popup_sim_info_text, Integer.valueOf(cmghVar.b), cmghVar.c));
            textView2.setVisibility(0);
        }
    }
}
