package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkm extends bkn {
    static final bkn a = new bkm(null);
    public final Object b;

    public bkm(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.bkn, java.util.concurrent.Future
    public final Object get() {
        return this.b;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.b + "]]";
    }
}
