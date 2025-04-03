package defpackage;

import java.io.ByteArrayInputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febk extends febj {
    private final febi e;

    public febk(String str, febi febiVar) {
        super(str, false, febiVar);
        emxf.i(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        emxf.b(str.length() > 4, "empty key name");
        this.e = febiVar;
    }

    @Override // defpackage.febj
    public final Object a(byte[] bArr) {
        return this.e.b(new ByteArrayInputStream(bArr));
    }

    @Override // defpackage.febj
    public final byte[] b(Object obj) {
        return febo.k(this.e.a(obj));
    }

    @Override // defpackage.febj
    public final boolean c() {
        return true;
    }
}
