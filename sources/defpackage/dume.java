package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dume {
    private Object a;
    private volatile boolean b;

    public final Object a(emyl emylVar) {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.a = emylVar.get();
                    this.b = true;
                }
            }
        }
        return this.a;
    }
}
