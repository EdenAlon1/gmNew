package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrn implements zqz {
    public final ffbz a;
    private final MessageId b;

    public zrn(MessageId messageId, ffix ffixVar) {
        this.b = messageId;
        this.a = ffca.b(2, ffixVar);
    }

    @Override // defpackage.zqz
    public final MessageId a() {
        return this.b;
    }

    @Override // defpackage.zqz
    public final axrc b() {
        return (axrc) this.a.a();
    }
}
