package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elgy implements eewl {
    final /* synthetic */ eewl a;
    final /* synthetic */ elhc b;

    public elgy(elhc elhcVar, eewl eewlVar) {
        this.a = eewlVar;
        this.b = elhcVar;
    }

    @Override // defpackage.eewl
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.eewl
    public final String c(Context context, String[] strArr) {
        ekzm d = this.b.a.d(this.a.b());
        try {
            String c = this.a.c(context, strArr);
            d.close();
            return c;
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eewl
    public final String[] d(Context context, String[] strArr) {
        return this.a.d(context, strArr);
    }
}
