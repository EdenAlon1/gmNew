package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drkf extends drkg<drnd, drkf> {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public drkf() {
        this(null);
    }

    @Override // defpackage.drkg
    public final /* bridge */ /* synthetic */ boolean a(drka drkaVar) {
        ffkj.e((drnd) drkaVar, drmw.a);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drkf)) {
            return false;
        }
        drkf drkfVar = (drkf) obj;
        boolean z = drkfVar.a;
        boolean z2 = drkfVar.b;
        boolean z3 = drkfVar.c;
        boolean z4 = drkfVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((drke.a(true) * 31) + drke.a(true)) * 31) + drke.a(true)) * 31) + drke.a(false);
    }

    public final String toString() {
        return "Video(supportsVP8=true, supportsVP9=true, supportsHEVC=true, supportsAV1=false)";
    }

    public /* synthetic */ drkf(byte[] bArr) {
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = false;
    }
}
