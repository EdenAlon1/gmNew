package com.google.gson.internal.bind;

import defpackage.evkn;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evlo;
import defpackage.evnz;
import defpackage.evpj;
import defpackage.evpl;
import defpackage.evpn;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ArrayTypeAdapter extends evlf {
    public static final evlg a = new evlg() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // defpackage.evlg
        public final evlf a(evkn evknVar, evpj evpjVar) {
            Type genericComponentType;
            Type type = evpjVar.b;
            if (type instanceof GenericArrayType) {
                genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                if (!(type instanceof Class)) {
                    return null;
                }
                Class cls = (Class) type;
                if (!cls.isArray()) {
                    return null;
                }
                genericComponentType = cls.getComponentType();
            }
            return new ArrayTypeAdapter(evknVar, evknVar.a(new evpj(genericComponentType)), evlo.a(genericComponentType));
        }
    };
    private final Class b;
    private final evlf c;

    public ArrayTypeAdapter(evkn evknVar, evlf evlfVar, Class cls) {
        this.c = new evnz(evknVar, evlfVar, cls);
        this.b = cls;
    }

    @Override // defpackage.evlf
    public final Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        evplVar.l();
        while (evplVar.r()) {
            arrayList.add(this.c.a(evplVar));
        }
        evplVar.n();
        int size = arrayList.size();
        if (!this.b.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.b, size));
        }
        Object newInstance = Array.newInstance((Class<?>) this.b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // defpackage.evlf
    public final void b(evpn evpnVar, Object obj) {
        if (obj == null) {
            evpnVar.j();
            return;
        }
        evpnVar.e();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.b(evpnVar, Array.get(obj, i));
        }
        evpnVar.g();
    }
}
