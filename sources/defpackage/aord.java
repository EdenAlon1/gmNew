package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aord extends aoyf {
    private final ResolvedRecipient a;
    private final aqux b;

    public aord(ResolvedRecipient resolvedRecipient, aqux aquxVar) {
        this.a = resolvedRecipient;
        this.b = aquxVar;
    }

    @Override // defpackage.alxp
    public final ResolvedRecipient a() {
        return this.a;
    }

    @Override // defpackage.alxp
    public final aqux b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoyf) {
            aoyf aoyfVar = (aoyf) obj;
            if (this.a.equals(aoyfVar.a()) && this.b.equals(aoyfVar.b())) {
                aoyfVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        aqux aquxVar = this.b;
        return "DefaultIncomingMessageProvenance{sender=" + this.a.toString() + ", receivingSelfIdentity=" + aquxVar.toString() + ", messageDetails=null}";
    }

    @Override // defpackage.aoyf
    public final void c() {
    }
}
