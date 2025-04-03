package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmpi {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public dmpi() {
        this(false, false, false, false, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmpi)) {
            return false;
        }
        dmpi dmpiVar = (dmpi) obj;
        return this.a == dmpiVar.a && this.b == dmpiVar.b && this.c == dmpiVar.c && this.d == dmpiVar.d && this.e == dmpiVar.e && this.f == dmpiVar.f && this.g == dmpiVar.g;
    }

    public final int hashCode() {
        int a = dmph.a(this.a);
        boolean z = this.g;
        boolean z2 = this.f;
        boolean z3 = this.e;
        boolean z4 = this.d;
        return (((((((((((a * 31) + dmph.a(this.b)) * 31) + dmph.a(this.c)) * 31) + dmph.a(z4)) * 31) + dmph.a(z3)) * 31) + dmph.a(z2)) * 31) + dmph.a(z);
    }

    public final String toString() {
        return "Flags(useRevisedLayout=" + this.a + ", useMagicEdit=" + this.b + ", verifyTextFieldDisposition=" + this.c + ", hideInputIfNullUiData=" + this.d + ", fixTextOnWhiteBackground=" + this.e + ", showSpacerForNullShortcuts=" + this.f + ", enableAutomationDetectionForClickEvents=" + this.g + ")";
    }

    public dmpi(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public /* synthetic */ dmpi(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), false, false, ((i & 8) == 0) & z2, ((i & 16) == 0) & z3, ((i & 32) == 0) & z4, false);
    }
}
