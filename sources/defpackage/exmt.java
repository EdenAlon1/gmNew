package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exmt extends exmw {
    private final float a;
    private final int b;
    private final String c;
    private final String d;

    public exmt(float f, int i, String str, String str2) {
        this.a = f;
        this.b = i;
        if (str == null) {
            throw new NullPointerException("Null categoryName");
        }
        this.c = str;
        if (str2 == null) {
            throw new NullPointerException("Null displayName");
        }
        this.d = str2;
    }

    @Override // defpackage.exmw
    public final float a() {
        return this.a;
    }

    @Override // defpackage.exmw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.exmw
    public final String c() {
        return this.c;
    }

    @Override // defpackage.exmw
    public final String d() {
        return this.d;
    }
}
