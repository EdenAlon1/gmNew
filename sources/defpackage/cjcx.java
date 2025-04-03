package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjcx extends citi {
    private final Context a;

    public cjcx(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.citi
    public final /* synthetic */ elfl b(Object obj) {
        citj g = citk.g();
        g.b(true);
        cism cismVar = (cism) g;
        cismVar.c = ciwm.f(new Intent(), false, 123, Optional.empty(), Optional.empty());
        String string = this.a.getString(R.string.safetycore_missing_notification_content);
        Optional empty = Optional.empty();
        citb citbVar = new citb();
        citbVar.b(ciws.BIG_TEXT_STYLE);
        citbVar.b = Optional.empty();
        citbVar.c = Optional.empty();
        citbVar.m = Optional.empty();
        citbVar.o = Optional.empty();
        citbVar.n = Optional.empty();
        citbVar.f = Optional.of(string);
        citbVar.p = empty;
        citbVar.l = Optional.empty();
        citbVar.i = Optional.empty();
        citbVar.d = Optional.empty();
        citbVar.e = Optional.empty();
        citbVar.j = Optional.empty();
        citbVar.h = Optional.empty();
        citbVar.k = Optional.empty();
        citbVar.g = Optional.empty();
        citbVar.d(this.a.getString(R.string.safetycore_missing_notification_title));
        citbVar.b = Optional.ofNullable(this.a.getString(R.string.safetycore_missing_notification_content));
        citbVar.a = IconCompat.h(this.a, R.drawable.gs_warning_vd_theme_24);
        citbVar.c(this.a.getColor(R.color.primary_brand_icon_color));
        citbVar.d = Optional.of(this.a.getString(R.string.safetycore_missing_notification_ticker));
        cismVar.b = citbVar.a();
        Context context = this.a;
        cismVar.e = Optional.of(engw.r(ciuw.m(ciux.NAT_INSTALL_SAFETYCORE, IconCompat.h(context, R.drawable.gs_warning_vd_theme_24), context.getString(R.string.safetycore_missing_notification_action_button_text), Optional.empty()).a()));
        elfl e = elfo.e(g.a());
        e.getClass();
        return e;
    }

    @Override // defpackage.civa
    public final ciwq c() {
        return new cjcw();
    }

    @Override // defpackage.civa
    public final cixf d() {
        return cixf.NT_SAFETYCORE_MISSING;
    }

    @Override // defpackage.civa
    public final elfl e() {
        elfl e = elfo.e(true);
        e.getClass();
        return e;
    }

    @Override // defpackage.civa
    public final String g() {
        return "recommendation";
    }
}
