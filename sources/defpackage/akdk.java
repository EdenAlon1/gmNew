package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akdk {
    public final eqom a;
    public final UUID b;
    public final akdj c;

    public akdk(eqom eqomVar, UUID uuid, akdj akdjVar) {
        this.a = eqomVar;
        this.b = uuid;
        this.c = akdjVar;
    }

    public final boolean a() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akdk)) {
            return false;
        }
        akdk akdkVar = (akdk) obj;
        return this.a == akdkVar.a && ffkj.e(this.b, akdkVar.b) && ffkj.e(this.c, akdkVar.c);
    }

    public final int hashCode() {
        eqom eqomVar = this.a;
        return ((((eqomVar == null ? 0 : eqomVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HandshakeResult(failureReason=" + this.a + ", sessionId=" + this.b + ", result=" + this.c + ")";
    }
}
