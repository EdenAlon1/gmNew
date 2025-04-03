package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejnt extends ejoe {
    public Class a;
    public emxc b;
    public ejog c;
    public emxc d;
    public pot e;
    private poj f;
    private emxc g;
    private emxc h;
    private enip i;
    private emxc j;
    private emxc k;
    private emxc l;

    public ejnt() {
        emux emuxVar = emux.a;
        this.b = emuxVar;
        this.d = emuxVar;
        this.g = emuxVar;
        this.h = emuxVar;
        this.j = emuxVar;
        this.k = emuxVar;
        this.l = emuxVar;
    }

    @Override // defpackage.ejoe
    public final ejoi a() {
        poj pojVar;
        ejog ejogVar;
        pot potVar;
        enip enipVar;
        Class cls = this.a;
        if (cls != null && (pojVar = this.f) != null && (ejogVar = this.c) != null && (potVar = this.e) != null && (enipVar = this.i) != null) {
            return new ejnu(cls, pojVar, this.b, ejogVar, this.d, potVar, this.g, this.h, enipVar, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" workerClass");
        }
        if (this.f == null) {
            sb.append(" constraints");
        }
        if (this.c == null) {
            sb.append(" initialDelay");
        }
        if (this.e == null) {
            sb.append(" inputData");
        }
        if (this.i == null) {
            sb.append(" tags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ejoe
    public final void b(emxc emxcVar) {
        this.k = emxcVar;
    }

    @Override // defpackage.ejoe
    public final void c(emxc emxcVar) {
        this.j = emxcVar;
    }

    @Override // defpackage.ejoe
    public final void d(poj pojVar) {
        if (pojVar == null) {
            throw new NullPointerException("Null constraints");
        }
        this.f = pojVar;
    }

    @Override // defpackage.ejoe
    public final void e(ejof ejofVar) {
        this.g = emxc.j(ejofVar);
    }

    @Override // defpackage.ejoe
    public final void f(Set set) {
        this.i = enip.o(set);
    }

    @Override // defpackage.ejoe
    public final void g(ejoh ejohVar) {
        this.h = emxc.j(ejohVar);
    }

    public ejnt(ejoi ejoiVar) {
        emux emuxVar = emux.a;
        this.b = emuxVar;
        this.d = emuxVar;
        this.g = emuxVar;
        this.h = emuxVar;
        this.j = emuxVar;
        this.k = emuxVar;
        this.l = emuxVar;
        ejnu ejnuVar = (ejnu) ejoiVar;
        this.a = ejnuVar.a;
        this.f = ejnuVar.b;
        this.b = ejnuVar.c;
        this.c = ejnuVar.d;
        this.d = ejnuVar.e;
        this.e = ejnuVar.f;
        this.g = ejnuVar.g;
        this.h = ejnuVar.h;
        this.i = ejnuVar.i;
        this.j = ejnuVar.j;
        this.k = ejnuVar.k;
        this.l = ejnuVar.l;
    }
}
