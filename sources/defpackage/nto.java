package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nto {
    public int a;
    private int b;
    private int c;

    public nto() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    public final ntp a() {
        return new ntp(this.a, this.b, this.c);
    }

    public final void b(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public nto(ntp ntpVar) {
        this.a = ntpVar.b;
        this.b = ntpVar.d;
        this.c = ntpVar.e;
    }
}
