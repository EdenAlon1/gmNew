package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqwf extends cqwh {
    private final MessageCoreData a;

    public cqwf(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.cqwh, defpackage.cqzw
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.cqzw
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cqzw) {
            cqzw cqzwVar = (cqzw) obj;
            if (cqzwVar.b() == 1 && this.a.equals(cqzwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageCoreDataOrWorkQueueResult{messageCoreData=" + this.a.toString() + "}";
    }
}
