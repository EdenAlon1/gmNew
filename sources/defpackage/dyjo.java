package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjo {
    private static dyjo c;
    public int a;
    public int b;

    private dyjo(Context context) {
        dyhw.b();
        try {
            Properties properties = new Properties();
            properties.load(context.getAssets().open("lighter-properties.txt"));
            this.a = 2;
            String property = properties.getProperty("BUILD_BASELINE_CHANGELIST");
            this.b = TextUtils.isEmpty(property) ? 0 : Integer.parseInt(property);
        } catch (IOException e) {
            throw new RuntimeException("Lighter properties was not found in the apk", e);
        }
    }

    public static synchronized dyjo a(Context context) {
        synchronized (dyjo.class) {
            dyjo dyjoVar = c;
            if (dyjoVar != null) {
                return dyjoVar;
            }
            dyjo dyjoVar2 = new dyjo(context);
            c = dyjoVar2;
            return dyjoVar2;
        }
    }
}
