package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edle extends edoz {
    public final edoy a;
    public final edpe b;
    public final Instant c;

    public edle(edoy edoyVar, edpe edpeVar, Instant instant) {
        if (edoyVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = edoyVar;
        if (edpeVar == null) {
            throw new NullPointerException("Null price");
        }
        this.b = edpeVar;
        if (instant == null) {
            throw new NullPointerException("Null updateTime");
        }
        this.c = instant;
    }

    @Override // defpackage.edoz
    public final edoy a() {
        return this.a;
    }

    @Override // defpackage.edoz
    public final edpe b() {
        return this.b;
    }

    @Override // defpackage.edoz
    public final Instant c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edoz) {
            edoz edozVar = (edoz) obj;
            if (this.a.equals(edozVar.a()) && this.b.equals(edozVar.b()) && this.c.equals(edozVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Instant instant = this.c;
        edpe edpeVar = this.b;
        return "FuelPrice{type=" + this.a.toString() + ", price=" + edpeVar.toString() + ", updateTime=" + instant.toString() + "}";
    }
}
