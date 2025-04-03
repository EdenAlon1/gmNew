package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debl implements dgtt {
    @Override // defpackage.dgtt
    public final void a(dgts dgtsVar) {
        if (csjy.q("EmptyExampleIterator", 4)) {
            csjy.i("EmptyExampleIterator", "next() called");
        }
        dgtsVar.b(null, null);
    }

    @Override // defpackage.dgtt
    public final void b() {
        if (csjy.q("EmptyExampleIterator", 4)) {
            csjy.i("EmptyExampleIterator", "request() called");
        }
    }

    @Override // defpackage.dgtt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (csjy.q("EmptyExampleIterator", 4)) {
            csjy.i("EmptyExampleIterator", "close() called");
        }
    }
}
