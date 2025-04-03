package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qvh implements qtp {
    private final qtp b;
    private final qtp c;

    public qvh(qtp qtpVar, qtp qtpVar2) {
        this.b = qtpVar;
        this.c = qtpVar2;
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof qvh) {
            qvh qvhVar = (qvh) obj;
            if (this.b.equals(qvhVar.b) && this.c.equals(qvhVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        qtp qtpVar = this.c;
        return "DataCacheKey{sourceKey=" + String.valueOf(this.b) + ", signature=" + String.valueOf(qtpVar) + "}";
    }
}
