package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qev extends qey {
    public qev(List list) {
        super(list);
    }

    @Override // defpackage.qer
    public final /* bridge */ /* synthetic */ Object f(qlx qlxVar, float f) {
        return Float.valueOf(l(qlxVar, f));
    }

    public final float k() {
        return l(d(), b());
    }

    final float l(qlx qlxVar, float f) {
        float f2;
        if (qlxVar.b == null || qlxVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        qlz qlzVar = this.d;
        if (qlzVar != null) {
            f2 = f;
            Float f3 = (Float) qlzVar.b(qlxVar.g, qlxVar.h.floatValue(), (Float) qlxVar.b, (Float) qlxVar.c, f2, c(), this.c);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        float f4 = qlxVar.i;
        if (f4 == -3987645.8f) {
            f4 = ((Float) qlxVar.b).floatValue();
            qlxVar.i = f4;
        }
        float f5 = qlxVar.j;
        if (f5 == -3987645.8f) {
            f5 = ((Float) qlxVar.c).floatValue();
            qlxVar.j = f5;
        }
        PointF pointF = qlr.a;
        return f4 + (f2 * (f5 - f4));
    }
}
