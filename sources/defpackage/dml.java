package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dml extends ffkk implements ffji {
    public static final dml a = new dml();

    public dml() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        if (((Context) hgc.b((hqb) obj, AndroidCompositionLocals_androidKt.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
            return dmn.b;
        }
        int i = dmk.a;
        return dmj.b;
    }
}
