package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elcn extends elas {
    final /* synthetic */ elat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elcn(ekzz ekzzVar, elat elatVar) {
        super(ekzzVar);
        this.b = elatVar;
    }

    @Override // defpackage.elas, defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        elat elatVar = this.b;
        if (elatVar != null) {
            ekyf.g(elatVar);
        }
    }
}
