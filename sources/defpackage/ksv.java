package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksv extends ksu {
    private final Object a;

    public ksv(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.ksu, defpackage.kst
    public final Object a() {
        Object a;
        synchronized (this.a) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.ksu, defpackage.kst
    public final boolean b(Object obj) {
        boolean b;
        obj.getClass();
        synchronized (this.a) {
            b = super.b(obj);
        }
        return b;
    }
}
