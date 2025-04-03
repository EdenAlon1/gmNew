package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.TelephonyNetworkSpecifier;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnom {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer");
    public final ConnectivityManager a;
    public final azpo b;
    private final Context d;

    public cnom(ConnectivityManager connectivityManager, azpo azpoVar, Context context) {
        connectivityManager.getClass();
        azpoVar.getClass();
        context.getClass();
        this.a = connectivityManager;
        this.b = azpoVar;
        this.d = context;
    }

    public static final NetworkRequest c(int i, Integer num) {
        TelephonyNetworkSpecifier.Builder subscriptionId;
        TelephonyNetworkSpecifier build;
        NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addTransportType(i).addCapability(12);
        if (num != null) {
            subscriptionId = new TelephonyNetworkSpecifier.Builder().setSubscriptionId(num.intValue());
            build = subscriptionId.build();
            addCapability.setNetworkSpecifier(build);
        }
        NetworkRequest build2 = addCapability.build();
        build2.getClass();
        return build2;
    }

    public static /* synthetic */ PendingIntent d(cnom cnomVar, azsu azsuVar, String str, int i) {
        if (1 == (i & 1)) {
            azsuVar = null;
        }
        return cnomVar.a(azsuVar, null, str);
    }

    public final PendingIntent a(azsu azsuVar, Integer num, String str) {
        Intent a = akuv.b(new ComponentName(this.d, (Class<?>) SatelliteConnectionChangeReceiver.class), str).a();
        a.getClass();
        if (azsuVar != null) {
            a.putExtra("MyIdentityToken", azsuVar.b());
            if (num != null) {
                a.setIdentifier(azsuVar.b + "|" + num);
            }
        }
        PendingIntent d = eepf.d(this.d, 0, a, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        if (d != null) {
            return d;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void b() {
        enru enruVar = c;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleSatellite");
        ((enrr) e.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer", "registerNetworkCallbacksForNewSatelliteConnection", 47, "DunestarNetworkCallbackRegisterer.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executing...");
        try {
            ConnectivityManager connectivityManager = this.a;
            NetworkRequest.Builder removeCapability = new NetworkRequest.Builder().addTransportType(10).addCapability(12).removeCapability(13);
            if (ctid.i) {
                removeCapability.removeCapability(37);
            }
            NetworkRequest build = removeCapability.build();
            build.getClass();
            connectivityManager.registerNetworkCallback(build, d(this, null, "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_NEW_SATELLITE_CONNECTION", 3));
            ensk e2 = enruVar.e();
            e2.Y(ente.a, "BugleSatellite");
            ((enrr) e2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer", "registerNetworkCallbacksForNewSatelliteConnection", 53, "DunestarNetworkCallbackRegisterer.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executed.");
        } catch (IllegalArgumentException e3) {
            ensk e4 = c.e();
            e4.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) e4).g(e3).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer", "registerNetworkCallbacksForNewSatelliteConnection", 55, "DunestarNetworkCallbackRegisterer.kt")).q("IllegalArgumentException: Satellite features not supported");
        }
    }
}
