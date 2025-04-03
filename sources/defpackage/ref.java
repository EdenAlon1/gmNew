package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ref implements qtw {
    private final rfh a;
    private final qxf b;

    public ref(rfh rfhVar, qxf qxfVar) {
        this.a = rfhVar;
        this.b = qxfVar;
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        qwv c = this.a.c((Uri) obj, qtuVar);
        if (c == null) {
            return null;
        }
        return rdn.a(this.b, ((rfe) c).c(), i, i2);
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
