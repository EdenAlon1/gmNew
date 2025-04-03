package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivu {
    public final iui a;
    public final ito b;
    public iwi c;
    public final hvh d;
    public hvh e;
    public hne f;
    public hne g;
    private ivt h;

    public ivu(iui iuiVar) {
        this.a = iuiVar;
        ito itoVar = new ito(iuiVar);
        this.b = itoVar;
        this.c = itoVar;
        ixr ixrVar = itoVar.f;
        this.d = ixrVar;
        this.e = ixrVar;
    }

    public static final hvh k(hvg hvgVar, hvh hvhVar) {
        hvh isgVar;
        if (hvgVar instanceof ivp) {
            isgVar = ((ivp) hvgVar).d();
            isgVar.q = iwk.c(isgVar);
        } else {
            isgVar = new isg(hvgVar);
        }
        if (isgVar.z) {
            imn.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        isgVar.w = true;
        hvh hvhVar2 = hvhVar.t;
        if (hvhVar2 != null) {
            hvhVar2.s = isgVar;
            isgVar.t = hvhVar2;
        }
        hvhVar.t = isgVar;
        isgVar.s = hvhVar;
        return isgVar;
    }

    public static final hvh l(hvh hvhVar) {
        if (hvhVar.z) {
            iwk.f(hvhVar);
            hvhVar.I();
            hvhVar.F();
        }
        hvh hvhVar2 = hvhVar.t;
        hvh hvhVar3 = hvhVar.s;
        if (hvhVar2 != null) {
            hvhVar2.s = hvhVar3;
            hvhVar.t = null;
        }
        if (hvhVar3 != null) {
            hvhVar3.t = hvhVar2;
            hvhVar.s = null;
        }
        hvhVar3.getClass();
        return hvhVar3;
    }

    public static final void m(hvg hvgVar, hvg hvgVar2, hvh hvhVar) {
        if ((hvgVar instanceof ivp) && (hvgVar2 instanceof ivp)) {
            ivv ivvVar = ivx.a;
            hvhVar.getClass();
            ((ivp) hvgVar2).e(hvhVar);
            if (hvhVar.z) {
                iwk.g(hvhVar);
                return;
            } else {
                hvhVar.x = true;
                return;
            }
        }
        if (!(hvhVar instanceof isg)) {
            imn.c("Unknown Modifier.Node type");
            return;
        }
        isg isgVar = (isg) hvhVar;
        if (isgVar.z) {
            isgVar.x();
        }
        isgVar.a = hvgVar2;
        isgVar.q = iwk.a(hvgVar2);
        if (isgVar.z) {
            isgVar.v(false);
        }
        if (hvhVar.z) {
            iwk.g(hvhVar);
        } else {
            hvhVar.x = true;
        }
    }

    public final int a() {
        return this.e.r;
    }

    public final void b() {
        for (hvh hvhVar = this.e; hvhVar != null; hvhVar = hvhVar.t) {
            hvhVar.E();
        }
    }

    public final void c() {
        for (hvh hvhVar = this.d; hvhVar != null; hvhVar = hvhVar.s) {
            if (hvhVar.z) {
                hvhVar.F();
            }
        }
    }

    public final void d(hvh hvhVar, iwi iwiVar) {
        for (hvh hvhVar2 = hvhVar.s; hvhVar2 != null; hvhVar2 = hvhVar2.s) {
            if (hvhVar2 == ivx.a) {
                iui u = this.a.u();
                iwiVar.v = u != null ? u.y() : null;
                this.c = iwiVar;
                return;
            } else {
                if ((hvhVar2.q & 2) != 0) {
                    return;
                }
                hvhVar2.K(iwiVar);
            }
        }
    }

    public final void e() {
        ito itoVar;
        iwi iwiVar = this.c;
        while (true) {
            itoVar = this.b;
            if (iwiVar == itoVar) {
                break;
            }
            iwiVar.ai();
            iwiVar = iwiVar.u;
            iwiVar.getClass();
        }
        itoVar.ai();
        for (hvh hvhVar = this.e; hvhVar != null; hvhVar = hvhVar.t) {
            hvhVar.H();
            if (hvhVar.w) {
                iwk.d(hvhVar);
            }
            if (hvhVar.x) {
                iwk.g(hvhVar);
            }
            hvhVar.w = false;
            hvhVar.x = false;
        }
    }

    public final void f() {
        for (hvh hvhVar = this.d; hvhVar != null; hvhVar = hvhVar.s) {
            if (hvhVar.z) {
                hvhVar.I();
            }
        }
        iwi iwiVar = this.b;
        iwi iwiVar2 = this.c;
        while (iwiVar != iwiVar2) {
            iwiVar.ak();
            iwiVar = iwiVar.v;
            iwiVar.getClass();
        }
        iwiVar2.ak();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0217, code lost:
    
        r12 = r32;
        r13 = r19;
        r15 = r15 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0192, code lost:
    
        r24 = r12;
        r25 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0177, code lost:
    
        r22 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0170, code lost:
    
        r21 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x015e, code lost:
    
        r13 = defpackage.ism.a(r3, r15 + 1);
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x014e, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x015a, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0220, code lost:
    
        r5 = r5 + 1;
        r9 = r31;
        r14 = r11;
        r11 = r12;
        r15 = r13;
        r13 = r20;
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (defpackage.ism.a(r10, r1 + 1) > defpackage.ism.a(r10, r11)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012d, code lost:
    
        r1 = r12;
        r20 = r13;
        r13 = r15;
        r12 = r11;
        r11 = r14;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
    
        if (r15 > r5) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
    
        if (r15 == r9) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
    
        r14 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013b, code lost:
    
        if (r15 == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013d, code lost:
    
        r32 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014b, code lost:
    
        if (defpackage.ism.a(r3, r15 + 1) >= defpackage.ism.a(r3, r14)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0152, code lost:
    
        r12 = defpackage.ism.a(r3, r14);
        r13 = r12 - 1;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0166, code lost:
    
        r12 = r1 - ((r19 - r13) - r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016b, code lost:
    
        if (r5 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016d, code lost:
    
        r21 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0172, code lost:
    
        if (r13 != r14) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0174, code lost:
    
        r22 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017b, code lost:
    
        if (r13 <= r6) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017d, code lost:
    
        if (r12 <= r11) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017f, code lost:
    
        r24 = r12;
        r12 = r13 - 1;
        r25 = r14;
        r14 = r24 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018b, code lost:
    
        if (r0.a(r12, r14) == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018d, code lost:
    
        r13 = r12;
        r12 = r14;
        r14 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0196, code lost:
    
        r12 = (r18 & 1) ^ 1;
        defpackage.ism.b(r3, r15, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019d, code lost:
    
        if (r12 == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019f, code lost:
    
        r12 = r18 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a1, code lost:
    
        if (r12 < r9) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a3, code lost:
    
        if (r12 > r5) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a9, code lost:
    
        if (defpackage.ism.a(r10, r12) < r13) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ab, code lost:
    
        r17 = r32;
        r5 = r19;
        r9 = 3;
        defpackage.ivs.a(r13, r24, r25, r12 + (r21 & r22), true, r17);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r28, defpackage.hne r29, defpackage.hne r30, defpackage.hvh r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivu.g(int, hne, hne, hvh, boolean):void");
    }

    public final void h() {
        int i = 0;
        for (hvh hvhVar = this.d.s; hvhVar != null && hvhVar != ivx.a; hvhVar = hvhVar.s) {
            i |= hvhVar.q;
            hvhVar.r = i;
        }
    }

    public final void i() {
        iwi iwiVar;
        iwi iwiVar2 = this.b;
        for (hvh hvhVar = this.d.s; hvhVar != null; hvhVar = hvhVar.s) {
            itu c = isx.c(hvhVar);
            if (c != null) {
                iwi iwiVar3 = hvhVar.v;
                if (iwiVar3 != null) {
                    itx itxVar = (itx) iwiVar3;
                    itu ituVar = itxVar.f;
                    itxVar.H(c);
                    iwiVar = itxVar;
                    if (ituVar != hvhVar) {
                        itxVar.al();
                        iwiVar = itxVar;
                    }
                } else {
                    iwi itxVar2 = new itx(this.a, c);
                    hvhVar.K(itxVar2);
                    iwiVar = itxVar2;
                }
                iwiVar2.v = iwiVar;
                iwiVar.u = iwiVar2;
                iwiVar2 = iwiVar;
            } else {
                hvhVar.K(iwiVar2);
            }
        }
        iui u = this.a.u();
        iwiVar2.v = u != null ? u.y() : null;
        this.c = iwiVar2;
    }

    public final boolean j(int i) {
        return (i & a()) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        hvh hvhVar = this.e;
        if (hvhVar != this.d) {
            while (true) {
                if (hvhVar == null || hvhVar == this.d) {
                    break;
                }
                sb.append(hvhVar.toString());
                if (hvhVar.t == this.d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                hvhVar = hvhVar.t;
            }
        } else {
            sb.append("]");
        }
        return sb.toString();
    }
}
