package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdb implements abqq {
    private final Conversation a;

    public xdb(Conversation conversation) {
        this.a = conversation;
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
