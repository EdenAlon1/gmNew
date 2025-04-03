package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exmu extends exmx {
    public final List a;
    private final Optional b;

    public exmu(List list, Optional optional) {
        if (list == null) {
            throw new NullPointerException("Null classifications");
        }
        this.a = list;
        this.b = optional;
    }

    @Override // defpackage.exmx
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.exmx
    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exmx) {
            exmx exmxVar = (exmx) obj;
            if (this.a.equals(exmxVar.b()) && this.b.equals(exmxVar.a())) {
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
        return "ClassificationResult{classifications=" + this.a.toString() + ", timestampMs=" + optional.toString() + "}";
    }
}
