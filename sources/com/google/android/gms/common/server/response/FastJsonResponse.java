package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import defpackage.dfwp;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dfyc;
import defpackage.dfyk;
import defpackage.dfyu;
import defpackage.dfyv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class FastJsonResponse {

    /* compiled from: PG */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final dfyc CREATOR = new dfyc();
        public final int a;
        protected final int b;
        protected final boolean c;
        protected final int d;
        protected final boolean e;
        protected final String f;
        public final int g;
        protected final Class h;
        protected final String i;
        public FieldMappingDictionary j;
        public StringToIntConverter k;

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, ConverterWrapper converterWrapper) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
            this.e = z2;
            this.f = str;
            this.g = i4;
            StringToIntConverter stringToIntConverter = null;
            if (str2 == null) {
                this.h = null;
                this.i = null;
            } else {
                this.h = SafeParcelResponse.class;
                this.i = str2;
            }
            if (converterWrapper != null && (stringToIntConverter = converterWrapper.b) == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.k = stringToIntConverter;
        }

        final String a() {
            String str = this.i;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final Map b() {
            dfwv.n(this.i);
            dfwv.n(this.j);
            Map a = this.j.a(this.i);
            dfwv.n(a);
            return a;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            dfwp.b("versionCode", Integer.valueOf(this.a), arrayList);
            dfwp.b("typeIn", Integer.valueOf(this.b), arrayList);
            dfwp.b("typeInArray", Boolean.valueOf(this.c), arrayList);
            dfwp.b("typeOut", Integer.valueOf(this.d), arrayList);
            dfwp.b("typeOutArray", Boolean.valueOf(this.e), arrayList);
            dfwp.b("outputFieldName", this.f, arrayList);
            dfwp.b("safeParcelFieldId", Integer.valueOf(this.g), arrayList);
            dfwp.b("concreteTypeName", a(), arrayList);
            Class cls = this.h;
            if (cls != null) {
                dfwp.b("concreteType.class", cls.getCanonicalName(), arrayList);
            }
            StringToIntConverter stringToIntConverter = this.k;
            if (stringToIntConverter != null) {
                dfwp.b("converterName", stringToIntConverter.getClass().getCanonicalName(), arrayList);
            }
            return dfwp.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = dfxk.a(parcel);
            dfxk.i(parcel, 1, i2);
            dfxk.i(parcel, 2, this.b);
            dfxk.d(parcel, 3, this.c);
            dfxk.i(parcel, 4, this.d);
            dfxk.d(parcel, 5, this.e);
            dfxk.m(parcel, 6, this.f, false);
            dfxk.i(parcel, 7, this.g);
            dfxk.m(parcel, 8, a(), false);
            StringToIntConverter stringToIntConverter = this.k;
            dfxk.k(parcel, 9, stringToIntConverter == null ? null : new ConverterWrapper(stringToIntConverter), i, false);
            dfxk.c(parcel, a);
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
            this.a = 1;
            this.b = i;
            this.c = z;
            this.d = i2;
            this.e = z2;
            this.f = str;
            this.g = i3;
            this.h = cls;
            if (cls == null) {
                this.i = null;
            } else {
                this.i = cls.getCanonicalName();
            }
            this.k = null;
        }
    }

    private static final void d(StringBuilder sb, Field field, Object obj) {
        int i = field.b;
        if (i == 11) {
            Class cls = field.h;
            dfwv.n(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(dfyu.a((String) obj));
            sb.append("\"");
        }
    }

    protected static final Object e(Field field, Object obj) {
        StringToIntConverter stringToIntConverter = field.k;
        if (stringToIntConverter != null) {
            obj = (String) stringToIntConverter.c.get(((Integer) obj).intValue());
            if (obj == null && stringToIntConverter.b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    protected Object a(Field field) {
        String str = field.f;
        if (field.h == null) {
            f();
            return null;
        }
        f();
        dfwv.k(true, "Concrete field shouldn't be value object: %s", field.f);
        boolean z = field.e;
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public abstract Map b();

    protected boolean c(Field field) {
        if (field.d != 11) {
            String str = field.f;
            g();
            return false;
        }
        boolean z = field.e;
        String str2 = field.f;
        if (z) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected abstract void f();

    protected abstract void g();

    public String toString() {
        Map b = b();
        StringBuilder sb = new StringBuilder(100);
        for (String str : b.keySet()) {
            Field field = (Field) b.get(str);
            if (c(field)) {
                Object e = e(field, a(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (e != null) {
                    switch (field.d) {
                        case 8:
                            sb.append("\"");
                            sb.append(dfyk.a((byte[]) e));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(dfyk.b((byte[]) e));
                            sb.append("\"");
                            break;
                        case 10:
                            dfyv.a(sb, (HashMap) e);
                            break;
                        default:
                            if (field.c) {
                                ArrayList arrayList = (ArrayList) e;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        d(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                d(sb, field, e);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
