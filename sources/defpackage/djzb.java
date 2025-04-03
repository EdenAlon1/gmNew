package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djzb extends dkaq {
    private final String a;
    private final Optional b;

    public djzb(String str, Optional optional) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        this.b = optional;
    }

    @Override // defpackage.dkaq
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.dkaq
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkaq) {
            dkaq dkaqVar = (dkaq) obj;
            if (this.a.equals(dkaqVar.b()) && this.b.equals(dkaqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ConfigurationUpdate{simId=" + this.a + ", optionalConfiguration=" + this.b.toString() + "}";
    }
}
