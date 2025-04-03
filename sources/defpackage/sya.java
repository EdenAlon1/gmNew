package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sya extends syc {
    private final int a;

    public sya(int i) {
        this.a = i;
    }

    @Override // defpackage.tah
    public final int a() {
        return 1;
    }

    @Override // defpackage.syc, defpackage.tah
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tah) {
            tah tahVar = (tah) obj;
            if (tahVar.a() == 1 && this.a == tahVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a.a(Integer.toString(this.a - 1), "DialogLoggingSource{blockAndReportSpamDialogSource=", "}");
    }
}
