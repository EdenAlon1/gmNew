package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awcu extends awcv {
    private final avvd a;

    public awcu(avvd avvdVar) {
        this.a = avvdVar;
    }

    @Override // defpackage.awcx
    public final int b() {
        return 2;
    }

    @Override // defpackage.awcv, defpackage.awcx
    public final avvd c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awcx) {
            awcx awcxVar = (awcx) obj;
            if (awcxVar.b() == 2 && this.a.equals(awcxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FileInformationOrFileTransferFailure{fileTransferFailure=" + this.a.toString() + "}";
    }
}
