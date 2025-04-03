package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlm implements adky {
    private final Activity a;
    private final elbx b;
    private final ffbr c;

    public adlm(Activity activity, elbx elbxVar, ffbr ffbrVar) {
        this.a = activity;
        this.b = elbxVar;
        this.c = ffbrVar;
    }

    @Override // defpackage.adky
    public final ebgo a() {
        Activity activity = this.a;
        ebgn k = ebgo.k();
        k.b(activity.getString(R.string.account_menu_spam_and_blocked));
        Drawable a = ku.a(this.a, R.drawable.quantum_gm_ic_gshield_vd_theme_24);
        a.getClass();
        ebge ebgeVar = (ebge) k;
        ebgeVar.b = a;
        ebgeVar.d = new elay(this.b, "Clicked Spam & blocked", (View.OnClickListener) this.c.b());
        return k.d();
    }
}
