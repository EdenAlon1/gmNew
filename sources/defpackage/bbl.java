package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbl extends bfp {
    private final bfo a;
    private final bfo b;
    private final bfo c;
    private final bfo d;

    public bbl(bfo bfoVar, bfo bfoVar2, bfo bfoVar3, bfo bfoVar4) {
        if (bfoVar == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.a = bfoVar;
        if (bfoVar2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.b = bfoVar2;
        this.c = bfoVar3;
        this.d = bfoVar4;
    }

    @Override // defpackage.bfp
    public final bfo a() {
        return this.c;
    }

    @Override // defpackage.bfp
    public final bfo b() {
        return this.b;
    }

    @Override // defpackage.bfp
    public final bfo c() {
        return this.d;
    }

    @Override // defpackage.bfp
    public final bfo d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        bfo bfoVar;
        bfo bfoVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfp) {
            bfp bfpVar = (bfp) obj;
            if (this.a.equals(bfpVar.d()) && this.b.equals(bfpVar.b()) && ((bfoVar = this.c) != null ? bfoVar.equals(bfpVar.a()) : bfpVar.a() == null) && ((bfoVar2 = this.d) != null ? bfoVar2.equals(bfpVar.c()) : bfpVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        bfo bfoVar = this.c;
        int hashCode2 = ((hashCode * 1000003) ^ (bfoVar == null ? 0 : bfoVar.hashCode())) * 1000003;
        bfo bfoVar2 = this.d;
        return hashCode2 ^ (bfoVar2 != null ? bfoVar2.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.a + ", imageCaptureOutputSurface=" + this.b + ", imageAnalysisOutputSurface=" + this.c + ", postviewOutputSurface=" + this.d + "}";
    }
}
