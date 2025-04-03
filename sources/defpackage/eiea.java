package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_Conversation;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiea extends eiff {
    private RcsDestinationId a;
    private String b;
    private int c;

    @Override // defpackage.eiff
    public final Conversation a() {
        RcsDestinationId rcsDestinationId;
        String str;
        int i = this.c;
        if (i != 0 && (rcsDestinationId = this.a) != null && (str = this.b) != null) {
            return new AutoValue_Conversation(i, rcsDestinationId, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" type");
        }
        if (this.a == null) {
            sb.append(" destination");
        }
        if (this.b == null) {
            sb.append(" id");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eiff
    public final void b(RcsDestinationId rcsDestinationId) {
        if (rcsDestinationId == null) {
            throw new NullPointerException("Null destination");
        }
        this.a = rcsDestinationId;
    }

    @Override // defpackage.eiff
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.b = str;
    }

    @Override // defpackage.eiff
    public final void d(int i) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.c = i;
    }
}
