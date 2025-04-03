package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqcl implements aqcm {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public /* synthetic */ aqcl(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2) {
        this.a = 1 == (i2 & 1) ? null : str;
        this.h = i;
        this.b = ((i2 & 4) == 0) & z;
        this.c = ((i2 & 8) == 0) & z2;
        this.d = ((i2 & 16) == 0) & z3;
        this.e = ((i2 & 32) == 0) & z4;
        this.f = ((i2 & 64) == 0) & z5;
        this.g = ((i2 & 128) == 0) & z6;
    }

    @Override // defpackage.aqcm
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aqcm
    public final int b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqcl)) {
            return false;
        }
        aqcl aqclVar = (aqcl) obj;
        return ffkj.e(this.a, aqclVar.a) && this.h == aqclVar.h && this.b == aqclVar.b && this.c == aqclVar.c && this.d == aqclVar.d && this.e == aqclVar.e && this.f == aqclVar.f && this.g == aqclVar.g;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.h) * 31) + aqck.a(this.b)) * 31) + aqck.a(this.c)) * 31) + aqck.a(this.d)) * 31) + aqck.a(this.e)) * 31) + aqck.a(this.f)) * 31) + aqck.a(this.g);
    }

    public final String toString() {
        return "BugleOutgoingDisplayableStatus(text=" + this.a + ", type=" + ((Object) aqcn.a(this.h)) + ", canResend=" + this.b + ", canFallback=" + this.c + ", canDelete=" + this.d + ", sentAsFallback=" + this.e + ", canResendImmediately=" + this.f + ", canShowPremiumOptions=" + this.g + ")";
    }
}
