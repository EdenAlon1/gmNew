package defpackage;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eewe implements eewl {
    private final String a;
    private final Object b;
    private final Method c;
    private eewd d;

    public eewe(String str, Object obj, Method method) {
        this.a = str;
        this.b = obj;
        this.c = method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    private final synchronized eewd e() {
        if (this.d == null) {
            eewd eewdVar = new eewd(this.c);
            this.d = eewdVar;
            try {
                if (!eewdVar.d) {
                    ?? r0 = eewdVar.c;
                    while (true) {
                        Class[] clsArr = eewdVar.b;
                        if (r0 >= clsArr.length) {
                            break;
                        }
                        Class cls = clsArr[r0];
                        if (!eewd.a.contains(cls) && !cls.isEnum()) {
                            throw new IllegalArgumentException("Invalid param: ".concat(String.valueOf(cls.getSimpleName())));
                        }
                        r0 += 2;
                    }
                } else {
                    if (eewdVar.b.length != (eewdVar.c ? 1 : 0) + 1) {
                        throw new IllegalArgumentException("Extra params not allowed after String[]");
                    }
                }
                this.c.setAccessible(true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid method signature: ".concat(String.valueOf(String.valueOf(this.c))), e);
            }
        }
        return this.d;
    }

    private final String f(Object obj) {
        if (obj == null && this.c.getReturnType() == Void.TYPE) {
            return "OK";
        }
        if (!(obj instanceof Future)) {
            return String.valueOf(obj);
        }
        try {
            return String.valueOf(((Future) obj).get());
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Short] */
    public final String a(eewd eewdVar, Context context, String[] strArr) {
        int i;
        try {
            if (eewdVar.d) {
                return eewdVar.c ? f(this.c.invoke(this.b, context, strArr)) : f(this.c.invoke(this.b, strArr));
            }
            int length = strArr.length;
            boolean z = eewdVar.c;
            ?? r4 = new Object[z ? length + 1 : length];
            if (z) {
                r4[0] = context;
                i = 1;
            } else {
                i = 0;
            }
            for (?? r5 : strArr) {
                Class cls = eewdVar.b[i];
                if (cls != String.class) {
                    if (cls == Byte.TYPE) {
                        r5 = Byte.valueOf((String) r5);
                    } else if (cls == Short.TYPE) {
                        r5 = Short.valueOf((String) r5);
                    } else if (cls == Integer.TYPE) {
                        r5 = Integer.valueOf((String) r5);
                    } else if (cls == Long.TYPE) {
                        r5 = Long.valueOf((String) r5);
                    } else if (cls == Float.TYPE) {
                        r5 = Float.valueOf((String) r5);
                    } else if (cls == Double.TYPE) {
                        r5 = Double.valueOf((String) r5);
                    } else if (cls == Boolean.TYPE) {
                        r5 = Boolean.valueOf((String) r5);
                    } else {
                        if (cls != Character.TYPE) {
                            if (!cls.isEnum()) {
                                throw new IllegalArgumentException("Invalid param type: ".concat(String.valueOf(String.valueOf(cls))));
                            }
                            for (Enum r9 : (Enum[]) cls.getEnumConstants()) {
                                if (r9.name().equals(r5)) {
                                    r5 = r9;
                                }
                            }
                            throw new IllegalArgumentException("Invalid enum value: ".concat(String.valueOf((Object) r5)));
                        }
                        if (r5.length() != 1) {
                            throw new IllegalArgumentException("Invalid char param: ".concat(String.valueOf((Object) r5)));
                        }
                        r5 = Character.valueOf(r5.charAt(0));
                    }
                }
                r4[i] = r5;
                i++;
            }
            return f(this.c.invoke(this.b, r4));
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            String th = e.toString();
            StringBuilder sb = new StringBuilder("Usage: ");
            sb.append(this.a);
            eewd e2 = e();
            if (e2.d) {
                sb.append(" [params...]");
            } else {
                for (?? r0 = e2.c; r0 < e2.b.length; r0++) {
                    sb.append(" <");
                    sb.append(e2.b[r0].getSimpleName());
                    sb.append('>');
                }
            }
            sb.append('\n');
            return a.w(sb.toString(), th, "\n\n");
        }
    }

    @Override // defpackage.eewl
    public final String b() {
        return this.a;
    }

    @Override // defpackage.eewl
    public final String c(Context context, String[] strArr) {
        eewd e = e();
        return e.e ? new eewc(this, e).c(context, strArr) : a(e, context, strArr);
    }

    @Override // defpackage.eewl
    public final String[] d(Context context, String[] strArr) {
        eewd e = e();
        if (!e.d) {
            boolean z = e.c;
            Class[] clsArr = e.b;
            int length = clsArr.length - (z ? 1 : 0);
            int length2 = strArr.length;
            if (length2 < length) {
                Class cls = clsArr[(z ? 1 : 0) + length2];
                if (cls == Boolean.TYPE) {
                    return new String[]{"true", "false"};
                }
                if (cls.isEnum()) {
                    Enum[] enumArr = (Enum[]) cls.getEnumConstants();
                    int length3 = enumArr.length;
                    String[] strArr2 = new String[length3];
                    for (int i = 0; i < length3; i++) {
                        strArr2[i] = enumArr[i].name();
                    }
                    return strArr2;
                }
            }
        }
        return new String[0];
    }
}
