package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_MessagingResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehze extends eibw {
    private int a;
    private int b;
    private Duration c;
    private byte d;

    @Override // defpackage.eibw
    public final MessagingResult a() {
        if (this.d == 3 && this.c != null) {
            return new AutoValue_MessagingResult(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" errorCode");
        }
        if ((this.d & 2) == 0) {
            sb.append(" errorCause");
        }
        if (this.c == null) {
            sb.append(" retryAfter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eibw
    public final void b(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    @Override // defpackage.eibw
    public final void c(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }

    @Override // defpackage.eibw
    public final void d(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null retryAfter");
        }
        this.c = duration;
    }
}
