package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class csgy extends RuntimeException {
    public final csgx b;
    public final int c;

    protected csgy(int i, csgx csgxVar) {
        this.c = i;
        this.b = csgxVar;
    }

    public int a() {
        return 1;
    }

    protected csgy(int i, csgx csgxVar, String str) {
        super(str);
        this.c = i;
        this.b = csgxVar;
    }

    protected csgy(int i, csgx csgxVar, String str, Throwable th) {
        super(str, th);
        this.c = i;
        this.b = csgxVar;
    }

    protected csgy(int i, csgx csgxVar, Throwable th) {
        super(th);
        this.c = i;
        this.b = csgxVar;
    }
}
