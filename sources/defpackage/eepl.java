package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepl {
    public Boolean a;
    private final engr b;
    private final engr c;
    private boolean d;

    public eepl() {
        int i = engw.d;
        this.b = new engr();
        this.c = new engr();
        this.d = false;
    }

    public final eepm a() {
        this.a.getClass();
        return new eepm(this.a.booleanValue(), this.d, this.b.g(), this.c.g());
    }

    public final void b(eepr eeprVar) {
        this.a.getClass();
        this.b.h(eeprVar);
    }

    public final void c() {
        this.d = true;
    }

    public final void d() {
        emxf.m(this.a == null, "A SourcePolicy can only set internal() or external() once.");
        this.a = false;
    }
}
