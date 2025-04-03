package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rmj extends rmm implements rml, rmi {
    public List i = new ArrayList();
    public Set j = null;
    public String k = null;
    public Set l = null;
    public Set m = null;

    protected rmj() {
    }

    @Override // defpackage.rml
    public void b(rmp rmpVar) {
        this.i.add(rmpVar);
    }

    @Override // defpackage.rmi
    public final String c() {
        return this.k;
    }

    @Override // defpackage.rmi
    public final Set d() {
        return this.j;
    }

    @Override // defpackage.rmi
    public final Set e() {
        return this.m;
    }

    @Override // defpackage.rmi
    public final Set f() {
        return this.l;
    }

    @Override // defpackage.rmi
    public final Set g() {
        return null;
    }

    @Override // defpackage.rmi
    public final void h(String str) {
        this.k = str;
    }

    @Override // defpackage.rmi
    public final void i(Set set) {
        this.j = set;
    }

    @Override // defpackage.rmi
    public final void j(Set set) {
        this.m = set;
    }

    @Override // defpackage.rmi
    public final void k(Set set) {
        this.l = set;
    }

    @Override // defpackage.rml
    public final List n() {
        return this.i;
    }

    @Override // defpackage.rmi
    public final void l(Set set) {
    }
}
