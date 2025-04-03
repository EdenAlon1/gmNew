package defpackage;

import java.security.KeyPair;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgpi {
    public final KeyPair a;
    public final long b;

    public dgpi(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    public final String a() {
        return dgpz.b(this.a.getPrivate().getEncoded());
    }

    public final String b() {
        return dgpz.b(this.a.getPublic().getEncoded());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dgpi)) {
            return false;
        }
        dgpi dgpiVar = (dgpi) obj;
        return this.b == dgpiVar.b && this.a.getPublic().equals(dgpiVar.a.getPublic()) && this.a.getPrivate().equals(dgpiVar.a.getPrivate());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.b)});
    }
}
