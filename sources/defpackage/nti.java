package defpackage;

import android.content.Context;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nti extends mcj implements ntn {
    public nti(Context context, lsg lsgVar, lpo lpoVar, lpr lprVar, lsj lsjVar, Executor executor, lse lseVar, List list) {
        super(context, lsgVar, lpoVar, lprVar, lsjVar, executor, list);
    }

    @Override // defpackage.ntn
    public final nrl c(int i) {
        lti.c(!lvf.T(this.g, i));
        mdl mdlVar = this.l;
        lti.f(mdlVar);
        mdlVar.c(i);
        DefaultVideoFrameProcessor$Factory.Builder builder = new DefaultVideoFrameProcessor$Factory.Builder(this.h);
        builder.c = new mbx(this, i);
        lti.a(true);
        builder.d = 2;
        this.g.put(i, builder.build().a(this.a, lpr.a, this.b, true, this.e, new mcf(this, i)));
        lti.c(lvf.T(this.g, i));
        lsi lsiVar = (lsi) this.g.get(i);
        int i2 = engw.d;
        return new ntq(lsiVar, enou.a);
    }
}
