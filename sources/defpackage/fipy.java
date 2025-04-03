package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fipy {
    public fipy e = null;
    public fipy f = null;
    public fipy g = null;
    public fipy h = null;
    public fipy i = null;
    private List a = null;

    public fipy b() {
        return this.e;
    }

    protected void c(fipy fipyVar) {
        this.e = fipyVar;
    }

    public abstract void d(fiqk fiqkVar);

    public final List e() {
        List list = this.a;
        return list != null ? DesugarCollections.unmodifiableList(list) : Collections.EMPTY_LIST;
    }

    public final void f(fiqf fiqfVar) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(fiqfVar);
    }

    public final void g(fipy fipyVar) {
        fipyVar.j();
        fipyVar.c(this);
        fipy fipyVar2 = this.g;
        if (fipyVar2 != null) {
            fipyVar2.i = fipyVar;
            fipyVar.h = fipyVar2;
        } else {
            this.f = fipyVar;
        }
        this.g = fipyVar;
    }

    public final void h(fipy fipyVar) {
        fipyVar.j();
        fipy fipyVar2 = this.i;
        fipyVar.i = fipyVar2;
        if (fipyVar2 != null) {
            fipyVar2.h = fipyVar;
        }
        fipyVar.h = this;
        this.i = fipyVar;
        fipy fipyVar3 = this.e;
        fipyVar.e = fipyVar3;
        if (fipyVar.i == null) {
            fipyVar3.g = fipyVar;
        }
    }

    public final void i(List list) {
        if (list.isEmpty()) {
            this.a = null;
        } else {
            this.a = new ArrayList(list);
        }
    }

    public final void j() {
        fipy fipyVar = this.h;
        if (fipyVar != null) {
            fipyVar.i = this.i;
        } else {
            fipy fipyVar2 = this.e;
            if (fipyVar2 != null) {
                fipyVar2.f = this.i;
            }
        }
        fipy fipyVar3 = this.i;
        if (fipyVar3 != null) {
            fipyVar3.h = fipyVar;
        } else {
            fipy fipyVar4 = this.e;
            if (fipyVar4 != null) {
                fipyVar4.g = fipyVar;
            }
        }
        this.e = null;
        this.i = null;
        this.h = null;
    }

    protected String k() {
        return "";
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + k() + "}";
    }
}
