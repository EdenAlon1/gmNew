package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qes extends qey {
    public qes(List list) {
        super(list);
    }

    @Override // defpackage.qer
    public final /* bridge */ /* synthetic */ Object f(qlx qlxVar, float f) {
        return Integer.valueOf(l(qlxVar, f));
    }

    public final int k() {
        return l(d(), b());
    }

    public final int l(qlx qlxVar, float f) {
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
        return qln.a(qlr.a(f2, 0.0f, 1.0f), ((Integer) qlxVar.b).intValue(), ((Integer) qlxVar.c).intValue());
    }
}
