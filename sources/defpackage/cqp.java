package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqp implements ipn {
    public final cqw a;

    public cqp(cqw cqwVar) {
        this.a = cqwVar;
    }

    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((inx) list.get(0)).a(i));
            int e = ffdx.e(list);
            if (e > 0) {
                int i2 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((inx) list.get(i2)).a(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == e) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ipn
    public final int b(iny inyVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((inx) list.get(0)).b(i));
            int e = ffdx.e(list);
            if (e > 0) {
                int i2 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((inx) list.get(i2)).b(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == e) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ipn
    public final int c(iny inyVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((inx) list.get(0)).c(i));
            int e = ffdx.e(list);
            if (e > 0) {
                int i2 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((inx) list.get(i2)).c(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == e) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ipn
    public final int d(iny inyVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((inx) list.get(0)).d(i));
            int e = ffdx.e(list);
            if (e > 0) {
                int i2 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((inx) list.get(i2)).d(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == e) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        iqk iqkVar;
        iqk iqkVar2;
        int i;
        int i2;
        ipo ei;
        int size = list.size();
        iqk[] iqkVarArr = new iqk[size];
        int size2 = list.size();
        long j2 = 0;
        int i3 = 0;
        while (true) {
            iqkVar = null;
            if (i3 >= size2) {
                break;
            }
            ipl iplVar = (ipl) list.get(i3);
            Object f = iplVar.f();
            cqr cqrVar = f instanceof cqr ? (cqr) f : null;
            if (cqrVar != null && ((Boolean) cqrVar.a.a()).booleanValue()) {
                long j3 = r7.b & 4294967295L;
                iqkVarArr[i3] = iplVar.e(j);
                j2 = j3 | (r7.a << 32);
            }
            i3++;
        }
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ipl iplVar2 = (ipl) list.get(i4);
            if (iqkVarArr[i4] == null) {
                iqkVarArr[i4] = iplVar2.e(j);
            }
        }
        if (ipqVar.eu()) {
            i = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                iqkVar2 = null;
            } else {
                iqkVar2 = iqkVarArr[0];
                int B = ffdo.B(iqkVarArr);
                if (B != 0) {
                    int i5 = iqkVar2 != null ? iqkVar2.a : 0;
                    ffev it = new ffmj(1, B).iterator();
                    while (((ffmi) it).a) {
                        iqk iqkVar3 = iqkVarArr[it.a()];
                        int i6 = iqkVar3 != null ? iqkVar3.a : 0;
                        if (i5 < i6) {
                            iqkVar2 = iqkVar3;
                            i5 = i6;
                        }
                    }
                }
            }
            i = iqkVar2 != null ? iqkVar2.a : 0;
        }
        if (ipqVar.eu()) {
            i2 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                iqkVar = iqkVarArr[0];
                int B2 = ffdo.B(iqkVarArr);
                if (B2 != 0) {
                    int i7 = iqkVar != null ? iqkVar.b : 0;
                    ffev it2 = new ffmj(1, B2).iterator();
                    while (((ffmi) it2).a) {
                        iqk iqkVar4 = iqkVarArr[it2.a()];
                        int i8 = iqkVar4 != null ? iqkVar4.b : 0;
                        if (i7 < i8) {
                            iqkVar = iqkVar4;
                            i7 = i8;
                        }
                    }
                }
            }
            i2 = iqkVar != null ? iqkVar.b : 0;
        }
        if (!ipqVar.eu()) {
            this.a.c.b(new kaf((i << 32) | (i2 & 4294967295L)));
        }
        ei = ipqVar.ei(i, i2, ffem.a, new cqo(iqkVarArr, this, i, i2));
        return ei;
    }
}
