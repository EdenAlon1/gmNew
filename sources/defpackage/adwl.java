package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adwl implements ellh {
    final /* synthetic */ adwi a;

    public adwl(adwi adwiVar) {
        this.a = adwiVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        adya adyaVar = new adya();
        fbae.e(adyaVar);
        adwi adwiVar = this.a;
        cg cgVar = new cg(adwiVar.a.a());
        cgVar.F(R.anim.enter_right, R.anim.exit_left);
        cgVar.E(R.id.advanced_feedback_fragment_container, adyaVar);
        cgVar.c();
        adwiVar.d = 3;
        return elli.a;
    }
}
