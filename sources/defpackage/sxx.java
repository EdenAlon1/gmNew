package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxx implements zks {
    public final Context a;
    public final Map b;
    public final ffxx c;
    public final ablq d;
    private final ffhd e;
    private final ffsk f;
    private final ffxx g;
    private final ffxx h;

    public sxx(Context context, ffhd ffhdVar, ffsk ffskVar, ffxx ffxxVar, ffxx ffxxVar2, ablq ablqVar) {
        context.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ablqVar.getClass();
        this.a = context;
        this.e = ffhdVar;
        this.f = ffskVar;
        this.g = ffxxVar;
        this.h = ffxxVar2;
        this.d = ablqVar;
        this.b = new LinkedHashMap();
        this.c = ffyo.b(new fgch(ffxxVar2, ffxxVar, new sxw(this, null)), ffhdVar);
    }

    @Override // defpackage.zks
    public final void a() {
        axol.k(this.f, null, new sxv(this, null), 3);
    }
}
