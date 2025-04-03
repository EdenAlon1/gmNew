package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaiq implements eain {
    private final dlpw a;
    private final eaht b;
    private final easu c;

    public eaiq(dlpw dlpwVar, eaht eahtVar, easu easuVar) {
        dlpwVar.getClass();
        eahtVar.getClass();
        this.a = dlpwVar;
        this.b = eahtVar;
        this.c = easuVar;
    }

    @Override // defpackage.eain
    public final boolean a(Context context, euxg euxgVar) {
        int parseInt;
        context.getClass();
        String b = eaio.b(euxgVar);
        byte[] d = euxgVar.d();
        String a = eaio.a(euxgVar);
        String str = (String) euxgVar.c().get("ki");
        int a2 = eaip.a(euxgVar.a());
        int a3 = eaip.a(euxgVar.b());
        Object obj = euxgVar.a.get("google.ttl");
        if (obj instanceof Integer) {
            parseInt = ((Integer) obj).intValue();
        } else {
            if (obj instanceof String) {
                try {
                    parseInt = Integer.parseInt((String) obj);
                } catch (NumberFormatException unused) {
                    Log.w("FirebaseMessaging", "Invalid TTL: ".concat(String.valueOf(String.valueOf(obj))));
                }
            }
            parseInt = 0;
        }
        Bundle bundle = euxgVar.a;
        Integer valueOf = Integer.valueOf(parseInt);
        int m = eahr.m(bundle.getString("message_type"));
        String string = euxgVar.a.getString("google.message_id");
        if (string == null) {
            string = euxgVar.a.getString("message_id");
        }
        if (true == TextUtils.isEmpty(string)) {
            string = null;
        }
        eahn eahnVar = new eahn(string, m, a2, a3, valueOf, b, d, a, str);
        if (!eahnVar.l()) {
            return false;
        }
        this.c.a(context);
        long micros = TimeUnit.MILLISECONDS.toMicros(this.a.f().toEpochMilli());
        eaht eahtVar = this.b;
        if (easb.d(context)) {
            eafp.c(fdod.a.get().a());
        } else {
            eafp.d();
        }
        eahtVar.c(eahnVar, micros);
        return true;
    }
}
