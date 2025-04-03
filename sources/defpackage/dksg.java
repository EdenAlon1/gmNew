package defpackage;

import android.content.Context;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksg {
    public static boolean a(Context context) {
        try {
            NetworkInfo d = dkvo.f(context).d();
            if (d != null) {
                if (d.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (dkvd e) {
            dkty.s(e, "Failed due to missing permission.", new Object[0]);
            return false;
        }
    }

    public static boolean b(Context context) {
        try {
            NetworkInfo d = dkvo.f(context).d();
            if (d != null && d.getType() == 1 && d.isConnected()) {
                dkty.c("Wifi connection is available.", new Object[0]);
                return true;
            }
        } catch (dkvd e) {
            dkty.s(e, "Failed due to missing permission.", new Object[0]);
        }
        return false;
    }
}
