package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daab implements aefa {
    public final eg a;
    public final ffbr b;

    public daab(eg egVar, ffbr ffbrVar) {
        this.a = egVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.aefa
    public final void a(ejlq ejlqVar, View view) {
        eg egVar = this.a;
        aens.a(this.a, egVar.getString(R.string.google_tos_banner_dismissed_snackbar_text), egVar.getString(R.string.google_tos_banner_dismissed_snackbar_action_text), new View.OnClickListener() { // from class: daaa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                daab daabVar = daab.this;
                eldl.p(daabVar.a, ((akvg) daabVar.b.b()).o(daabVar.a));
            }
        });
    }
}
