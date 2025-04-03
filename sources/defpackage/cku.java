package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cku {
    public static final /* synthetic */ int a = 0;
    private static final Map b;
    private static final Map c;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        b = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        c = arrayMap2;
    }

    private cku() {
    }

    public static Bundle a(Object obj, String str, cks cksVar) {
        Bundle bundle;
        if (obj != null) {
            Iterator it = cksVar.a.iterator();
            while (it.hasNext()) {
                if (((ckr) it.next()).a == obj) {
                    throw new ckq("Found cycle while bundling type ".concat(String.valueOf(obj.getClass().getSimpleName())), cksVar);
                }
            }
        }
        cks b2 = cks.b(obj, str, cksVar);
        try {
            if (obj == null) {
                throw new ckt("Bundling of null object is not supported", b2);
            }
            if (obj instanceof IconCompat) {
                bundle = new Bundle(2);
                bundle.putInt("tag_class_type", 6);
                bundle.putBundle("tag_value", ((IconCompat) obj).e());
            } else {
                boolean z = obj instanceof Boolean;
                int i = 0;
                if (!z && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof String) && !(obj instanceof Parcelable)) {
                    if (obj instanceof IInterface) {
                        IInterface iInterface = (IInterface) obj;
                        bundle = new Bundle(3);
                        String name = iInterface.getClass().getName();
                        bundle.putInt("tag_class_type", 1);
                        bundle.putBinder("tag_value", iInterface.asBinder());
                        bundle.putString("tag_class_name", name);
                    } else if (obj instanceof IBinder) {
                        bundle = new Bundle(2);
                        bundle.putInt("tag_class_type", 9);
                        bundle.putBinder("tag_value", (IBinder) obj);
                    } else if (obj instanceof Map) {
                        bundle = new Bundle(2);
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            Bundle bundle2 = new Bundle(2);
                            bundle2.putBundle("tag_1", a(entry.getKey(), a.f(i, "<key ", ">"), b2));
                            if (entry.getValue() != null) {
                                bundle2.putBundle("tag_2", a(entry.getValue(), a.f(i, "<value ", ">"), b2));
                            }
                            i++;
                            arrayList.add(bundle2);
                        }
                        bundle.putInt("tag_class_type", 2);
                        bundle.putParcelableArrayList("tag_value", arrayList);
                    } else if (obj instanceof List) {
                        bundle = f((List) obj, b2);
                        bundle.putInt("tag_class_type", 4);
                    } else if (obj instanceof Set) {
                        bundle = f((Set) obj, b2);
                        bundle.putInt("tag_class_type", 3);
                    } else if (obj.getClass().isEnum()) {
                        bundle = g(obj, b2);
                    } else if (obj instanceof Class) {
                        bundle = new Bundle(2);
                        bundle.putInt("tag_class_type", 8);
                        bundle.putString("tag_value", ((Class) obj).getName());
                    } else {
                        if (obj.getClass().isArray()) {
                            throw new ckt("Object serializing contains an array, use a list or a set instead", b2);
                        }
                        if (obj instanceof knr) {
                            bundle = ((knr) obj).a();
                            bundle.putInt("tag_class_type", 10);
                        } else {
                            String name2 = obj.getClass().getName();
                            if (!obj.getClass().isAnnotationPresent(cfs.class)) {
                                throw new ckt("Invalid class not marked as CarProtocol: ".concat(String.valueOf(name2)), b2);
                            }
                            try {
                                obj.getClass().getDeclaredConstructor(new Class[0]);
                                List<Field> l = l(obj.getClass());
                                Bundle bundle3 = new Bundle(l.size() + 2);
                                bundle3.putInt("tag_class_type", 5);
                                bundle3.putString("tag_class_name", name2);
                                for (Field field : l) {
                                    field.setAccessible(true);
                                    String d = d(field);
                                    try {
                                        Object obj2 = field.get(obj);
                                        if (obj2 != null) {
                                            bundle3.putParcelable(d, a(obj2, field.getName(), b2));
                                        }
                                    } catch (IllegalAccessException e) {
                                        throw new ckt("Field is not accessible: ".concat(d), b2, e);
                                    }
                                }
                                bundle = bundle3;
                            } catch (NoSuchMethodException e2) {
                                throw new ckt("Class to deserialize is missing a no args constructor: ".concat(String.valueOf(name2)), b2, e2);
                            }
                        }
                    }
                }
                Bundle bundle4 = new Bundle(2);
                bundle4.putInt("tag_class_type", 0);
                if (z) {
                    bundle4.putBoolean("tag_value", ((Boolean) obj).booleanValue());
                } else if (obj instanceof Byte) {
                    bundle4.putByte("tag_value", ((Byte) obj).byteValue());
                } else if (obj instanceof Character) {
                    bundle4.putChar("tag_value", ((Character) obj).charValue());
                } else if (obj instanceof Short) {
                    bundle4.putShort("tag_value", ((Short) obj).shortValue());
                } else if (obj instanceof Integer) {
                    bundle4.putInt("tag_value", ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle4.putLong("tag_value", ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    bundle4.putDouble("tag_value", ((Double) obj).doubleValue());
                } else if (obj instanceof Float) {
                    bundle4.putFloat("tag_value", ((Float) obj).floatValue());
                } else if (obj instanceof String) {
                    bundle4.putString("tag_value", (String) obj);
                } else {
                    if (!(obj instanceof Parcelable)) {
                        throw new ckt("Unsupported primitive type: ".concat(String.valueOf(obj.getClass().getName())), b2);
                    }
                    bundle4.putParcelable("tag_value", (Parcelable) obj);
                }
                bundle = bundle4;
            }
            b2.close();
            return bundle;
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Collection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map] */
    public static Object b(Bundle bundle, cks cksVar) {
        Object i;
        ?? hashMap;
        ClassLoader classLoader = cku.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        int i2 = bundle.getInt("tag_class_type");
        cks b2 = cks.b(bundle, c(bundle.getInt("tag_class_type")), cksVar);
        try {
            switch (i2) {
                case 0:
                    Object obj = bundle.get("tag_value");
                    if (obj == null) {
                        throw new ckt("Bundle is missing the primitive value", b2);
                    }
                    b2.close();
                    return obj;
                case 1:
                    i = i(bundle, b2);
                    b2.close();
                    return i;
                case 2:
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
                    if (parcelableArrayList == null) {
                        throw new ckt("Bundle is missing the map", b2);
                    }
                    hashMap = new HashMap();
                    int size = parcelableArrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Bundle bundle2 = (Bundle) ((Parcelable) parcelableArrayList.get(i3));
                        Bundle bundle3 = bundle2.getBundle("tag_1");
                        Bundle bundle4 = bundle2.getBundle("tag_2");
                        if (bundle3 == null) {
                            throw new ckt("Bundle is missing key", b2);
                        }
                        hashMap.put(b(bundle3, b2), bundle4 == null ? null : b(bundle4, b2));
                    }
                    i = hashMap;
                    b2.close();
                    return i;
                case 3:
                    hashMap = new HashSet();
                    m(bundle, hashMap, b2);
                    i = hashMap;
                    b2.close();
                    return i;
                case 4:
                    hashMap = new ArrayList();
                    m(bundle, hashMap, b2);
                    i = hashMap;
                    b2.close();
                    return i;
                case 5:
                    i = j(bundle, b2);
                    b2.close();
                    return i;
                case 6:
                    Bundle bundle5 = bundle.getBundle("tag_value");
                    if (bundle5 == null) {
                        throw new ckt("IconCompat bundle is null", b2);
                    }
                    IconCompat f = IconCompat.f(bundle5);
                    if (f == null) {
                        throw new ckt("Failed to create IconCompat from bundle", b2);
                    }
                    b2.close();
                    return f;
                case 7:
                    i = h(bundle, b2);
                    b2.close();
                    return i;
                case 8:
                    String string = bundle.getString("tag_value");
                    if (string == null) {
                        throw new ckt("Class is missing the class name", b2);
                    }
                    try {
                        i = Class.forName(string);
                        b2.close();
                        return i;
                    } catch (ClassNotFoundException e) {
                        throw new ckt("Class name is unknown: ".concat(string), b2, e);
                    }
                case 9:
                    IBinder binder = bundle.getBinder("tag_value");
                    if (binder == null) {
                        throw new ckt("Bundle is missing the binder", b2);
                    }
                    b2.close();
                    return binder;
                case 10:
                    i = knr.b(bundle);
                    b2.close();
                    return i;
                default:
                    throw new ckt(a.h(i2, "Unsupported class type in bundle: "), b2);
            }
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static String c(int i) {
        String str = (String) c.get(Integer.valueOf(i));
        return str == null ? "unknown" : str;
    }

    static String d(Field field) {
        return String.valueOf(field.getDeclaringClass().getName()).concat(String.valueOf(field.getName()));
    }

    static String e(Class cls) {
        String str = (String) b.get(cls);
        if (str == null) {
            if (List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
        }
        return str == null ? cls.getSimpleName() : str;
    }

    private static Bundle f(Collection collection, cks cksVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(a(it.next(), a.f(i, "<item ", ">"), cksVar));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    private static Bundle g(Object obj, cks cksVar) {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) k(obj.getClass(), "name", cksVar).invoke(obj, new Object[0]));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e) {
            throw new ckt("Enum missing name method", cksVar, e);
        }
    }

    private static Object h(Bundle bundle, cks cksVar) {
        String string = bundle.getString("tag_value");
        if (string == null) {
            throw new ckt("Missing enum name [null]", cksVar);
        }
        String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new ckt("Missing enum className [null]", cksVar);
        }
        try {
            return k(Class.forName(string2), "valueOf", cksVar).invoke(null, string);
        } catch (ClassNotFoundException e) {
            throw new ckt(a.a(string2, "Enum class [", "] not found"), cksVar, e);
        } catch (IllegalArgumentException e2) {
            throw new ckt(a.d(string2, string, "Enum value [", "] does not exist in enum class [", "]"), cksVar, e2);
        } catch (ReflectiveOperationException e3) {
            throw new ckt(a.a(string2, "Enum of class [", "] missing valueOf method"), cksVar, e3);
        }
    }

    private static Object i(Bundle bundle, cks cksVar) {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new ckt("Bundle is missing the binder", cksVar);
        }
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new ckt("Bundle is missing IInterface class name", cksVar);
        }
        try {
            Object invoke = k(Class.forName(string), "asInterface", cksVar).invoke(null, binder);
            if (invoke != null) {
                return invoke;
            }
            throw new ckt("Failed to get interface from binder", cksVar);
        } catch (ClassNotFoundException e) {
            throw new ckt("Binder for unknown IInterface: ".concat(string), cksVar, e);
        } catch (ReflectiveOperationException e2) {
            throw new ckt("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), cksVar, e2);
        }
    }

    private static Object j(Bundle bundle, cks cksVar) {
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new ckt("Bundle is missing the class name", cksVar);
        }
        try {
            Class<?> cls = Class.forName(string);
            if (!cls.isAnnotationPresent(cfs.class)) {
                throw new ckt(a.t(string, "Invalid class not marked as CarProtocol: "), cksVar);
            }
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance(new Object[0]);
            for (Field field : l(cls)) {
                field.setAccessible(true);
                String d = d(field);
                Object obj = bundle.get(d);
                if (obj == null) {
                    obj = bundle.get(d.replaceAll("androidx.core.graphics.drawable.IconCompat", "androidx.core.graphics.drawable.IconCompat"));
                }
                if (obj instanceof Bundle) {
                    field.set(newInstance, b((Bundle) obj, cksVar));
                } else if (obj == null && Log.isLoggable("CarApp.Bun", 3)) {
                    Log.d("CarApp.Bun", a.n(field, "Value is null for field: "));
                }
            }
            return newInstance;
        } catch (ClassNotFoundException e) {
            throw new ckt("Object for unknown class: ".concat(string), cksVar, e);
        } catch (IllegalArgumentException e2) {
            throw new ckt("Failed to deserialize class: ".concat(string), cksVar, e2);
        } catch (NoSuchMethodException e3) {
            throw new ckt("Object missing no args constructor: ".concat(string), cksVar, e3);
        } catch (ReflectiveOperationException e4) {
            throw new ckt("Constructor or field is not accessible: ".concat(string), cksVar, e4);
        }
    }

    private static Method k(Class cls, String str, cks cksVar) {
        if (cls == null || cls == Object.class) {
            throw new ckt(a.o(cls, str, "No method ", " in class "), cksVar);
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return k(cls.getSuperclass(), str, cksVar);
    }

    private static List l(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(l(cls.getSuperclass()));
        }
        return arrayList;
    }

    private static void m(Bundle bundle, Collection collection, cks cksVar) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new ckt("Bundle is missing the collection", cksVar);
        }
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            collection.add(b((Bundle) ((Parcelable) parcelableArrayList.get(i)), cksVar));
        }
    }
}
