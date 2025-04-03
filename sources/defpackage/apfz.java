package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class apfz implements alxg {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.alxg
    public abstract aqux g();

    @Override // defpackage.alxg
    public final arae h() {
        return (arae) this.a.get();
    }

    @Override // defpackage.alxg
    public final boolean j() {
        aqns q = q();
        return q != null && q.k();
    }

    @Override // defpackage.alxg
    public final boolean k() {
        aqns q = q();
        return q != null && q.e();
    }

    @Override // defpackage.alxg
    public final boolean m() {
        aqns q = q();
        return q != null && q.j();
    }

    public abstract alxi o();

    public abstract amtc p();

    public abstract aqns q();

    public abstract azcr r();

    public abstract engw s();

    public abstract eoxo t();

    public abstract boolean u();

    public abstract int v();
}
