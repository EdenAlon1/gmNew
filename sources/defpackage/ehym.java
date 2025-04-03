package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehym extends eiah {
    private final eiag a;
    private final Optional b;

    public ehym(eiag eiagVar, Optional optional) {
        this.a = eiagVar;
        this.b = optional;
    }

    @Override // defpackage.eiah
    public final eiag a() {
        return this.a;
    }

    @Override // defpackage.eiah
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiah) {
            eiah eiahVar = (eiah) obj;
            if (this.a.equals(eiahVar.a()) && this.b.equals(eiahVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "FileTransferInformation{fileInformation=" + this.a.toString() + ", thumbnailInformation=" + optional.toString() + "}";
    }
}
