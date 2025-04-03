package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xlg {
    public final xlt a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public xlg(xlt xltVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = xltVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlg)) {
            return false;
        }
        xlg xlgVar = (xlg) obj;
        return ffkj.e(this.a, xlgVar.a) && this.b == xlgVar.b && this.c == xlgVar.c && this.d == xlgVar.d && this.e == xlgVar.e && this.f == xlgVar.f && this.g == xlgVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.g;
        boolean z2 = this.f;
        boolean z3 = this.e;
        boolean z4 = this.d;
        return ((((((((((hashCode + xlf.a(this.b)) * 31) + xlf.a(this.c)) * 31) + xlf.a(z4)) * 31) + xlf.a(z3)) * 31) + xlf.a(z2)) * 31) + xlf.a(z);
    }

    public final String toString() {
        return "SendIconData(sendIcon=" + this.a + ", isScheduledMessage=" + this.b + ", isEditMessage=" + this.c + ", processingAttachment=" + this.d + ", editMessageTextChanged=" + this.e + ", hasSendableContent=" + this.f + ", disableSendDueToTextLength=" + this.g + ")";
    }
}
