package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoyq implements alya, alyo {
    private final alxo a;
    private final alyt b;
    private final long c;
    private final aqge d;

    public aoyq(alxo alxoVar, alyt alytVar, long j) {
        alxoVar.getClass();
        this.a = alxoVar;
        this.b = alytVar;
        this.c = j;
        this.d = null;
    }

    @Override // defpackage.alyo
    public final alxo a() {
        return this.a;
    }

    @Override // defpackage.alyo
    public final alyt b() {
        return this.b;
    }

    @Override // defpackage.alya
    public final int d() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoyq)) {
            return false;
        }
        aoyq aoyqVar = (aoyq) obj;
        if (this.a != aoyqVar.a || !ffkj.e(this.b, aoyqVar.b) || this.c != aoyqVar.c) {
            return false;
        }
        aqge aqgeVar = aoyqVar.d;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long j = this.c;
        return ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public final String toString() {
        return "DefaultUnknownOutgoingMessageProvenance(deliveryStatus=" + this.a + ", readReport=" + this.b + ", timestamp=" + this.c + ", messageDetails=null)";
    }
}
