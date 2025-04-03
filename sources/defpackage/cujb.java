package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujb {
    public final String a;
    public final MessageIdType b;
    public final int c;

    public cujb(String str, MessageIdType messageIdType, int i) {
        this.a = str;
        this.b = messageIdType;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cujb)) {
            return false;
        }
        cujb cujbVar = (cujb) obj;
        return ffkj.e(this.a, cujbVar.a) && ffkj.e(this.b, cujbVar.b) && this.c == cujbVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "SpamReport(jsonSpamReport=" + this.a + ", messageId=" + this.b + ", protocol=" + this.c + ")";
    }
}
