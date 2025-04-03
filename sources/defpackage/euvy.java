package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euvy {
    public static final void a(kml kmlVar, euwy euwyVar) {
        if (euwyVar != null) {
            try {
                dhre dhreVar = euwyVar.c;
                dfwv.n(dhreVar);
                Bitmap bitmap = (Bitmap) dhrt.g(dhreVar, 5L, TimeUnit.SECONDS);
                kmlVar.m(bitmap);
                kmd kmdVar = new kmd();
                kmdVar.f(bitmap);
                kmdVar.e(null);
                kmlVar.u(kmdVar);
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                euwyVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(String.valueOf(e.getCause()))));
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                euwyVar.close();
            }
        }
    }
}
