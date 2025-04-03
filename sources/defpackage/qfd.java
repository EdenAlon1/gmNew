package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfd extends qey {
    private final qma e;

    public qfd(List list) {
        super(list);
        this.e = new qma();
    }

    @Override // defpackage.qer
    public final /* bridge */ /* synthetic */ Object f(qlx qlxVar, float f) {
        Object obj;
        float f2;
        Object obj2 = qlxVar.b;
        if (obj2 == null || (obj = qlxVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        qma qmaVar = (qma) obj2;
        qma qmaVar2 = (qma) obj;
        qlz qlzVar = this.d;
        if (qlzVar != null) {
            f2 = f;
            qma qmaVar3 = (qma) qlzVar.b(qlxVar.g, qlxVar.h.floatValue(), qmaVar, qmaVar2, f2, c(), this.c);
            if (qmaVar3 != null) {
                return qmaVar3;
            }
        } else {
            f2 = f;
        }
        qma qmaVar4 = this.e;
        float f3 = qmaVar.a;
        float f4 = qmaVar2.a;
        PointF pointF = qlr.a;
        float f5 = f3 + ((f4 - f3) * f2);
        float f6 = qmaVar.b;
        float f7 = f6 + ((qmaVar2.b - f6) * f2);
        qmaVar4.a = f5;
        qmaVar4.b = f7;
        return this.e;
    }
}
