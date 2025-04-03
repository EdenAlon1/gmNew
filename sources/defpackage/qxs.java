package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qxs implements qxq {
    int a;
    public Bitmap.Config b;
    private final qxt c;

    public qxs(qxt qxtVar) {
        this.c = qxtVar;
    }

    @Override // defpackage.qxq
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qxs) {
            qxs qxsVar = (qxs) obj;
            if (this.a == qxsVar.a && rkh.l(this.b, qxsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return qxu.c(this.a, this.b);
    }
}
