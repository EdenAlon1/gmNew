package defpackage;

import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abwa extends abwh {
    public final String a;
    public final String b;
    public final Spanned c;
    private final long d;
    private final boolean e;

    public abwa(String str, String str2, Spanned spanned, long j, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = spanned;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.abwh
    public final long a() {
        return this.d;
    }

    @Override // defpackage.abwh
    public final Spanned b() {
        return this.c;
    }

    @Override // defpackage.abwh
    public final String c() {
        return this.b;
    }

    @Override // defpackage.abwh
    public final String d() {
        return this.a;
    }

    @Override // defpackage.abwh
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abwh) {
            abwh abwhVar = (abwh) obj;
            if (this.a.equals(abwhVar.d()) && this.b.equals(abwhVar.c()) && this.c.equals(abwhVar.b()) && this.d == abwhVar.a() && this.e == abwhVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        int i = true != this.e ? 1237 : 1231;
        long j = this.d;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i;
    }

    public final String toString() {
        return "Message{normalizedDestination=" + this.a + ", displayDestination=" + this.b + ", textContent=" + this.c.toString() + ", timestamp=" + this.d + ", isIncoming=" + this.e + "}";
    }
}
