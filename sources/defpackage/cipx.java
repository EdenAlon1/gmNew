package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cipx extends cims {
    public static final entd a = entd.c("BugleNotifications");
    public final cins b;
    public final ffbr c;
    public final akzt d;
    public final cipm e;
    public final ffbr f;
    public Optional g;
    public ConversationIdType h;
    ConversationId i;
    public int j;
    public int k;
    public boolean l;
    private final Context m;
    private final ayfg n;
    private final ffbr o;

    public cipx(Context context, cine cineVar, ayfg ayfgVar, ffbr ffbrVar, akzt akztVar, cipm cipmVar, cins cinsVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        super(cineVar.a(cinj.RCS_STILL_SENDING));
        this.h = bdgq.a;
        this.i = InvalidConversationId.a;
        this.m = context;
        this.b = cinsVar;
        this.n = ayfgVar;
        this.c = ffbrVar;
        this.d = akztVar;
        this.e = cipmVar;
        this.f = ffbrVar2;
        this.o = ffbrVar3;
    }

    private final boolean e() {
        return ((cirg) this.o.b()).a().b();
    }

    @Override // defpackage.cims, defpackage.cink
    public final Notification b() {
        String quantityString;
        String b = e() ? qmn.b(this.m, R.string.rcs_still_sending_notification_title_satellite, "count", Integer.valueOf(this.k)) : qmn.b(this.m, R.string.rcs_still_sending_notification_title_v2, "count", Integer.valueOf(this.k));
        if (e()) {
            quantityString = this.m.getString(R.string.stuck_in_sending_notification_text_satellite);
        } else if (this.j == 1) {
            quantityString = this.m.getResources().getString(R.string.rcs_still_sending_notification_text_singular, this.g.get());
        } else {
            Resources resources = this.m.getResources();
            int i = this.j;
            quantityString = resources.getQuantityString(R.plurals.rcs_still_sending_notification_text_plural, i, Integer.valueOf(i));
        }
        kml kmlVar = new kml(this.m, o());
        PendingIntent p = this.j == 1 ? this.n.p(this.m, this.i, this.l) : this.n.b(this.m);
        p.getClass();
        kmlVar.g = p;
        kmlVar.i(b);
        kmlVar.h(quantityString);
        kmlVar.w(b);
        kme kmeVar = new kme();
        kmeVar.e(quantityString);
        kmlVar.u(kmeVar);
        kmlVar.r(R.drawable.notification_icon);
        kmlVar.C = this.m.getColor(R.color.primary_brand_non_icon_color);
        kmlVar.g(true);
        kmlVar.p(true);
        return kmlVar.a();
    }

    @Override // defpackage.cims, defpackage.cink
    public final String d() {
        return "rcs_still_sending_notification_tag";
    }
}
