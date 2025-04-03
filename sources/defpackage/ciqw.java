package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ciqw extends cims {
    public static final /* synthetic */ int o = 0;
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final cins d;
    public final ffbr e;
    public ConversationIdType f;
    public ConversationId g;
    public int h;
    public int i;
    public String j;
    public long k;
    public long l;
    public long m;
    public boolean n;
    private final Context r;
    private final cipe s;
    private final cnmx t;
    private final cthp u;
    private final ffbr v;

    public ciqw(Context context, cine cineVar, ffbr ffbrVar, ffbr ffbrVar2, cipe cipeVar, ffbr ffbrVar3, cnmx cnmxVar, cthp cthpVar, cins cinsVar, ffbr ffbrVar4, ffbr ffbrVar5) {
        super(cineVar.a(cinj.STUCK_MESSAGES));
        this.f = bdgq.a;
        this.g = InvalidConversationId.a;
        this.j = "";
        this.r = context;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.s = cipeVar;
        this.c = ffbrVar3;
        this.t = cnmxVar;
        this.u = cthpVar;
        this.d = cinsVar;
        this.e = ffbrVar4;
        this.v = ffbrVar5;
    }

    private static String e(long j) {
        return j <= 0 ? "zero" : j == 1 ? "one" : "multiple";
    }

    @Override // defpackage.cims, defpackage.cink
    public final Notification b() {
        String string;
        String id;
        Resources resources = this.r.getResources();
        int i = this.h;
        int i2 = this.i;
        ffbr ffbrVar = this.v;
        String str = this.j;
        boolean a = ((cirg) ffbrVar.b()).a().a();
        String quantityString = resources.getQuantityString(R.plurals.stuck_in_sending_notification_title, i);
        if (a) {
            string = resources.getString(R.string.stuck_in_sending_notification_text_satellite);
        } else if (i2 == 1) {
            str.getClass();
            string = resources.getQuantityString(R.plurals.stuck_in_sending_notification_text_beta, i, Integer.valueOf(i), str);
        } else {
            string = resources.getString(R.string.stuck_in_sending_notification_text_multiple_conversations_beta, String.valueOf(i));
        }
        cinb cinbVar = new cinb(quantityString, string);
        Context context = this.r;
        id = this.u.d().getId();
        kml kmlVar = new kml(context, id);
        kmlVar.i(cinbVar.a);
        kmlVar.h(cinbVar.b);
        kme kmeVar = new kme();
        kmeVar.e(cinbVar.b);
        kmlVar.u(kmeVar);
        kmlVar.w(cinbVar.a);
        kmlVar.r(R.drawable.notification_icon);
        cipe cipeVar = this.s;
        int i3 = this.h;
        ConversationIdType conversationIdType = this.f;
        ConversationId conversationId = this.g;
        boolean z = this.n;
        ephs ephsVar = (ephs) ephx.a.createBuilder();
        ephsVar.copyOnWrite();
        ephx ephxVar = (ephx) ephsVar.instance;
        ephxVar.c = 3;
        ephxVar.b |= 1;
        ephv ephvVar = ephv.MESSAGE_STUCK_IN_SENDING;
        ephsVar.copyOnWrite();
        ephx ephxVar2 = (ephx) ephsVar.instance;
        ephxVar2.d = ephvVar.o;
        ephxVar2.b |= 2;
        ephx ephxVar3 = (ephx) ephsVar.build();
        PendingIntent o2 = !conversationIdType.b() ? cipeVar.b.o(cipeVar.a, conversationId, ephxVar3, z) : cipeVar.b.c(cipeVar.a, ephxVar3);
        String quantityString2 = cipeVar.a.getResources().getQuantityString(R.plurals.stuck_in_sending_notification_view_message_action_button, i3);
        o2.getClass();
        klz klzVar = new klz(R.drawable.ic_warning_light, quantityString2, o2);
        klzVar.d = true;
        kmlVar.e(klzVar.a());
        kmlVar.e(this.s.a(ephv.MESSAGE_STUCK_IN_SENDING));
        kmlVar.l = 2;
        kmlVar.k(this.t.a(ephv.MESSAGE_STUCK_IN_SENDING));
        kmlVar.p(true);
        kmlVar.C = this.r.getColor(R.color.primary_brand_non_icon_color);
        kmlVar.g = this.t.c(ephv.MESSAGE_STUCK_IN_SENDING, enhk.n("stuckSms", e(this.k), "stuckMms", e(this.l), "stuckRcs", e(this.m)));
        return kmlVar.a();
    }

    @Override // defpackage.cims, defpackage.cink
    public final String d() {
        return "stuck_messages_notification_tag";
    }
}
