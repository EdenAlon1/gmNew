package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ndb implements ndn {
    private final ndn a;

    public ndb(ndn ndnVar) {
        this.a = ndnVar;
    }

    @Override // defpackage.ndn
    public ndl b(long j) {
        return this.a.b(j);
    }

    @Override // defpackage.ndn
    public long w() {
        return this.a.w();
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return this.a.y();
    }
}
