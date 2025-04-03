package defpackage;

import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public final class jyx {
    public static final jyx a = new jyx();

    private jyx() {
    }

    public static final void a(String str, String str2, hfd hfdVar, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            int length = objArr.length;
            Method c = c(cls, str2, Arrays.copyOf(objArr, length));
            if (c != null) {
                c.setAccessible(true);
                if (Modifier.isStatic(c.getModifiers())) {
                    d(c, null, hfdVar, Arrays.copyOf(objArr, length));
                    return;
                } else {
                    d(c, cls.getConstructor(new Class[0]).newInstance(new Object[0]), hfdVar, Arrays.copyOf(objArr, length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e) {
            Log.w("PreviewLogger", "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null);
            throw e;
        }
    }

    private static final int b(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil((i + i2) / 10.0d);
    }

    private static final Method c(Class cls, String str, Object... objArr) {
        Method method;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int b = b(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                ffmj q = ffmk.q(0, b);
                ArrayList arrayList2 = new ArrayList(ffdx.n(q, 10));
                ffev it = q.iterator();
                while (((ffmi) it).a) {
                    it.a();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                ArrayList arrayList3 = new ArrayList(3);
                ffle.a(clsArr, arrayList3);
                arrayList3.add(hfd.class);
                ffle.a(clsArr2, arrayList3);
                Class[] clsArr3 = (Class[]) arrayList3.toArray(new Class[arrayList3.size()]);
                int length2 = declaredMethods.length;
                int i3 = 0;
                loop2: while (true) {
                    if (i3 >= length2) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i3];
                    if (!ffkj.e(str, method.getName())) {
                        if (!ffpc.t(method.getName(), str + '-')) {
                            continue;
                            i3++;
                            i = 0;
                        }
                    }
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Class<?>[] clsArr4 = (Class[]) Arrays.copyOf(clsArr3, clsArr3.length);
                    int length3 = parameterTypes.length;
                    if (length3 == clsArr4.length) {
                        ArrayList arrayList4 = new ArrayList(length3);
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < length3) {
                            Class<?> cls4 = parameterTypes[i4];
                            int i6 = i5 + 1;
                            Class<?> cls5 = clsArr4[i5];
                            boolean z = true;
                            if (!ffkj.e(ffiu.c(cls4), ffiu.c(cls5)) && !cls4.isAssignableFrom(cls5)) {
                                z = false;
                            }
                            arrayList4.add(Boolean.valueOf(z));
                            i4++;
                            i5 = i6;
                        }
                        if (!arrayList4.isEmpty()) {
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                if (!((Boolean) it2.next()).booleanValue()) {
                                    break;
                                }
                            }
                            break loop2;
                        }
                        break;
                    }
                    continue;
                    i3++;
                    i = 0;
                }
                if (method != null) {
                    return method;
                }
                throw new NoSuchMethodException(str.concat(" not found"));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method2 : cls.getDeclaredMethods()) {
                if (!ffkj.e(method2.getName(), str)) {
                    if (!ffpc.t(method2.getName(), str + '-')) {
                    }
                }
                return method2;
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final void d(Method method, Object obj, hfd hfdVar, Object... objArr) {
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (ffkj.e(parameterTypes[length], hfd.class)) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        int i3 = i + 1;
        int b = b(i, obj != null ? 1 : 0) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != b ? (int) Math.ceil(i / 31.0d) : 0) + b != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            if (i4 < 0 || i4 >= i) {
                if (i4 == i) {
                    obj2 = hfdVar;
                } else if (i3 <= i4 && i4 < b) {
                    obj2 = 0;
                } else {
                    if (b > i4 || i4 >= length2) {
                        throw new IllegalStateException("Unexpected index");
                    }
                    obj2 = 2097151;
                }
            } else if (i4 <= ffdo.B(objArr)) {
                obj2 = objArr[i4];
            } else {
                String name = method.getParameterTypes()[i4].getName();
                if (name != null) {
                    switch (name.hashCode()) {
                        case -1325958191:
                            if (name.equals("double")) {
                                obj2 = Double.valueOf(eobe.a);
                                break;
                            }
                            break;
                        case 104431:
                            if (name.equals("int")) {
                                obj2 = 0;
                                break;
                            }
                            break;
                        case 3039496:
                            if (name.equals("byte")) {
                                obj2 = (byte) 0;
                                break;
                            }
                            break;
                        case 3052374:
                            if (name.equals("char")) {
                                obj2 = (char) 0;
                                break;
                            }
                            break;
                        case 3327612:
                            if (name.equals(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG)) {
                                obj2 = 0L;
                                break;
                            }
                            break;
                        case 64711720:
                            if (name.equals("boolean")) {
                                obj2 = false;
                                break;
                            }
                            break;
                        case 97526364:
                            if (name.equals("float")) {
                                obj2 = Float.valueOf(0.0f);
                                break;
                            }
                            break;
                        case 109413500:
                            if (name.equals("short")) {
                                obj2 = (short) 0;
                                break;
                            }
                            break;
                    }
                }
                obj2 = null;
            }
            objArr2[i4] = obj2;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }
}
