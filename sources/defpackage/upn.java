package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class upn extends ejte {
    final /* synthetic */ upp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upn(upp uppVar, elbx elbxVar) {
        super(elbxVar, "BaseMessageListManager.MessageContentObserver#onChange", erpp.a);
        this.a = uppVar;
    }

    @Override // defpackage.ejte
    public final void a(boolean z, Uri uri) {
        if (uri == null) {
            upp.a.r("BaseMessageListManager.MessageContentObserver uri=null, can't determine messageId");
            return;
        }
        List<String> pathSegments = uri.getPathSegments();
        String lastPathSegment = uri.getLastPathSegment();
        if (pathSegments.size() != bcqc.h(this.a.b).getPathSegments().size() + 2 || lastPathSegment == null) {
            return;
        }
        upp uppVar = this.a;
        uppVar.e.add(bdhb.b(lastPathSegment));
        this.a.d();
    }
}
