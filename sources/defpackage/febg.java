package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febg extends febj {
    private final febh e;

    public febg(String str, febh febhVar) {
        super(str, false, febhVar);
        emxf.i(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        emxf.b(str.length() > 4, "empty key name");
        febhVar.getClass();
        this.e = febhVar;
    }

    @Override // defpackage.febj
    public final Object a(byte[] bArr) {
        return this.e.a(bArr);
    }

    @Override // defpackage.febj
    public final byte[] b(Object obj) {
        byte[] b = this.e.b(obj);
        b.getClass();
        return b;
    }
}
