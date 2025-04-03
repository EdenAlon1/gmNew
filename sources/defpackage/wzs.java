package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzs implements wqq {
    public final Context a;
    public final alye b;
    public final ffsk c;
    public final aawu d;
    public final ablq e;
    private final ffxx f;
    private final Set g;

    public wzs(Context context, alye alyeVar, ffsk ffskVar, aawu aawuVar, ablq ablqVar) {
        context.getClass();
        alyeVar.getClass();
        ffskVar.getClass();
        aawuVar.getClass();
        ablqVar.getClass();
        this.a = context;
        this.b = alyeVar;
        this.c = ffskVar;
        this.d = aawuVar;
        this.e = ablqVar;
        this.f = new wzp(aawuVar.a(), this);
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
        axol.k(this.c, null, new wzq(this, alxrVar, null), 3);
    }
}
