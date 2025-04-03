package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcuw extends dcva {
    public Uri a;
    public String b;
    public String c;
    public ConversationIdType d;
    public ConversationId e;
    public MessageIdType f;
    public MessageId g;
    private Uri h;
    private String i;

    public dcuw() {
    }

    @Override // defpackage.dcva
    public final MediaViewerItem a() {
        String str;
        Uri uri = this.h;
        if (uri != null && (str = this.i) != null) {
            return new dcuz(uri, this.a, str, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == null) {
            sb.append(" uri");
        }
        if (this.i == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dcva
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.i = str;
    }

    @Override // defpackage.dcva
    public final void c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.h = uri;
    }

    public dcuw(MediaViewerItem mediaViewerItem) {
        this.h = mediaViewerItem.b();
        this.a = mediaViewerItem.a();
        this.i = mediaViewerItem.h();
        this.b = mediaViewerItem.j();
        this.c = mediaViewerItem.i();
        this.d = mediaViewerItem.e();
        this.e = mediaViewerItem.d();
        this.f = mediaViewerItem.f();
        this.g = mediaViewerItem.c();
    }
}
