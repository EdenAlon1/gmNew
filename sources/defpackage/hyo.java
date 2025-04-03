package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class hyo extends ffkh implements ffix {
    public hyo(Object obj) {
        super(0, obj, hyp.class, "invalidateNodes", "invalidateNodes()V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [isw, java.lang.Object] */
    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ivu ivuVar;
        char c;
        long j;
        char c2;
        long j2;
        hyp hypVar = (hyp) this.g;
        ?? a = ((ffkl) hypVar.b).a();
        char c3 = 7;
        long j3 = -9187201950435737472L;
        if (a == 0) {
            coq coqVar = hypVar.d;
            Object[] objArr = coqVar.b;
            long[] jArr = coqVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j4 = jArr[i];
                    if ((((~j4) << c3) & j4 & j3) != j3) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (i3 < i2) {
                            if ((j4 & 255) < 128) {
                                c2 = c3;
                                j2 = j3;
                                ((hyk) objArr[(i << 3) + i3]).dP(hzo.d);
                            } else {
                                c2 = c3;
                                j2 = j3;
                            }
                            j4 >>= 8;
                            i3++;
                            c3 = c2;
                            j3 = j2;
                        }
                        c = c3;
                        j = j3;
                        if (i2 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j3;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                    c3 = c;
                    j3 = j;
                }
            }
        } else {
            hvh hvhVar = (hvh) a;
            if (hvhVar.z) {
                if (hypVar.c.j(a)) {
                    ((FocusTargetNode) a).i();
                }
                if (!hvhVar.p.z) {
                    imn.c("visitAncestors called on an unattached node");
                }
                hvh hvhVar2 = hvhVar.p;
                iui d = isx.d(a);
                boolean z = false;
                while (d != null) {
                    if ((d.x.e.r & 5120) != 0) {
                        while (hvhVar2 != null) {
                            if ((hvhVar2.q & 5120) != 0) {
                                if ((hvhVar2 instanceof FocusTargetNode) && hvhVar2 != a) {
                                    z = true;
                                }
                                if ((hvhVar2 instanceof hyk) && hypVar.d.j(hvhVar2)) {
                                    if (z) {
                                        ((hyk) hvhVar2).dP(hzo.b);
                                    } else {
                                        ((hyk) hvhVar2).dP(((FocusTargetNode) a).g());
                                    }
                                    hypVar.d.i(hvhVar2);
                                }
                            }
                            hvhVar2 = hvhVar2.s;
                        }
                    }
                    d = d.u();
                    hvhVar2 = null;
                    if (d != null && (ivuVar = d.x) != null) {
                        hvhVar2 = ivuVar.d;
                    }
                }
                coq coqVar2 = hypVar.d;
                Object[] objArr2 = coqVar2.b;
                long[] jArr2 = coqVar2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j5 = jArr2[i4];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length2)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j5 & 255) < 128) {
                                    ((hyk) objArr2[(i4 << 3) + i6]).dP(hzo.d);
                                }
                                j5 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length2) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        hypVar.a.invoke();
        hypVar.c.a();
        hypVar.d.a();
        hypVar.e = false;
        return ffcu.a;
    }
}
