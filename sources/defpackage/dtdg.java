package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtdg {
    private final ffbr a;
    private final ffbr b;

    public dtdg(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final ReactiveGridLayoutManager a(dtdj dtdjVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        return new ReactiveGridLayoutManager((dtcz) this.b.b(), context.getResources().getDimensionPixelSize(R.dimen.standard_view_padding), dtdjVar);
    }
}
