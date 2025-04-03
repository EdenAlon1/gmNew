package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syb extends syc {
    private final int a;

    public syb(int i) {
        this.a = i;
    }

    @Override // defpackage.tah
    public final int a() {
        return 2;
    }

    @Override // defpackage.syc, defpackage.tah
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tah) {
            tah tahVar = (tah) obj;
            if (tahVar.a() == 2 && this.a == tahVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a.a(Integer.toString(this.a - 1), "DialogLoggingSource{rbmBlockAndReportSpamDialogSource=", "}");
    }
}
