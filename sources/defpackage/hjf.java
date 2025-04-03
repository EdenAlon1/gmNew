package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjf extends ffhv implements ffjn {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    int i;
    /* synthetic */ Object j;
    final /* synthetic */ hjh k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjf(hjh hjhVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.k = hjhVar;
    }

    public static final void d(hjh hjhVar, List list, List list2, List list3, coq coqVar, coq coqVar2, coq coqVar3, coq coqVar4) {
        char c;
        long j;
        long j2;
        synchronized (hjhVar.d) {
            list.clear();
            list2.clear();
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                hgh hghVar = (hgh) list3.get(i);
                hghVar.g();
                hjhVar.y(hghVar);
            }
            list3.clear();
            Object[] objArr = coqVar.b;
            long[] jArr = coqVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                j = 255;
                while (true) {
                    long j3 = jArr[i2];
                    c = 7;
                    j2 = -9187201950435737472L;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j3 & 255) < 128) {
                                hgh hghVar2 = (hgh) objArr[(i2 << 3) + i4];
                                hghVar2.g();
                                hjhVar.y(hghVar2);
                            }
                            j3 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            } else {
                c = 7;
                j = 255;
                j2 = -9187201950435737472L;
            }
            coqVar.a();
            Object[] objArr2 = coqVar2.b;
            long[] jArr2 = coqVar2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j4 = jArr2[i5];
                    if ((((~j4) << c) & j4 & j2) != j2) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & j) < 128) {
                                ((hgh) objArr2[(i5 << 3) + i7]).k();
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            coqVar2.a();
            coqVar3.a();
            Object[] objArr3 = coqVar4.b;
            long[] jArr3 = coqVar4.a;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i8 = 0;
                while (true) {
                    long j5 = jArr3[i8];
                    if ((((~j5) << c) & j5 & j2) != j2) {
                        int i9 = 8 - ((~(i8 - length3)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j5 & j) < 128) {
                                hgh hghVar3 = (hgh) objArr3[(i8 << 3) + i10];
                                hghVar3.g();
                                hjhVar.y(hghVar3);
                            }
                            j5 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length3) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            coqVar4.a();
        }
    }

    public static final void e(List list, hjh hjhVar) {
        list.clear();
        synchronized (hjhVar.d) {
            List list2 = hjhVar.i;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((hhn) list2.get(i));
            }
            hjhVar.i.clear();
        }
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hjf hjfVar = new hjf(this.k, (ffgu) obj3);
        hjfVar.j = (hhh) obj2;
        return hjfVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [hhh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x012f -> B:5:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x02cb -> B:34:0x0082). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjf.b(java.lang.Object):java.lang.Object");
    }
}
