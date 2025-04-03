package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpd extends hoz {
    private final hom c;

    public hpd(hom homVar) {
        this.c = homVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new hog(this.c, objArr[i], objArr[i + 1]);
    }
}
