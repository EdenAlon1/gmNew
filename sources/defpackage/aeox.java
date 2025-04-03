package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeox {
    public final crjx a;
    public final elbx b;
    public Context c;
    public final CharSequence[] d;
    public int e;
    public iv f;

    public aeox(crjx crjxVar, Context context, elbx elbxVar) {
        this.c = context;
        this.a = crjxVar;
        this.b = elbxVar;
        this.d = new CharSequence[]{context.getString(R.string.theme_setting_dialog_options_light_mode), context.getString(R.string.theme_setting_dialog_options_dark_mode), context.getString(R.string.theme_setting_dialog_options_system_default_mode)};
        int a = crjxVar.a();
        this.e = a != 1 ? a != 2 ? 2 : 1 : 0;
    }
}
