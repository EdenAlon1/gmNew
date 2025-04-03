package com.google.gson.internal.bind;

import defpackage.evkn;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evnp;
import defpackage.evpj;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ObjectTypeAdapter$1 implements evlg {
    final /* synthetic */ int a;

    public ObjectTypeAdapter$1(int i) {
        this.a = i;
    }

    @Override // defpackage.evlg
    public final evlf a(evkn evknVar, evpj evpjVar) {
        if (evpjVar.a == Object.class) {
            return new evnp(evknVar, this.a);
        }
        return null;
    }
}
