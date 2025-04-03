package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class htd extends ffkk implements ffix {
    final /* synthetic */ hte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htd(hte hteVar) {
        super(0);
        this.a = hteVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        Object[] objArr;
        int i2;
        do {
            hte hteVar = this.a;
            synchronized (hteVar.e) {
                if (!hteVar.c) {
                    hteVar.c = true;
                    try {
                        hne hneVar = hteVar.d;
                        Object[] objArr2 = hneVar.a;
                        int i3 = hneVar.b;
                        int i4 = 0;
                        while (i4 < i3) {
                            hta htaVar = (hta) objArr2[i4];
                            coq coqVar = htaVar.g;
                            ffji ffjiVar = htaVar.a;
                            Object[] objArr3 = coqVar.b;
                            long[] jArr = coqVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    objArr = objArr2;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = i5 - length;
                                        int i7 = 0;
                                        while (true) {
                                            i = i3;
                                            i2 = 8 - ((~i6) >>> 31);
                                            if (i7 >= i2) {
                                                break;
                                            }
                                            if ((j & 255) < 128) {
                                                ffjiVar.invoke(objArr3[(i5 << 3) + i7]);
                                            }
                                            j >>= 8;
                                            i7++;
                                            i3 = i;
                                        }
                                        if (i2 != 8) {
                                            break;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    if (i5 == length) {
                                        break;
                                    }
                                    i5++;
                                    objArr2 = objArr;
                                    i3 = i;
                                }
                            } else {
                                i = i3;
                                objArr = objArr2;
                            }
                            coqVar.a();
                            i4++;
                            objArr2 = objArr;
                            i3 = i;
                        }
                        hteVar.c = false;
                    } finally {
                    }
                }
            }
        } while (this.a.f());
        return ffcu.a;
    }
}
