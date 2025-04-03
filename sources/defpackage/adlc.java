package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlc implements View.OnClickListener {
    private final Activity a;
    private final ffbr b;
    private final adkx c;

    public adlc(Activity activity, ffbr ffbrVar, adkx adkxVar) {
        this.a = activity;
        this.b = ffbrVar;
        this.c = adkxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.a(4);
        View findViewById = this.a.findViewById(R.id.selected_account_disc);
        if (findViewById == null) {
            return;
        }
        Activity activity = this.a;
        od odVar = new od(activity);
        odVar.b = new vb();
        oo ooVar = new oo(activity, odVar, findViewById, false, R.attr.popupMenuStyle);
        ooVar.b = 5;
        ooVar.c = new vc();
        ((dafa) this.b.b()).b(odVar, false, Optional.of(this.a));
        ooVar.f();
    }
}
