package com.google.gson.internal.bind;

import defpackage.evkn;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evpj;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TypeAdapters$29 implements evlg {
    final /* synthetic */ Class a;
    final /* synthetic */ evlf b;

    public TypeAdapters$29(Class cls, evlf evlfVar) {
        this.a = cls;
        this.b = evlfVar;
    }

    @Override // defpackage.evlg
    public final evlf a(evkn evknVar, evpj evpjVar) {
        if (evpjVar.a == this.a) {
            return this.b;
        }
        return null;
    }

    public final String toString() {
        evlf evlfVar = this.b;
        return "Factory[type=" + this.a.getName() + ",adapter=" + evlfVar.toString() + "]";
    }
}
