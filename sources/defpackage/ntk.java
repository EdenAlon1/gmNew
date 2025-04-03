package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ntk extends mdc implements ntn {
    private final List e;
    private ntq f;

    public ntk(Context context, lsg lsgVar, lpo lpoVar, lsj lsjVar, lpr lprVar, Executor executor, lse lseVar, List list) {
        super(context, lsgVar, lpoVar, lsjVar, lprVar, executor, lseVar, true);
        this.e = list;
    }

    @Override // defpackage.ntn
    public final nrl c(int i) {
        lti.c(this.f == null);
        j(i);
        ntq ntqVar = new ntq(b(i), this.e);
        this.f = ntqVar;
        return ntqVar;
    }
}
