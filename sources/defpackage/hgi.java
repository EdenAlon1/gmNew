package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgi extends hto {
    public static final Object a = new Object();
    public long b;
    public int c;
    public cov d;
    public Object e;
    public int f;

    public hgi(long j) {
        super(j);
        this.d = cow.a();
        this.e = a;
    }

    @Override // defpackage.hto
    public final hto a(long j) {
        return new hgi(j);
    }

    @Override // defpackage.hto
    public final void b(hto htoVar) {
        htoVar.getClass();
        hgi hgiVar = (hgi) htoVar;
        this.d = hgiVar.d;
        this.e = hgiVar.e;
        this.f = hgiVar.f;
    }

    public final int c(hrw hrwVar) {
        cov covVar;
        long[] jArr;
        int i;
        int i2;
        char c;
        long[] jArr2;
        hto b;
        synchronized (hsj.c) {
            covVar = this.d;
        }
        int i3 = 7;
        if (!covVar.i()) {
            return 7;
        }
        hne a2 = hkg.a();
        Object[] objArr = a2.a;
        int i4 = a2.b;
        for (int i5 = 0; i5 < i4; i5++) {
            ((hgm) objArr[i5]).b();
        }
        try {
            Object[] objArr2 = covVar.b;
            int[] iArr = covVar.c;
            long[] jArr3 = covVar.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 7;
                int i7 = 0;
                while (true) {
                    long j = jArr3[i7];
                    if ((((~j) << i3) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = i7 - length;
                        int i9 = 0;
                        while (true) {
                            i = i3;
                            i2 = 8 - ((~i8) >>> 31);
                            if (i9 >= i2) {
                                break;
                            }
                            if ((j & 255) < 128) {
                                int i10 = (i7 << 3) + i9;
                                c = '\b';
                                htm htmVar = (htm) objArr2[i10];
                                if (iArr[i10] == 1) {
                                    if (htmVar instanceof hgk) {
                                        try {
                                            hgk hgkVar = (hgk) htmVar;
                                            b = hgkVar.b((hgi) hsj.f(hgkVar.b, hrwVar), hrwVar, false, hgkVar.a);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = a2.a;
                                            int i11 = a2.b;
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                ((hgm) objArr3[i12]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        b = hsj.f(htmVar.d(), hrwVar);
                                    }
                                    int identityHashCode = ((i6 * 31) + System.identityHashCode(b)) * 31;
                                    jArr2 = jArr3;
                                    long j2 = b.g;
                                    i6 = identityHashCode + ((int) (j2 ^ (j2 >>> 32)));
                                    j >>= c;
                                    i9++;
                                    jArr3 = jArr2;
                                    i3 = i;
                                }
                            } else {
                                c = '\b';
                            }
                            jArr2 = jArr3;
                            j >>= c;
                            i9++;
                            jArr3 = jArr2;
                            i3 = i;
                        }
                        jArr = jArr3;
                        if (i2 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i = i3;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    jArr3 = jArr;
                    i3 = i;
                }
                i3 = i6;
            }
            Object[] objArr4 = a2.a;
            int i13 = a2.b;
            for (int i14 = 0; i14 < i13; i14++) {
                ((hgm) objArr4[i14]).a();
            }
            return i3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean d(hrw hrwVar) {
        boolean z;
        boolean z2;
        synchronized (hsj.c) {
            z = false;
            if (this.b == hrwVar.v()) {
                if (this.c == hrwVar.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.e != a && (!z2 || this.f == c(hrwVar))) {
            z = true;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (hsj.c) {
            this.b = hrwVar.v();
            this.c = hrwVar.h();
        }
        return z;
    }
}
