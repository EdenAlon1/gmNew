package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afcr extends agzh {
    public final long a;
    public final ConversationIdType b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final ctsx f;

    public afcr(long j, ConversationIdType conversationIdType, boolean z, boolean z2, int i, ctsx ctsxVar) {
        this.a = j;
        this.b = conversationIdType;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = ctsxVar;
    }

    @Override // defpackage.agzh
    public final int a() {
        return this.e;
    }

    @Override // defpackage.agzh
    public final long b() {
        return this.a;
    }

    @Override // defpackage.agzh
    public final ConversationIdType c() {
        return this.b;
    }

    @Override // defpackage.agzh
    public final ctsx d() {
        return this.f;
    }

    @Override // defpackage.agzh
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agzh) {
            agzh agzhVar = (agzh) obj;
            if (this.a == agzhVar.b() && this.b.equals(agzhVar.c()) && this.c == agzhVar.e() && this.d == agzhVar.f() && this.e == agzhVar.a() && this.f.equals(agzhVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.agzh
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        ctsx ctsxVar = this.f;
        return "QueryParams{sortTimestamp=" + this.a + ", conversationId=" + this.b.toString() + ", conversationIsPinned=" + this.c + ", isWear=" + this.d + ", limit=" + this.e + ", nudgeSettingsData=" + ctsxVar.toString() + "}";
    }
}
