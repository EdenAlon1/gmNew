package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.messaging.shared.receiver.DefaultSmsPackageChangedReceiver;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import com.google.android.apps.messaging.shared.receiver.SmsReceiver;
import com.google.android.apps.messaging.shared.receiver.SmsRejectedReceiver;
import com.google.android.apps.messaging.shared.receiver.TelephonyChangeReceiver;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnew {
    private static final cskc a = cskc.g("Bugle", "AppConfigUpdater");
    private final Context b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public cnew(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = context;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
    }

    public final void a() {
        Context context = this.b;
        boolean h = ctid.h(context);
        PackageManager packageManager = context.getPackageManager();
        if (h) {
            a.q("Enabling SMS message receiving");
            packageManager.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) SmsReceiver.class), 1, 1);
        } else {
            a.q("Disabling SMS message receiving");
            packageManager.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) SmsReceiver.class), 2, 1);
        }
        cskc cskcVar = a;
        cskcVar.q("Enabling Telephony change receiving");
        packageManager.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) TelephonyChangeReceiver.class), 1, 1);
        cskcVar.q("Enabling Default SMS package change receiving");
        packageManager.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) DefaultSmsPackageChangedReceiver.class), 1, 1);
        csjb d = cskcVar.d();
        d.I("Manufacturer:");
        d.I(Build.MANUFACTURER);
        d.r();
        if (((Optional) ((fbbb) this.c).a).isEmpty()) {
            csjb d2 = cskcVar.d();
            d2.I("Enabling RestoreReceiver.");
            d2.A("manufacturer", Build.MANUFACTURER);
            d2.r();
            packageManager.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) RestoreReceiver.class), 1, 1);
        }
        if (this.d.b() != null) {
            csxu csxuVar = (csxu) this.d.b();
            final cnjj cnjjVar = (cnjj) this.e.b();
            cnjjVar.getClass();
            csxuVar.g(new Runnable() { // from class: cnev
                @Override // java.lang.Runnable
                public final void run() {
                    cnjj.this.e();
                }
            });
        } else {
            csjb b = cskcVar.b();
            b.I("updateSmsReceiveHandler: bugleGservices is null!");
            b.s(new Exception());
        }
        if (!((Optional) ((fbbb) this.c).a).isPresent()) {
            PackageManager packageManager2 = this.b.getPackageManager();
            if (!((Boolean) SmsRejectedReceiver.a.e()).booleanValue() || ctid.h(this.b)) {
                cskcVar.q("Disabling SMS rejected receiver");
                packageManager2.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) SmsRejectedReceiver.class), 2, 1);
            } else {
                cskcVar.q("Enabling SMS rejected receiver");
                packageManager2.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) SmsRejectedReceiver.class), 1, 1);
            }
        }
        cteu cteuVar = (cteu) this.f.b();
        if (cteuVar.c.isPresent()) {
            return;
        }
        PackageManager packageManager3 = cteuVar.b.getPackageManager();
        ensk g = cteu.a.g();
        g.Y(ente.a, "BugleTranscoding");
        boolean R = ((enrr) g).R();
        if (cteuVar.d.a()) {
            if (R) {
                ensk g2 = cteu.a.g();
                g2.Y(ente.a, "BugleTranscoding");
                ((enrr) ((enrr) g2).h("com/google/android/apps/messaging/shared/util/media/video/VideoSharingActivityUtil", "updateVideoSharingActivity", 47, "VideoSharingActivityUtil.java")).q("Enabling Video Sharing Activity");
            }
            packageManager3.setComponentEnabledSetting(new ComponentName(cteuVar.b, "com.google.android.apps.messaging.ui.conversationlist.VideoShareIntentActivity"), 1, 1);
            return;
        }
        if (R) {
            ensk g3 = cteu.a.g();
            g3.Y(ente.a, "BugleTranscoding");
            ((enrr) ((enrr) g3).h("com/google/android/apps/messaging/shared/util/media/video/VideoSharingActivityUtil", "updateVideoSharingActivity", 56, "VideoSharingActivityUtil.java")).q("Disabling Video Sharing Activity");
        }
        packageManager3.setComponentEnabledSetting(new ComponentName(cteuVar.b, "com.google.android.apps.messaging.ui.conversationlist.VideoShareIntentActivity"), 2, 1);
    }
}
