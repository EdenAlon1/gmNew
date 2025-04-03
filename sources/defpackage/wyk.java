package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyk implements wqq {
    public final Context a;
    public final ffsk b;
    public final aawu c;
    public final xhv d;
    public final abcf e;
    private final ffxx f;
    private final Set g;

    public wyk(Context context, ffsk ffskVar, aawu aawuVar, xhv xhvVar, abcf abcfVar) {
        context.getClass();
        ffskVar.getClass();
        aawuVar.getClass();
        xhvVar.getClass();
        abcfVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = aawuVar;
        this.d = xhvVar;
        this.e = abcfVar;
        this.f = fgau.a(aawuVar.a(), new wyi(this, null));
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
}
