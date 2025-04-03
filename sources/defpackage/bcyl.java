package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcyl {
    public final Integer a;
    public final String b;
    public final String c;

    public bcyl(Integer num, String str, String str2) {
        this.a = num;
        this.b = str;
        this.c = str2;
    }

    public final void a(Bundle bundle) {
        String str = this.c;
        if (str != null) {
            bundle.putString("other_participant_msisdn", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            bundle.putString("conversation_name", str2);
        }
        Integer num = this.a;
        if (num != null) {
            bundle.putInt("theme_color", num.intValue());
        }
    }

    public bcyl(Bundle bundle) {
        if (bundle == null) {
            this.c = null;
            this.b = null;
            this.a = null;
        } else {
            this.c = bundle.getString("other_participant_msisdn");
            this.b = bundle.getString("conversation_name");
            Object obj = bundle.get("theme_color");
            this.a = obj instanceof Integer ? (Integer) obj : null;
        }
    }
}
