package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fggt {
    public static final /* synthetic */ int a = 0;
    private static final int b = c(Throwable.class, -1);
    private static final fggi c;

    static {
        fggi fggiVar;
        try {
            fggiVar = fggu.a ? fghz.a : fggc.a;
        } catch (Throwable unused) {
            fggiVar = fghz.a;
        }
        c = fggiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object a2;
        if (!(th instanceof ffrw)) {
            return (Throwable) c.a(th.getClass()).invoke(th);
        }
        try {
            a2 = ((ffrw) th).a();
        } catch (Throwable th2) {
            a2 = ffci.a(th2);
        }
        if (true == (a2 instanceof ffcg)) {
            a2 = null;
        }
        return (Throwable) a2;
    }

    public static final ffji b(Class cls) {
        Object obj;
        ffji ffjiVar;
        ffcf ffcfVar;
        fggs fggsVar = fggs.a;
        if (b == c(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            while (true) {
                obj = null;
                if (i >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    final ffji ffjiVar2 = new ffji() { // from class: fggr
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            int i2 = fggt.a;
                            Object newInstance = constructor.newInstance(new Object[0]);
                            newInstance.getClass();
                            Throwable th = (Throwable) newInstance;
                            th.initCause((Throwable) obj2);
                            return th;
                        }
                    };
                    ffcfVar = new ffcf(new ffji() { // from class: fggn
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            Object obj3;
                            Throwable th = (Throwable) obj2;
                            int i2 = fggt.a;
                            try {
                                Throwable th2 = (Throwable) ffji.this.invoke(th);
                                boolean e = ffkj.e(th.getMessage(), th2.getMessage());
                                obj3 = th2;
                                if (!e) {
                                    boolean e2 = ffkj.e(th2.getMessage(), th.toString());
                                    obj3 = th2;
                                    if (!e2) {
                                        obj3 = null;
                                    }
                                }
                            } catch (Throwable th3) {
                                obj3 = ffci.a(th3);
                            }
                            return (Throwable) (true != (obj3 instanceof ffcg) ? obj3 : null);
                        }
                    }, 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (ffkj.e(cls2, String.class)) {
                        final ffji ffjiVar3 = new ffji() { // from class: fggp
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                Throwable th = (Throwable) obj2;
                                int i2 = fggt.a;
                                Object newInstance = constructor.newInstance(th.getMessage());
                                newInstance.getClass();
                                Throwable th2 = (Throwable) newInstance;
                                th2.initCause(th);
                                return th2;
                            }
                        };
                        ffcfVar = new ffcf(new ffji() { // from class: fggn
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                Object obj3;
                                Throwable th = (Throwable) obj2;
                                int i2 = fggt.a;
                                try {
                                    Throwable th2 = (Throwable) ffji.this.invoke(th);
                                    boolean e = ffkj.e(th.getMessage(), th2.getMessage());
                                    obj3 = th2;
                                    if (!e) {
                                        boolean e2 = ffkj.e(th2.getMessage(), th.toString());
                                        obj3 = th2;
                                        if (!e2) {
                                            obj3 = null;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    obj3 = ffci.a(th3);
                                }
                                return (Throwable) (true != (obj3 instanceof ffcg) ? obj3 : null);
                            }
                        }, 2);
                    } else if (ffkj.e(cls2, Throwable.class)) {
                        final ffji ffjiVar4 = new ffji() { // from class: fggq
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                int i2 = fggt.a;
                                Object newInstance = constructor.newInstance((Throwable) obj2);
                                newInstance.getClass();
                                return (Throwable) newInstance;
                            }
                        };
                        ffcfVar = new ffcf(new ffji() { // from class: fggn
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                Object obj3;
                                Throwable th = (Throwable) obj2;
                                int i2 = fggt.a;
                                try {
                                    Throwable th2 = (Throwable) ffji.this.invoke(th);
                                    boolean e = ffkj.e(th.getMessage(), th2.getMessage());
                                    obj3 = th2;
                                    if (!e) {
                                        boolean e2 = ffkj.e(th2.getMessage(), th.toString());
                                        obj3 = th2;
                                        if (!e2) {
                                            obj3 = null;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    obj3 = ffci.a(th3);
                                }
                                return (Throwable) (true != (obj3 instanceof ffcg) ? obj3 : null);
                            }
                        }, 1);
                    } else {
                        ffcfVar = new ffcf(null, -1);
                    }
                } else if (length2 != 2) {
                    ffcfVar = new ffcf(null, -1);
                } else if (ffkj.e(parameterTypes[0], String.class) && ffkj.e(parameterTypes[1], Throwable.class)) {
                    final ffji ffjiVar5 = new ffji() { // from class: fggo
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            int i2 = fggt.a;
                            Object newInstance = constructor.newInstance(th.getMessage(), th);
                            newInstance.getClass();
                            return (Throwable) newInstance;
                        }
                    };
                    ffcfVar = new ffcf(new ffji() { // from class: fggn
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            Object obj3;
                            Throwable th = (Throwable) obj2;
                            int i2 = fggt.a;
                            try {
                                Throwable th2 = (Throwable) ffji.this.invoke(th);
                                boolean e = ffkj.e(th.getMessage(), th2.getMessage());
                                obj3 = th2;
                                if (!e) {
                                    boolean e2 = ffkj.e(th2.getMessage(), th.toString());
                                    obj3 = th2;
                                    if (!e2) {
                                        obj3 = null;
                                    }
                                }
                            } catch (Throwable th3) {
                                obj3 = ffci.a(th3);
                            }
                            return (Throwable) (true != (obj3 instanceof ffcg) ? obj3 : null);
                        }
                    }, 3);
                } else {
                    ffcfVar = new ffcf(null, -1);
                }
                arrayList.add(ffcfVar);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((ffcf) obj).b).intValue();
                    while (true) {
                        Object next = it.next();
                        int intValue2 = ((Number) ((ffcf) next).b).intValue();
                        int i2 = intValue < intValue2 ? intValue2 : intValue;
                        if (intValue < intValue2) {
                            obj = next;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        intValue = i2;
                    }
                }
            }
            ffcf ffcfVar2 = (ffcf) obj;
            if (ffcfVar2 != null && (ffjiVar = (ffji) ffcfVar2.a) != null) {
                return ffjiVar;
            }
        }
        return fggsVar;
    }

    private static final int c(Class cls, int i) {
        Object a2;
        ffiu.c(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                a2 = ffci.a(th);
            }
        } while (cls != null);
        a2 = Integer.valueOf(i2);
        Object valueOf = Integer.valueOf(i);
        if (true == (a2 instanceof ffcg)) {
            a2 = valueOf;
        }
        return ((Number) a2).intValue();
    }
}
