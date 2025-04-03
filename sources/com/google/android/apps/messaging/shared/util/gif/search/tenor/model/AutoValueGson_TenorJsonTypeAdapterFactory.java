package com.google.android.apps.messaging.shared.util.gif.search.tenor.model;

import defpackage.csxd;
import defpackage.csxf;
import defpackage.csxh;
import defpackage.csxj;
import defpackage.csxl;
import defpackage.csxn;
import defpackage.csxo;
import defpackage.csxp;
import defpackage.csxq;
import defpackage.csxr;
import defpackage.evkn;
import defpackage.evlf;
import defpackage.evpj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoValueGson_TenorJsonTypeAdapterFactory extends TenorJsonTypeAdapterFactory {
    @Override // defpackage.evlg
    public final evlf a(evkn evknVar, evpj evpjVar) {
        Class cls = evpjVar.a;
        if (csxn.class.isAssignableFrom(cls)) {
            return new csxd(evknVar);
        }
        if (csxo.class.isAssignableFrom(cls)) {
            return new csxf(evknVar);
        }
        if (csxp.class.isAssignableFrom(cls)) {
            return new csxh(evknVar);
        }
        if (csxq.class.isAssignableFrom(cls)) {
            return new csxj(evknVar);
        }
        if (csxr.class.isAssignableFrom(cls)) {
            return new csxl(evknVar);
        }
        return null;
    }
}
