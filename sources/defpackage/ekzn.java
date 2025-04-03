package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ekzn implements elav {
    public final /* synthetic */ elav a;
    public final /* synthetic */ elav b;
    public final /* synthetic */ elat c;

    public /* synthetic */ ekzn(elav elavVar, elav elavVar2, elat elatVar) {
        this.a = elavVar;
        this.b = elavVar2;
        this.c = elatVar;
    }

    @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        elav elavVar = this.b;
        if (elavVar != null) {
            elavVar.close();
        }
        ekyf.g(this.c);
    }
}
