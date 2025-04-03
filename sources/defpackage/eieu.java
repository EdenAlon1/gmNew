package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_RcsDestinationId;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eieu extends eihc {
    private String a;
    private int b;

    @Override // defpackage.eihc
    public final RcsDestinationId a() {
        String str;
        int i = this.b;
        if (i != 0 && (str = this.a) != null) {
            return new AutoValue_RcsDestinationId(i, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" type");
        }
        if (this.a == null) {
            sb.append(" id");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eihc
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    @Override // defpackage.eihc
    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.b = i;
    }
}
