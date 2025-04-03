package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class okp extends mo {
    final /* synthetic */ oko a;
    final /* synthetic */ oko b;
    final /* synthetic */ mr c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    public okp(oko okoVar, oko okoVar2, mr mrVar, int i, int i2) {
        this.a = okoVar;
        this.b = okoVar2;
        this.c = mrVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.mo
    public final int a() {
        return this.e;
    }

    @Override // defpackage.mo
    public final int b() {
        return this.d;
    }

    @Override // defpackage.mo
    public final Object c(int i, int i2) {
        oko okoVar = this.b;
        Object i3 = this.a.i(i);
        Object i4 = okoVar.i(i2);
        if (i3 == i4) {
            return true;
        }
        return this.c.a(i3, i4);
    }

    @Override // defpackage.mo
    public final boolean d(int i, int i2) {
        oko okoVar = this.b;
        Object i3 = this.a.i(i);
        Object i4 = okoVar.i(i2);
        if (i3 == i4) {
            return true;
        }
        return this.c.b(i3, i4);
    }

    @Override // defpackage.mo
    public final boolean e(int i, int i2) {
        oko okoVar = this.b;
        Object i3 = this.a.i(i);
        Object i4 = okoVar.i(i2);
        if (i3 == i4) {
            return true;
        }
        return this.c.c(i3, i4);
    }
}
