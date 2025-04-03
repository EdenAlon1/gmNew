package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhx implements nht {
    private final luv a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public nhx(lvj lvjVar) {
        luv luvVar = lvjVar.a;
        this.a = luvVar;
        luvVar.K(12);
        this.c = luvVar.m() & PrivateKeyType.INVALID;
        this.b = luvVar.m();
    }

    @Override // defpackage.nht
    public final int a() {
        return -1;
    }

    @Override // defpackage.nht
    public final int b() {
        return this.b;
    }

    @Override // defpackage.nht
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.j();
        }
        if (i == 16) {
            return this.a.n();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int j = this.a.j();
        this.e = j;
        return (j & 240) >> 4;
    }
}
