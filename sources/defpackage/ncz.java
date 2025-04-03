package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncz {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final ncy k;
    private final lrb l;

    public ncz(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, ncy ncyVar, lrb lrbVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = g(i5);
        this.g = i6;
        this.h = i7;
        this.i = f(i7);
        this.j = j;
        this.k = ncyVar;
        this.l = lrbVar;
    }

    private static int f(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final long b(long j) {
        return lvf.q((j * this.e) / 1000000, 0L, this.j - 1);
    }

    public final lqc c(byte[] bArr, lrb lrbVar) {
        bArr[4] = Byte.MIN_VALUE;
        lrb d = d(lrbVar);
        lqb lqbVar = new lqb();
        lqbVar.c("audio/flac");
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        lqbVar.n = i;
        lqbVar.C = this.g;
        lqbVar.D = this.e;
        lqbVar.E = lvf.m(this.h);
        lqbVar.p = Collections.singletonList(bArr);
        lqbVar.k = d;
        return new lqc(lqbVar);
    }

    public final lrb d(lrb lrbVar) {
        lrb lrbVar2 = this.l;
        return lrbVar2 == null ? lrbVar : lrbVar2.d(lrbVar);
    }

    public final ncz e(ncy ncyVar) {
        return new ncz(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, ncyVar, this.l);
    }

    public ncz(byte[] bArr, int i) {
        luu luuVar = new luu(bArr);
        luuVar.l(i * 8);
        this.a = luuVar.d(16);
        this.b = luuVar.d(16);
        this.c = luuVar.d(24);
        this.d = luuVar.d(24);
        int d = luuVar.d(20);
        this.e = d;
        this.f = g(d);
        this.g = luuVar.d(3) + 1;
        int d2 = luuVar.d(5) + 1;
        this.h = d2;
        this.i = f(d2);
        this.j = luuVar.e(36);
        this.k = null;
        this.l = null;
    }
}
