package defpackage;

import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountArguments;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adoa implements eivv {
    final /* synthetic */ adob a;

    public adoa(adob adobVar) {
        this.a = adobVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        if (ffkj.e(eivtVar.b(), "pseudonymous")) {
            ensk h = adob.a.h();
            h.Y(ente.a, "BugleAccountSignOut");
            ((enrr) h.h("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountActivityPeer$SignOutAccountActivityPeerAccountUiCallbacks", "onAccountChanged", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "SignOutAccountActivityPeer.kt")).q("Switched to pseudonymous account, finishing sign out");
            this.a.b.setResult(-1);
            this.a.b.finishAfterTransition();
            return;
        }
        Intent intent = this.a.b.getIntent();
        intent.getClass();
        if (Build.VERSION.SDK_INT > 33) {
            parcelableExtra2 = intent.getParcelableExtra("EXTRA_CURRENT_ACCOUNT_ID", eisx.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent.getParcelableExtra("EXTRA_CURRENT_ACCOUNT_ID");
        }
        eisx eisxVar = (eisx) parcelableExtra;
        if (eisxVar != null && !ffkj.e(eivtVar.a(), eisxVar)) {
            ensk h2 = adob.a.h();
            h2.Y(ente.a, "BugleAccountSignOut");
            ((enrr) h2.h("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountActivityPeer$SignOutAccountActivityPeerAccountUiCallbacks", "onAccountChanged", 113, "SignOutAccountActivityPeer.kt")).q("Switched to another account, finishing sign out");
            this.a.b.finishAfterTransition();
        }
        this.a.b.getIntent().putExtra("EXTRA_CURRENT_ACCOUNT_ID", eivtVar.a());
        eisx a = eivtVar.a();
        a.getClass();
        eisx a2 = this.a.a();
        adoq adoqVar = new adoq();
        fbae.e(adoqVar);
        ekky.b(adoqVar, a);
        Bundle bundle = adoqVar.m;
        if (bundle != null) {
            bundle.putParcelable("sign_out_account_arguments", new SignOutAccountArguments(a2));
        }
        cg cgVar = new cg(this.a.b.a());
        cgVar.s(R.id.content, adoqVar);
        cgVar.c();
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        ((adio) this.a.d.b()).a(eiupVar);
        this.a.b.setResult(0);
        this.a.b.finish();
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
