package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    private final boolean d;

    public abdm(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.d = false;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abdm)) {
            return false;
        }
        abdm abdmVar = (abdm) obj;
        if (this.a != abdmVar.a) {
            return false;
        }
        boolean z = abdmVar.d;
        return this.b == abdmVar.b && this.c == abdmVar.c;
    }

    public final int hashCode() {
        int a = abdl.a(this.a);
        boolean z = this.c;
        return (((((a * 31) + abdl.a(false)) * 31) + abdl.a(this.b)) * 31) + abdl.a(z);
    }

    public final String toString() {
        return "Flags(shareSnackbarHostStateWithProjector=" + this.a + ", useProjectorThemeForBottomSheetsAndBottomContentInProjectorMode=false, useBottomContentHeightFlowForTopAppBarVisibility=" + this.b + ", moveSnackbarAboveComposeRow=" + this.c + ")";
    }

    public abdm() {
        this(false, false, false);
    }
}
