package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlac implements dkzw {
    public final dlab a;
    private final dkzw b;

    public dlac(dlab dlabVar, dkzw dkzwVar) {
        this.a = dlabVar;
        this.b = dkzwVar;
    }

    @Override // defpackage.dkzw
    public final Object a(dlfy dlfyVar, ffgu ffguVar) {
        return this.b.a(dlfyVar, ffguVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
