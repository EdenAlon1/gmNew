package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febm extends febj {
    private final febn e;

    public febm(String str, boolean z, febn febnVar) {
        super(str, z, febnVar);
        emxf.i(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        febnVar.getClass();
        this.e = febnVar;
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
