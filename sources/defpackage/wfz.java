package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfz implements wfv {
    public static final entd a = entd.c("BugleSearch");
    public final ejlr b = new wfw();
    private final ejlq c;
    private final ejlr d;
    private final aqcc e;
    private final cvqc f;
    private final wfj g;

    public wfz(Context context, ea eaVar, ejlq ejlqVar, cvqc cvqcVar, aqcc aqccVar, wfj wfjVar) {
        this.c = ejlqVar;
        this.f = cvqcVar;
        this.e = aqccVar;
        this.g = wfjVar;
        this.d = new wfy(this, context, eaVar, cvqcVar, ejlqVar, aqccVar);
    }

    private final void d(ConversationId conversationId, MessageIdType messageIdType, cvqb cvqbVar) {
        this.c.i(ejlp.b(this.f.a.d(conversationId, messageIdType)), ejlm.a(cvqbVar), this.d);
    }

    @Override // defpackage.wfv
    public final void a() {
        this.c.k(this.d);
        this.c.k(this.b);
    }

    @Override // defpackage.wfv
    public final void b(wfg wfgVar) {
        if (!((Boolean) ((cfup) ddnm.a.get()).e()).booleanValue()) {
            cvqa createBuilder = cvqb.a.createBuilder();
            createBuilder.copyOnWrite();
            ((cvqb) createBuilder.instance).d = cvpz.b(4);
            String b = wfgVar.d().b();
            createBuilder.copyOnWrite();
            cvqb cvqbVar = (cvqb) createBuilder.instance;
            b.getClass();
            cvqbVar.b = b;
            String b2 = wfgVar.e().b();
            createBuilder.copyOnWrite();
            cvqb cvqbVar2 = (cvqb) createBuilder.instance;
            b2.getClass();
            cvqbVar2.c = b2;
            String l = Long.toString(wfgVar.a());
            createBuilder.copyOnWrite();
            cvqb cvqbVar3 = (cvqb) createBuilder.instance;
            l.getClass();
            cvqbVar3.e = l;
            cvqb build = createBuilder.build();
            d(wfgVar.d(), wfgVar.e(), build);
            this.e.b(3, build);
            return;
        }
        wfj wfjVar = this.g;
        wfgVar.getClass();
        fr a2 = wfjVar.a.a();
        if (a2.ai()) {
            return;
        }
        cvpx cvpxVar = (cvpx) cvpy.a.createBuilder();
        String b3 = wfgVar.d().b();
        cvpxVar.copyOnWrite();
        cvpy cvpyVar = (cvpy) cvpxVar.instance;
        b3.getClass();
        cvpyVar.b = b3;
        long j = wfgVar.e().a;
        cvpxVar.copyOnWrite();
        ((cvpy) cvpxVar.instance).c = j;
        long a3 = wfgVar.a();
        cvpxVar.copyOnWrite();
        ((cvpy) cvpxVar.instance).d = a3;
        eyfy build2 = cvpxVar.build();
        build2.getClass();
        wfk wfkVar = new wfk();
        fbae.e(wfkVar);
        ekku.a(wfkVar, (cvpy) build2);
        wfkVar.t(a2, "StarBadgeMenuFragment");
        final wfq H = wfkVar.H();
        View c = wfgVar.c();
        H.a();
        H.f = c;
        H.d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: wfn
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                wfq.this.c();
            }
        };
        ViewTreeObserver viewTreeObserver = c.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = H.d;
        onGlobalLayoutListener.getClass();
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        H.c();
        ((ddwu) H.c.b()).a(H.e, new Runnable() { // from class: wfo
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, "StarBadgeMenuFragmentPeer_setAnchorView");
    }

    @Override // defpackage.wfv
    public final void c(wfr wfrVar) {
        cvqa createBuilder = cvqb.a.createBuilder();
        createBuilder.copyOnWrite();
        ((cvqb) createBuilder.instance).d = cvpz.b(4);
        String b = wfrVar.b().b();
        createBuilder.copyOnWrite();
        cvqb cvqbVar = (cvqb) createBuilder.instance;
        b.getClass();
        cvqbVar.b = b;
        String b2 = wfrVar.c().b();
        createBuilder.copyOnWrite();
        cvqb cvqbVar2 = (cvqb) createBuilder.instance;
        b2.getClass();
        cvqbVar2.c = b2;
        String l = Long.toString(wfrVar.a());
        createBuilder.copyOnWrite();
        cvqb cvqbVar3 = (cvqb) createBuilder.instance;
        l.getClass();
        cvqbVar3.e = l;
        d(wfrVar.b(), wfrVar.c(), createBuilder.build());
    }
}
