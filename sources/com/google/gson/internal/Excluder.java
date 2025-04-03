package com.google.gson.internal;

import defpackage.evkf;
import defpackage.evkn;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evmj;
import defpackage.evpf;
import defpackage.evpj;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Excluder implements Cloneable, evlg {
    public static final Excluder a = new Excluder();
    public boolean d;
    public final double b = -1.0d;
    public final int c = 136;
    public final List e = Collections.EMPTY_LIST;
    public final List f = Collections.EMPTY_LIST;

    @Override // defpackage.evlg
    public final evlf a(evkn evknVar, evpj evpjVar) {
        Class cls = evpjVar.a;
        boolean c = c(cls, true);
        boolean c2 = c(cls, false);
        if (c || c2) {
            return new evmj(this, c2, c, evknVar, evpjVar);
        }
        return null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean c(Class cls, boolean z) {
        List list;
        if (z) {
            list = this.e;
        } else {
            if (!Enum.class.isAssignableFrom(cls) && evpf.h(cls)) {
                return true;
            }
            list = this.f;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((evkf) it.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
