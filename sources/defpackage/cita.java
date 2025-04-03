package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cita extends ciwp {
    private final Optional a;
    private final CharSequence b;
    private final long c;
    private final Optional d;
    private final Optional e;

    public cita(Optional optional, CharSequence charSequence, long j, Optional optional2, Optional optional3) {
        this.a = optional;
        this.b = charSequence;
        this.c = j;
        this.d = optional2;
        this.e = optional3;
    }

    @Override // defpackage.ciwp
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ciwp
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.ciwp
    public final Optional c() {
        return this.e;
    }

    @Override // defpackage.ciwp
    public final Optional d() {
        return this.a;
    }

    @Override // defpackage.ciwp
    public final CharSequence e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciwp) {
            ciwp ciwpVar = (ciwp) obj;
            if (this.a.equals(ciwpVar.d()) && this.b.equals(ciwpVar.e()) && this.c == ciwpVar.a() && this.d.equals(ciwpVar.b()) && this.e.equals(ciwpVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        CharSequence charSequence = this.b;
        return "NotificationMessage{personInfo=" + String.valueOf(this.a) + ", messageText=" + charSequence.toString() + ", messageTimestamp=" + this.c + ", attachmentType=" + String.valueOf(optional2) + ", attachmentUri=" + String.valueOf(optional) + "}";
    }
}
