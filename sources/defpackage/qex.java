package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qex extends qey {
    public qex(List list) {
        super(list);
    }

    @Override // defpackage.qer
    public final /* bridge */ /* synthetic */ Object f(qlx qlxVar, float f) {
        return Integer.valueOf(k(qlxVar, f));
    }

    public final int k(qlx qlxVar, float f) {
        float f2;
        if (qlxVar.b == null || qlxVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        qlz qlzVar = this.d;
        if (qlzVar != null) {
            f2 = f;
            Integer num = (Integer) qlzVar.b(qlxVar.g, qlxVar.h.floatValue(), (Integer) qlxVar.b, (Integer) qlxVar.c, f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        int i = qlxVar.k;
        if (i == 784923401) {
            i = ((Integer) qlxVar.b).intValue();
            qlxVar.k = i;
        }
        int i2 = qlxVar.l;
        if (i2 == 784923401) {
            i2 = ((Integer) qlxVar.c).intValue();
            qlxVar.l = i2;
        }
        PointF pointF = qlr.a;
        return (int) (i + ((i2 - i) * f2));
    }
}
