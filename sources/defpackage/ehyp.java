package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GetMessagesRequest;
import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyp extends eian {
    private int a;
    private TraceId b;
    private byte c;

    @Override // defpackage.eian
    public final GetMessagesRequest a() {
        if (this.c == 1 && this.b != null) {
            return new AutoValue_GetMessagesRequest(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" limit");
        }
        if (this.b == null) {
            sb.append(" traceId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eian
    public final void b(int i) {
        this.a = i;
        this.c = (byte) 1;
    }

    @Override // defpackage.eian
    public final void c(TraceId traceId) {
        if (traceId == null) {
            throw new NullPointerException("Null traceId");
        }
        this.b = traceId;
    }
}
