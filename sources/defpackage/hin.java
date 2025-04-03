package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hin extends ffkk implements ffji {
    final /* synthetic */ hio a;
    final /* synthetic */ int b;
    final /* synthetic */ cog c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hin(hio hioVar, int i, cog cogVar) {
        super(1);
        this.a = hioVar;
        this.b = i;
        this.c = cogVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        char c;
        hfq hfqVar = (hfq) obj;
        hio hioVar = this.a;
        if (hioVar.e == this.b && ffkj.e(this.c, hioVar.f) && (hfqVar instanceof hfu)) {
            cog cogVar = this.c;
            int i2 = this.b;
            hio hioVar2 = this.a;
            long[] jArr = cogVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = i3 - length;
                        int i5 = 0;
                        while (true) {
                            i = 8 - ((~i4) >>> 31);
                            if (i5 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj2 = cogVar.b[i6];
                                if (cogVar.c[i6] != i2) {
                                    hfu hfuVar = (hfu) hfqVar;
                                    c = '\b';
                                    hni.c(hfuVar.f, obj2, hioVar2);
                                    if (obj2 instanceof hgl) {
                                        hgl hglVar = (hgl) obj2;
                                        if (!hfuVar.f.h(hglVar)) {
                                            hni.b(hfuVar.g, hglVar);
                                        }
                                        cop copVar = hioVar2.g;
                                        if (copVar != null) {
                                            copVar.b(obj2);
                                        }
                                    }
                                    cogVar.b(i6);
                                    j >>= c;
                                    i5++;
                                }
                            }
                            c = '\b';
                            j >>= c;
                            i5++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return ffcu.a;
    }
}
