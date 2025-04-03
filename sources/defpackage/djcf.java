package defpackage;

import com.google.android.rcs.client.messaging.data.GroupNotification;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djcf implements erqj {
    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        GroupNotification groupNotification = (GroupNotification) obj;
        if (groupNotification == null) {
            dkty.k("Null group notification produced.", new Object[0]);
        } else {
            dkty.k("Group notification produced: %s", groupNotification);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dkty.i(th, "Error while receiving notification: %s", th.getMessage());
    }
}
