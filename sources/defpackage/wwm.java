package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwm implements wqq {
    public final ffsk a;
    public final ffxx b;
    private final ffxx c;
    private final Set d;

    public wwm(Context context, aigz aigzVar, ffsk ffskVar, ffxx ffxxVar) {
        context.getClass();
        aigzVar.getClass();
        ffskVar.getClass();
        ffxxVar.getClass();
        this.a = ffskVar;
        this.c = ffxxVar;
        this.b = new wwl(ffxxVar, context, this, aigzVar);
        this.d = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.b;
    }
}
