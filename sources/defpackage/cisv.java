package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cisv extends ciwc {
    private final engw a;
    private final Optional b;

    public cisv(engw engwVar, Optional optional) {
        if (engwVar == null) {
            throw new NullPointerException("Null notificationBuilderInfos");
        }
        this.a = engwVar;
        this.b = optional;
    }

    @Override // defpackage.ciwc
    public final engw a() {
        return this.a;
    }

    @Override // defpackage.ciwc
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciwc) {
            ciwc ciwcVar = (ciwc) obj;
            if (enkr.h(this.a, ciwcVar.a()) && this.b.equals(ciwcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "NotificationCreationPackage{notificationBuilderInfos=" + this.a.toString() + ", summaryBuilderInfo=" + optional.toString() + "}";
    }
}
