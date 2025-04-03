package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuji extends ContentObserver {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ SelfIdentityId b;
    final /* synthetic */ String c;
    final /* synthetic */ cujj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuji(cujj cujjVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        super(null);
        this.a = conversationIdType;
        this.b = selfIdentityId;
        this.c = str;
        this.d = cujjVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        synchronized (this.d.i) {
            if (this.d.f.f().toEpochMilli() - this.d.k >= TimeUnit.SECONDS.toMillis(((Integer) cujj.a.e()).intValue())) {
                this.d.a(this);
                return;
            }
            if (uri != null && uri.getPathSegments().size() == bcqc.h(this.d.d).getPathSegments().size() + 2) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null) {
                    return;
                }
                MessageCoreData v = ((bdmq) this.d.c.b()).v(bdhb.b(lastPathSegment));
                if (v != null && v.cK()) {
                    cujj cujjVar = this.d;
                    String ar = v.ar();
                    if (ar != null && cujjVar.l.matcher(ar).find()) {
                        this.d.e.e(this.d.h.i(this.a, this.b, this.c), false, byyt.SPAM_FOLDER).t();
                        if (!((Boolean) cujj.b.e()).booleanValue()) {
                            this.d.g.c("Bugle.Spam.AutoReply.Counts");
                        }
                        this.d.a(this);
                        return;
                    }
                    this.d.a(this);
                }
            }
        }
    }
}
