package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GetGroupNotificationsRequest;
import com.google.android.rcs.client.messaging.GetGroupNotificationsRequest;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyn extends eiaj {
    private int a;
    private byte b;

    @Override // defpackage.eiaj
    public final GetGroupNotificationsRequest a() {
        if (this.b == 1) {
            return new AutoValue_GetGroupNotificationsRequest(this.a);
        }
        throw new IllegalStateException("Missing required properties: limit");
    }

    @Override // defpackage.eiaj
    public final void b(int i) {
        this.a = i;
        this.b = (byte) 1;
    }
}
