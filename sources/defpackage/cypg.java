package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cypg implements cypa {
    public final Context a;
    public final ffsk b;
    public final ConversationId c;
    public final alxl d;
    private final ffsk e;
    private final ffxx f;
    private final ffxx g;
    private final fgcq h;
    private final ffxx i;
    private final atbw j;

    public cypg(Context context, ffsk ffskVar, ffsk ffskVar2, ConversationId conversationId, ffxx ffxxVar, ffxx ffxxVar2, fgcq fgcqVar, ffxx ffxxVar3, alxl alxlVar, atbw atbwVar) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        conversationId.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        fgcqVar.getClass();
        alxlVar.getClass();
        atbwVar.getClass();
        this.a = context;
        this.e = ffskVar;
        this.b = ffskVar2;
        this.c = conversationId;
        this.f = ffxxVar;
        this.g = ffxxVar2;
        this.h = fgcqVar;
        this.i = ffxxVar3;
        this.d = alxlVar;
        this.j = atbwVar;
    }

    @Override // defpackage.cypa
    public final fgdj a() {
        ffxx i = this.j.a() ? axsp.i(this.f, this.i, this.g, this.h, this.e, new cype(this, null)) : axsp.j(this.f, this.i, this.e, new cypf(this, null));
        ffsk ffskVar = this.e;
        int i2 = fgcz.a;
        return fgbn.b(i, ffskVar, fgcy.a(0L, 3), null);
    }
}
