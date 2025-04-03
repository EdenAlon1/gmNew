package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odv {
    public final ofz a;
    public final Object b;
    public final int c;
    public final int d;

    public odv(ofz ofzVar, Object obj, int i, int i2) {
        ofzVar.getClass();
        this.a = ofzVar;
        this.b = obj;
        this.c = i;
        this.d = i2;
        if (ofzVar != ofz.a && obj == null) {
            throw new IllegalArgumentException("Key must be non-null for prepend/append");
        }
    }
}
