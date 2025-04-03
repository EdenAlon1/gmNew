package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djks {
    public static eejk a(djkr djkrVar, djtr djtrVar) {
        String v = djkrVar.b().hasTransport(0) ? djtrVar.v() : djtrVar.A();
        return "SIPoUDP".equals(v) ? eejk.UDP : "SIPoTLS".equals(v) ? eejk.TLS : eejk.TCP;
    }
}
