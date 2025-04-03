package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejza {
    public final ejvw a;
    public ejyz b;
    public ejxm c;
    public boolean d = false;
    public boolean e = false;
    private final Executor f;

    public ejza(ejvw ejvwVar, Executor executor) {
        this.a = ejvwVar;
        this.f = executor;
    }

    final void a(ejxi ejxiVar) {
        efbd.c();
        emxf.l(!this.e);
        ejyz ejyzVar = this.b;
        if (ejyzVar != null) {
            ejyzVar.close();
            ejvw ejvwVar = this.a;
            ejyz ejyzVar2 = this.b;
            ejvwVar.e(ejyzVar2.a, ejyzVar2);
        }
        ejyz ejyzVar3 = new ejyz(this, ejxiVar, this.f);
        this.b = ejyzVar3;
        this.a.d(ejyzVar3.a, ejyzVar3);
    }
}
