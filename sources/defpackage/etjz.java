package defpackage;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etjz extends etgr {
    public final etjy a;
    public final int b;

    private etjz(etjy etjyVar, int i) {
        this.a = etjyVar;
        this.b = i;
    }

    public static etjz b(etjy etjyVar, int i) {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new etjz(etjyVar, i);
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.a != etjy.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof etjz)) {
            return false;
        }
        etjz etjzVar = (etjz) obj;
        return etjzVar.a == this.a && etjzVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(etjz.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + this.a.c + "salt_size_bytes: " + this.b + ")";
    }
}
