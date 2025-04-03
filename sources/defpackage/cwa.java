package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwa extends ffkk implements ffji {
    final /* synthetic */ cwb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwa(cwb cwbVar) {
        super(1);
        this.a = cwbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        char c;
        long j;
        long j2;
        long j3;
        boolean z;
        cwb cwbVar = this.a;
        cop copVar = cwbVar.i;
        Object[] objArr = copVar.b;
        Object[] objArr2 = copVar.c;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            j = 128;
            j2 = 255;
            loop0: while (true) {
                long j4 = jArr[i];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j4 & 255) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            if (((cvd) objArr2[i4]).k()) {
                                z = true;
                                break loop0;
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        z = false;
        if (z != cwbVar.a()) {
            cwbVar.d.b(Boolean.valueOf(z));
            if (!z) {
                cop copVar2 = cwbVar.i;
                Object[] objArr3 = copVar2.b;
                Object[] objArr4 = copVar2.c;
                long[] jArr2 = copVar2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j5 = jArr2[i5];
                        if ((((~j5) << c) & j5 & j3) != j3) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j5 & j2) < j) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj3 = objArr3[i8];
                                    cvd cvdVar = (cvd) objArr4[i8];
                                    cvdVar.e(cvdVar.d.a() > 1 && cvdVar.j());
                                    cvdVar.f(null);
                                }
                                j5 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        }
                        i5++;
                    }
                }
            }
        }
        cop copVar3 = cwbVar.i;
        Object[] objArr5 = copVar3.b;
        Object[] objArr6 = copVar3.c;
        long[] jArr3 = copVar3.a;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr3[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length3)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j6 & j2) < j) {
                            int i12 = (i9 << 3) + i11;
                            Object obj4 = objArr5[i12];
                            ((cvd) objArr6[i12]).g();
                        }
                        j6 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i9 == length3) {
                    break;
                }
                i9++;
            }
        }
        cwbVar.f();
        return ffcu.a;
    }
}
