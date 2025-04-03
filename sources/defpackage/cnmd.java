package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnmd {
    public final cnma a;
    public final MessageIdType b;
    public final bdhg c;

    public cnmd(cnma cnmaVar) {
        this.a = cnmaVar;
        MessageIdType b = bdhb.b(cnmaVar.b);
        this.b = b;
        String str = cnmaVar.c;
        this.c = bdhg.a(true == ffkj.e(str, "") ? null : str);
        if (b.c()) {
            throw new IllegalArgumentException("Creating a ReplyMessageDataWrapper with empty repliedToMessageId");
        }
    }

    public static final cnmd a(MessageIdType messageIdType, bdhg bdhgVar) {
        messageIdType.getClass();
        bdhgVar.getClass();
        cnlz cnlzVar = (cnlz) cnma.a.createBuilder();
        cnlzVar.getClass();
        cnmb.b(messageIdType.b(), cnlzVar);
        String f = bdhgVar.f();
        cnlzVar.copyOnWrite();
        ((cnma) cnlzVar.instance).c = f;
        return new cnmd(cnmb.a(cnlzVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnmd) && ffkj.e(this.a, ((cnmd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReplyMessageDataWrapper(replyMessageData=" + this.a + ")";
    }
}
