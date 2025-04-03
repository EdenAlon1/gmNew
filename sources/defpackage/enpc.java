package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enpc extends enie {
    static final enpc a = new enpc(new enoj());
    final transient enoj b;
    private final transient int c;
    private transient enip d;

    public enpc(enoj enojVar) {
        this.b = enojVar;
        long j = 0;
        for (int i = 0; i < enojVar.c; i++) {
            j += enojVar.c(i);
        }
        this.c = ermn.g(j);
    }

    @Override // defpackage.enny
    public final int b(Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.engi
    public final boolean l() {
        return false;
    }

    @Override // defpackage.enie, defpackage.enny
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final enip i() {
        enip enipVar = this.d;
        if (enipVar != null) {
            return enipVar;
        }
        enpa enpaVar = new enpa(this);
        this.d = enpaVar;
        return enpaVar;
    }

    @Override // defpackage.enie
    public final ennx p(int i) {
        return this.b.h(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.enny
    public final int size() {
        return this.c;
    }

    @Override // defpackage.enie, defpackage.engi
    public Object writeReplace() {
        return new enpb(this);
    }
}
