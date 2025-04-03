package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrn implements wqq {
    public final Context a;
    public final ConversationId b;
    public final aigz c;
    public final OpenConversation2Arguments d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffxx h;
    public final ffjn i;
    private final ffsk j;
    private final ffxx k;
    private final ffxx l;
    private final Set m;

    public wrn(Context context, final ffsk ffskVar, ffxx ffxxVar, ConversationId conversationId, aigz aigzVar, OpenConversation2Arguments openConversation2Arguments, ffxx ffxxVar2, ffxx ffxxVar3, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffxx ffxxVar4) {
        context.getClass();
        ffskVar.getClass();
        ffxxVar.getClass();
        conversationId.getClass();
        aigzVar.getClass();
        openConversation2Arguments.getClass();
        ffxxVar2.getClass();
        ffxxVar3.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffxxVar4.getClass();
        this.a = context;
        this.j = ffskVar;
        this.b = conversationId;
        this.c = aigzVar;
        this.d = openConversation2Arguments;
        this.k = ffxxVar3;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.l = ffxxVar4;
        this.h = fgck.b(ffxxVar, ffxxVar2, ffxxVar3, ffxxVar4, new wrl(this, null));
        this.m = fffi.b(aaxf.a);
        final wrm wrmVar = new wrm(this);
        final fflb fflbVar = new fflb();
        this.i = new ffjn() { // from class: axpt
            @Override // defpackage.ffjn
            public final Object a(Object obj, Object obj2, Object obj3) {
                fflb fflbVar2 = fflb.this;
                if (fflbVar2.a == null) {
                    fflbVar2.a = axol.k(ffskVar, null, new axpx(wrmVar, obj, obj2, obj3, fflbVar2, null), 3);
                }
                return ffcu.a;
            }
        };
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.m;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.h;
    }
}
