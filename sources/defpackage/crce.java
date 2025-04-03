package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crce {
    public final awvd a;
    public final Optional b;

    public crce(awvd awvdVar, Optional optional) {
        this.a = awvdVar;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crce)) {
            return false;
        }
        crce crceVar = (crce) obj;
        return ffkj.e(this.a, crceVar.a) && ffkj.e(this.b, crceVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FileUploadResult(fileUploadResponse=" + this.a + ", thumbnailError=" + this.b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public crce(awvd awvdVar) {
        this(awvdVar, Optional.empty());
        awvdVar.getClass();
    }
}
