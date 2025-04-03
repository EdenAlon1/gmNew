package defpackage;

import java.security.KeyPair;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkh extends dzkj {
    private final KeyPair a;

    public dzkh(KeyPair keyPair) {
        this.a = keyPair;
    }

    @Override // defpackage.dzkj, defpackage.dzjp
    public final KeyPair a() {
        return this.a;
    }

    @Override // defpackage.dzjp
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzjp) {
            dzjp dzjpVar = (dzjp) obj;
            if (dzjpVar.b() == 2 && this.a.equals(dzjpVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfId{ecdsa=" + this.a.toString() + "}";
    }
}
