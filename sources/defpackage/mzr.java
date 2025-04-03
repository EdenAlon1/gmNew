package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzr implements lrp {
    private final lsg a;

    public mzr(lsg lsgVar) {
        this.a = lsgVar;
    }

    @Override // defpackage.lrp
    public final mcm a(Context context, lpo lpoVar, lpr lprVar, lsj lsjVar, Executor executor, lse lseVar, List list) {
        try {
            return ((lrp) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(lsg.class).newInstance(this.a)).a(context, lpoVar, lprVar, lsjVar, executor, lseVar, list);
        } catch (Exception e) {
            throw lsf.a(e);
        }
    }
}
