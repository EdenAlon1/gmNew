package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.android.vcard.VCardConfig;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euwj {
    private static final Object a = new Object();
    private static euyg b;

    public static dhre a(Context context, final Intent intent, boolean z) {
        euyg euygVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (a) {
            if (b == null) {
                b = new euyg(context);
            }
            euygVar = b;
        }
        if (!z) {
            return euygVar.a(intent).c(new euwe(), new dhqh() { // from class: euwh
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    return -1;
                }
            });
        }
        if (euxl.a().c(context)) {
            synchronized (euxz.b) {
                euxz.a(context);
                boolean d = euxz.d(intent);
                euxz.c(intent, true);
                if (!d) {
                    euxz.c.a(euxz.a);
                }
                euygVar.a(intent).s(new dhqs() { // from class: euxy
                    @Override // defpackage.dhqs
                    public final void a(dhre dhreVar) {
                        euxz.b(intent);
                    }
                });
            }
        } else {
            euygVar.a(intent);
        }
        return dhrt.c(-1);
    }

    public static final dhre b(final Intent intent, final Context context, Executor executor) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        final boolean z = (intent.getFlags() & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0;
        return (i < 26 || z) ? dhrt.a(executor, new Callable() { // from class: euwf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2;
                ComponentName startService;
                euxl a2 = euxl.a();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                Intent intent2 = intent;
                Context context2 = context;
                a2.c.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                String b2 = a2.b(context2, intent3);
                if (b2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(b2));
                    }
                    intent3.setClassName(context2.getPackageName(), b2);
                }
                try {
                    if (a2.c(context2)) {
                        synchronized (euxz.b) {
                            euxz.a(context2);
                            boolean d = euxz.d(intent3);
                            euxz.c(intent3, true);
                            startService = context2.startService(intent3);
                            if (startService == null) {
                                startService = null;
                            } else if (!d) {
                                euxz.c.a(euxz.a);
                            }
                        }
                    } else {
                        startService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = 404;
                    } else {
                        i2 = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e.toString()));
                    i2 = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i2 = 401;
                }
                return Integer.valueOf(i2);
            }
        }).e(executor, new dhqh() { // from class: euwg
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                if (((Integer) dhreVar.i()).intValue() != 402) {
                    return dhreVar;
                }
                boolean z2 = z;
                return euwj.a(context, intent, z2).c(new euwe(), new dhqh() { // from class: euwi
                    @Override // defpackage.dhqh
                    public final Object a(dhre dhreVar2) {
                        return 403;
                    }
                });
            }
        }) : a(context, intent, false);
    }
}
