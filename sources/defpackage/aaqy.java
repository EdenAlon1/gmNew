package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqy {
    public final MessageId a;
    public final appy b;
    public final zvp c;

    public aaqy(MessageId messageId, appy appyVar, zvp zvpVar) {
        this.a = messageId;
        this.b = appyVar;
        this.c = zvpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaqy)) {
            return false;
        }
        aaqy aaqyVar = (aaqy) obj;
        return ffkj.e(this.a, aaqyVar.a) && ffkj.e(this.b, aaqyVar.b) && ffkj.e(this.c, aaqyVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TombstoneArgs(messageId=" + this.a + ", content=" + this.b + ", messageWithMetadata=" + this.c + ")";
    }
}
