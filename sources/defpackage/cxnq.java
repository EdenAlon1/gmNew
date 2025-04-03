package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxnq extends cxno {
    public final enhk a;
    public final engw b;
    public final int c;
    public final int d;

    public cxnq(enhk enhkVar, engw engwVar, int i, int i2) {
        this.a = enhkVar;
        if (engwVar == null) {
            throw new NullPointerException("Null googlePhotosAttachments");
        }
        this.b = engwVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.cxno
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cxno
    public final int b() {
        return this.d;
    }

    @Override // defpackage.cxno
    public final engw d() {
        return this.b;
    }

    @Override // defpackage.cxno
    public final enhk e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxno) {
            cxno cxnoVar = (cxno) obj;
            if (ennc.m(this.a, cxnoVar.e()) && enkr.h(this.b, cxnoVar.d()) && this.c == cxnoVar.a() && this.d == cxnoVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "AttachmentsPosition{positionToSingleAttachments=" + ennc.g(this.a) + ", googlePhotosAttachments=" + this.b.toString() + ", googlePhotosPosition=" + this.c + ", googlePhotosUploadStateHash=" + this.d + "}";
    }
}
