package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxe {
    public final lrv a;
    public final int[] b;

    public mxe(lrv lrvVar, int... iArr) {
        this(lrvVar, iArr, null);
    }

    public mxe(lrv lrvVar, int[] iArr, byte[] bArr) {
        if (iArr.length == 0) {
            luj.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = lrvVar;
        this.b = iArr;
    }
}
