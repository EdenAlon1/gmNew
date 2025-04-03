package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvoz implements aeev {
    public final Context a;
    public final effy b;
    public final ffbr c;
    public final ffbr d;
    public final eisx e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    private final ffsk j;

    public cvoz(Context context, effy effyVar, ffbr ffbrVar, ffbr ffbrVar2, eisx eisxVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffsk ffskVar) {
        context.getClass();
        effyVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        eisxVar.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.a = context;
        this.b = effyVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = eisxVar;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffskVar;
    }

    @Override // defpackage.aeev
    public final elfl a() {
        aeey l = aefb.l();
        aees aeesVar = (aees) l;
        aeesVar.a = "spatula_zero_day_banner";
        aeesVar.b = this.a.getText(R.string.spatula_home_banner_title);
        aeesVar.c = this.a.getText(R.string.spatula_home_banner_body);
        l.c(R.drawable.gs_blur_on_vd_theme_24);
        l.d(new aeez() { // from class: cvot
            @Override // defpackage.aeez
            public final void q() {
                ((cvpb) cvoz.this.g.b()).a(cvpa.a);
            }
        });
        aeesVar.d = this.a.getText(R.string.spatula_home_banner_dismiss_button);
        aeesVar.f = new aefa() { // from class: cvou
            @Override // defpackage.aefa
            public final void a(ejlq ejlqVar, View view) {
                cvoz.this.e(cvpa.b);
            }
        };
        l.e(this.a.getText(R.string.spatula_home_banner_learn_more_button));
        aeesVar.e = new aefa() { // from class: cvov
            @Override // defpackage.aefa
            public final void a(ejlq ejlqVar, View view) {
                Intent addFlags = new Intent("com.google.android.gms.spatula.settings.action.OPEN_SPATULA_SETTINGS").addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                addFlags.getClass();
                cvoz cvozVar = cvoz.this;
                eldl.p(cvozVar.a, addFlags);
                cvozVar.e(cvpa.c);
            }
        };
        elfl e = elfo.e(l.a());
        e.getClass();
        return e;
    }

    @Override // defpackage.aeev
    public final elfl b() {
        elfl c;
        c = axol.c(this.j, ffhe.a, ffsm.a, new cvoy(this, null));
        return c;
    }

    @Override // defpackage.aeev
    public final /* synthetic */ Set c() {
        return new enpx(cgix.HOME);
    }

    @Override // defpackage.aeev
    public final int d() {
        return 5;
    }

    public final void e(cvpa cvpaVar) {
        axol.k(this.j, null, new cvox(this, cvpaVar, null), 3).hZ(new ffji() { // from class: cvos
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((ejvp) cvoz.this.i.b()).a(elfo.e(null), aefc.a);
                return ffcu.a;
            }
        });
    }
}
