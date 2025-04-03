package defpackage;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter$1;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters$29;
import com.google.gson.internal.bind.TypeAdapters$30;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evkn {
    static final evkh a = evkh.a;
    static final int d = 1;
    static final int e = 1;
    static final int f = 2;
    public static final /* synthetic */ int g = 0;
    final List b;
    final evkh c;
    private final ThreadLocal h;
    private final ConcurrentMap i;
    private final evmi j;
    private final JsonAdapterAnnotationTypeAdapterFactory k;

    static {
        try {
            Class.forName("eyhs");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public evkn() {
        /*
            r9 = this;
            com.google.gson.internal.Excluder r1 = com.google.gson.internal.Excluder.a
            int r2 = defpackage.evkn.d
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            evkh r4 = defpackage.evkn.a
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            int r6 = defpackage.evkn.e
            int r7 = defpackage.evkn.f
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evkn.<init>():void");
    }

    static void l(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static final evpl n(Reader reader) {
        evpl evplVar = new evpl(reader);
        evplVar.u(2);
        return evplVar;
    }

    public static final void o(evkt evktVar, evpn evpnVar) {
        int i = evpnVar.d;
        boolean z = evpnVar.b;
        boolean z2 = evpnVar.c;
        evpnVar.b = true;
        evpnVar.c = false;
        if (i == 2) {
            evpnVar.d(1);
        }
        try {
            try {
                evnc.b(evktVar, evpnVar);
            } catch (IOException e2) {
                throw new evku(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.12.1): " + e3.getMessage(), e3);
            }
        } finally {
            evpnVar.d(i);
            evpnVar.b = z;
            evpnVar.c = z2;
        }
    }

    public final evlf a(evpj evpjVar) {
        boolean z;
        evlf evlfVar = (evlf) this.i.get(evpjVar);
        if (evlfVar != null) {
            return evlfVar;
        }
        Map map = (Map) this.h.get();
        boolean z2 = false;
        if (map == null) {
            map = new HashMap();
            this.h.set(map);
            z = true;
        } else {
            evlf evlfVar2 = (evlf) map.get(evpjVar);
            if (evlfVar2 != null) {
                return evlfVar2;
            }
            z = false;
        }
        try {
            evkm evkmVar = new evkm();
            map.put(evpjVar, evkmVar);
            Iterator it = this.b.iterator();
            evlf evlfVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                evlfVar3 = ((evlg) it.next()).a(this, evpjVar);
                if (evlfVar3 != null) {
                    if (evkmVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    evkmVar.a = evlfVar3;
                    map.put(evpjVar, evlfVar3);
                }
            }
            if (z) {
                this.h.remove();
                z2 = true;
            }
            if (evlfVar3 == null) {
                throw new IllegalArgumentException("GSON (2.12.1) cannot handle ".concat(evpjVar.toString()));
            }
            if (z2) {
                this.i.putAll(map);
            }
            return evlfVar3;
        } catch (Throwable th) {
            if (z) {
                this.h.remove();
            }
            throw th;
        }
    }

    public final evlf b(Class cls) {
        return a(new evpj(cls));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0034, code lost:
    
        if (r0.c(r1, (defpackage.evlg) com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.e(r0.b, r2)) == r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r2 == r5) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.evlf c(defpackage.evlg r5, defpackage.evpj r6) {
        /*
            r4 = this;
            evlg r0 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.a
            if (r5 != r0) goto L5
            goto L36
        L5:
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r0 = r4.k
            java.lang.Class r1 = r6.a
            java.util.concurrent.ConcurrentMap r2 = r0.c
            java.lang.Object r2 = r2.get(r1)
            evlg r2 = (defpackage.evlg) r2
            if (r2 == 0) goto L16
            if (r2 != r5) goto L38
            goto L36
        L16:
            evli r2 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.d(r1)
            if (r2 == 0) goto L38
            java.lang.Class r2 = r2.a()
            java.lang.Class<evlg> r3 = defpackage.evlg.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L38
            evmi r3 = r0.b
            java.lang.Object r2 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.e(r3, r2)
            evlg r2 = (defpackage.evlg) r2
            evlg r0 = r0.c(r1, r2)
            if (r0 != r5) goto L38
        L36:
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r5 = r4.k
        L38:
            java.util.List r0 = r4.b
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L3f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r0.next()
            evlg r2 = (defpackage.evlg) r2
            if (r1 != 0) goto L51
            if (r2 != r5) goto L3f
            r1 = 1
            goto L3f
        L51:
            evlf r2 = r2.a(r4, r6)
            if (r2 == 0) goto L3f
            return r2
        L58:
            if (r1 != 0) goto L5f
            evlf r5 = r4.a(r6)
            return r5
        L5f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            java.lang.String r6 = r0.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evkn.c(evlg, evpj):evlf");
    }

    public final evpn d(Writer writer) {
        evpn evpnVar = new evpn(writer);
        evpnVar.b(this.c);
        evpnVar.b = true;
        evpnVar.d(2);
        evpnVar.c = false;
        return evpnVar;
    }

    public final Object e(evpl evplVar, evpj evpjVar) {
        Object obj;
        int i = evplVar.i;
        boolean z = true;
        if (i == 2) {
            evplVar.u(1);
        }
        try {
            try {
                try {
                    try {
                        evplVar.t();
                    } catch (EOFException e2) {
                        e = e2;
                    }
                    try {
                        obj = a(evpjVar).a(evplVar);
                    } catch (EOFException e3) {
                        e = e3;
                        z = false;
                        if (!z) {
                            throw new evlb(e);
                        }
                        obj = null;
                        return obj;
                    }
                    return obj;
                } finally {
                    evplVar.u(i);
                }
            } catch (IllegalStateException e4) {
                throw new evlb(e4);
            }
        } catch (IOException e5) {
            throw new evlb(e5);
        } catch (AssertionError e6) {
            throw new AssertionError("AssertionError (GSON 2.12.1): " + e6.getMessage(), e6);
        }
    }

    public final Object f(Reader reader, evpj evpjVar) {
        evpl n = n(reader);
        Object e2 = e(n, evpjVar);
        if (e2 != null) {
            try {
                if (n.t() != 10) {
                    throw new evlb("JSON document was not fully consumed.");
                }
            } catch (evpo e3) {
                throw new evlb(e3);
            } catch (IOException e4) {
                throw new evku(e4);
            }
        }
        return e2;
    }

    public final Object g(Reader reader, Class cls) {
        return evmx.a(cls).cast(f(reader, new evpj(cls)));
    }

    public final Object h(String str, evpj evpjVar) {
        if (str == null) {
            return null;
        }
        return f(new StringReader(str), evpjVar);
    }

    public final Object i(String str, Class cls) {
        return evmx.a(cls).cast(h(str, new evpj(cls)));
    }

    public final Object j(String str, Type type) {
        return h(str, new evpj(type));
    }

    public final String k(Object obj) {
        if (obj == null) {
            evkv evkvVar = evkv.a;
            StringWriter stringWriter = new StringWriter();
            try {
                o(evkvVar, d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new evku(e2);
            }
        }
        StringWriter stringWriter2 = new StringWriter();
        try {
            m(obj, obj.getClass(), d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e3) {
            throw new evku(e3);
        }
    }

    public final void m(Object obj, Type type, evpn evpnVar) {
        evlf a2 = a(new evpj(type));
        int i = evpnVar.d;
        if (i == 2) {
            evpnVar.d(1);
        }
        boolean z = evpnVar.b;
        boolean z2 = evpnVar.c;
        evpnVar.b = true;
        evpnVar.c = false;
        try {
            try {
                a2.b(evpnVar, obj);
            } catch (IOException e2) {
                throw new evku(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.12.1): " + e3.getMessage(), e3);
            }
        } finally {
            evpnVar.d(i);
            evpnVar.b = z;
            evpnVar.c = z2;
        }
    }

    public final String toString() {
        evmi evmiVar = this.j;
        return "{serializeNulls:false,factories:" + String.valueOf(this.b) + ",instanceCreators:" + evmiVar.toString() + "}";
    }

    public evkn(Excluder excluder, int i, Map map, evkh evkhVar, List list, int i2, int i3, List list2) {
        this.h = new ThreadLocal();
        this.i = new ConcurrentHashMap();
        evmi evmiVar = new evmi(map, list2);
        this.j = evmiVar;
        this.c = evkhVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(evpa.U);
        arrayList.add(i2 == 1 ? evnp.a : new ObjectTypeAdapter$1(0));
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(evpa.A);
        arrayList.add(evpa.m);
        arrayList.add(evpa.g);
        arrayList.add(evpa.i);
        arrayList.add(evpa.k);
        evlf evlfVar = evpa.t;
        arrayList.add(new TypeAdapters$30(Long.TYPE, Long.class, evlfVar));
        arrayList.add(new TypeAdapters$30(Double.TYPE, Double.class, new evki()));
        arrayList.add(new TypeAdapters$30(Float.TYPE, Float.class, new evkj()));
        arrayList.add(i3 == 2 ? evno.a : evno.c(i3));
        arrayList.add(evpa.o);
        arrayList.add(evpa.q);
        arrayList.add(new TypeAdapters$29(AtomicLong.class, new evkk(evlfVar).d()));
        arrayList.add(new TypeAdapters$29(AtomicLongArray.class, new evkl(evlfVar).d()));
        arrayList.add(evpa.s);
        arrayList.add(evpa.v);
        arrayList.add(evpa.C);
        arrayList.add(evpa.E);
        arrayList.add(new TypeAdapters$29(BigDecimal.class, evpa.x));
        arrayList.add(new TypeAdapters$29(BigInteger.class, evpa.y));
        arrayList.add(new TypeAdapters$29(evmm.class, evpa.z));
        arrayList.add(evpa.G);
        arrayList.add(evpa.I);
        arrayList.add(evpa.M);
        arrayList.add(evpa.O);
        arrayList.add(evpa.S);
        arrayList.add(evpa.K);
        arrayList.add(evpa.d);
        arrayList.add(DefaultDateTypeAdapter.a);
        arrayList.add(evpa.Q);
        if (evpi.a) {
            arrayList.add(evpi.c);
            arrayList.add(evpi.b);
            arrayList.add(evpi.d);
        }
        arrayList.add(ArrayTypeAdapter.a);
        arrayList.add(evpa.b);
        arrayList.add(new CollectionTypeAdapterFactory(evmiVar));
        arrayList.add(new MapTypeAdapterFactory(evmiVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(evmiVar);
        this.k = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(evpa.V);
        arrayList.add(new ReflectiveTypeAdapterFactory(evmiVar, i, excluder, jsonAdapterAnnotationTypeAdapterFactory, list2));
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }
}
