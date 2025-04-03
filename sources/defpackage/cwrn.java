package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwrn extends cwvr {
    public ctbe aj;
    private PackageManager ak;
    private Preference al;
    private Preference an;
    private Preference ao;

    public final boolean aU(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(G().getPackageManager()) == null) {
            return false;
        }
        aQ(intent);
        return true;
    }

    @Override // defpackage.efad, defpackage.ea
    public final void ao() {
        super.ao();
        try {
            this.al.n(this.ak.getPackageInfo(G().getPackageName(), 128).versionName);
            this.an.o = new oni() { // from class: cwrl
                @Override // defpackage.oni
                public final boolean a(Preference preference) {
                    cwrn cwrnVar = cwrn.this;
                    return cwrnVar.aU(cwrnVar.aj.a());
                }
            };
            this.ao.o = new oni() { // from class: cwrm
                @Override // defpackage.oni
                public final boolean a(Preference preference) {
                    cwrn cwrnVar = cwrn.this;
                    return cwrnVar.aU(cwrnVar.aj.b());
                }
            };
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Package of a resumed activity doesn't exist", e);
        }
    }

    @Override // defpackage.ont
    public final void t(Bundle bundle) {
        gi(R.xml.privacy_terms_preference);
        this.ak = G().getPackageManager();
        this.al = a(Y(R.string.application_version_number));
        this.an = a(Y(R.string.privacy_policy_pref_key));
        this.ao = a(Y(R.string.terms_of_service_pref_key));
    }
}
