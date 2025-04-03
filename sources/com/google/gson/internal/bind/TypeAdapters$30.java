package com.google.gson.internal.bind;

import defpackage.evkn;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evpj;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TypeAdapters$30 implements evlg {
    final /* synthetic */ Class a;
    final /* synthetic */ Class b;
    final /* synthetic */ evlf c;

    public TypeAdapters$30(Class cls, Class cls2, evlf evlfVar) {
        this.a = cls;
        this.b = cls2;
        this.c = evlfVar;
    }

    @Override // defpackage.evlg
    public final evlf a(evkn evknVar, evpj evpjVar) {
        Class cls = evpjVar.a;
        if (cls == this.a || cls == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        evlf evlfVar = this.c;
        Class cls = this.a;
        return "Factory[type=" + this.b.getName() + "+" + cls.getName() + ",adapter=" + evlfVar.toString() + "]";
    }
}
