package defpackage;

import android.view.ScrollFeedbackProvider;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kui implements kuk {
    private final ScrollFeedbackProvider a;

    public kui(View view) {
        ScrollFeedbackProvider createProvider;
        createProvider = ScrollFeedbackProvider.createProvider(view);
        this.a = createProvider;
    }

    @Override // defpackage.kuk
    public final void a(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.kuk
    public final void b(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
