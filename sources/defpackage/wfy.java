package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wfy implements ejlr<eyjv<cvqb>, Void> {
    final /* synthetic */ Context a;
    final /* synthetic */ ea b;
    final /* synthetic */ ejlq c;
    final /* synthetic */ aqcc d;
    final /* synthetic */ wfz e;
    final /* synthetic */ cvqc f;

    public wfy(wfz wfzVar, Context context, ea eaVar, cvqc cvqcVar, ejlq ejlqVar, aqcc aqccVar) {
        this.a = context;
        this.b = eaVar;
        this.f = cvqcVar;
        this.c = ejlqVar;
        this.d = aqccVar;
        this.e = wfzVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        final eyjv eyjvVar = (eyjv) obj;
        ((ensz) ((ensz) wfz.a.h()).h("com/google/android/apps/messaging/conversation/star/handler/ConversationStarUiHandlerImpl$2", "onSuccess", 89, "ConversationStarUiHandlerImpl.java")).q("Star badge clicked is handled successfully.");
        ellj.f(new cvms(this.a.getResources().getString(R.string.star_badge_on_click_snackbar_message), this.a.getResources().getString(R.string.star_badge_on_click_snackbar_action), new Runnable() { // from class: wfx
            @Override // java.lang.Runnable
            public final void run() {
                cvqb cvqbVar = (cvqb) eyjvVar.a(cvqb.a, eyfc.a());
                BugleConversationId bugleConversationId = new BugleConversationId(bdgq.b(cvqbVar.b));
                MessageIdType b = bdhb.b(cvqbVar.c);
                String str = cvqbVar.e;
                wfy wfyVar = wfy.this;
                elfl c = wfyVar.f.a.c(bugleConversationId, b);
                cvqa createBuilder = cvqb.a.createBuilder();
                createBuilder.copyOnWrite();
                ((cvqb) createBuilder.instance).d = cvpz.b(3);
                String b2 = bugleConversationId.b();
                createBuilder.copyOnWrite();
                cvqb cvqbVar2 = (cvqb) createBuilder.instance;
                b2.getClass();
                cvqbVar2.b = b2;
                String b3 = b.b();
                createBuilder.copyOnWrite();
                cvqb cvqbVar3 = (cvqb) createBuilder.instance;
                b3.getClass();
                cvqbVar3.c = b3;
                createBuilder.copyOnWrite();
                cvqb cvqbVar4 = (cvqb) createBuilder.instance;
                str.getClass();
                cvqbVar4.e = str;
                cvqb build = createBuilder.build();
                wfyVar.c.i(ejlp.b(c), ejlm.a(build), wfyVar.e.b);
                wfyVar.d.b(4, build);
            }
        }), this.b);
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        ((ensz) ((ensz) ((ensz) wfz.a.j()).g(th)).h("com/google/android/apps/messaging/conversation/star/handler/ConversationStarUiHandlerImpl$2", "onFailure", 'p', "ConversationStarUiHandlerImpl.java")).q("Failed to handle star badge clicked.");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
