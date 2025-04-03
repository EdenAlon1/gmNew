package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmlk {
    public final cmlj a;
    public final MessageIdType b;
    public final bdhg c;
    public final Instant d;

    public cmlk(cmlj cmljVar) {
        this.a = cmljVar;
        MessageIdType b = bdhb.b(cmljVar.b);
        this.b = b;
        String str = cmljVar.c;
        bdhg a = bdhg.a(true == ffkj.e(str, "") ? null : str);
        this.c = a;
        Instant ofEpochMilli = Instant.ofEpochMilli(cmljVar.d);
        ofEpochMilli.getClass();
        this.d = ofEpochMilli;
        if (b.c()) {
            throw new IllegalArgumentException("Creating an EditMessageDataWrapper with empty editedMessageId");
        }
        if (!a.k()) {
            throw new IllegalArgumentException("Creating an EditMessageDataWrapper with empty editedRcsMessageId");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmlk) && ffkj.e(this.a, ((cmlk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EditMessageDataWrapper(editMessageData=" + this.a + ")";
    }
}
