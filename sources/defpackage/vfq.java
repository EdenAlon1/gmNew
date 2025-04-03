package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface vfq {
    vgb a(bcse bcseVar);

    elli b(vfi vfiVar, ejlq ejlqVar, ejlr ejlrVar, bcqs bcqsVar);

    elli c(cmtd cmtdVar, cmrl cmrlVar, eprt eprtVar, cmrm cmrmVar, boolean z, boolean z2, ConversationIdType conversationIdType, int i, SelfIdentityId selfIdentityId, Runnable runnable, ejlq ejlqVar, ejlr ejlrVar);

    void d(ea eaVar, View view, View view2, bcse bcseVar, SelfIdentityId selfIdentityId, boolean z, boolean z2, Runnable runnable);

    void e(Context context, RecyclerView recyclerView, List list);

    boolean f(bcse bcseVar, bcqs bcqsVar);
}
