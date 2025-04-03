package defpackage;

import android.content.Intent;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clfp implements clhc {
    private final ffbr c;
    private final ffbr d;
    private final clie e;
    private final avuh f;
    private static final cskc b = cskc.g("BugleRcs", "GetMessagesMethod");
    public static final cfva a = cfvl.i(cfvl.b, "enable_get_single_message_strategy", true);

    public clfp(ffbr ffbrVar, ffbr ffbrVar2, avuh avuhVar, clie clieVar) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.f = avuhVar;
        this.e = clieVar;
    }

    @Override // defpackage.clhc
    public final elfl a(Intent intent) {
        axad build;
        emxf.a("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action".equals(intent.getAction()));
        String stringExtra = intent.getStringExtra(RcsIntents.EXTRA_TRACE_ID);
        if (emxe.c(stringExtra)) {
            build = (axad) this.f.fP(cslr.a());
        } else {
            axac createBuilder = axad.a.createBuilder();
            createBuilder.copyOnWrite();
            axad axadVar = (axad) createBuilder.instance;
            stringExtra.getClass();
            axadVar.b |= 1;
            axadVar.c = stringExtra;
            build = createBuilder.build();
        }
        if (((Boolean) ((cfup) clie.e.get()).e()).booleanValue()) {
            this.e.c(build, bdhg.a(intent.getStringExtra(RcsIntents.EXTRA_MESSAGE_ID)), 5, 18);
        }
        csjb a2 = b.a();
        a2.I("GetMessagesMethod.processIntent");
        a2.A(GroupManagementRequest.ACTION_TAG, intent.getAction());
        a2.r();
        return c().a(build);
    }

    @Override // defpackage.clhc
    public final String b() {
        return "Bugle.MessagingService.Intent.IncomingChatMessage.Latency";
    }

    public final clfq c() {
        return ((Boolean) a.e()).booleanValue() ? (clfq) this.d.b() : (clfq) this.c.b();
    }
}
