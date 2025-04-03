package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzk extends eick {
    public Conversation a;
    public eifn b;
    public TraceId c;
    public eyee d;

    @Override // defpackage.eick
    public final void a(TraceId traceId) {
        if (traceId == null) {
            throw new NullPointerException("Null traceId");
        }
        this.c = traceId;
    }
}
