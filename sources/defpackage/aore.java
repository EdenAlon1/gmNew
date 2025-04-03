package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aore extends aoym {
    private final aqux a;
    private final alxo b;
    private final alyt c;
    private final Instant d;

    public aore(aqux aquxVar, alxo alxoVar, alyt alytVar, Instant instant) {
        if (aquxVar == null) {
            throw new NullPointerException("Null sendingSelfIdentity");
        }
        this.a = aquxVar;
        if (alxoVar == null) {
            throw new NullPointerException("Null deliveryStatus");
        }
        this.b = alxoVar;
        this.c = alytVar;
        if (instant == null) {
            throw new NullPointerException("Null timestamp");
        }
        this.d = instant;
    }

    @Override // defpackage.aoym, defpackage.alyo
    public final alxo a() {
        return this.b;
    }

    @Override // defpackage.aoym, defpackage.alyo
    public final alyt b() {
        return this.c;
    }

    @Override // defpackage.alyn
    public final aqux c() {
        return this.a;
    }

    @Override // defpackage.aoym
    public final Instant e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoym) {
            aoym aoymVar = (aoym) obj;
            if (this.a.equals(aoymVar.c()) && this.b.equals(aoymVar.a()) && this.c.equals(aoymVar.b()) && this.d.equals(aoymVar.e())) {
                aoymVar.f();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
    }

    public final String toString() {
        Instant instant = this.d;
        alyt alytVar = this.c;
        alxo alxoVar = this.b;
        return "DefaultOutgoingMessageProvenance{sendingSelfIdentity=" + this.a.toString() + ", deliveryStatus=" + alxoVar.toString() + ", readReport=" + alytVar.toString() + ", timestamp=" + instant.toString() + ", messageDetails=null}";
    }

    @Override // defpackage.aoym
    public final void f() {
    }
}
