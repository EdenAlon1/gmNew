package androidx.media3.effect;

import android.content.Context;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory;
import defpackage.lpo;
import defpackage.lpr;
import defpackage.lrp;
import defpackage.lse;
import defpackage.lsg;
import defpackage.lsj;
import defpackage.mcm;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreviewingSingleInputVideoGraph$Factory implements lrp {
    private final lsg a;

    public PreviewingSingleInputVideoGraph$Factory(lsg lsgVar) {
        this.a = lsgVar;
    }

    @Override // defpackage.lrp
    public final mcm a(Context context, lpo lpoVar, lpr lprVar, lsj lsjVar, Executor executor, lse lseVar, List list) {
        return new mcm(context, this.a, lpoVar, lprVar, lsjVar, executor);
    }

    public PreviewingSingleInputVideoGraph$Factory() {
        this(new DefaultVideoFrameProcessor$Factory.Builder().build());
    }
}
