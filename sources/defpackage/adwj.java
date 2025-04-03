package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adwj implements ellh {
    final /* synthetic */ adwi a;

    public adwj(adwi adwiVar) {
        this.a = adwiVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        adtw a = ((adxt) ellfVar).a();
        adwn adwnVar = new adwn();
        fbae.e(adwnVar);
        Bundle bundle = new Bundle();
        bundle.putString("advanced_feedback_data_description", a.f());
        bundle.putString("advanced_feedback_data_rationale", a.i());
        bundle.putString("advanced_feedback_data_name", a.g());
        bundle.putString("advanced_feedback_data_rationale_title", a.j());
        adwnVar.at(bundle);
        adwi adwiVar = this.a;
        cg cgVar = new cg(adwiVar.a.a());
        cgVar.F(R.anim.enter, R.anim.exit);
        cgVar.E(R.id.advanced_feedback_fragment_container, adwnVar);
        cgVar.B();
        cgVar.c();
        adwiVar.d = 2;
        return elli.a;
    }
}
