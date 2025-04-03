package defpackage;

import android.util.Property;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehmi extends Property {
    public ehmi(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = ehmj.a;
        return Float.valueOf(((ehmj) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ehmj ehmjVar = (ehmj) obj;
        float floatValue = ((Float) obj2).floatValue();
        ehmjVar.g = floatValue;
        float f = floatValue * 1800.0f;
        for (int i = 0; i < ehmjVar.k.size(); i++) {
            int i2 = (int) f;
            ehlx ehlxVar = (ehlx) ehmjVar.k.get(i);
            int i3 = i + i;
            ehlxVar.a = kqp.a(ehmjVar.c[i3].getInterpolation(ehmj.f(i2, ehmj.b[i3], ehmj.a[i3])), 0.0f, 1.0f);
            int i4 = i3 + 1;
            ehlxVar.b = kqp.a(ehmjVar.c[i4].getInterpolation(ehmj.f(i2, ehmj.b[i4], ehmj.a[i4])), 0.0f, 1.0f);
        }
        if (ehmjVar.f) {
            Iterator it = ehmjVar.k.iterator();
            while (it.hasNext()) {
                ((ehlx) it.next()).c = ehmjVar.d.c[ehmjVar.e];
            }
            ehmjVar.f = false;
        }
        ehmjVar.j.invalidateSelf();
    }
}
