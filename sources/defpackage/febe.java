package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febe extends febj {
    private final febf e;

    public febe(String str, febf febfVar) {
        super(str, false, febfVar);
        emxf.i(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        febfVar.getClass();
        this.e = febfVar;
    }

    @Override // defpackage.febj
    public final Object a(byte[] bArr) {
        return this.e.a(new String(bArr, StandardCharsets.US_ASCII));
    }

    @Override // defpackage.febj
    public final byte[] b(Object obj) {
        return this.e.b(obj).getBytes(StandardCharsets.US_ASCII);
    }
}
