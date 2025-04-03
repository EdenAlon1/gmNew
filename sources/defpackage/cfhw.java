package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfhw implements ceuw {
    final ceuc a;
    final ceva b;
    final /* synthetic */ ceze c;
    final /* synthetic */ String d;
    final /* synthetic */ engw e;
    final /* synthetic */ ceve f;
    final /* synthetic */ cfhx g;

    public cfhw(cfhx cfhxVar, ceze cezeVar, String str, engw engwVar, ceve ceveVar) {
        this.c = cezeVar;
        this.d = str;
        this.e = engwVar;
        this.f = ceveVar;
        this.g = cfhxVar;
        this.a = cfhxVar.o.a(cezeVar);
        this.b = ceva.j(str, engwVar);
    }

    @Override // defpackage.ceuw
    public final ceva a() {
        return this.b;
    }

    @Override // defpackage.ceuw
    public final boolean b() {
        return this.a.d(ceub.CANCELLED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ceuw
    public final boolean c() {
        int i = ((cetj) this.f.a()).d;
        if (!(this.f instanceof ceuj)) {
            return this.c.k() + 1 < i;
        }
        engw engwVar = this.e;
        int size = engwVar.size();
        int i2 = 0;
        while (i2 < size) {
            int k = ((ceze) engwVar.get(i2)).k() + 1;
            i2++;
            if (k < i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ceuw
    public final boolean d(int i) {
        if (i < this.e.size()) {
            return ((ceze) this.e.get(i)).k() + 1 < ((cetj) this.f.a()).d;
        }
        throw new IllegalArgumentException("position " + i + " is out of range [0:" + this.e.size() + "]");
    }
}
