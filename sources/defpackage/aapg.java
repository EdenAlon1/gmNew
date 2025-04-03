package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapg {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter");
    public final ffsk b;
    public final Context c;
    public final ffhd d;
    public final ffbr e;
    public final aigz f;
    public final ffbr g;
    public final aufr h;
    public final zen i;
    public final asnh j;
    public final aufp k;
    public final athc l;
    public final ffbz m;
    public final alye n;
    public final Set o;
    public final ffjq p;
    public final ffji q;
    public final ffji r;
    public final ailp s;
    private final Conversation t;
    private final xto u;
    private final xgp v;

    public aapg(final ffsk ffskVar, Context context, ffhd ffhdVar, Conversation conversation, ffbr ffbrVar, aigz aigzVar, xto xtoVar, ailp ailpVar, ffbr ffbrVar2, aufr aufrVar, final ffbr ffbrVar3, zen zenVar, asnh asnhVar, aufp aufpVar, xgp xgpVar, athc athcVar) {
        ffji a2;
        ffji a3;
        ffskVar.getClass();
        context.getClass();
        ffhdVar.getClass();
        conversation.getClass();
        ffbrVar.getClass();
        aigzVar.getClass();
        xtoVar.getClass();
        aufrVar.getClass();
        ffbrVar3.getClass();
        this.b = ffskVar;
        this.c = context;
        this.d = ffhdVar;
        this.t = conversation;
        this.e = ffbrVar;
        this.f = aigzVar;
        this.u = xtoVar;
        this.s = ailpVar;
        this.g = ffbrVar2;
        this.h = aufrVar;
        this.i = zenVar;
        this.j = asnhVar;
        this.k = aufpVar;
        this.v = xgpVar;
        this.l = athcVar;
        this.m = ffca.a(new ffix() { // from class: aaon
            @Override // defpackage.ffix
            public final Object invoke() {
                return (akld) ffbr.this.b();
            }
        });
        this.n = conversation.c();
        this.o = new LinkedHashSet();
        axol.k(ffskVar, null, new aaou(this, null), 3);
        final aape aapeVar = new aape(this);
        final fflb fflbVar = new fflb();
        this.p = new ffjq() { // from class: axpo
            @Override // defpackage.ffjq
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                fflb fflbVar2 = fflb.this;
                if (fflbVar2.a == null) {
                    fflbVar2.a = axol.k(ffskVar, null, new axpz(aapeVar, obj, obj2, obj3, obj4, obj5, obj6, fflbVar2, null), 3);
                }
                return ffcu.a;
            }
        };
        a2 = axqa.a(new aapc(this), 1000L, ffskVar);
        this.q = a2;
        a3 = axqa.a(new aapa(this), 1000L, ffskVar);
        this.r = a3;
    }

    public final void a(ainw ainwVar) {
        drlx a2 = drlo.a(ainwVar.a);
        if (a2 == null) {
            return;
        }
        xto xtoVar = this.u;
        xgp xgpVar = this.v;
        xtoVar.a(new xhl(xgpVar.a(), a2, ainwVar.b, null, doxq.a));
    }
}
