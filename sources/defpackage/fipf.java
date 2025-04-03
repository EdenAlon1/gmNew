package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fipf extends fipy {
    @Override // defpackage.fipy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fipf b() {
        return (fipf) this.e;
    }

    @Override // defpackage.fipy
    protected final void c(fipy fipyVar) {
        if (!(fipyVar instanceof fipf)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.e = fipyVar;
    }
}
