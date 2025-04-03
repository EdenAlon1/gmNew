package com.google.gson.internal.bind;

import defpackage.evkn;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evlo;
import defpackage.evmi;
import defpackage.evnn;
import defpackage.evnz;
import defpackage.evpa;
import defpackage.evpj;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MapTypeAdapterFactory implements evlg {
    private final evmi a;

    public MapTypeAdapterFactory(evmi evmiVar) {
        this.a = evmiVar;
    }

    @Override // defpackage.evlg
    public final evlf a(evkn evknVar, evpj evpjVar) {
        Type[] actualTypeArguments;
        Class cls = evpjVar.a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(cls)) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type d = evlo.d(evpjVar.b, cls, Map.class);
            actualTypeArguments = d instanceof ParameterizedType ? ((ParameterizedType) d).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type = actualTypeArguments[0];
        Type type2 = actualTypeArguments[1];
        return new evnn(new evnz(evknVar, (type == Boolean.TYPE || type == Boolean.class) ? evpa.f : evknVar.a(new evpj(type)), type), new evnz(evknVar, evknVar.a(new evpj(type2)), type2), this.a.a(evpjVar));
    }
}
