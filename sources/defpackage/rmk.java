package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rmk extends rmm implements rmi {
    public Set h = null;
    public String i = null;
    public Set j = null;
    public Set k = null;
    public Set l = null;

    protected rmk() {
    }

    @Override // defpackage.rmi
    public final String c() {
        return this.i;
    }

    @Override // defpackage.rmi
    public final Set d() {
        return this.h;
    }

    @Override // defpackage.rmi
    public final Set e() {
        return this.l;
    }

    @Override // defpackage.rmi
    public final Set f() {
        return this.k;
    }

    @Override // defpackage.rmi
    public final Set g() {
        return this.j;
    }

    @Override // defpackage.rmi
    public final void h(String str) {
        this.i = str;
    }

    @Override // defpackage.rmi
    public final void i(Set set) {
        this.h = set;
    }

    @Override // defpackage.rmi
    public final void j(Set set) {
        this.l = set;
    }

    @Override // defpackage.rmi
    public final void k(Set set) {
        this.k = set;
    }

    @Override // defpackage.rmi
    public final void l(Set set) {
        this.j = set;
    }
}
