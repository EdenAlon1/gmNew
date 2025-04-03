package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coko {
    private static final cskc b = cskc.g("Bugle", "MessageSendingMetadata");
    public final comc a;

    public coko(comc comcVar) {
        this.a = comcVar;
    }

    public final cokm a() {
        try {
            return (cokm) this.a.l();
        } catch (eygu e) {
            csjb b2 = b.b();
            b2.I("Couldn't load MessageSendingMetadata from store");
            b2.s(e);
            return cokm.a;
        }
    }
}
