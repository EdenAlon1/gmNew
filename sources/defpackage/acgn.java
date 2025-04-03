package defpackage;

import defpackage.acgt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgn extends acgt.a {
    private final acgs a;

    public acgn(acgs acgsVar) {
        this.a = acgsVar;
    }

    @Override // acgt.a
    public final acgs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acgt.a) {
            return this.a.equals(((acgt.a) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TakeBugReportRequestEvent{eventData=" + this.a.toString() + "}";
    }
}
