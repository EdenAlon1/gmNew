package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqr {
    public static final String a(Object obj) {
        Objects.toString(obj);
        return obj.toString().concat(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
    }

    public static final hho b(Object[] objArr, hrh hrhVar, ffix ffixVar, hfd hfdVar) {
        return (hho) c(Arrays.copyOf(objArr, 0), new hrk(new hqo(hrhVar), new hqp(hrhVar)), ffixVar, hfdVar, 0, 0);
    }

    public static final Object c(Object[] objArr, hrh hrhVar, ffix ffixVar, hfd hfdVar, int i, int i2) {
        Object[] objArr2;
        Object obj;
        Object a;
        if ((i2 & 2) != 0) {
            hrhVar = hrl.a;
        }
        hrh hrhVar2 = hrhVar;
        String num = Integer.toString(hey.a(hfdVar), 36);
        num.getClass();
        hrhVar2.getClass();
        hrc hrcVar = (hrc) hfdVar.e(hrg.a);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            Object a2 = (hrcVar == null || (a = hrcVar.a(num)) == null) ? null : hrhVar2.a(a);
            if (a2 == null) {
                a2 = ffixVar.invoke();
            }
            objArr2 = objArr;
            Object hqtVar = new hqt(hrhVar2, hrcVar, num, a2, objArr2);
            hfdVar.y(hqtVar);
            f = hqtVar;
        } else {
            objArr2 = objArr;
        }
        hqt hqtVar2 = (hqt) f;
        Object obj2 = Arrays.equals(objArr2, hqtVar2.e) ? hqtVar2.d : null;
        if (obj2 == null) {
            obj2 = ffixVar.invoke();
        }
        boolean F = hfdVar.F(hqtVar2);
        boolean z = true;
        if ((((i & 112) ^ 48) <= 32 || !hfdVar.F(hrhVar2)) && (i & 48) != 32) {
            z = false;
        }
        boolean F2 = F | z | hfdVar.F(hrcVar) | hfdVar.D(num) | hfdVar.F(obj2) | hfdVar.F(objArr2);
        Object f2 = hfdVar.f();
        if (F2 || f2 == hfc.a) {
            Object obj3 = obj2;
            Object[] objArr3 = objArr2;
            obj = obj3;
            Object hqqVar = new hqq(hqtVar2, hrhVar2, hrcVar, num, obj, objArr3);
            hfdVar.y(hqqVar);
            f2 = hqqVar;
        } else {
            obj = obj2;
        }
        hgs.i((ffix) f2, hfdVar);
        return obj;
    }
}
