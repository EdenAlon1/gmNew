package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class icu {
    public static /* synthetic */ void a(icv icvVar, iam iamVar) {
        ibc ibcVar = (ibc) icvVar;
        if (ibcVar.b == null) {
            ibcVar.b = new RectF();
        }
        RectF rectF = ibcVar.b;
        rectF.getClass();
        rectF.set(iamVar.b, iamVar.c, iamVar.d, iamVar.e);
        Path path = ibcVar.a;
        RectF rectF2 = ibcVar.b;
        rectF2.getClass();
        path.addOval(rectF2, Path.Direction.CCW);
    }
}
