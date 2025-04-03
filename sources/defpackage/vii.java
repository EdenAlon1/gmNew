package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class vii extends ffkh implements ffix {
    public vii(Object obj) {
        super(0, obj, vij.class, "computeMaxHeight", "computeMaxHeight()I", 0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf((int) (Resources.getSystem().getDisplayMetrics().heightPixels * 0.75f));
    }
}
