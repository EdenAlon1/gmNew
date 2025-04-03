package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enfq extends enci {
    final enfy a;
    final Object b;
    int c;

    public enfq(enfy enfyVar, int i) {
        this.a = enfyVar;
        this.b = enfyVar.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            enfy enfyVar = this.a;
            if (i <= enfyVar.c && emxb.a(this.b, enfyVar.b[i])) {
                return;
            }
        }
        this.c = this.a.e(this.b);
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.a[i];
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            this.a.k(this.b, obj);
            return null;
        }
        Object obj2 = this.a.a[i];
        if (emxb.a(obj2, obj)) {
            return obj;
        }
        this.a.l(this.c, obj);
        return obj2;
    }
}
