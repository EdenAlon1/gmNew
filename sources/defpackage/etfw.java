package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etfw {
    public boolean a;
    public final etfu b;
    public final etfs c;
    public final etgf d;
    public etfx e;
    public etfy f;

    public etfw(etfs etfsVar) {
        this.b = etfu.a;
        this.e = null;
        this.f = null;
        this.c = etfsVar;
        this.d = null;
    }

    public final void a() {
        etfy etfyVar = this.f;
        if (etfyVar != null) {
            etfyVar.b();
        }
        this.a = true;
    }

    public final void b(int i) {
        this.e = new etfx(i);
    }

    public etfw(etgf etgfVar) {
        this.b = etfu.a;
        this.e = null;
        this.f = null;
        this.c = null;
        this.d = etgfVar;
    }
}
