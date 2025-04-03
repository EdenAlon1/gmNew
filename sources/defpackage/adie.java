package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adie implements ejhf {
    final /* synthetic */ adhy a;
    final /* synthetic */ Activity b;
    final /* synthetic */ ffbr c;

    public adie(adhy adhyVar, Activity activity, ffbr ffbrVar) {
        this.a = adhyVar;
        this.b = activity;
        this.c = ffbrVar;
    }

    @Override // defpackage.ejhf
    public final ebfw a() {
        boolean z = !((Boolean) adhu.a.e()).booleanValue();
        ebfv c = ebfw.c();
        c.b(z);
        return c.a();
    }

    @Override // defpackage.ejhf
    public final ebga b(final ebbc ebbcVar) {
        ebfz a = ebga.a();
        ebhr ebhrVar = new ebhr();
        int i = engw.d;
        ebhrVar.a(enou.a);
        if (adhu.a()) {
            adhy adhyVar = this.a;
            engr engrVar = new engr();
            engw engwVar = (engw) adhyVar.c.b();
            int size = engwVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                engrVar.h(((adky) engwVar.get(i2)).a());
            }
            ebhrVar.a(engrVar.g());
            final adhy adhyVar2 = this.a;
            engr engrVar2 = new engr();
            Activity activity = adhyVar2.a;
            String string = activity.getString(R.string.app_name);
            elay elayVar = new elay(adhyVar2.b, "Clicked account menu privacy", new View.OnClickListener() { // from class: adhv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((adhn) adhy.this.d.b()).a(new adhm(adhl.PRIVACY));
                }
            });
            Drawable a2 = ku.a(activity, R.drawable.ic_safer_shield_ic_outline_your_data);
            a2.getClass();
            ebfn h = ebfp.h();
            h.f(R.id.og_ai_privacy_advisor);
            ebfr ebfrVar = (ebfr) h;
            ebfrVar.a = a2;
            h.g(activity.getString(R.string.og_privacy_advisor, string));
            h.h(90536);
            ebfrVar.b = elayVar;
            h.c(ebfm.PRIVACY_ADVISOR);
            engrVar2.h(h.b());
            Activity activity2 = adhyVar2.a;
            String string2 = activity2.getString(R.string.app_name);
            elay elayVar2 = new elay(adhyVar2.b, "Clicked account menu settings", new View.OnClickListener() { // from class: adhw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((adhn) adhy.this.d.b()).a(new adhm(adhl.SETTINGS));
                }
            });
            String string3 = activity2.getString(R.string.og_app_settings, string2);
            ebfn h2 = ebfp.h();
            h2.f(R.id.og_ai_settings);
            h2.e(R.drawable.quantum_gm_ic_settings_vd_theme_24);
            h2.g(string3);
            h2.h(90537);
            ((ebfr) h2).b = elayVar2;
            h2.i(true);
            h2.c(ebfm.SETTINGS);
            engrVar2.h(h2.b());
            if (!((Boolean) adwg.a.e()).booleanValue()) {
                Activity activity3 = adhyVar2.a;
                elay elayVar3 = new elay(adhyVar2.b, "Clicked account menu help and feedback", new View.OnClickListener() { // from class: adhx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ((adhn) adhy.this.d.b()).a(new adhm(adhl.HELP));
                    }
                });
                ebfn h3 = ebfp.h();
                h3.f(R.id.og_ai_help_and_feedback);
                h3.e(R.drawable.quantum_gm_ic_help_outline_vd_theme_24);
                h3.g(activity3.getString(R.string.og_help_feedback));
                h3.h(90538);
                ((ebfr) h3).b = elayVar3;
                h3.i(true);
                h3.c(ebfm.HELP_AND_FEEDBACK);
                engrVar2.h(h3.b());
            }
            a.b(engrVar2.g());
            ebgc ebgcVar = (ebgc) a;
            ebgcVar.i = new ebkr();
            ebgcVar.a = emxc.j(new eayy(new adib(this.b, this.c), new emxg() { // from class: adic
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    return ebbc.this.a() != null;
                }
            }));
            final ffbr ffbrVar = this.c;
            ebgcVar.d = emxc.j(new eblc(true, emxc.j(new ebnt() { // from class: adid
                @Override // defpackage.ebnt
                public final ListenableFuture a() {
                    ((adhn) ffbr.this.b()).a(new adhm(adhl.SIGN_OUT_ACCOUNT));
                    return elfo.e(false);
                }
            })));
        }
        engw engwVar2 = ebhrVar.b;
        if (engwVar2 == null) {
            throw new IllegalStateException("Missing required properties: flavorCustomActions");
        }
        ((ebgc) a).e = new ebhs(ebhrVar.a, engwVar2, ebhrVar.c);
        return a.a();
    }

    @Override // defpackage.ejhf
    public final /* synthetic */ String c() {
        return "https://myaccount.google.com/";
    }

    @Override // defpackage.ejhf
    public final /* synthetic */ String d() {
        return "https://policies.google.com/privacy";
    }

    @Override // defpackage.ejhf
    public final /* synthetic */ String e() {
        return "https://policies.google.com/terms";
    }
}
