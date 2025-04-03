package defpackage;

import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajtd implements bdna {
    private static final entd a = entd.c("BugleReplies");
    private final ajrp b;

    public ajtd(ajrp ajrpVar) {
        ajrpVar.getClass();
        this.b = ajrpVar;
    }

    @Override // defpackage.bdna
    public final void a(bcse bcseVar) {
        RepliedToDataAdapter repliedToDataAdapter;
        ajqt ajqtVar = bcseVar.f;
        if (ajqtVar != null) {
            try {
                repliedToDataAdapter = this.b.a(ajqtVar);
            } catch (IllegalStateException e) {
                ((ensz) ((ensz) a.i()).g(e)).q("Failed to extract replied-to data");
                repliedToDataAdapter = null;
            }
            if (repliedToDataAdapter != null) {
                bcseVar.x = repliedToDataAdapter;
            }
        }
    }
}
