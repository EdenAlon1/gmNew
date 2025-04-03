package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlb implements adky {
    public final adkx a;
    public final ffbr b;
    private final Activity c;
    private final elbx d;

    public adlb(Activity activity, elbx elbxVar, adkx adkxVar, ffbr ffbrVar) {
        this.c = activity;
        this.d = elbxVar;
        this.a = adkxVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.adky
    public final ebgo a() {
        Activity activity = this.c;
        ebgn k = ebgo.k();
        k.b(activity.getString(R.string.account_menu_archived_messages));
        Drawable a = ku.a(this.c, R.drawable.quantum_gm_ic_archive_vd_theme_24);
        a.getClass();
        ebge ebgeVar = (ebge) k;
        ebgeVar.b = a;
        ebgeVar.d = new elay(this.d, "Clicked Archived messages", new View.OnClickListener() { // from class: adla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adlb adlbVar = adlb.this;
                ((adhn) adlbVar.b.b()).a(new adhm(adhl.ARCHIVED));
                adlbVar.a.a(1);
            }
        });
        return k.d();
    }
}
