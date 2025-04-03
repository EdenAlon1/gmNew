package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pes {
    public final peu[] a;
    public final byte[] b;
    public final int c;
    private final String d;

    public pes(String str, peu[] peuVarArr) {
        this.d = str;
        this.b = null;
        this.a = peuVarArr;
        this.c = 0;
    }

    private static final String c(int i) {
        return i != 0 ? "ArrayBuffer" : "String";
    }

    public final String a() {
        b(0);
        return this.d;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.c) + " expected, but got " + c(i));
    }

    public pes(byte[] bArr, peu[] peuVarArr) {
        bArr.getClass();
        this.b = bArr;
        this.d = null;
        this.a = peuVarArr;
        this.c = 1;
    }
}
