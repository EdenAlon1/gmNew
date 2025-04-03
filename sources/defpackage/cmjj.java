package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjj {
    public final cmji a;
    public final bdhg b;
    private final MessageIdType c;

    public cmjj(cmji cmjiVar) {
        this.a = cmjiVar;
        MessageIdType b = bdhb.b(cmjiVar.b);
        this.c = b;
        String str = cmjiVar.c;
        bdhg a = bdhg.a(true == ffkj.e(str, "") ? null : str);
        this.b = a;
        if (b.c()) {
            throw new IllegalArgumentException("Creating a DeleteMessageDataWrapper with empty deletedMessageId");
        }
        if (!a.k()) {
            throw new IllegalArgumentException("Creating a DeleteMessageDataWrapper with empty deletedRcsMessageId");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmjj) && ffkj.e(this.a, ((cmjj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeleteMessageDataWrapper(deleteMessageData=" + this.a + ")";
    }
}
