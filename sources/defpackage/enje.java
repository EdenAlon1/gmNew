package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enje extends enip {
    public abstract Object a(int i);

    @Override // defpackage.engi
    public final int c(Object[] objArr, int i) {
        return g().c(objArr, i);
    }

    @Override // defpackage.enip
    public final engw h() {
        return new enjd(this);
    }

    @Override // defpackage.enip, defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public enqu listIterator() {
        return g().iterator();
    }

    @Override // defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
