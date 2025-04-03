package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjn implements qtp {
    private final Object b;

    public rjn(Object obj) {
        rkf.f(obj);
        this.b = obj;
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof rjn) {
            return this.b.equals(((rjn) obj).b);
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b.toString() + "}";
    }
}
