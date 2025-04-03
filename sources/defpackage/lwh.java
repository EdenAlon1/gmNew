package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lwh implements lwn {
    private final boolean a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private lwv d;

    protected lwh(boolean z) {
        this.a = z;
    }

    @Override // defpackage.lwn
    public /* synthetic */ Map e() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.lwn
    public final void f(lxp lxpVar) {
        lti.f(lxpVar);
        if (this.b.contains(lxpVar)) {
            return;
        }
        this.b.add(lxpVar);
        this.c++;
    }

    protected final void g(int i) {
        lwv lwvVar = this.d;
        int i2 = lvf.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((lxp) this.b.get(i3)).a(lwvVar, this.a, i);
        }
    }

    protected final void h() {
        lwv lwvVar = this.d;
        int i = lvf.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((lxp) this.b.get(i2)).b(lwvVar, this.a);
        }
        this.d = null;
    }

    protected final void i(lwv lwvVar) {
        this.d = lwvVar;
        for (int i = 0; i < this.c; i++) {
            ((lxp) this.b.get(i)).d(lwvVar, this.a);
        }
    }

    protected final void j() {
        for (int i = 0; i < this.c; i++) {
            ((lxp) this.b.get(i)).c();
        }
    }
}
