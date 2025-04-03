package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wut implements wqq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/actions/details/ConversationDetailsActionPlugin");
    public final ffsk b;
    public final alxs c;
    public final aigz d;
    public final ffbr e;
    public final ffxx f;
    public final ffjm g;
    private final Context h;
    private final ffxx i;
    private final ffxx j;
    private final ConversationId k;
    private final Optional l;
    private final ffxx m;
    private final ffxx n;
    private final Set o;

    public wut(Context context, ffsk ffskVar, ffxx ffxxVar, alxs alxsVar, ffxx ffxxVar2, ConversationId conversationId, aigz aigzVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2) {
        context.getClass();
        ffskVar.getClass();
        ffxxVar.getClass();
        alxsVar.getClass();
        ffxxVar2.getClass();
        conversationId.getClass();
        aigzVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.h = context;
        this.b = ffskVar;
        this.i = ffxxVar;
        this.c = alxsVar;
        this.j = ffxxVar2;
        this.k = conversationId;
        this.d = aigzVar;
        this.l = optional;
        this.e = ffbrVar;
        cyvq cyvqVar = (cyvq) fflm.b(optional);
        ffxx ffygVar = cyvqVar != null ? cyvqVar.b : new ffyg(null);
        cyvq cyvqVar2 = (cyvq) fflm.b(optional);
        wus wusVar = new wus(new wup(axsp.j(ffygVar, cyvqVar2 != null ? cyvqVar2.c : new ffyg(null), ffskVar, new wul(null)), this));
        wum wumVar = new wum(null);
        int i = fgau.a;
        fgen fgenVar = new fgen(wumVar, wusVar);
        this.m = fgenVar;
        cyvq cyvqVar3 = (cyvq) fflm.b(optional);
        ffxx i2 = axsp.i(ffxxVar, ffxxVar2, cyvqVar3 != null ? cyvqVar3.b : new ffyg(null), fgenVar, ffskVar, new wui(this, null));
        this.n = i2;
        if (((askf) ffbrVar2.b()).a() && (conversationId instanceof RbmConversationId)) {
            i2 = new ffyg(null);
        }
        this.f = i2;
        this.g = axqa.d(new wuk(this), ffskVar);
        this.o = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.o;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.f;
    }

    public final dlsr c(final alxj alxjVar) {
        String string = this.h.getString(alxjVar.b() == alxi.GROUP ? R.string.action_people_and_options_group : R.string.action_people_and_options);
        string.getClass();
        return new dlsr(string, dmzz.bJ, false, true, true, false, null, false, null, new ffix() { // from class: wuh
            @Override // defpackage.ffix
            public final Object invoke() {
                wut wutVar = wut.this;
                wutVar.g.a(alxjVar, wutVar.c);
                return ffcu.a;
            }
        }, 996);
    }
}
