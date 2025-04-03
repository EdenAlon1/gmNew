package com.google.gson.internal.bind;

import com.google.gson.internal.Excluder;
import defpackage.a;
import defpackage.evkf;
import defpackage.evkn;
import defpackage.evku;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evlh;
import defpackage.evmi;
import defpackage.evnb;
import defpackage.evnd;
import defpackage.evnq;
import defpackage.evnu;
import defpackage.evnw;
import defpackage.evpf;
import defpackage.evpj;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ReflectiveTypeAdapterFactory implements evlg {
    private final evmi a;
    private final Excluder b;
    private final JsonAdapterAnnotationTypeAdapterFactory c;
    private final List d;
    private final int e;

    public ReflectiveTypeAdapterFactory(evmi evmiVar, int i, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.a = evmiVar;
        this.e = i;
        this.b = excluder;
        this.c = jsonAdapterAnnotationTypeAdapterFactory;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (true == Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!evnb.a(accessibleObject, obj)) {
            throw new evku(evpf.e(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c1  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.evnv c(defpackage.evkn r29, defpackage.evpj r30, java.lang.Class r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(evkn, evpj, java.lang.Class, boolean, boolean):evnv");
    }

    private static IllegalArgumentException d(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + evpf.d(field) + " and " + evpf.d(field2) + "\nSee " + evnd.a("duplicate-fields"));
    }

    private final boolean e(Field field, boolean z) {
        Excluder excluder = this.b;
        int i = excluder.c;
        if ((field.getModifiers() & 136) != 0) {
            return false;
        }
        double d = excluder.b;
        if (field.isSynthetic()) {
            return false;
        }
        if (excluder.d) {
            evlh evlhVar = (evlh) field.getAnnotation(evlh.class);
            if (evlhVar == null) {
                return false;
            }
            if (z) {
                if (!evlhVar.b()) {
                    return false;
                }
            } else if (!evlhVar.a()) {
                return false;
            }
        }
        if (excluder.c(field.getType(), z)) {
            return false;
        }
        List list = z ? excluder.e : excluder.f;
        if (list.isEmpty()) {
            return true;
        }
        field.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((evkf) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.evlg
    public final evlf a(evkn evknVar, evpj evpjVar) {
        Class cls = evpjVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        if (evpf.h(cls)) {
            return new evnq();
        }
        int b = evnb.b(this.d);
        if (b == 4) {
            throw new evku(a.F(cls, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z = b == 3;
        return evpf.a.c(cls) ? new evnw(cls, c(evknVar, evpjVar, cls, z, true), z) : new evnu(this.a.a(evpjVar), c(evknVar, evpjVar, cls, z, false));
    }
}
