package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajly implements adky {
    public final adkx a;
    public final ffbr b;
    private final Activity c;
    private final elbx d;
    private final ajlz e;

    public ajly(Activity activity, elbx elbxVar, adkx adkxVar, ajlz ajlzVar, ffbr ffbrVar) {
        activity.getClass();
        elbxVar.getClass();
        ajlzVar.getClass();
        this.c = activity;
        this.d = elbxVar;
        this.a = adkxVar;
        this.e = ajlzVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.adky
    public final ebgo a() {
        Activity activity = this.c;
        ebgn k = ebgo.k();
        k.b(activity.getString(R.string.account_menu_profile_label));
        ebge ebgeVar = (ebge) k;
        ebgeVar.b = ku.a(this.c, R.drawable.gs_person_vd_theme_24);
        ebgeVar.e = this.e;
        k.c(235749);
        ebgeVar.d = new elay(this.d, "Clicked profile plugin", new View.OnClickListener() { // from class: ajlx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ajly ajlyVar = ajly.this;
                ((adhn) ajlyVar.b.b()).a(new adhm(adhl.EDIT_PROFILE));
                ajlyVar.a.a(8);
            }
        });
        return k.d();
    }
}
