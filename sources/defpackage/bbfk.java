package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbfk {
    private static final cskc a = cskc.g("BugleAction", "ProcessConversationUpdateActionLauncher");
    private final Context b;
    private final Optional c;
    private final bbfl d;

    public bbfk(Context context, Optional optional, bbfl bbflVar) {
        this.b = context;
        this.c = optional;
        this.d = bbflVar;
    }

    public final void a(fcek fcekVar, String str, Uri uri) {
        if (uri == null || fcekVar == null) {
            return;
        }
        List<String> pathSegments = uri.getPathSegments();
        ConversationIdType b = bdgq.b(uri.getLastPathSegment());
        if (pathSegments.size() == bcqc.j(this.b).getPathSegments().size() + 1 && str != null && !b.b() && this.c.isPresent()) {
            this.d.b(fcekVar, str, b, uri.getBooleanQueryParameter("sendPush", false)).s();
        } else if (b.b()) {
            a.n("Could not processConversationUpdate as conversationId was null");
        }
    }
}
