package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqqs extends cqrn {
    public final Optional a;
    public final Optional b;

    public cqqs(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.cqrn
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.cqrn
    public final Optional b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqrn) {
            cqrn cqrnVar = (cqrn) obj;
            if (this.a.equals(cqrnVar.b()) && this.b.equals(cqrnVar.a())) {
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
        return "FileTransferMessageCoreData{messageCoreData=" + String.valueOf(this.a) + ", fileTransferBindData=" + String.valueOf(optional) + "}";
    }
}
