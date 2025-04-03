package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwdd {
    public final Recipient a;
    public final elfl b;

    public cwdd(Recipient recipient, elfl elflVar) {
        this.a = recipient;
        this.b = elflVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwdd)) {
            return false;
        }
        cwdd cwddVar = (cwdd) obj;
        return ffkj.e(this.a, cwddVar.a) && ffkj.e(this.b, cwddVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CachedRecipient(recipient=" + this.a + ", capabilities=" + this.b + ")";
    }
}
