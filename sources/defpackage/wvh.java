package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvh implements wqq {
    public final Context a;
    public final aigz b;
    public final alxs c;
    public final ffsk d;
    public final ffxx e;
    private final Set f;

    public wvh(Context context, aigz aigzVar, ffxx ffxxVar, ffxx ffxxVar2, alxs alxsVar, ffsk ffskVar) {
        context.getClass();
        aigzVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        alxsVar.getClass();
        ffskVar.getClass();
        this.a = context;
        this.b = aigzVar;
        this.c = alxsVar;
        this.d = ffskVar;
        this.e = new fgch(ffxxVar2, ffxxVar, new wvf(this, null));
        this.f = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.e;
    }
}
