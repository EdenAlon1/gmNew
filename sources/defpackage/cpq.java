package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpq extends ffev {
    final /* synthetic */ cpo a;
    private int b;

    public cpq(cpo cpoVar) {
        this.a = cpoVar;
    }

    @Override // defpackage.ffev
    public final int a() {
        int i = this.b;
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }
}
