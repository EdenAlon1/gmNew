package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czxo {
    public final Context a;
    private final Optional b;

    public czxo(Context context, Optional optional) {
        context.getClass();
        this.a = context;
        this.b = optional;
    }

    static /* synthetic */ czxn f(czxo czxoVar, String str, String str2, Integer num, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        crmi.d(czxoVar.a, spannableStringBuilder, str2, null);
        if ((i & 4) != 0) {
            num = null;
        }
        return new czxn(spannableStringBuilder, str2, num, (i & 8) != 0);
    }

    public final czxn a() {
        this.b.isPresent();
        String string = this.a.getString(R.string.suspected_messages_toolstone_link);
        string.getClass();
        String string2 = this.a.getString(R.string.suspected_messages_toolstone_text, string);
        string2.getClass();
        return f(this, string2, string, Integer.valueOf(R.drawable.gs_gshield_vd_theme_24), 504);
    }

    public final czxn b() {
        String string = this.a.getString(R.string.satellite_messaging_toolstone_link);
        string.getClass();
        String string2 = this.a.getString(R.string.satellite_messaging_toolstone_text, string);
        string2.getClass();
        return f(this, string2, string, Integer.valueOf(R.drawable.gs_android_satellite_vd_theme_24), 496);
    }

    public final czxn c() {
        String string = this.a.getString(R.string.spatula_toolstone_resources_link_string);
        string.getClass();
        String string2 = this.a.getString(R.string.spatula_toolstone_main_string, string);
        string2.getClass();
        return f(this, string2, string, null, 508);
    }

    public final czxn d() {
        String string = this.a.getString(R.string.suggestion_shortcut_search_title);
        string.getClass();
        String string2 = this.a.getString(R.string.suggestion_shortcut_star_toolstone, string);
        string2.getClass();
        return f(this, string2, string, null, 508);
    }

    public final czxn e(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? c() : a() : b() : d();
    }
}
