package defpackage;

import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adxo implements ctuj {
    final /* synthetic */ adxn a;

    public adxo(adxn adxnVar) {
        this.a = adxnVar;
    }

    @Override // defpackage.ctuj
    public final void c() {
        ((ensz) this.a.l.o().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer$2", "onDenied", 598, "AdvancedFeedbackFragmentPeer.java")).q("Location permission denied");
        adxn adxnVar = this.a;
        for (AdvancedFeedbackDataView advancedFeedbackDataView : adxnVar.k) {
            Optional g = advancedFeedbackDataView.g();
            if (g.isPresent()) {
                if (g.get().getClass() == adxnVar.o.getClass()) {
                    advancedFeedbackDataView.g.setChecked(false);
                }
            }
        }
    }

    @Override // defpackage.ctuj
    public final void d() {
        ((ensz) this.a.l.o().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer$2", "onGranted", 592, "AdvancedFeedbackFragmentPeer.java")).q("Location permission granted");
        this.a.b();
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void b() {
    }
}
