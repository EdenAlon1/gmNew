package defpackage;

import android.content.Context;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajz implements bhl {
    final ala a;

    public ajz(Context context) {
        this.a = ala.d(context);
    }

    @Override // defpackage.bhl
    public final bdp a(bhj bhjVar, int i) {
        int i2;
        bfh a = bfh.a();
        bgc bgcVar = new bgc();
        bgcVar.t(anh.a(bhjVar, i));
        a.c(bhh.p, bgcVar.b());
        a.c(bhh.r, ajy.a);
        bdi bdiVar = new bdi();
        int ordinal = bhjVar.ordinal();
        if (ordinal != 0) {
            i2 = 3;
            if (ordinal != 3 || ara.a(PreviewUnderExposureQuirk.class) != null) {
                i2 = 1;
            }
        } else {
            i2 = i == 2 ? 5 : 2;
        }
        bdiVar.b = i2;
        a.c(bhh.q, bdiVar.b());
        a.c(bhh.s, bhjVar == bhj.IMAGE_CAPTURE ? alx.b : ahy.a);
        if (bhjVar == bhj.PREVIEW) {
            a.c(bet.K, this.a.b());
        }
        a.c(bet.F, Integer.valueOf(this.a.c(true).getRotation()));
        if (bhjVar == bhj.VIDEO_CAPTURE || bhjVar == bhj.STREAM_SHARING) {
            a.c(bhh.v, true);
        }
        return bfn.f(a);
    }
}
