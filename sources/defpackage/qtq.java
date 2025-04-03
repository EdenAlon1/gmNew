package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtq implements qty {
    private final Collection b;

    @SafeVarargs
    public qtq(qty... qtyVarArr) {
        if (qtyVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.b = Arrays.asList(qtyVarArr);
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qty) it.next()).a(messageDigest);
        }
    }

    @Override // defpackage.qty
    public final qwv b(Context context, qwv qwvVar, int i, int i2) {
        Iterator it = this.b.iterator();
        qwv qwvVar2 = qwvVar;
        while (it.hasNext()) {
            qwv b = ((qty) it.next()).b(context, qwvVar2, i, i2);
            if (qwvVar2 != null && !qwvVar2.equals(qwvVar) && !qwvVar2.equals(b)) {
                qwvVar2.e();
            }
            qwvVar2 = b;
        }
        return qwvVar2;
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof qtq) {
            return this.b.equals(((qtq) obj).b);
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return this.b.hashCode();
    }
}
