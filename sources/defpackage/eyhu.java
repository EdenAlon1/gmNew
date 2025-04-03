package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyhu {
    public static final /* synthetic */ int a = 0;
    private static final char[] b;

    static {
        char[] cArr = new char[80];
        b = cArr;
        Arrays.fill(cArr, ' ');
    }

    static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(eyiy.a(eyee.A((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof eyee) {
            sb.append(": \"");
            sb.append(eyiy.a((eyee) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof eyfy) {
            sb.append(" {");
            b((eyfy) obj, sb, i + 2);
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i3, "key", entry.getKey());
        a(sb, i3, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, entry.getValue());
        sb.append("\n");
        c(i, sb);
        sb.append("}");
    }

    public static void b(eyhs eyhsVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = eyhsVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i, substring.substring(0, substring.length() - 4), eyfy.invokeOrDie(method2, eyhsVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), eyfy.invokeOrDie(method, eyhsVar, new Object[0]));
            } else if (hashSet.contains("set".concat(String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object invokeOrDie = eyfy.invokeOrDie(method4, eyhsVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) eyfy.invokeOrDie(method5, eyhsVar, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, invokeOrDie);
                    } else if (invokeOrDie instanceof Boolean) {
                        if (!((Boolean) invokeOrDie).booleanValue()) {
                        }
                        a(sb, i, substring, invokeOrDie);
                    } else if (invokeOrDie instanceof Integer) {
                        if (((Integer) invokeOrDie).intValue() == 0) {
                        }
                        a(sb, i, substring, invokeOrDie);
                    } else if (invokeOrDie instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) invokeOrDie).floatValue()) == 0) {
                        }
                        a(sb, i, substring, invokeOrDie);
                    } else if (invokeOrDie instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) invokeOrDie).doubleValue()) == 0) {
                        }
                        a(sb, i, substring, invokeOrDie);
                    } else {
                        if (invokeOrDie instanceof String) {
                            equals = invokeOrDie.equals("");
                        } else if (invokeOrDie instanceof eyee) {
                            equals = invokeOrDie.equals(eyee.b);
                        } else if (invokeOrDie instanceof eyhs) {
                            if (invokeOrDie == ((eyhs) invokeOrDie).getDefaultInstanceForType()) {
                            }
                            a(sb, i, substring, invokeOrDie);
                        } else {
                            if ((invokeOrDie instanceof Enum) && ((Enum) invokeOrDie).ordinal() == 0) {
                            }
                            a(sb, i, substring, invokeOrDie);
                        }
                        if (equals) {
                        }
                        a(sb, i, substring, invokeOrDie);
                    }
                }
            }
            i2 = 3;
        }
        if (eyhsVar instanceof eyft) {
            Iterator e = ((eyft) eyhsVar).r.e();
            while (e.hasNext()) {
                Map.Entry entry2 = (Map.Entry) e.next();
                a(sb, i, "[" + ((eyfv) entry2.getKey()).b + "]", entry2.getValue());
            }
        }
        eyjd eyjdVar = ((eyfy) eyhsVar).unknownFields;
        if (eyjdVar != null) {
            for (int i4 = 0; i4 < eyjdVar.b; i4++) {
                a(sb, i, String.valueOf(eyjt.a(eyjdVar.c[i4])), eyjdVar.d[i4]);
            }
        }
    }

    private static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(b, 0, i2);
            i -= i2;
        }
    }
}
