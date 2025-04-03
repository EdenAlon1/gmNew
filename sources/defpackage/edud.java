package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edud extends edvh {
    private final edvk a;
    private final Optional b;

    public edud(edvk edvkVar, Optional optional) {
        this.a = edvkVar;
        this.b = optional;
    }

    @Override // defpackage.edvh
    public final edvk a() {
        return this.a;
    }

    @Override // defpackage.edvh
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edvh) {
            edvh edvhVar = (edvh) obj;
            if (this.a.equals(edvhVar.a()) && this.b.equals(edvhVar.b())) {
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
        return "EventRecord{eventVector=" + this.a.toString() + ", aggregateValue=" + optional.toString() + "}";
    }
}
