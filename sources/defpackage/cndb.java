package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cndb {
    public final int a;
    public final MessageIdType b;
    public final String c;

    public cndb(int i, MessageIdType messageIdType, String str) {
        this.a = i;
        this.b = messageIdType;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cndb)) {
            return false;
        }
        cndb cndbVar = (cndb) obj;
        return this.a == cndbVar.a && ffkj.e(this.b, cndbVar.b) && ffkj.e(this.c, cndbVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a * 31) + this.b.hashCode();
        String str = this.c;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "QueriedMessage(queryIndex=" + this.a + ", id=" + this.b + ", text=" + this.c + ")";
    }
}
