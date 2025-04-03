package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzl extends eicl {
    public final Conversation a;
    public final eifn b;
    public final TraceId c;
    public final eyee d;

    public ehzl(Conversation conversation, eifn eifnVar, TraceId traceId, eyee eyeeVar) {
        this.a = conversation;
        this.b = eifnVar;
        this.c = traceId;
        this.d = eyeeVar;
    }

    @Override // defpackage.eicl
    public final eifn a() {
        return this.b;
    }

    @Override // defpackage.eicl, defpackage.eiaa
    public final Conversation b() {
        return this.a;
    }

    @Override // defpackage.eicl
    public final TraceId c() {
        return this.c;
    }

    @Override // defpackage.eicl
    public final eyee d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eicl) {
            eicl eiclVar = (eicl) obj;
            if (this.a.equals(eiclVar.b()) && this.b.equals(eiclVar.a()) && this.c.equals(eiclVar.c()) && this.d.equals(eiclVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eyee eyeeVar = this.d;
        TraceId traceId = this.c;
        eifn eifnVar = this.b;
        return "SendFileOverMsrpRequest{conversation=" + this.a.toString() + ", message=" + eifnVar.toString() + ", traceId=" + traceId.toString() + ", opaqueData=" + eyeeVar.toString() + "}";
    }
}
