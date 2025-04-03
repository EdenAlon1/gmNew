package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqgj extends aqgm {
    private final MessageIdType a;
    private final int b;

    public aqgj(MessageIdType messageIdType, int i) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        this.b = i;
    }

    @Override // defpackage.aqgm
    public final MessageIdType a() {
        return this.a;
    }

    @Override // defpackage.aqgm
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqgm) {
            aqgm aqgmVar = (aqgm) obj;
            if (this.a.equals(aqgmVar.a()) && this.b == aqgmVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.b;
        return "InitiationResult{messageId=" + this.a.toString() + ", fallbackResult=" + Integer.toString(i - 1) + "}";
    }
}
