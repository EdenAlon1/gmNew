package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehme extends Property {
    public ehme(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = ehmf.f;
        return Float.valueOf(((ehmf) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ehmf ehmfVar = (ehmf) obj;
        float floatValue = ((Float) obj2).floatValue();
        ehmfVar.e = floatValue;
        ((ehlx) ehmfVar.k.get(0)).a = 0.0f;
        ehlx ehlxVar = (ehlx) ehmfVar.k.get(0);
        ehlx ehlxVar2 = (ehlx) ehmfVar.k.get(1);
        ljm ljmVar = ehmfVar.a;
        float f = ehmf.f((int) (floatValue * 333.0f), 0, 667);
        float interpolation = ljmVar.getInterpolation(f);
        ehlxVar2.a = interpolation;
        ehlxVar.b = interpolation;
        ehlx ehlxVar3 = (ehlx) ehmfVar.k.get(1);
        ehlx ehlxVar4 = (ehlx) ehmfVar.k.get(2);
        float interpolation2 = ehmfVar.a.getInterpolation(f + 0.49925038f);
        ehlxVar4.a = interpolation2;
        ehlxVar3.b = interpolation2;
        ((ehlx) ehmfVar.k.get(2)).b = 1.0f;
        if (ehmfVar.d && ((ehlx) ehmfVar.k.get(1)).b < 1.0f) {
            ((ehlx) ehmfVar.k.get(2)).c = ((ehlx) ehmfVar.k.get(1)).c;
            ((ehlx) ehmfVar.k.get(1)).c = ((ehlx) ehmfVar.k.get(0)).c;
            ((ehlx) ehmfVar.k.get(0)).c = ehmfVar.b.c[ehmfVar.c];
            ehmfVar.d = false;
        }
        ehmfVar.j.invalidateSelf();
    }
}
