package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyvb implements wqq {
    public final Context a;
    public final aigz b;
    public final ffxx c;
    private final ffsk d;
    private final Set e;

    public cyvb(Context context, aigz aigzVar, ffxx ffxxVar, ffxx ffxxVar2, ffsk ffskVar, Optional optional) {
        context.getClass();
        aigzVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffskVar.getClass();
        this.a = context;
        this.b = aigzVar;
        this.d = ffskVar;
        ffxx a = axrb.a(ffxxVar, "conversationRecipient");
        cyvq cyvqVar = (cyvq) fflm.b(optional);
        ffxx cyvaVar = cyvqVar != null ? new cyva(cyvqVar.b) : new ffyg(null);
        cyvq cyvqVar2 = (cyvq) fflm.b(optional);
        this.c = axsp.h(a, cyvaVar, cyvqVar2 != null ? cyvqVar2.c : new ffyg(null), ffskVar, new cyux(this, null));
        this.e = fffi.b(aaxf.b);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.c;
    }
}
