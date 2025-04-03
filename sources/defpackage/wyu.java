package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyu implements wqq {
    public final ConversationId a;
    public final aigz b;
    public final ffxx c;
    private final Context d;
    private final Optional e;
    private final ffsk f;
    private final Set g;

    public wyu(Context context, ConversationId conversationId, aigz aigzVar, Optional optional, ffsk ffskVar) {
        context.getClass();
        conversationId.getClass();
        aigzVar.getClass();
        ffskVar.getClass();
        this.d = context;
        this.a = conversationId;
        this.b = aigzVar;
        this.e = optional;
        this.f = ffskVar;
        String string = context.getString(R.string.search_action);
        string.getClass();
        dmzz dmzzVar = dmzz.dj;
        optional.isPresent();
        this.c = new ffyg(new dlsr(string, dmzzVar, false, true, true, false, null, false, null, axqa.b(new ffix() { // from class: wyt
            @Override // defpackage.ffix
            public final Object invoke() {
                wyu wyuVar = wyu.this;
                wyuVar.b.h(new aikf(wyuVar.a));
                return ffcu.a;
            }
        }, ffskVar), 996));
        this.g = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.c;
    }
}
