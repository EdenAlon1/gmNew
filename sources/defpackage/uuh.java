package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uuh implements erqj {
    final /* synthetic */ MessageIdType a;
    final /* synthetic */ Uri b;
    final /* synthetic */ uuy c;

    public uuh(uuy uuyVar, MessageIdType messageIdType, Uri uri) {
        this.a = messageIdType;
        this.b = uri;
        this.c = uuyVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.C.a();
        MessageIdType messageIdType = this.a;
        if (messageIdType.c()) {
            csjy.c("Bugle", "Load success, no targetMessageId, scrollToPosition 0");
            this.c.v(0);
        } else {
            csjy.d("Bugle", "Load success, start scrollToLoadedMessageId %s", messageIdType);
            this.c.L(this.a, this.b);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.c.C.a();
        if (!(th instanceof CancellationException)) {
            throw new IllegalArgumentException("load failed.", th);
        }
    }
}
