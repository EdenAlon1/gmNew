package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqi extends fhpk {
    private final long a;
    private final dips b;
    private final String c;

    public diqi(long j, dips dipsVar, String str) {
        super(fhph.STRICT, "b".concat(eeja.a()), null);
        this.a = j;
        this.b = dipsVar;
        this.c = str;
    }

    @Override // defpackage.fhpk, org.apache.http.HttpEntity
    public final void writeTo(OutputStream outputStream) {
        super.writeTo(new dirt(this.a, (int) getContentLength(), outputStream, this.b, this.c));
    }
}
