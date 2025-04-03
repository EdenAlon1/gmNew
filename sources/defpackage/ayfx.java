package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayfx extends aygc {
    public final ConversationIdType a;
    public final long b;
    public final eoko c;
    public final SuperSortLabel d;
    public final boolean e;

    public ayfx(ConversationIdType conversationIdType, long j, eoko eokoVar, SuperSortLabel superSortLabel, boolean z) {
        this.a = conversationIdType;
        this.b = j;
        this.c = eokoVar;
        this.d = superSortLabel;
        this.e = z;
    }

    @Override // defpackage.aygc
    public final long a() {
        return this.b;
    }

    @Override // defpackage.aygc
    public final SuperSortLabel b() {
        return this.d;
    }

    @Override // defpackage.aygc
    public final ConversationIdType c() {
        return this.a;
    }

    @Override // defpackage.aygc
    public final eoko d() {
        return this.c;
    }

    @Override // defpackage.aygc
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aygc) {
            aygc aygcVar = (aygc) obj;
            if (this.a.equals(aygcVar.c()) && this.b == aygcVar.a() && this.c.equals(aygcVar.d()) && this.d.equals(aygcVar.b()) && this.e == aygcVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        SuperSortLabel superSortLabel = this.d;
        eoko eokoVar = this.c;
        return "ConversationDeleterParameters{conversationId=" + this.a.toString() + ", deleteTimestamp=" + this.b + ", origin=" + eokoVar.toString() + ", filter=" + superSortLabel.toString() + ", onlyIfEmpty=" + this.e + "}";
    }
}
