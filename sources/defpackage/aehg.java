package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aehg extends aeho {
    private final ConversationIdType a;
    private final long b;
    private final boolean c;
    private final Optional d;

    public aehg(ConversationIdType conversationIdType, long j, boolean z, Optional optional) {
        this.a = conversationIdType;
        this.b = j;
        this.c = z;
        if (optional == null) {
            throw new NullPointerException("Null nudgeAdjustedTimestamp");
        }
        this.d = optional;
    }

    @Override // defpackage.aeho
    public final long a() {
        return this.b;
    }

    @Override // defpackage.aeho
    public final ConversationIdType b() {
        return this.a;
    }

    @Override // defpackage.aeho
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.aeho
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeho) {
            aeho aehoVar = (aeho) obj;
            if (this.a.equals(aehoVar.b()) && this.b == aehoVar.a() && this.c == aehoVar.d() && this.d.equals(aehoVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = true != this.c ? 1237 : 1231;
        long j = this.b;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        return "ConversationKey{conversationId=" + this.a.toString() + ", sortTimestamp=" + this.b + ", pinStatus=" + this.c + ", nudgeAdjustedTimestamp=" + optional.toString() + "}";
    }
}
