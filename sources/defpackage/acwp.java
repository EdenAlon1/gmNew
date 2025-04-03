package defpackage;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwp {
    public static final cfva a = cfvl.r(184724319, "add_badge_count");
    public static final emyl b = cfvl.x(175614877, "support_satellite_notification_reply");
    public final cinl c;
    public final aclr d;
    public final cml e = new cml(7);
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g = false;
    private final Context h;
    private final cthp i;
    private final String j;
    private final esol k;
    private final Intent l;
    private final knr m;

    public acwp(cinl cinlVar, Context context, cthp cthpVar, aclr aclrVar, String str, esol esolVar, knr knrVar) {
        this.c = cinlVar;
        this.h = context;
        this.j = str;
        this.k = esolVar;
        this.d = aclrVar;
        this.i = cthpVar;
        this.m = knrVar;
        Intent a2 = akuv.c(context, DittoWebActivity.class, "android.intent.action.VIEW").a();
        this.l = a2;
        a2.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        a2.putExtra("conversation_id_for_launch", aclrVar.toString());
        a2.setData(acrz.c(aclrVar));
    }

    private final String c() {
        return this.d.a();
    }

    public final cink a() {
        NotificationChannel e = this.i.e(bdgq.b(this.d.a()), c(), true);
        kml kmlVar = new kml(this.h, e != null ? e.getId() : "");
        kmlVar.g = eepf.a(this.h, 0, this.l, ctie.a(0));
        kna knaVar = new kna(this.m);
        if (this.k.b) {
            knaVar.a = this.j;
            knaVar.h(true);
        }
        int i = 0;
        while (true) {
            cml cmlVar = this.e;
            if (i >= cmlVar.a()) {
                break;
            }
            knaVar.g((kmz) cmlVar.b(i));
            i++;
        }
        kmlVar.u(knaVar);
        kmlVar.r(R.drawable.notification_icon);
        kmlVar.H = c();
        Bundle bundle = new Bundle();
        if (!this.k.b) {
            bundle.putString("android.conversationTitle", this.j);
        }
        kmlVar.B = bundle;
        if (((Boolean) a.e()).booleanValue()) {
            kmlVar.k = this.f.get();
        }
        if (((Boolean) ((cfup) b.get()).e()).booleanValue()) {
            Intent a2 = akuv.c(this.h, acwz.class, "android.intent.action.VIEW").a();
            a2.setAction("com.google.android.apps.messaging.SATELLITE_MESSAGE_REPLY");
            a2.putExtra("bugle_dittosatellite_reply_conversation_id", this.d.toString());
            a2.putExtra("bugle_dittosatellite_reply_conversation_name", this.j);
            a2.putExtra("bugle_dittosatellite_conversation_proto", this.k.toByteArray());
            klz klzVar = new klz(R.drawable.notification_icon, this.h.getString(R.string.reply_button_label), PendingIntent.getBroadcast(this.h, 0, a2, ctie.a | 1207959552));
            klzVar.c(new kns("bugle_dittosatellite_reply_text", this.h.getString(R.string.reply_button_label), null, true, 0, new Bundle(), new HashSet()));
            kmlVar.e(klzVar.a());
        }
        return new acwo(this, kmlVar.a());
    }

    public final void b() {
        this.g = false;
        cml cmlVar = this.e;
        int a2 = cmlVar.a();
        if (a2 > 0) {
            if (a2 > cmlVar.a()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int length = cmlVar.a.length;
            int i = cmlVar.b;
            if (a2 < length - i) {
                length = i + a2;
            }
            while (i < length) {
                cmlVar.a[i] = null;
                i++;
            }
            int i2 = cmlVar.b;
            int i3 = length - i2;
            int i4 = a2 - i3;
            cmlVar.b = cmlVar.d & (i2 + i3);
            if (i4 > 0) {
                for (int i5 = 0; i5 < i4; i5++) {
                    cmlVar.a[i5] = null;
                }
                cmlVar.b = i4;
            }
        }
        this.f.set(0);
        this.c.b(this.d.toString(), cinj.SATELLITE_INCOMING_MESSAGE);
    }
}
