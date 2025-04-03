package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpa extends hoz {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new hof(objArr[i], objArr[i + 1]);
    }
}
