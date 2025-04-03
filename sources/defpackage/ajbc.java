package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajbc {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ajbc(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajbc)) {
            return false;
        }
        ajbc ajbcVar = (ajbc) obj;
        return this.a == ajbcVar.a && this.b == ajbcVar.b && this.c == ajbcVar.c && this.d == ajbcVar.d && this.e == ajbcVar.e && this.f == ajbcVar.f;
    }

    public final int hashCode() {
        int a = ajbb.a(this.a);
        boolean z = this.f;
        boolean z2 = this.e;
        boolean z3 = this.d;
        return (((((((((a * 31) + ajbb.a(this.b)) * 31) + ajbb.a(this.c)) * 31) + ajbb.a(z3)) * 31) + ajbb.a(z2)) * 31) + ajbb.a(z);
    }

    public final String toString() {
        return "PenpalArguments(showGaiaPrompt=" + this.a + ", showPenpalUnderAgeDialog=" + this.b + ", showPenpalDasherDialog=" + this.c + ", showPenpalTos=" + this.d + ", isPenpalConversation=" + this.e + ", isInteractive=" + this.f + ")";
    }
}
