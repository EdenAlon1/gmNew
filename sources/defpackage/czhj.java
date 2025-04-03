package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czhj implements tuw {
    public final enhk a = enhk.q(tve.REACTION_BADGE, this, tve.CUSTOM_REACTION_BADGE, this, tve.STAR_BADGE, this, tve.CALENDAR_BADGE, this, tve.SCHEDULED_SEND_BADGE, this, tve.REMINDER_BADGE, this);
    private final Optional b;
    private final ConversationMessageView c;

    public czhj(Optional optional, ConversationMessageView conversationMessageView) {
        this.b = optional;
        this.c = conversationMessageView;
    }

    @Override // defpackage.tuw
    public final void a(View view, tve tveVar) {
        bcse bcseVar = this.c.e;
        emxf.a(this.b.isPresent());
        tve tveVar2 = tve.REACTION_BADGE;
        int ordinal = tveVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            vgb a = ((vfq) this.b.get()).a(bcseVar);
            SelfIdentityId s = bcseVar.s();
            cmrf cmrfVar = bcseVar.s;
            cmrfVar.getClass();
            ellj.g(new vff(a, s, cmrfVar), this.c);
            return;
        }
        if (ordinal == 2) {
            ellj.g(new wfb(this.c, view, new BugleConversationId(bcseVar.t()), bcseVar.u(), bcseVar.n()), this.c);
            return;
        }
        if (ordinal == 3) {
            int i = engw.d;
            ellj.g(new cztm(enou.a), this.c);
            return;
        }
        if (ordinal == 4) {
            coiy coiyVar = bcseVar.y;
            if (coiyVar != null) {
                akqw createBuilder = akqx.a.createBuilder();
                String e = coiyVar.e();
                createBuilder.copyOnWrite();
                akqx akqxVar = (akqx) createBuilder.instance;
                e.getClass();
                akqxVar.b = e;
                long epochMilli = coiyVar.d().toEpochMilli();
                createBuilder.copyOnWrite();
                ((akqx) createBuilder.instance).c = epochMilli;
                ellj.g(new akpr(createBuilder.build()), this.c);
                return;
            }
            return;
        }
        if (ordinal != 5) {
            return;
        }
        ddla ddlaVar = new ddla();
        ddln createBuilder2 = ddlo.a.createBuilder();
        String a2 = bcseVar.t().a();
        createBuilder2.copyOnWrite();
        ddlo ddloVar = (ddlo) createBuilder2.instance;
        a2.getClass();
        ddloVar.b = 4 | ddloVar.b;
        ddloVar.e = a2;
        String b = bcseVar.u().b();
        createBuilder2.copyOnWrite();
        ddlo ddloVar2 = (ddlo) createBuilder2.instance;
        b.getClass();
        ddloVar2.b = 2 | ddloVar2.b;
        ddloVar2.d = b;
        createBuilder2.copyOnWrite();
        ddlo ddloVar3 = (ddlo) createBuilder2.instance;
        ddloVar3.b |= 8;
        ddloVar3.f = true;
        long j = bcseVar.j;
        createBuilder2.copyOnWrite();
        ddlo ddloVar4 = (ddlo) createBuilder2.instance;
        ddloVar4.b |= 16;
        ddloVar4.g = j;
        ddlaVar.b(createBuilder2.build());
        ellj.g(ddlaVar.a(), this.c);
    }
}
