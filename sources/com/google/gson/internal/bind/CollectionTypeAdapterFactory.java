package com.google.gson.internal.bind;

import defpackage.evkn;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evlo;
import defpackage.evmi;
import defpackage.evnj;
import defpackage.evnz;
import defpackage.evpj;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CollectionTypeAdapterFactory implements evlg {
    private final evmi a;

    public CollectionTypeAdapterFactory(evmi evmiVar) {
        this.a = evmiVar;
    }

    @Override // defpackage.evlg
    public final evlf a(evkn evknVar, evpj evpjVar) {
        Class cls = evpjVar.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type d = evlo.d(evpjVar.b, cls, Collection.class);
        Class cls2 = d instanceof ParameterizedType ? ((ParameterizedType) d).getActualTypeArguments()[0] : Object.class;
        return new evnj(new evnz(evknVar, evknVar.a(new evpj(cls2)), cls2), this.a.a(evpjVar));
    }
}
