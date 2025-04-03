package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqgg implements aqge {
    final /* synthetic */ aqge a;
    final /* synthetic */ emwl b;
    final /* synthetic */ Executor c;

    public aqgg(aqge aqgeVar, emwl emwlVar, Executor executor) {
        this.a = aqgeVar;
        this.b = emwlVar;
        this.c = executor;
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        return this.a.a(aqgdVar);
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return this.a.b().h(this.b, this.c);
    }

    @Override // defpackage.aqge
    public final Object c() {
        return this.b.apply(this.a.c());
    }
}
