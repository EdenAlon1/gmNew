package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stm {
    public final Context a;

    public stm(Context context) {
        context.getClass();
        this.a = context;
    }

    public final String a(String str, String str2) {
        if (!((Boolean) ((cfup) stl.g.get()).e()).booleanValue()) {
            return b(str, str2, R.string.happy_birthday_name, R.string.happy_birthday_no_name);
        }
        String string = this.a.getString(R.string.same_birthday_nudge_text);
        string.getClass();
        return string;
    }

    public final String b(String str, String str2, int i, int i2) {
        if (str == null || str.length() == 0) {
            str = null;
            if (str2 != null && str2.length() != 0) {
                str = str2;
            }
        }
        if (str == null || ayvs.d(str)) {
            String string = this.a.getString(i2);
            string.getClass();
            return string;
        }
        String string2 = this.a.getString(i, str);
        string2.getClass();
        return string2;
    }
}
