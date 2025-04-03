package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqp implements abqd {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/viewmodel/LegacyConversationOpenedMetricMonitorImpl");
    public final Conversation b;
    public final ffxx c;
    public final ffbr d;
    public final ffbr e;
    private final ffsk f;
    private final ffbr g;
    private final ffbr h;

    public abqp(ffsk ffskVar, Conversation conversation, ffxx ffxxVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffskVar.getClass();
        conversation.getClass();
        ffxxVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.f = ffskVar;
        this.b = conversation;
        this.c = ffxxVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
    }

    public static final /* synthetic */ void c(abqp abqpVar) {
        if (((Boolean) ((cfup) alwj.c.get()).e()).booleanValue()) {
            ((alwf) abqpVar.h.b()).c(true);
        }
    }

    public static final boolean d(amfx amfxVar) {
        return amfxVar.E() == eoxn.SEND_MODE_XMS_LATCH;
    }

    public static final int e(alxj alxjVar) {
        return byyt.i(alxjVar.g());
    }

    public static final int f(amfx amfxVar, engw engwVar) {
        alxi b = amfxVar.b();
        if (b == null) {
            return 7;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            return cvfc.a(((aqrv) ((ResolvedRecipient) ffdx.T(engwVar)).m()).d);
        }
        if (ordinal != 2) {
            return 7;
        }
        return cvfc.a(cvei.a(engwVar));
    }

    @Override // defpackage.abqd
    public final void a() {
        axol.k(this.f, null, new abqo(this, null), 3);
    }

    public final engw b(engw engwVar) {
        aljt aljtVar = (aljt) this.g.b();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolvedRecipient) it.next()).g());
        }
        return aljtVar.a(engq.a(arrayList));
    }
}
