package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bcxq {
    public static bcxq h(Context context, int i, String str, int i2, int i3, SelfIdentityId selfIdentityId, String str2) {
        int a;
        Locale f = kqt.a(context.getResources().getConfiguration()).f(0);
        Integer valueOf = Integer.valueOf(i);
        String format = String.format(f, "%d", valueOf);
        if (TextUtils.isEmpty(str)) {
            str = context.getString(R.string.sim_slot_identifier, valueOf);
        }
        String str3 = str;
        if (i2 == 0) {
            a = context.getColor(R.color.sim_icon_text_color);
        } else {
            context.getClass();
            a = doxi.a(context, i2);
        }
        int i4 = a;
        return new bcqm(i3, selfIdentityId, crjm.z(context, format, false, i4), crjm.z(context, format, true, i4), str3, i4, str2);
    }

    public abstract int a();

    public abstract int b();

    public abstract Uri c();

    public abstract Uri d();

    public abstract SelfIdentityId e();

    public abstract String f();

    public abstract String g();
}
