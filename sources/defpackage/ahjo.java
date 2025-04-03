package defpackage;

import android.view.View;
import com.google.android.apps.messaging.label.ui.StillSortingNoticeView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahjo implements fbba {
    public static StillSortingNoticeView a(View view) {
        if (!(view instanceof StillSortingNoticeView)) {
            throw new IllegalStateException(a.I(view, ahjl.class, "Attempt to inject a View wrapper of type "));
        }
        StillSortingNoticeView stillSortingNoticeView = (StillSortingNoticeView) view;
        stillSortingNoticeView.getClass();
        return stillSortingNoticeView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
