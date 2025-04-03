package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajbx implements ajbd {
    public final ffsk a;
    public final ffxx b;
    public final ConversationId c;
    public final Optional d;
    public final zqx e;
    public final aepg f;
    public final aigz g;
    public final ffbr h;
    public final ajjc i;
    public final Optional j;
    public final ffbr k;
    public final ffxx l;
    public final fgdj m;

    public ajbx(ffsk ffskVar, ffxx ffxxVar, ConversationId conversationId, Optional optional, zqx zqxVar, aepg aepgVar, aigz aigzVar, Optional optional2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ajjc ajjcVar, Optional optional3, ffbr ffbrVar4) {
        fgdj j;
        ffskVar.getClass();
        ffxxVar.getClass();
        conversationId.getClass();
        zqxVar.getClass();
        aepgVar.getClass();
        aigzVar.getClass();
        optional2.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        ajjcVar.getClass();
        optional3.getClass();
        ffbrVar4.getClass();
        this.a = ffskVar;
        this.b = ffxxVar;
        this.c = conversationId;
        this.d = optional;
        this.e = zqxVar;
        this.f = aepgVar;
        this.g = aigzVar;
        this.h = ffbrVar3;
        this.i = ajjcVar;
        this.j = optional3;
        this.k = ffbrVar4;
        Object b = ffbrVar2.b();
        b.getClass();
        this.l = ffyy.a(new fgcp(new aiyc((Optional) b, null)));
        if (optional2.isEmpty()) {
            j = fgdm.a(false);
        } else {
            cjeo cjeoVar = (cjeo) optional2.get();
            Object b2 = ffbrVar.b();
            b2.getClass();
            j = cjeoVar.j((eisx) b2);
        }
        this.m = j;
    }

    @Override // defpackage.ajbd
    public final void a() {
        if (!((aspy) this.h.b()).a() || (this.c instanceof PenpalBotConversationId)) {
            axol.k(this.a, null, new ajbw(this, null), 3);
        }
    }
}
