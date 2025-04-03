package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvoa {
    public final ffix a;
    public final MessageId b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public cvoa(ffix ffixVar, MessageId messageId, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = ffixVar;
        this.b = messageId;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvoa)) {
            return false;
        }
        cvoa cvoaVar = (cvoa) obj;
        return ffkj.e(this.a, cvoaVar.a) && ffkj.e(this.b, cvoaVar.b) && ffkj.e(this.c, cvoaVar.c) && this.d == cvoaVar.d && this.e == cvoaVar.e && this.f == cvoaVar.f && this.g == cvoaVar.g && this.h == cvoaVar.h && this.i == cvoaVar.i;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        boolean z = this.i;
        boolean z2 = this.h;
        boolean z3 = this.g;
        boolean z4 = this.f;
        return (((((((((((hashCode * 31) + cvnz.a(this.d)) * 31) + cvnz.a(this.e)) * 31) + cvnz.a(z4)) * 31) + cvnz.a(z3)) * 31) + cvnz.a(z2)) * 31) + cvnz.a(z);
    }

    public final String toString() {
        return "SafeUrlLinkUiAdapterArgs(defaultOnClickBehavior=" + this.a + ", messageId=" + this.b + ", url=" + this.c + ", isIncoming=" + this.d + ", isContact=" + this.e + ", isRbm=" + this.f + ", isDetectedSpam=" + this.g + ", isUserMarkedNotSpam=" + this.h + ", isSpamFolder=" + this.i + ")";
    }
}
