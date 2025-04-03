package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cite extends cixs {
    private final kml a;
    private final cixf b;
    private final boolean c;
    private final Optional d;

    public cite(kml kmlVar, cixf cixfVar, boolean z, Optional optional) {
        if (kmlVar == null) {
            throw new NullPointerException("Null notificationBuilder");
        }
        this.a = kmlVar;
        if (cixfVar == null) {
            throw new NullPointerException("Null notificationType");
        }
        this.b = cixfVar;
        this.c = z;
        if (optional == null) {
            throw new NullPointerException("Null notificationTag");
        }
        this.d = optional;
    }

    @Override // defpackage.cixs
    public final kml a() {
        return this.a;
    }

    @Override // defpackage.cixs
    public final cixf b() {
        return this.b;
    }

    @Override // defpackage.cixs
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.cixs
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cixs) {
            cixs cixsVar = (cixs) obj;
            if (this.a.equals(cixsVar.a()) && this.b.equals(cixsVar.b()) && this.c == cixsVar.d() && this.d.equals(cixsVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        cixf cixfVar = this.b;
        return "NotifyInfo{notificationBuilder=" + this.a.toString() + ", notificationType=" + cixfVar.toString() + ", isSummary=" + this.c + ", notificationTag=" + optional.toString() + "}";
    }
}
