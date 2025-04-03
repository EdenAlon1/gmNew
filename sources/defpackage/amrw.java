package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amrw {
    public final ctbl a;
    private final Context b;

    public amrw(Context context, ctbk ctbkVar) {
        context.getClass();
        ctbkVar.getClass();
        this.b = context;
        this.a = ctbkVar.a(new amrv());
    }

    public final boolean a() {
        return koa.c(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }
}
