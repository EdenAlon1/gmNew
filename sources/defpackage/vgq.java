package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.reactions.ui.selection.ReactionSelectionRecyclerView;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgq extends wr {
    public final View s;
    public final View t;
    public final IllustrationViewStub u;
    public cwqp v;
    public final /* synthetic */ ReactionSelectionRecyclerView w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgq(ReactionSelectionRecyclerView reactionSelectionRecyclerView, View view) {
        super(view);
        this.w = reactionSelectionRecyclerView;
        this.s = view.findViewById(R.id.reaction_frame);
        this.t = view.findViewById(R.id.reaction_background);
        this.u = (IllustrationViewStub) view.findViewById(R.id.reaction_image);
    }
}
