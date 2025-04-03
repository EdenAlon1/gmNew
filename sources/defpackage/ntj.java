package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ntj implements ntm {
    private final lsg a;

    public ntj(lsg lsgVar) {
        this.a = lsgVar;
    }

    @Override // defpackage.ntm
    public final /* bridge */ /* synthetic */ ntn a(Context context, lpo lpoVar, lpr lprVar, lsj lsjVar, Executor executor, lse lseVar, List list) {
        return new ntk(context, this.a, lpoVar, lsjVar, lprVar, executor, lseVar, list);
    }
}
