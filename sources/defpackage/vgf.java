package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.conversation.reactions.ui.selection.ReactionSelectionDialogRecyclerView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgf {
    public static final entd a = entd.c("BugleReactions");
    public final vfc b;
    public final ReactionSelectionDialogRecyclerView c;
    public final elbx d;
    public final cmqo e;
    public final cmsl f;
    public final Context g;
    public Optional h;
    public MessageIdType i;
    public String j;

    public vgf(ReactionSelectionDialogRecyclerView reactionSelectionDialogRecyclerView, vfc vfcVar, elbx elbxVar, cmqo cmqoVar, cmsl cmslVar) {
        this.c = reactionSelectionDialogRecyclerView;
        this.b = vfcVar;
        this.d = elbxVar;
        this.e = cmqoVar;
        this.f = cmslVar;
        this.g = reactionSelectionDialogRecyclerView.getContext();
    }
}
