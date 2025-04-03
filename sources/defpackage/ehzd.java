package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzd extends eibu {
    private MessagingResult a;
    private String b;
    private Conversation c;
    private boolean d;
    private byte e;

    @Override // defpackage.eibu
    public final MessagingOperationResult a() {
        MessagingResult messagingResult;
        String str;
        Conversation conversation;
        if (this.e == 1 && (messagingResult = this.a) != null && (str = this.b) != null && (conversation = this.c) != null) {
            return new AutoValue_MessagingOperationResult(messagingResult, str, conversation, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" result");
        }
        if (this.b == null) {
            sb.append(" messageId");
        }
        if (this.c == null) {
            sb.append(" conversation");
        }
        if (this.e == 0) {
            sb.append(" isRevocationSupported");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eibu
    public final void b(Conversation conversation) {
        if (conversation == null) {
            throw new NullPointerException("Null conversation");
        }
        this.c = conversation;
    }

    @Override // defpackage.eibu
    public final void c(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }

    @Override // defpackage.eibu
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.b = str;
    }

    @Override // defpackage.eibu
    public final void e(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
