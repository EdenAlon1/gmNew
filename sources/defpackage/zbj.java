package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zbj implements wqq {
    public final Context a;
    public final ajjc b;
    public final ffxx c;
    public final zbo d;
    private final ffxx e;
    private final Set f;

    public zbj(ffxx ffxxVar, Context context, ajjc ajjcVar, zbo zboVar) {
        ffxxVar.getClass();
        context.getClass();
        ajjcVar.getClass();
        zboVar.getClass();
        this.a = context;
        this.b = ajjcVar;
        this.d = zboVar;
        ffxx a = ffyy.a(new zbf(ffxxVar));
        this.e = a;
        this.c = new zbi(a, this);
        this.f = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.c;
    }
}
