package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enfp extends enci {
    final Object a;
    int b;
    final /* synthetic */ enfy c;

    public enfp(enfy enfyVar, int i) {
        this.c = enfyVar;
        this.a = enfyVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            enfy enfyVar = this.c;
            if (i <= enfyVar.c && emxb.a(enfyVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.c(this.a);
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        if (i == -1) {
            this.c.put(this.a, obj);
            return null;
        }
        Object obj2 = this.c.b[i];
        if (emxb.a(obj2, obj)) {
            return obj;
        }
        this.c.m(this.b, obj);
        return obj2;
    }
}
