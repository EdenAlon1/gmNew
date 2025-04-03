package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjds {
    private static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    private static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    final fjdx a;
    final Method b;
    final Annotation[] c;
    final Annotation[][] d;
    final Type[] e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    String n;
    boolean o;
    boolean p;
    boolean q;
    String r;
    fhgh s;
    fhgn t;
    Set u;
    fjdm[] v;
    boolean w;

    public fjds(fjdx fjdxVar, Method method) {
        this.a = fjdxVar;
        this.b = method;
        this.c = method.getAnnotations();
        this.e = method.getGenericParameterTypes();
        this.d = method.getParameterAnnotations();
    }

    private static Class c(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    private final void d(int i, Type type) {
        if (fjee.o(type)) {
            throw fjee.d(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    private static /* synthetic */ String e(Class cls) {
        return cls.getSimpleName() + " must include generic type (e.g., " + cls.getSimpleName() + "<String>)";
    }

    public final fjdm a(int i, Type type, Annotation[] annotationArr, boolean z) {
        fjdm fjdmVar;
        fjdm fjdmVar2;
        fjdm fjcxVar;
        fjdm fjdeVar;
        fjdm fjcwVar;
        if (annotationArr != null) {
            fjdmVar = null;
            for (Annotation annotation : annotationArr) {
                if (annotation instanceof fjfn) {
                    d(i, type);
                    if (this.m) {
                        throw fjee.d(this.b, i, "Multiple @Url method annotations found.", new Object[0]);
                    }
                    if (this.i) {
                        throw fjee.d(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                    }
                    if (this.j) {
                        throw fjee.d(this.b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                    }
                    if (this.k) {
                        throw fjee.d(this.b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                    }
                    if (this.l) {
                        throw fjee.d(this.b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                    }
                    if (this.r != null) {
                        throw fjee.d(this.b, i, "@Url cannot be used with @%s URL", this.n);
                    }
                    this.m = true;
                    if (type != fhgk.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                        throw fjee.d(this.b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                    }
                    fjdmVar2 = new fjdk(this.b, i);
                } else {
                    if (annotation instanceof fjfh) {
                        d(i, type);
                        if (this.j) {
                            throw fjee.d(this.b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                        }
                        if (this.k) {
                            throw fjee.d(this.b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                        }
                        if (this.l) {
                            throw fjee.d(this.b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                        }
                        if (this.m) {
                            throw fjee.d(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        if (this.r == null) {
                            throw fjee.d(this.b, i, "@Path can only be used with relative url on @%s", this.n);
                        }
                        this.i = true;
                        fjfh fjfhVar = (fjfh) annotation;
                        String a = fjfhVar.a();
                        if (!y.matcher(a).matches()) {
                            throw fjee.d(this.b, i, "@Path parameter name must match %s. Found: %s", x.pattern(), a);
                        }
                        if (!this.u.contains(a)) {
                            throw fjee.d(this.b, i, "URL \"%s\" does not contain \"{%s}\".", this.r, a);
                        }
                        this.a.c(type);
                        fjdeVar = new fjdf(this.b, i, a, fjfhVar.b());
                    } else if (annotation instanceof fjfi) {
                        d(i, type);
                        fjfi fjfiVar = (fjfi) annotation;
                        String a2 = fjfiVar.a();
                        boolean b = fjfiVar.b();
                        Class a3 = fjee.a(type);
                        this.j = true;
                        if (Iterable.class.isAssignableFrom(a3)) {
                            if (!(type instanceof ParameterizedType)) {
                                throw fjee.d(this.b, i, e(a3), new Object[0]);
                            }
                            this.a.c(fjee.h(0, (ParameterizedType) type));
                            fjdmVar2 = new fjcv(new fjdg(a2, b));
                        } else if (a3.isArray()) {
                            this.a.c(c(a3.getComponentType()));
                            fjdmVar2 = new fjcw(new fjdg(a2, b));
                        } else {
                            this.a.c(type);
                            fjcxVar = new fjdg(a2, b);
                            fjdmVar2 = fjcxVar;
                        }
                    } else if (annotation instanceof fjfk) {
                        d(i, type);
                        boolean a4 = ((fjfk) annotation).a();
                        Class a5 = fjee.a(type);
                        this.k = true;
                        if (Iterable.class.isAssignableFrom(a5)) {
                            if (!(type instanceof ParameterizedType)) {
                                throw fjee.d(this.b, i, e(a5), new Object[0]);
                            }
                            this.a.c(fjee.h(0, (ParameterizedType) type));
                            fjcwVar = new fjcv(new fjdi(a4));
                        } else if (a5.isArray()) {
                            this.a.c(c(a5.getComponentType()));
                            fjcwVar = new fjcw(new fjdi(a4));
                        } else {
                            this.a.c(type);
                            fjdmVar2 = new fjdi(a4);
                        }
                        fjdmVar2 = fjcwVar;
                    } else if (annotation instanceof fjfj) {
                        d(i, type);
                        Class a6 = fjee.a(type);
                        this.l = true;
                        if (!Map.class.isAssignableFrom(a6)) {
                            throw fjee.d(this.b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                        }
                        Type i2 = fjee.i(type, a6, Map.class);
                        if (!(i2 instanceof ParameterizedType)) {
                            throw fjee.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        ParameterizedType parameterizedType = (ParameterizedType) i2;
                        Type h = fjee.h(0, parameterizedType);
                        if (h != String.class) {
                            throw fjee.d(this.b, i, "@QueryMap keys must be of type String: ".concat(String.valueOf(String.valueOf(h))), new Object[0]);
                        }
                        fjdeVar = new fjdh(this.b, i, this.a.c(fjee.h(1, parameterizedType)), ((fjfj) annotation).a());
                    } else if (annotation instanceof fjex) {
                        d(i, type);
                        String a7 = ((fjex) annotation).a();
                        Class a8 = fjee.a(type);
                        if (Iterable.class.isAssignableFrom(a8)) {
                            if (!(type instanceof ParameterizedType)) {
                                throw fjee.d(this.b, i, e(a8), new Object[0]);
                            }
                            this.a.c(fjee.h(0, (ParameterizedType) type));
                            fjcwVar = new fjcv(new fjda(a7));
                        } else if (a8.isArray()) {
                            this.a.c(c(a8.getComponentType()));
                            fjcwVar = new fjcw(new fjda(a7));
                        } else {
                            this.a.c(type);
                            fjdmVar2 = new fjda(a7);
                        }
                        fjdmVar2 = fjcwVar;
                    } else if (annotation instanceof fjey) {
                        if (type == fhgh.class) {
                            fjdmVar2 = new fjdc(this.b, i);
                        } else {
                            d(i, type);
                            Class a9 = fjee.a(type);
                            if (!Map.class.isAssignableFrom(a9)) {
                                throw fjee.d(this.b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                            }
                            Type i3 = fjee.i(type, a9, Map.class);
                            if (!(i3 instanceof ParameterizedType)) {
                                throw fjee.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                            }
                            ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                            Type h2 = fjee.h(0, parameterizedType2);
                            if (h2 != String.class) {
                                throw fjee.d(this.b, i, "@HeaderMap keys must be of type String: ".concat(String.valueOf(String.valueOf(h2))), new Object[0]);
                            }
                            this.a.c(fjee.h(1, parameterizedType2));
                            fjdmVar2 = new fjdb(this.b, i);
                        }
                    } else if (annotation instanceof fjer) {
                        d(i, type);
                        if (!this.p) {
                            throw fjee.d(this.b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                        fjer fjerVar = (fjer) annotation;
                        String a10 = fjerVar.a();
                        boolean b2 = fjerVar.b();
                        this.f = true;
                        Class a11 = fjee.a(type);
                        if (Iterable.class.isAssignableFrom(a11)) {
                            if (!(type instanceof ParameterizedType)) {
                                throw fjee.d(this.b, i, e(a11), new Object[0]);
                            }
                            this.a.c(fjee.h(0, (ParameterizedType) type));
                            fjdmVar2 = new fjcv(new fjcy(a10, b2));
                        } else if (a11.isArray()) {
                            this.a.c(c(a11.getComponentType()));
                            fjdmVar2 = new fjcw(new fjcy(a10, b2));
                        } else {
                            this.a.c(type);
                            fjcxVar = new fjcy(a10, b2);
                            fjdmVar2 = fjcxVar;
                        }
                    } else if (annotation instanceof fjes) {
                        d(i, type);
                        if (!this.p) {
                            throw fjee.d(this.b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                        }
                        Class a12 = fjee.a(type);
                        if (!Map.class.isAssignableFrom(a12)) {
                            throw fjee.d(this.b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                        }
                        Type i4 = fjee.i(type, a12, Map.class);
                        if (!(i4 instanceof ParameterizedType)) {
                            throw fjee.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                        Type h3 = fjee.h(0, parameterizedType3);
                        if (h3 != String.class) {
                            throw fjee.d(this.b, i, "@FieldMap keys must be of type String: ".concat(String.valueOf(String.valueOf(h3))), new Object[0]);
                        }
                        fjbu c = this.a.c(fjee.h(1, parameterizedType3));
                        this.f = true;
                        fjdeVar = new fjcz(this.b, i, c, ((fjes) annotation).a());
                    } else if (annotation instanceof fjff) {
                        d(i, type);
                        if (!this.q) {
                            throw fjee.d(this.b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                        }
                        fjff fjffVar = (fjff) annotation;
                        this.g = true;
                        String b3 = fjffVar.b();
                        Class a13 = fjee.a(type);
                        if (!b3.isEmpty()) {
                            fhgh c2 = fhgg.c(fhpi.c, a.a(b3, "form-data; name=\"", "\""), fhpi.b, fjffVar.a());
                            if (Iterable.class.isAssignableFrom(a13)) {
                                if (!(type instanceof ParameterizedType)) {
                                    throw fjee.d(this.b, i, e(a13), new Object[0]);
                                }
                                Type h4 = fjee.h(0, (ParameterizedType) type);
                                if (fhgp.class.isAssignableFrom(fjee.a(h4))) {
                                    throw fjee.d(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                }
                                fjdmVar2 = new fjcv(new fjdd(this.b, i, c2, this.a.d(h4, this.c)));
                            } else if (a13.isArray()) {
                                Class c3 = c(a13.getComponentType());
                                if (fhgp.class.isAssignableFrom(c3)) {
                                    throw fjee.d(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                }
                                fjdmVar2 = new fjcw(new fjdd(this.b, i, c2, this.a.d(c3, this.c)));
                            } else {
                                if (fhgp.class.isAssignableFrom(a13)) {
                                    throw fjee.d(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                }
                                fjdeVar = new fjdd(this.b, i, c2, this.a.d(type, this.c));
                            }
                        } else if (Iterable.class.isAssignableFrom(a13)) {
                            if (!(type instanceof ParameterizedType)) {
                                throw fjee.d(this.b, i, e(a13), new Object[0]);
                            }
                            if (!fhgp.class.isAssignableFrom(fjee.a(fjee.h(0, (ParameterizedType) type)))) {
                                throw fjee.d(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            fjdmVar2 = new fjcv(fjdj.a);
                        } else if (a13.isArray()) {
                            if (!fhgp.class.isAssignableFrom(a13.getComponentType())) {
                                throw fjee.d(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            fjdmVar2 = new fjcw(fjdj.a);
                        } else {
                            if (!fhgp.class.isAssignableFrom(a13)) {
                                throw fjee.d(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            fjdmVar2 = fjdj.a;
                        }
                    } else if (annotation instanceof fjfg) {
                        d(i, type);
                        if (!this.q) {
                            throw fjee.d(this.b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                        }
                        this.g = true;
                        Class a14 = fjee.a(type);
                        if (!Map.class.isAssignableFrom(a14)) {
                            throw fjee.d(this.b, i, "@PartMap parameter type must be Map.", new Object[0]);
                        }
                        Type i5 = fjee.i(type, a14, Map.class);
                        if (!(i5 instanceof ParameterizedType)) {
                            throw fjee.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        ParameterizedType parameterizedType4 = (ParameterizedType) i5;
                        Type h5 = fjee.h(0, parameterizedType4);
                        if (h5 != String.class) {
                            throw fjee.d(this.b, i, "@PartMap keys must be of type String: ".concat(String.valueOf(String.valueOf(h5))), new Object[0]);
                        }
                        Type h6 = fjee.h(1, parameterizedType4);
                        if (fhgp.class.isAssignableFrom(fjee.a(h6))) {
                            throw fjee.d(this.b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        fjdeVar = new fjde(this.b, i, this.a.d(h6, this.c), ((fjfg) annotation).a());
                    } else if (annotation instanceof fjep) {
                        d(i, type);
                        if (this.p || this.q) {
                            throw fjee.d(this.b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                        }
                        if (this.h) {
                            throw fjee.d(this.b, i, "Multiple @Body method annotations found.", new Object[0]);
                        }
                        try {
                            fjbu d = this.a.d(type, this.c);
                            this.h = true;
                            fjcxVar = new fjcx(this.b, i, d);
                            fjdmVar2 = fjcxVar;
                        } catch (RuntimeException e) {
                            throw fjee.e(this.b, e, i, "Unable to create @Body converter for %s", type);
                        }
                    } else if (annotation instanceof fjfm) {
                        d(i, type);
                        Class a15 = fjee.a(type);
                        for (int i6 = i - 1; i6 >= 0; i6--) {
                            fjdm fjdmVar3 = this.v[i6];
                            if ((fjdmVar3 instanceof fjdl) && ((fjdl) fjdmVar3).a.equals(a15)) {
                                throw fjee.d(this.b, i, "@Tag type " + a15.getName() + " is duplicate of parameter #" + (i6 + 1) + " and would always overwrite its value.", new Object[0]);
                            }
                        }
                        fjdmVar2 = new fjdl(a15);
                    } else {
                        fjdmVar2 = null;
                    }
                    fjdmVar2 = fjdeVar;
                }
                if (fjdmVar2 != null) {
                    if (fjdmVar != null) {
                        throw fjee.d(this.b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                    fjdmVar = fjdmVar2;
                }
            }
        } else {
            fjdmVar = null;
        }
        if (fjdmVar != null) {
            return fjdmVar;
        }
        if (z) {
            try {
                if (fjee.a(type) == ffgu.class) {
                    this.w = true;
                    return null;
                }
            } catch (NoClassDefFoundError unused) {
            }
        }
        throw fjee.d(this.b, i, "No Retrofit annotation found.", new Object[0]);
    }

    public final void b(String str, String str2, boolean z) {
        String str3 = this.n;
        if (str3 != null) {
            throw fjee.b(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.n = str;
        this.o = z;
        if (str2.isEmpty()) {
            return;
        }
        int indexOf = str2.indexOf(63);
        if (indexOf != -1 && indexOf < str2.length() - 1) {
            String substring = str2.substring(indexOf + 1);
            if (x.matcher(substring).find()) {
                throw fjee.b(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
            }
        }
        this.r = str2;
        Matcher matcher = x.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.u = linkedHashSet;
    }
}
