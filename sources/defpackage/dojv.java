package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dojv implements dojx {
    private final Integer a;
    private final int b;
    private final boolean c;

    public dojv() {
        this(null);
    }

    @Override // defpackage.dojx
    public final int a() {
        return 20;
    }

    @Override // defpackage.dojx
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dojv)) {
            return false;
        }
        dojv dojvVar = (dojv) obj;
        Integer num = dojvVar.a;
        if (!ffkj.e(null, null)) {
            return false;
        }
        int i = dojvVar.b;
        boolean z = dojvVar.c;
        return true;
    }

    public final int hashCode() {
        return 1857;
    }

    public final String toString() {
        return a.i(null, "Tinted(iconTint=", ", cornerRadiusDp=20, primaryColored=false)");
    }

    public /* synthetic */ dojv(byte[] bArr) {
        this.a = null;
        this.b = 20;
        this.c = false;
    }
}
