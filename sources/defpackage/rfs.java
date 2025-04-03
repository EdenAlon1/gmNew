package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfs implements qty {
    private final qty b;

    public rfs(qty qtyVar) {
        rkf.f(qtyVar);
        this.b = qtyVar;
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.qty
    public final qwv b(Context context, qwv qwvVar, int i, int i2) {
        rfp rfpVar = (rfp) qwvVar.c();
        qwv rcpVar = new rcp(rfpVar.a(), qpt.b(context).a);
        qwv b = this.b.b(context, rcpVar, i, i2);
        if (!rcpVar.equals(b)) {
            rcpVar.e();
        }
        Bitmap bitmap = (Bitmap) b.c();
        rfpVar.a.a.e(this.b, bitmap);
        return qwvVar;
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof rfs) {
            return this.b.equals(((rfs) obj).b);
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return this.b.hashCode();
    }
}
