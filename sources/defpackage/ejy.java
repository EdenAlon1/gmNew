package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejy {
    public final Object a;
    public int c;
    public boolean d;
    public ejy f;
    private final ekd g;
    public int b = -1;
    public final hho e = new hic(null, hla.a);

    public ejy(Object obj, ekd ekdVar) {
        this.a = obj;
        this.g = ekdVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        if (this.c <= 0) {
            dwv.d("Release should only be called once");
        }
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.g.a.remove(this);
            ejy ejyVar = this.f;
            if (ejyVar != null) {
                ejyVar.a();
            }
            this.f = null;
        }
    }

    public final ejy b() {
        return (ejy) this.e.a();
    }

    public final void c() {
        if (this.d) {
            dwv.d("Pin should not be called on an already disposed item ");
        }
        if (this.c == 0) {
            this.g.a.add(this);
            ejy b = b();
            if (b != null) {
                b.c();
            } else {
                b = null;
            }
            this.f = b;
        }
        this.c++;
    }
}
