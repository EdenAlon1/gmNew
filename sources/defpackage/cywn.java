package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cywn implements kev {
    final /* synthetic */ kah a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    public cywn(kah kahVar, long j, int i, int i2, int i3, int i4, int i5) {
        this.a = kahVar;
        this.b = j;
        this.c = i;
        this.g = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    @Override // defpackage.kev
    public final long a(kac kacVar, long j, kah kahVar, long j2) {
        int a;
        int b;
        kahVar.getClass();
        if (this.a == kah.b) {
            a = kaa.a(this.b) - this.c;
        } else {
            a = kaa.a(this.b);
        }
        int i = this.g;
        if (i == 4 || i == 3) {
            b = kaa.b(this.b) - this.d;
        } else {
            long j3 = this.b;
            b = (kaa.b(j3) - this.e) + this.f;
        }
        return (b & 4294967295L) | (a << 32);
    }
}
