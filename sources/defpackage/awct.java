package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awct extends awcv {
    private final awvb a;

    public awct(awvb awvbVar) {
        this.a = awvbVar;
    }

    @Override // defpackage.awcv, defpackage.awcx
    public final awvb a() {
        return this.a;
    }

    @Override // defpackage.awcx
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awcx) {
            awcx awcxVar = (awcx) obj;
            if (awcxVar.b() == 1 && this.a.equals(awcxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FileInformationOrFileTransferFailure{fileInformation=" + this.a.toString() + "}";
    }
}
