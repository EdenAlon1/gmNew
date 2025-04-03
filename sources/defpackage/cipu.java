package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cipu extends cims {
    public static final /* synthetic */ int l = 0;
    public final cins a;
    public final ffbr b;
    public final akzt c;
    public final cipm d;
    public final ffbr e;
    public Optional f;
    public ConversationIdType g;
    ConversationId h;
    public int i;
    public int j;
    public boolean k;
    private final Context m;
    private final ayfg n;

    public cipu(Context context, cine cineVar, ayfg ayfgVar, ffbr ffbrVar, final cthp cthpVar, akzt akztVar, cipm cipmVar, cins cinsVar, ffbr ffbrVar2) {
        super(cineVar.b(cinj.RCS_NOT_DELIVERED, "RCS Not Delivered Notification", new cipf() { // from class: cipt
            @Override // defpackage.cipf
            public final NotificationChannel a() {
                NotificationChannel notificationChannel;
                String group;
                CharSequence name;
                cthp cthpVar2 = cthp.this;
                String string = cthpVar2.b.getResources().getString(R.string.rcs_not_delivered_notification_channel_name);
                notificationChannel = ((NotificationManager) cthpVar2.a.b()).getNotificationChannel("bugle_rcs_not_delivered_channel");
                if (notificationChannel != null) {
                    group = notificationChannel.getGroup();
                    if (group != null) {
                        name = notificationChannel.getName();
                        if (TextUtils.equals(name, string)) {
                            return notificationChannel;
                        }
                    }
                }
                cthn cthnVar = new cthn("bugle_rcs_not_delivered_channel", string, 3);
                cthnVar.c(ctho.DEFAULT_SETTINGS.e);
                NotificationChannel notificationChannel2 = cthnVar.a;
                cthpVar2.n(notificationChannel2);
                return notificationChannel2;
            }
        }));
        this.g = bdgq.a;
        this.h = InvalidConversationId.a;
        this.k = false;
        this.m = context;
        this.a = cinsVar;
        this.n = ayfgVar;
        this.b = ffbrVar;
        this.c = akztVar;
        this.d = cipmVar;
        this.e = ffbrVar2;
    }

    @Override // defpackage.cims, defpackage.cink
    public final Notification b() {
        PendingIntent a;
        String quantityString = this.m.getResources().getQuantityString(R.plurals.rcs_not_delivered_notification_title, this.j);
        String quantityString2 = this.i == 1 ? this.m.getResources().getQuantityString(R.plurals.rcs_not_delivered_notification_text, this.i, this.f.get()) : this.m.getResources().getQuantityString(R.plurals.rcs_not_delivered_notification_text, this.i);
        kml kmlVar = new kml(this.m, o());
        if (this.i == 1) {
            Intent l2 = this.n.l(this.m, this.h, null, true, this.k);
            l2.putExtra("via_notification", true);
            l2.putExtra("via_rcs_not_delivered_notification", true);
            l2.setData(bcqc.e(this.m, this.g));
            a = ayff.a(this.m, l2, 0);
            a.getClass();
        } else {
            Intent d = this.n.d(this.m);
            d.putExtra("via_notification", true);
            d.putExtra("via_rcs_not_delivered_notification", true);
            a = ayff.a(this.m, d, 0);
            a.getClass();
        }
        kmlVar.g = a;
        kmlVar.i(quantityString);
        kmlVar.h(quantityString2);
        kmlVar.w(quantityString);
        kme kmeVar = new kme();
        kmeVar.e(quantityString2);
        kmlVar.u(kmeVar);
        kmlVar.r(R.drawable.notification_icon);
        kmlVar.C = this.m.getColor(R.color.primary_brand_non_icon_color);
        kmlVar.g(true);
        kmlVar.p(true);
        return kmlVar.a();
    }

    @Override // defpackage.cims, defpackage.cink
    public final String d() {
        return "rcs_not_delivered_notification_tag";
    }
}
