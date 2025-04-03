package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class abhn extends ffkh implements ffix {
    public abhn(Object obj) {
        super(0, obj, abho.class, "computeMaxHeight", "computeMaxHeight()I", 0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf((int) (Resources.getSystem().getDisplayMetrics().heightPixels * 0.75f));
    }
}
