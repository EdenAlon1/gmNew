package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgk extends htn implements hgl {
    public final ffix a;
    public hgi b = new hgi(hsj.b().v());
    private final hke c;

    public hgk(ffix ffixVar, hke hkeVar) {
        this.a = ffixVar;
        this.c = hkeVar;
    }

    @Override // defpackage.hkx
    public final Object a() {
        ffji k = hsj.b().k();
        if (k != null) {
            k.invoke(this);
        }
        hrw b = hsj.b();
        return b((hgi) hsj.f(this.b, b), b, true, this.a).e;
    }

    public final hgi b(hgi hgiVar, hrw hrwVar, boolean z, ffix ffixVar) {
        hne a;
        hto h;
        hke hkeVar;
        int i;
        char c;
        hgi hgiVar2 = hgiVar;
        byte[] bArr = null;
        if (hgiVar.d(hrwVar)) {
            if (z) {
                a = hkg.a();
                Object[] objArr = a.a;
                int i2 = a.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((hgm) objArr[i3]).b();
                }
                try {
                    cov covVar = hgiVar2.d;
                    hpz hpzVar = (hpz) hkg.a.a();
                    if (hpzVar == null) {
                        hpzVar = new hpz((byte[]) null);
                        hkg.a.b(hpzVar);
                    }
                    int i4 = hpzVar.a;
                    Object[] objArr2 = covVar.b;
                    int[] iArr = covVar.c;
                    long[] jArr = covVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = i5 - length;
                                int i7 = 0;
                                while (true) {
                                    i = 8 - ((~i6) >>> 31);
                                    if (i7 >= i) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        int i8 = (i5 << 3) + i7;
                                        c = '\b';
                                        htm htmVar = (htm) objArr2[i8];
                                        hpzVar.a = iArr[i8] + i4;
                                        ffji k = hrwVar.k();
                                        if (k != null) {
                                            k.invoke(htmVar);
                                        }
                                    } else {
                                        c = '\b';
                                    }
                                    j >>= c;
                                    i7++;
                                }
                                if (i != 8) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    hpzVar.a = i4;
                } finally {
                }
            }
            return hgiVar2;
        }
        cog cogVar = new cog(bArr);
        hpz hpzVar2 = (hpz) hkg.a.a();
        if (hpzVar2 == null) {
            hpzVar2 = new hpz((byte[]) null);
            hkg.a.b(hpzVar2);
        }
        int i9 = hpzVar2.a;
        a = hkg.a();
        Object[] objArr3 = a.a;
        int i10 = a.b;
        for (int i11 = 0; i11 < i10; i11++) {
            ((hgm) objArr3[i11]).b();
        }
        try {
            hpzVar2.a = i9 + 1;
            Object d = hrv.d(new hgj(this, hpzVar2, cogVar, i9), ffixVar);
            hpzVar2.a = i9;
            Object[] objArr4 = a.a;
            int i12 = a.b;
            for (int i13 = 0; i13 < i12; i13++) {
                ((hgm) objArr4[i13]).a();
            }
            synchronized (hsj.c) {
                hrw b = hsj.b();
                Object obj = hgiVar2.e;
                if (obj == hgi.a || (hkeVar = this.c) == null || !hkeVar.a(d, obj)) {
                    hgi hgiVar3 = this.b;
                    synchronized (hsj.c) {
                        h = hsj.h(hgiVar3, this, b);
                    }
                    hgiVar2 = (hgi) h;
                    hgiVar2.d = cogVar;
                    hgiVar2.f = hgiVar2.c(b);
                    hgiVar2.e = d;
                } else {
                    hgiVar2.d = cogVar;
                    hgiVar2.f = hgiVar2.c(b);
                }
            }
            hpz hpzVar3 = (hpz) hkg.a.a();
            if (hpzVar3 == null || hpzVar3.a != 0) {
                return hgiVar2;
            }
            hrv.c();
            synchronized (hsj.c) {
                hrw b2 = hsj.b();
                hgiVar2.b = b2.v();
                hgiVar2.c = b2.h();
            }
            return hgiVar2;
        } finally {
            Object[] objArr5 = a.a;
            int i14 = a.b;
            for (int i15 = 0; i15 < i14; i15++) {
                ((hgm) objArr5[i15]).a();
            }
        }
    }

    @Override // defpackage.hgl
    public final hke c() {
        return this.c;
    }

    @Override // defpackage.htm
    public final hto d() {
        return this.b;
    }

    @Override // defpackage.htm
    public final void e(hto htoVar) {
        htoVar.getClass();
        this.b = (hgi) htoVar;
    }

    @Override // defpackage.hgl
    public final hgi f() {
        hrw b = hsj.b();
        return b((hgi) hsj.f(this.b, b), b, false, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        hgi hgiVar = (hgi) hsj.e(this.b);
        sb.append(hgiVar.d(hsj.b()) ? String.valueOf(hgiVar.e) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
