package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wte implements wqq {
    public final Context a;
    public final alxl b;
    public final ajjc c;
    public final cuxz d;
    public final csll e;
    public final deaj f;
    public final elbx g;
    public final aigz h;
    public final ffbr i;
    public final ffbr j;
    public final ffxx k;
    public final Set l;
    private final ffsk m;
    private final ffxx n;

    public wte(Context context, ffsk ffskVar, alxl alxlVar, ajjc ajjcVar, cuxz cuxzVar, csll csllVar, deaj deajVar, elbx elbxVar, aigz aigzVar, ffxx ffxxVar, ffxx ffxxVar2, ffbr ffbrVar, ffbr ffbrVar2) {
        context.getClass();
        ffskVar.getClass();
        alxlVar.getClass();
        ajjcVar.getClass();
        cuxzVar.getClass();
        csllVar.getClass();
        deajVar.getClass();
        elbxVar.getClass();
        aigzVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffbrVar.getClass();
        this.a = context;
        this.m = ffskVar;
        this.b = alxlVar;
        this.c = ajjcVar;
        this.d = cuxzVar;
        this.e = csllVar;
        this.f = deajVar;
        this.g = elbxVar;
        this.h = aigzVar;
        this.n = ffxxVar2;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.k = new fgch(ffxxVar, ffxxVar2, new wtc(this, null));
        this.l = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.l;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.k;
    }

    public final void c(ConversationId conversationId) {
        axol.k(this.m, null, new wtd(this, conversationId, null), 3);
    }
}
