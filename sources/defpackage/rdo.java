package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdo implements qty {
    private final qty b;
    private final boolean c;

    public rdo(qty qtyVar, boolean z) {
        this.b = qtyVar;
        this.c = z;
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.qty
    public final qwv b(Context context, qwv qwvVar, int i, int i2) {
        qxf qxfVar = qpt.b(context).a;
        Drawable drawable = (Drawable) qwvVar.c();
        qwv a = rdn.a(qxfVar, drawable, i, i2);
        if (a == null) {
            if (this.c) {
                throw new IllegalArgumentException(a.F(drawable, "Unable to convert ", " to a Bitmap"));
            }
            return qwvVar;
        }
        qwv b = this.b.b(context, a, i, i2);
        if (!b.equals(a)) {
            return reb.f(context.getResources(), b);
        }
        b.e();
        return qwvVar;
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof rdo) {
            return this.b.equals(((rdo) obj).b);
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return this.b.hashCode();
    }
}
