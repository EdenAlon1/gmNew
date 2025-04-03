package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eneb extends enci {
    final /* synthetic */ ened a;
    private final Object b;
    private int c;

    public eneb(ened enedVar, int i) {
        this.a = enedVar;
        this.b = enedVar.g(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i == -1 || i >= this.a.size() || !emxb.a(this.b, this.a.g(this.c))) {
            this.c = this.a.f(this.b);
        }
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getValue() {
        Map n = this.a.n();
        if (n != null) {
            return n.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.j(i);
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map n = this.a.n();
        if (n != null) {
            return n.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            this.a.put(this.b, obj);
            return null;
        }
        ened enedVar = this.a;
        Object j = enedVar.j(i);
        enedVar.t(this.c, obj);
        return j;
    }
}
