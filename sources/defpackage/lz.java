package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lz extends lk {
    private static final enru c = enru.c("android/support/v7/mms/pdu/SendReq");

    public lz() {
        try {
            c(128);
            d(18);
            this.a.j("application/vnd.wap.multipart.related".getBytes(), 132);
            b(new lg("insert-address-token".getBytes()));
            h("T".concat(String.valueOf(Long.toHexString(System.currentTimeMillis()))).getBytes());
        } catch (li e) {
            ensk i = c.i();
            i.Y(ente.a, "PduParser");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("android/support/v7/mms/pdu/SendReq", "<init>", '*', "SendReq.java")).q("Unexpected InvalidHeaderValueException.");
            throw new RuntimeException(e);
        }
    }

    public final void h(byte[] bArr) {
        this.a.j(bArr, 152);
    }

    public lz(lq lqVar, ln lnVar) {
        super(lqVar, lnVar);
    }
}
