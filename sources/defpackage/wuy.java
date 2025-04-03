package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuy implements wqq {
    public final Context a;
    public final ajjc b;
    private final ffsk c;
    private final aawu d;
    private final ffbr e;
    private final ffxx f;
    private final Set g;

    public wuy(Context context, ffsk ffskVar, aawu aawuVar, ajjc ajjcVar, ffbr ffbrVar, asmm asmmVar, aigz aigzVar, ConversationId conversationId) {
        context.getClass();
        ffskVar.getClass();
        aawuVar.getClass();
        ajjcVar.getClass();
        asmmVar.getClass();
        aigzVar.getClass();
        conversationId.getClass();
        this.a = context;
        this.c = ffskVar;
        this.d = aawuVar;
        this.b = ajjcVar;
        this.e = ffbrVar;
        this.f = new fgch(aawuVar.a(), ((Optional) ffbrVar.b()).isPresent() ? ((wxw) ((Optional) ffbrVar.b()).get()).b : new ffyg(false), new wuv(this, null));
        this.g = fffi.b(aaxf.b);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.f;
    }

    public final void c(alxr alxrVar) {
        alxrVar.getClass();
        axol.k(this.c, null, new wux(this, alxrVar, null), 3);
    }
}
