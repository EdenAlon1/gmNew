package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edcl implements emyl {
    boolean a;
    Object b;
    final /* synthetic */ emyl c;

    public edcl(emyl emylVar) {
        this.c = emylVar;
    }

    @Override // defpackage.emyl
    public final Object get() {
        if (this.a) {
            return this.b;
        }
        Object obj = this.c.get();
        this.b = obj;
        this.a = true;
        return obj;
    }
}
