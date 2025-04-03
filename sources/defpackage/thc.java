package defpackage;

import android.content.Intent;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.fi.FiSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class thc implements eivv {
    final /* synthetic */ thd a;

    public thc(thd thdVar) {
        this.a = thdVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        thd.a.p("onAccountChanged called, opening FiSettingsFragment.");
        cg cgVar = new cg(this.a.c.a());
        eisx a = eivtVar.a();
        thf thfVar = new thf();
        fbae.e(thfVar);
        ekky.b(thfVar, a);
        cgVar.E(R.id.fragment_container, thfVar);
        cgVar.c();
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        int i;
        thd.a.s("onAccountError called.", eiupVar);
        if (((Boolean) ((cfup) thd.b.get()).e()).booleanValue()) {
            thd thdVar = this.a;
            if (eiupVar instanceof eiuu) {
                Throwable cause = eiupVar.getCause();
                i = cause instanceof eizq ? 102 : cause instanceof IllegalStateException ? 103 : cause instanceof ejmg ? 104 : cause instanceof SecurityException ? 105 : EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            } else {
                i = eiupVar instanceof eiuq ? 4 : eiupVar instanceof eiuv ? 1 : eiupVar instanceof eius ? 2 : eiupVar instanceof eiuw ? 3 : 0;
            }
            thdVar.d.e("Bugle.Accounts.FiSettingsActivity.onAccountError.Count", i);
        }
        FiSettingsActivity fiSettingsActivity = this.a.c;
        Intent a = tcn.a(fiSettingsActivity);
        if (fiSettingsActivity.getIntent().hasExtra("entry_point")) {
            a = a.putExtra("entry_point", this.a.c.getIntent().getIntExtra("entry_point", -1));
        }
        if ((eiupVar instanceof eiuu) && (eiupVar.getCause() instanceof babn)) {
            thd.a.m("There is no linked account; show opt in flow instead");
            this.a.c.startActivity(a);
            this.a.c.finish();
        } else {
            if (!(eiupVar instanceof eiuq)) {
                throw new IllegalStateException("Unexpected account loading error", eiupVar);
            }
            thd.a.m("Account not enabled; show opt in flow instead");
            this.a.c.startActivity(a);
            this.a.c.finish();
        }
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
