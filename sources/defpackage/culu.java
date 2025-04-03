package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final aoku i;

    public culu(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, aoku aokuVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = i;
        this.h = i2;
        this.i = aokuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof culu)) {
            return false;
        }
        culu culuVar = (culu) obj;
        return this.a == culuVar.a && this.b == culuVar.b && this.c == culuVar.c && this.d == culuVar.d && this.e == culuVar.e && this.f == culuVar.f && this.g == culuVar.g && this.h == culuVar.h && ffkj.e(this.i, culuVar.i);
    }

    public final int hashCode() {
        return (((((((((((((((cult.a(this.a) * 31) + cult.a(this.b)) * 31) + cult.a(this.c)) * 31) + cult.a(this.d)) * 31) + cult.a(this.e)) * 31) + cult.a(this.f)) * 31) + this.g) * 31) + this.h) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "SpamPrechecksResult(isSpamProtectionOn=" + this.a + ", isSenderInContacts=" + this.b + ", wasSenderMarkedAsNotSpamByUser=" + this.c + ", isConversationStartedByUser=" + this.d + ", isEarliestMessageOrTombstone=" + this.e + ", isSenderRbmBot=" + this.f + ", userMessagesCount=" + this.g + ", conversationAgeInDays=" + this.h + ", senderMessagingIdentity=" + this.i + ")";
    }
}
