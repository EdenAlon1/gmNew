package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejtu extends ejtc {
    private volatile transient enip b;

    public ejtu(enip enipVar) {
        super(enipVar);
    }

    @Override // defpackage.ejvi, defpackage.ejuj
    public final enip b() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    enip enipVar = this.a;
                    enin eninVar = new enin();
                    for (Object obj : enipVar) {
                        if (obj instanceof ejuj) {
                            eninVar.j(((ejuj) obj).b());
                        } else {
                            eninVar.c(obj);
                        }
                    }
                    eninVar.c(this);
                    this.b = eninVar.g();
                    if (this.b == null) {
                        throw new NullPointerException("getNotificationKeys() cannot return null");
                    }
                }
            }
        }
        return this.b;
    }
}
