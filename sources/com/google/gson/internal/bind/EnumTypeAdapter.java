package com.google.gson.internal.bind;

import defpackage.evkn;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evlj;
import defpackage.evpj;
import defpackage.evpl;
import defpackage.evpn;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class EnumTypeAdapter extends evlf {
    public static final evlg a = new evlg() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // defpackage.evlg
        public final evlf a(evkn evknVar, evpj evpjVar) {
            Class cls = evpjVar.a;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new EnumTypeAdapter(cls);
        }
    };
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    public EnumTypeAdapter(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String name = r4.name();
                String str = r4.toString();
                evlj evljVar = (evlj) field2.getAnnotation(evlj.class);
                if (evljVar != null) {
                    name = evljVar.a();
                    for (String str2 : evljVar.b()) {
                        this.b.put(str2, r4);
                    }
                }
                this.b.put(name, r4);
                this.c.put(str, r4);
                this.d.put(r4, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        String j = evplVar.j();
        Enum r0 = (Enum) this.b.get(j);
        return r0 != null ? r0 : (Enum) this.c.get(j);
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        Enum r3 = (Enum) obj;
        evpnVar.m(r3 == null ? null : (String) this.d.get(r3));
    }
}
