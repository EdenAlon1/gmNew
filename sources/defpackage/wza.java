package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wza implements wqq {
    public final Context a;
    public final ffsk b;
    public final aigz c;
    public final alxl d;
    public final ffxx e;
    private final ffxx f;
    private final Optional g;
    private final Set h;

    public wza(Context context, ffsk ffskVar, ffxx ffxxVar, Optional optional, aigz aigzVar, alxl alxlVar) {
        context.getClass();
        ffskVar.getClass();
        ffxxVar.getClass();
        aigzVar.getClass();
        alxlVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.f = ffxxVar;
        this.g = optional;
        this.c = aigzVar;
        this.d = alxlVar;
        cyvq cyvqVar = (cyvq) fflm.b(optional);
        this.e = axsp.j(ffxxVar, cyvqVar != null ? cyvqVar.b : new ffyg(null), ffskVar, new wyz(this, null));
        this.h = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.h;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.e;
    }
}
