package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffao extends ernr {
    public final fdxo a;

    public ffao(fdxo fdxoVar) {
        this.a = fdxoVar;
    }

    @Override // defpackage.ernr
    protected final String gP() {
        emwz b = emxa.b(this);
        b.b("clientCall", this.a);
        return b.toString();
    }

    @Override // defpackage.ernr
    protected final void k() {
        this.a.c("GrpcFuture was cancelled", null);
    }
}
