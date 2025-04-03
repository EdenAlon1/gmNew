package defpackage;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class einp extends IntentService {
    public static final enru a = enru.c("com/google/android/search/verification/client/SearchActionVerificationClientService");
    public final boolean b;
    private final long c;
    private final Intent d;
    private final Intent e;
    private eino f;
    private eino g;

    public einp() {
        super("SearchActionVerificationClientService");
        this.d = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.e = new Intent("com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE").setPackage("com.google.android.apps.assistant");
        this.b = e();
        this.c = 1000L;
    }

    private final boolean b(String str) {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && packageInfo.applicationInfo != null) {
                if (packageInfo.applicationInfo.enabled) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            ensk j = a.j();
            j.Y(ente.a, "SAVerificationClientS");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "isPackageInstalled", 197, "SearchActionVerificationClientService.java")).t("Couldn't find package name %s", str);
            return false;
        }
    }

    private final boolean c(String str) {
        if (b(str)) {
            return e() || einq.a(this, str);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean d(java.lang.String r19, android.content.Intent r20, defpackage.eino r21) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.einp.d(java.lang.String, android.content.Intent, eino):boolean");
    }

    private static final boolean e() {
        return !"user".equals(Build.TYPE);
    }

    public abstract void a(Intent intent, boolean z);

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        if (this.b) {
            ensk e = a.e();
            e.Y(ente.a, "SAVerificationClientS");
            ((enrr) ((enrr) e).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onCreate", 323, "SearchActionVerificationClientService.java")).q("onCreate");
        }
        super.onCreate();
        this.f = new eino(this);
        if (c("com.google.android.googlequicksearchbox")) {
            bindService(this.d, this.f, 1);
        }
        this.g = new eino(this);
        if (c("com.google.android.apps.assistant")) {
            bindService(this.e, this.g, 1);
        }
        NotificationChannel notificationChannel = new NotificationChannel("Assistant_verifier", getApplicationContext().getResources().getString(R.string.google_assistant_verification_channel_name), 2);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        kml kmlVar = new kml(getApplicationContext(), "Assistant_verifier");
        kmlVar.u = "Assistant_verifier";
        kmlVar.i(getApplicationContext().getResources().getString(R.string.google_assistant_verification_notification_title));
        kmlVar.r(android.R.drawable.ic_dialog_email);
        kmlVar.l = -2;
        kmlVar.D = 1;
        startForeground(10000, kmlVar.a());
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        if (this.b) {
            ensk e = a.e();
            e.Y(ente.a, "SAVerificationClientS");
            ((enrr) ((enrr) e).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onDestroy", 350, "SearchActionVerificationClientService.java")).q("onDestroy");
        }
        super.onDestroy();
        if (this.f.a()) {
            unbindService(this.f);
        }
        if (this.g.a()) {
            unbindService(this.g);
        }
        stopForeground(true);
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        if (intent == null) {
            if (this.b) {
                ensk e = a.e();
                e.Y(ente.a, "SAVerificationClientS");
                ((enrr) ((enrr) e).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 282, "SearchActionVerificationClientService.java")).q("Unable to verify null intent");
                return;
            }
            return;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            boolean b = b("com.google.android.googlequicksearchbox");
            boolean z = true;
            boolean z2 = !b || this.f.a();
            if (this.b) {
                ensk e2 = a.e();
                e2.Y(ente.a, "SAVerificationClientS");
                ((enrr) ((enrr) e2).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "installedServicesConnected", 171, "SearchActionVerificationClientService.java")).J("GSA app %s installed: %b connected %b", "com.google.android.googlequicksearchbox", Boolean.valueOf(b), Boolean.valueOf(this.f.a()));
            }
            boolean b2 = b("com.google.android.apps.assistant");
            if (b2 && !this.g.a()) {
                z = false;
            }
            if (this.b) {
                ensk e3 = a.e();
                e3.Y(ente.a, "SAVerificationClientS");
                ((enrr) ((enrr) e3).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "installedServicesConnected", 182, "SearchActionVerificationClientService.java")).J("AssistantGo app %s installed: %b connected %b", "com.google.android.apps.assistant", Boolean.valueOf(b2), Boolean.valueOf(this.g.a()));
            }
            if ((!z2 || !z) && System.nanoTime() - nanoTime < this.c * 1000000) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e4) {
                    if (this.b) {
                        ensk e5 = a.e();
                        e5.Y(ente.a, "SAVerificationClientS");
                        ((enrr) ((enrr) ((enrr) e5).g(e4)).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", (char) 294, "SearchActionVerificationClientService.java")).q("Unexpected InterruptedException");
                    }
                }
            }
        }
        if (d("com.google.android.googlequicksearchbox", intent, this.f)) {
            ensk h = a.h();
            h.Y(ente.a, "SAVerificationClientS");
            ((enrr) ((enrr) h).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 305, "SearchActionVerificationClientService.java")).q("Verified the intent with GSA.");
            return;
        }
        enru enruVar = a;
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "SAVerificationClientS");
        ((enrr) ((enrr) h2).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 308, "SearchActionVerificationClientService.java")).q("Unable to verify the intent with GSA.");
        if (d("com.google.android.apps.assistant", intent, this.g)) {
            ensk h3 = enruVar.h();
            h3.Y(ente.a, "SAVerificationClientS");
            ((enrr) ((enrr) h3).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 313, "SearchActionVerificationClientService.java")).q("Verified the intent with Assistant Go.");
        } else {
            ensk h4 = enruVar.h();
            h4.Y(ente.a, "SAVerificationClientS");
            ((enrr) ((enrr) h4).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 315, "SearchActionVerificationClientService.java")).q("Unable to verify the intent with Assistant Go.");
        }
    }
}
