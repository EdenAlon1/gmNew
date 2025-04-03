package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alqp extends alrl {
    public final MessageCoreData a;
    public final epdh b;

    public alqp(MessageCoreData messageCoreData, epdh epdhVar) {
        this.a = messageCoreData;
        this.b = epdhVar;
    }

    @Override // defpackage.alrl
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.alrl
    public final epdh b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alrl) {
            alrl alrlVar = (alrl) obj;
            if (this.a.equals(alrlVar.a()) && this.b.equals(alrlVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        epdh epdhVar = this.b;
        return "MessageNotDeliveredParameters{messageSnapshot=" + this.a.toString() + ", outgoingMessageFailureReason=" + epdhVar.toString() + "}";
    }
}
