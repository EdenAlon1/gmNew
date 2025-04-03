package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adpm implements adky {
    public final adkx a;
    public final ffbr b;
    private final Activity c;
    private final elbx d;
    private final adpn e;

    public adpm(Activity activity, elbx elbxVar, adkx adkxVar, adpn adpnVar, ffbr ffbrVar) {
        activity.getClass();
        elbxVar.getClass();
        adpnVar.getClass();
        this.c = activity;
        this.d = elbxVar;
        this.a = adkxVar;
        this.e = adpnVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.adky
    public final ebgo a() {
        Activity activity = this.c;
        ebgn k = ebgo.k();
        k.b(activity.getString(R.string.account_menu_sign_out_label));
        ebge ebgeVar = (ebge) k;
        ebgeVar.b = ku.a(this.c, R.drawable.gs_account_circle_off_vd_theme_24);
        ebgeVar.e = this.e;
        ebgeVar.d = new elay(this.d, "Clicked sign out account plugin", new View.OnClickListener() { // from class: adpl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adpm adpmVar = adpm.this;
                ((adhn) adpmVar.b.b()).a(new adhm(adhl.SIGN_OUT_ACCOUNT));
                adpmVar.a.a(7);
            }
        });
        return k.d();
    }
}
