package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebkx extends eawx {
    private final ebgv b;
    private final eave c;
    private final emxc d;

    public ebkx(Context context, ebgv ebgvVar, eave eaveVar) {
        this.b = ebgvVar;
        this.c = eaveVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, eblj.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
        try {
            obtainStyledAttributes.getColor(4, ebli.a(context, R.color.og_background_light));
            int color = obtainStyledAttributes.getColor(10, ebli.a(context, R.color.og_default_icon_color_light));
            obtainStyledAttributes.getColor(11, ebli.a(context, R.color.og_incognito_top_tight_icon_color_light));
            obtainStyledAttributes.getColor(8, ebli.a(context, R.color.og_menu_title_color_light));
            obtainStyledAttributes.getColor(9, ebli.a(context, R.color.google_white));
            ku.a(context, obtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
            obtainStyledAttributes.recycle();
            this.d = emxc.j(new eavz(ebor.a(context, R.drawable.ic_camera_18px_obake_icon_14px, color), null, eawu.OBAKE));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.eawx
    protected final void a(Object obj) {
        Object obj2;
        efbd.c();
        if (this.b.a(obj, this.c)) {
            eawa eawaVar = new eawa();
            eawaVar.a = this.d;
            obj2 = emxc.j(eawaVar.a());
        } else {
            obj2 = emux.a;
        }
        this.a.m(obj2);
    }
}
