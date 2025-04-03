package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyhw implements eyik {
    private final eyhs a;
    private final eyjc b;
    private final boolean c;
    private final eyfd d;

    public eyhw(eyjc eyjcVar, eyfd eyfdVar, eyhs eyhsVar) {
        this.b = eyjcVar;
        this.c = eyhsVar instanceof eyft;
        this.d = eyfdVar;
        this.a = eyhsVar;
    }

    @Override // defpackage.eyik
    public final int a(Object obj) {
        eyjd k = eyje.k(obj);
        int i = k.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < k.b; i2++) {
                int a = eyjt.a(k.c[i2]);
                eyee eyeeVar = (eyee) k.d[i2];
                int U = eyer.U(1);
                i += U + U + eyer.V(2, a) + eyer.B(3, eyeeVar);
            }
            k.e = i;
        }
        if (!this.c) {
            return i;
        }
        eyfj a2 = this.d.a(obj);
        int i3 = a2.b.b;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += a2.c(a2.b.d(i5));
        }
        Iterator it = a2.b.a().iterator();
        while (it.hasNext()) {
            i4 += a2.c((Map.Entry) it.next());
        }
        return i + i4;
    }

    @Override // defpackage.eyik
    public final int b(Object obj) {
        int hashCode = eyje.k(obj).hashCode();
        return this.c ? (hashCode * 53) + this.d.a(obj).hashCode() : hashCode;
    }

    @Override // defpackage.eyik
    public final Object e() {
        eyhs eyhsVar = this.a;
        return eyhsVar instanceof eyfy ? ((eyfy) eyhsVar).newMutableInstance() : eyhsVar.newBuilderForType().buildPartial();
    }

    @Override // defpackage.eyik
    public final void g(Object obj) {
        this.b.h(obj);
        this.d.c(obj);
    }

    @Override // defpackage.eyik
    public final void h(Object obj, Object obj2) {
        eyil.J(obj, obj2);
        if (this.c) {
            eyil.n(this.d, obj, obj2);
        }
    }

    @Override // defpackage.eyik
    public final void i(Object obj, eyie eyieVar, eyfc eyfcVar) {
        boolean P;
        eyfd eyfdVar = this.d;
        eyjc eyjcVar = this.b;
        Object a = eyjcVar.a(obj);
        eyfj b = eyfdVar.b(obj);
        while (eyieVar.c() != Integer.MAX_VALUE) {
            try {
                int i = ((eyem) eyieVar).b;
                if (i != eyjt.a) {
                    if (eyjt.b(i) == 2) {
                        eyfw b2 = eyfcVar.b(this.a, eyjt.a(i));
                        if (b2 != null) {
                            eyfdVar.d(eyieVar, b2, eyfcVar, b);
                        } else {
                            P = eyjcVar.i(a, eyieVar, 0);
                        }
                    } else {
                        P = eyieVar.P();
                    }
                    if (!P) {
                        break;
                    }
                } else {
                    eyfw eyfwVar = null;
                    eyee eyeeVar = null;
                    int i2 = 0;
                    while (eyieVar.c() != Integer.MAX_VALUE) {
                        int i3 = ((eyem) eyieVar).b;
                        if (i3 != eyjt.c) {
                            if (i3 != eyjt.d) {
                                if (i3 == eyjt.b || !eyieVar.P()) {
                                    break;
                                }
                            } else if (eyfwVar != null) {
                                eyfdVar.d(eyieVar, eyfwVar, eyfcVar, b);
                            } else {
                                eyeeVar = eyieVar.o();
                            }
                        } else {
                            i2 = eyieVar.i();
                            eyfwVar = eyfcVar.b(this.a, i2);
                        }
                    }
                    if (((eyem) eyieVar).b != eyjt.b) {
                        throw new eygu("Protocol message end-group tag did not match expected tag.");
                    }
                    if (eyeeVar != null) {
                        if (eyfwVar != null) {
                            eyhr newBuilderForType = eyfwVar.c.newBuilderForType();
                            eyel l = eyeeVar.l();
                            newBuilderForType.mergeFrom(l, eyfcVar);
                            b.n(eyfwVar.d, newBuilderForType.buildPartial());
                            l.z(0);
                        } else {
                            eyjcVar.f(a, i2, eyeeVar);
                        }
                    }
                }
            } finally {
                eyje.l(obj, (eyjd) a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[EDGE_INSN: B:24:0x00bb->B:25:0x00bb BREAK  A[LOOP:1: B:10:0x0065->B:18:0x0065], SYNTHETIC] */
    @Override // defpackage.eyik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.eydr r15) {
        /*
            r10 = this;
            r0 = r11
            eyfy r0 = (defpackage.eyfy) r0
            eyjd r1 = r0.unknownFields
            eyjd r2 = defpackage.eyjd.a
            if (r1 != r2) goto L10
            eyjd r1 = new eyjd
            r1.<init>()
            r0.unknownFields = r1
        L10:
            r6 = r1
            eyft r11 = (defpackage.eyft) r11
            eyfj r11 = r11.a()
            r0 = 0
            r1 = r0
        L19:
            if (r13 >= r14) goto Lc9
            int r4 = defpackage.eyds.t(r12, r13, r15)
            int r2 = r15.a
            int r13 = defpackage.eyjt.a
            r3 = 2
            if (r2 == r13) goto L61
            int r13 = defpackage.eyjt.b(r2)
            if (r13 != r3) goto L5a
            eyfc r13 = r15.d
            eyhs r1 = r10.a
            int r3 = defpackage.eyjt.a(r2)
            eyfw r1 = r13.b(r1, r3)
            if (r1 == 0) goto L52
            eyhs r13 = r1.c
            eyib r2 = defpackage.eyib.a
            java.lang.Class r13 = r13.getClass()
            eyik r13 = r2.a(r13)
            int r13 = defpackage.eyds.f(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.c
            eyfv r3 = r1.d
            r11.n(r3, r2)
            goto L19
        L52:
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = defpackage.eyds.s(r2, r3, r4, r5, r6, r7)
            goto L19
        L5a:
            r5 = r14
            r7 = r15
            int r13 = defpackage.eyds.z(r2, r12, r4, r5, r7)
            goto L19
        L61:
            r5 = r14
            r7 = r15
            r13 = 0
            r14 = r0
        L65:
            if (r4 >= r5) goto Lba
            int r15 = defpackage.eyds.t(r12, r4, r7)
            int r2 = r7.a
            int r4 = defpackage.eyjt.a(r2)
            int r8 = defpackage.eyjt.b(r2)
            if (r4 == r3) goto La0
            r9 = 3
            if (r4 == r9) goto L7b
            goto Lb1
        L7b:
            if (r1 == 0) goto L95
            eyhs r2 = r1.c
            eyib r4 = defpackage.eyib.a
            java.lang.Class r2 = r2.getClass()
            eyik r2 = r4.a(r2)
            int r4 = defpackage.eyds.f(r2, r12, r15, r5, r7)
            java.lang.Object r15 = r7.c
            eyfv r2 = r1.d
            r11.n(r2, r15)
            goto L65
        L95:
            if (r8 != r3) goto Lb1
            int r4 = defpackage.eyds.c(r12, r15, r7)
            java.lang.Object r14 = r7.c
            eyee r14 = (defpackage.eyee) r14
            goto L65
        La0:
            if (r8 != 0) goto Lb1
            int r4 = defpackage.eyds.t(r12, r15, r7)
            int r13 = r7.a
            eyfc r15 = r7.d
            eyhs r1 = r10.a
            eyfw r1 = r15.b(r1, r13)
            goto L65
        Lb1:
            int r4 = defpackage.eyjt.b
            if (r2 == r4) goto Lbb
            int r4 = defpackage.eyds.z(r2, r12, r15, r5, r7)
            goto L65
        Lba:
            r15 = r4
        Lbb:
            if (r14 == 0) goto Lc4
            int r13 = defpackage.eyjt.c(r13, r3)
            r6.f(r13, r14)
        Lc4:
            r13 = r15
            r14 = r5
            r15 = r7
            goto L19
        Lc9:
            r5 = r14
            if (r13 != r5) goto Lcd
            return
        Lcd:
            eygu r11 = new eygu
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyhw.j(java.lang.Object, byte[], int, int, eydr):void");
    }

    @Override // defpackage.eyik
    public final boolean k(Object obj, Object obj2) {
        if (!eyje.k(obj).equals(eyje.k(obj2))) {
            return false;
        }
        if (this.c) {
            return this.d.a(obj).equals(this.d.a(obj2));
        }
        return true;
    }

    @Override // defpackage.eyik
    public final boolean l(Object obj) {
        return this.d.a(obj).j();
    }

    @Override // defpackage.eyik
    public final void m(Object obj, eyes eyesVar) {
        Iterator e = this.d.a(obj).e();
        while (e.hasNext()) {
            Map.Entry entry = (Map.Entry) e.next();
            eyfv eyfvVar = (eyfv) entry.getKey();
            if (eyfvVar.a() != eyjs.MESSAGE || eyfvVar.d || eyfvVar.e) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof eygx) {
                eyesVar.l(eyfvVar.b, ((eygz) ((eygx) entry).a.getValue()).a());
            } else {
                eyesVar.l(eyfvVar.b, entry.getValue());
            }
        }
        eyjd k = eyje.k(obj);
        for (int i = 0; i < k.b; i++) {
            eyesVar.l(eyjt.a(k.c[i]), k.d[i]);
        }
    }
}
