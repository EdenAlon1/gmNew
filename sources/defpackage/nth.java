package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nth implements ntm {
    private final lsg a;

    public nth(lsg lsgVar) {
        this.a = lsgVar;
    }

    @Override // defpackage.ntm
    public final /* bridge */ /* synthetic */ ntn a(Context context, lpo lpoVar, lpr lprVar, lsj lsjVar, Executor executor, lse lseVar, List list) {
        return new nti(context, this.a, lpoVar, lprVar, lsjVar, executor, lseVar, list);
    }
}
