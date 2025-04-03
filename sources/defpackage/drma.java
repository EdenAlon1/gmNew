package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drma {
    public static final /* synthetic */ int a = 0;
    private static final drme[] b = drme.values();

    public static final drlh a(drli drliVar, drkg drkgVar) {
        drkgVar.getClass();
        return e(drliVar, drkgVar, drme.b, null);
    }

    public static final drlh b(drlj drljVar, drkg drkgVar) {
        drkgVar.getClass();
        drme drmeVar = drme.b;
        drmeVar.getClass();
        if (drljVar instanceof drli) {
            return e((drli) drljVar, drkgVar, drmeVar, null);
        }
        if (drljVar instanceof drlh) {
            return (drlh) drljVar;
        }
        throw new ffcd();
    }

    public static final drlh c(drli drliVar, drkg drkgVar, Long l) {
        drliVar.getClass();
        return e(drliVar, drkgVar, drme.d, l);
    }

    public static final drlh d(drlj drljVar, drlk drlkVar, Long l) {
        drljVar.getClass();
        return f(drljVar, drlkVar, drme.d, l);
    }

    public static final drlh e(drli drliVar, drkg drkgVar, final drme drmeVar, Long l) {
        Object obj;
        drmeVar.getClass();
        Iterable c = drliVar.c();
        drlh drlhVar = (drlh) ffdx.L(c);
        if (drlhVar == null) {
            throw new IllegalStateException("Variation list can't be empty");
        }
        int ordinal = drmeVar.ordinal();
        do {
            final drme drmeVar2 = b[ordinal];
            ffji ffjiVar = drmeVar2 == drmeVar ? new ffji() { // from class: drly
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    drme drmeVar3 = (drme) obj2;
                    int i = drma.a;
                    drmeVar3.getClass();
                    return Boolean.valueOf(drmeVar3.compareTo(drme.this) >= 0);
                }
            } : new ffji() { // from class: drlz
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    drme drmeVar3 = (drme) obj2;
                    int i = drma.a;
                    drmeVar3.getClass();
                    return Boolean.valueOf(drmeVar3 == drme.this);
                }
            };
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : c) {
                drlh drlhVar2 = (drlh) obj2;
                if (l == null || drlhVar2.a() <= l.longValue()) {
                    if (((Boolean) ffjiVar.invoke(drlhVar2.n())).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (drkgVar.a(((drlh) obj3).l())) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long a2 = ((drlh) next).a();
                    do {
                        Object next2 = it.next();
                        long a3 = ((drlh) next2).a();
                        if (a2 > a3) {
                            a2 = a3;
                        }
                        if (a2 > a3) {
                            next = next2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            drlh drlhVar3 = (drlh) obj;
            if (drlhVar3 != null) {
                return drlhVar3;
            }
            ordinal--;
        } while (ordinal >= 0);
        return drlhVar;
    }

    public static final drlh f(drlj drljVar, drlk drlkVar, drme drmeVar, Long l) {
        drmeVar.getClass();
        if (drljVar instanceof drlh) {
            return (drlh) drljVar;
        }
        drlw m = drljVar.m();
        if (ffkj.e(m, drlu.a)) {
            return e((drli) drljVar, drlkVar.a, drmeVar, l);
        }
        if (ffkj.e(m, drlv.a)) {
            return e((drli) drljVar, drlkVar.b, drmeVar, l);
        }
        if (ffkj.e(m, drlr.a)) {
            throw new IllegalArgumentException("Audio media doesn't have variations");
        }
        if (!(m instanceof drlq)) {
            throw new ffcd();
        }
        drlw m2 = drljVar.m();
        Objects.toString(m2);
        throw new IllegalArgumentException("Unhandled Media Type ".concat(m2.toString()));
    }
}
