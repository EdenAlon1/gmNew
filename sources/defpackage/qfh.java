package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfh extends qey {
    public qfh(List list) {
        super(list);
    }

    @Override // defpackage.qer
    public final /* bridge */ /* synthetic */ Object f(qlx qlxVar, float f) {
        Object obj;
        qlz qlzVar = this.d;
        if (qlzVar == null) {
            return (f != 1.0f || (obj = qlxVar.c) == null) ? (qhn) qlxVar.b : (qhn) obj;
        }
        float f2 = qlxVar.g;
        Float f3 = qlxVar.h;
        float floatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        qhn qhnVar = (qhn) qlxVar.b;
        Object obj2 = qlxVar.c;
        return (qhn) qlzVar.b(f2, floatValue, qhnVar, obj2 == null ? qhnVar : (qhn) obj2, f, b(), this.c);
    }
}
