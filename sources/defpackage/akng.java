package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akng {
    public static final ComponentName a;
    public static final List b;
    private static final cfva c;
    private static final cfva d;
    private static final String[] e;
    private static final cfva f;

    static {
        cfup h = cfvl.h(cfvl.b, "andromeda_cmc_package_name", "com.samsung.android.mdecservice");
        c = h;
        cfup h2 = cfvl.h(cfvl.b, "andromeda_cmc_receiver_name", "com.samsung.android.mdecservice.mdeccommon.receiver.AndroidMessageListener");
        d = h2;
        a = new ComponentName((String) h.e(), (String) h2.e());
        String[] strArr = {"g", "n", "o", "p", "r", "1", "2", "fit2"};
        e = strArr;
        f = cfvl.h(cfvl.b, "andromeda_mp_receiver_name", "com.samsung.accessory.saproviders.samessage.receiver.SAAndroidMessageReceiver");
        b = new ArrayList(8);
        for (int i = 0; i < 8; i++) {
            String str = strArr[i];
            b.add(new ComponentName((String) cfvl.h(cfvl.b, "andromeda_mp_package_name_".concat(String.valueOf(str)), a.a(str, "com.samsung.android.gear", "plugin")).e(), (String) f.e()));
        }
    }
}
