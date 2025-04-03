package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcq implements wqq {
    public final ConversationId a;
    public final aigz b;
    public final ffxx c;
    private final Context d;
    private final ffsk e;
    private final Set f;

    public xcq(Context context, ConversationId conversationId, aigz aigzVar, ffsk ffskVar) {
        context.getClass();
        conversationId.getClass();
        aigzVar.getClass();
        ffskVar.getClass();
        this.d = context;
        this.a = conversationId;
        this.b = aigzVar;
        this.e = ffskVar;
        String string = context.getString(R.string.view_starred_action);
        string.getClass();
        this.c = new ffyg(new dlsr(string, dmzz.dG, false, true, false, false, null, false, null, axqa.b(new ffix() { // from class: xcp
            @Override // defpackage.ffix
            public final Object invoke() {
                xcq xcqVar = xcq.this;
                xcqVar.b.h(new aini(xcqVar.a));
                return ffcu.a;
            }
        }, ffskVar), 1012));
        this.f = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.c;
    }
}
