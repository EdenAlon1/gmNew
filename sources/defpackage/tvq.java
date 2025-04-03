package defpackage;

import android.view.View;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvq implements fbba {
    public static BadgesRecyclerView a(View view) {
        if (!(view instanceof BadgesRecyclerView)) {
            throw new IllegalStateException(a.I(view, tvn.class, "Attempt to inject a View wrapper of type "));
        }
        BadgesRecyclerView badgesRecyclerView = (BadgesRecyclerView) view;
        badgesRecyclerView.getClass();
        return badgesRecyclerView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
