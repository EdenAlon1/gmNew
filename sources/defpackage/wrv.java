package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrv implements wqq {
    public final Context a;
    public final ffsk b;
    public final alxl c;
    public final csll d;
    public final aigz e;
    private final ffxx f;
    private final Set g;

    public wrv(Context context, ffsk ffskVar, alxl alxlVar, csll csllVar, aigz aigzVar, ffxx ffxxVar) {
        context.getClass();
        ffskVar.getClass();
        alxlVar.getClass();
        csllVar.getClass();
        aigzVar.getClass();
        ffxxVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = alxlVar;
        this.d = csllVar;
        this.e = aigzVar;
        this.f = new wrt(ffxxVar, this);
        this.g = fffi.b(aaxf.a);
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
