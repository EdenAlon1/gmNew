package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mwv implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ mxd a;

    public mwv(mxd mxdVar) {
        this.a = mxdVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.g();
    }
}
