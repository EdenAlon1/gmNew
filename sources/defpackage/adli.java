package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adli implements adky {
    public final adkx a;
    public final ffbr b;
    public final fazb c;
    private final Activity d;
    private final elbx e;
    private final fazb f;

    public adli(Activity activity, elbx elbxVar, adkx adkxVar, fazb fazbVar, ffbr ffbrVar, fazb fazbVar2) {
        this.d = activity;
        this.e = elbxVar;
        this.a = adkxVar;
        this.f = fazbVar;
        this.b = ffbrVar;
        this.c = fazbVar2;
    }

    @Override // defpackage.adky
    public final ebgo a() {
        final adhl adhlVar;
        final int i;
        int i2;
        if (((Optional) this.f.b()).isPresent() && ((acio) ((Optional) this.f.b()).get()).m()) {
            adhlVar = adhl.CHOOOSE_TEXTING_MODE;
            i = 6;
            i2 = R.string.account_menu_choose_texting_mode;
        } else {
            adhlVar = adhl.DEVICE_PAIRING;
            i = 5;
            i2 = R.string.account_menu_device_pairing;
        }
        Activity activity = this.d;
        ebgn k = ebgo.k();
        k.b(activity.getString(i2));
        Drawable a = ku.a(this.d, R.drawable.quantum_gm_ic_devices_vd_theme_24);
        a.getClass();
        ebge ebgeVar = (ebge) k;
        ebgeVar.b = a;
        ebgeVar.d = new elay(this.e, "Clicked device pairing", new View.OnClickListener() { // from class: adlg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adli adliVar = adli.this;
                ((adhn) adliVar.b.b()).a(new adhm(adhlVar));
                adliVar.a.a(i);
            }
        });
        ebgeVar.e = new adlh(this);
        return k.d();
    }
}
