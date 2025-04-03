package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adld implements adky {
    private final Activity a;
    private final elbx b;
    private final ffbr c;
    private final ffbr d;

    public adld(Activity activity, elbx elbxVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = activity;
        this.b = elbxVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    @Override // defpackage.adky
    public final ebgo a() {
        Activity activity = this.a;
        ebgn k = ebgo.k();
        k.b(activity.getString(R.string.account_menu_debug));
        Drawable a = ku.a(this.a, R.drawable.quantum_gm_ic_bug_report_vd_theme_24);
        a.getClass();
        ebge ebgeVar = (ebge) k;
        ebgeVar.b = a;
        ebgeVar.e = (ebfq) this.d.b();
        ebgeVar.d = new elay(this.b, "Clicked debug", (View.OnClickListener) this.c.b());
        return k.d();
    }
}
