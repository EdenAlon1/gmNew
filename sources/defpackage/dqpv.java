package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqpv implements dqoy {
    public final effy a;
    public boolean b;
    public final Map c;
    public final Map d;
    private final ffsk e;
    private final dqok f;
    private final dqoh g;
    private final ffbz h;
    private ffud i;
    private final CopyOnWriteArrayList j;

    public dqpv(final ffbr ffbrVar, effy effyVar, ffsk ffskVar, dqok dqokVar, dqoh dqohVar) {
        ffbrVar.getClass();
        effyVar.getClass();
        ffskVar.getClass();
        dqokVar.getClass();
        dqohVar.getClass();
        this.a = effyVar;
        this.e = ffskVar;
        this.f = dqokVar;
        this.g = dqohVar;
        this.h = ffca.a(new ffix() { // from class: dqpc
            @Override // defpackage.ffix
            public final Object invoke() {
                Object b = ffbr.this.b();
                b.getClass();
                Optional optional = (Optional) b;
                return ((dqsv) (optional.isPresent() ? optional.get() : new dqsv(null, null, PrivateKeyType.INVALID))).a;
            }
        });
        this.j = new CopyOnWriteArrayList();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    private final dqpw k() {
        return (dqpw) this.h.a();
    }

    private final Object l(ffji ffjiVar, ffgu ffguVar) {
        final dqpp dqppVar = new dqpp(ffjiVar);
        ListenableFuture b = this.a.b(new emwl() { // from class: dqpt
            @Override // defpackage.emwl
            public final /* synthetic */ Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }
        }, erpp.a);
        ffss c = ffqy.c(this.e, null, new dqpn(b, null), 3);
        c.hZ(new dqpo(b));
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((dqox) it.next()).b();
        }
        Object c2 = c.c(ffguVar);
        return c2 == ffhh.a ? c2 : ffcu.a;
    }

    private final Object m(dqqj dqqjVar, final dqnw dqnwVar, ffgu ffguVar) {
        return i(dqqjVar, new ffji() { // from class: dqpf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqph dqphVar = (dqph) obj;
                dqphVar.getClass();
                return Boolean.valueOf(dqphVar.a != dqnw.this);
            }
        }, new ffji() { // from class: dqpg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqph dqphVar = (dqph) obj;
                dqphVar.getClass();
                dqnw dqnwVar2 = dqnw.this;
                if (dqnwVar2 == dqnw.b) {
                    dqnwVar2 = null;
                }
                dqphVar.a = dqnwVar2;
                return ffcu.a;
            }
        }, ffguVar);
    }

    private final Object n(dqqj dqqjVar, final dqnw dqnwVar, final dqnz dqnzVar, ffgu ffguVar) {
        return i(dqqjVar, new ffji() { // from class: dqpd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqph dqphVar = (dqph) obj;
                dqphVar.getClass();
                boolean z = true;
                if (dqphVar.a == dqnw.this) {
                    if (dqphVar.b == dqnzVar) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        }, new ffji() { // from class: dqpe
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqph dqphVar = (dqph) obj;
                dqphVar.getClass();
                dqnw dqnwVar2 = dqnw.this;
                if (dqnwVar2 == dqnw.b) {
                    dqnwVar2 = null;
                }
                dqphVar.a = dqnwVar2;
                dqnz dqnzVar2 = dqnzVar;
                dqphVar.b = dqnzVar2 != dqnz.b ? dqnzVar2 : null;
                return ffcu.a;
            }
        }, ffguVar);
    }

    private final Object o(dqqj dqqjVar, final dqnz dqnzVar, ffgu ffguVar) {
        return i(dqqjVar, new ffji() { // from class: dqoz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqph dqphVar = (dqph) obj;
                dqphVar.getClass();
                return Boolean.valueOf(dqphVar.b != dqnz.this);
            }
        }, new ffji() { // from class: dqpa
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqph dqphVar = (dqph) obj;
                dqphVar.getClass();
                dqnz dqnzVar2 = dqnz.this;
                if (dqnzVar2 == dqnz.b) {
                    dqnzVar2 = null;
                }
                dqphVar.b = dqnzVar2;
                return ffcu.a;
            }
        }, ffguVar);
    }

    private final Object p(dqof dqofVar, ffgu ffguVar) {
        final CharSequence a = dqofVar.b().a();
        final CharSequence a2 = dqofVar.a();
        if (ffkj.e(a2, a) ? this.c.remove(a) != null : !ffkj.e(this.c.put(a, a2), a2)) {
            Object l = l(new ffji() { // from class: dqpb
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    dqre dqreVar = (dqre) obj;
                    dqreVar.getClass();
                    CharSequence charSequence = a2;
                    String obj2 = a.toString();
                    String obj3 = charSequence.toString();
                    obj2.getClass();
                    obj3.getClass();
                    dqreVar.copyOnWrite();
                    dqrj dqrjVar = (dqrj) dqreVar.instance;
                    dqrj dqrjVar2 = dqrj.a;
                    eyhm eyhmVar = dqrjVar.b;
                    if (!eyhmVar.b) {
                        dqrjVar.b = eyhmVar.a();
                    }
                    dqrjVar.b.put(obj2, obj3);
                    return ffcu.a;
                }
            }, ffguVar);
            if (l == ffhh.a) {
                return l;
            }
        }
        return ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
    
        if (r10 != r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        if (r10 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.dqoy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dqqj r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqpv.a(dqqj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r2.p((defpackage.dqof) r7, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e3, code lost:
    
        if (r2.p((defpackage.dqof) r7, r0) != r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dqoy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dqqj r6, defpackage.dqof r7, defpackage.ffgu r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqpv.b(dqqj, dqof, ffgu):java.lang.Object");
    }

    @Override // defpackage.dqoy
    public final void c(dqox dqoxVar) {
        dqoxVar.getClass();
        this.j.add(dqoxVar);
    }

    @Override // defpackage.dqoy
    public final void d(dqox dqoxVar) {
        dqoxVar.getClass();
        this.j.remove(dqoxVar);
    }

    @Override // defpackage.dqoy
    public final Object e() {
        ffud ffudVar = this.i;
        if ((ffudVar == null || ffudVar.y()) && !this.b) {
            this.i = ffqy.d(this.e, null, null, new dqpi(this, null), 3);
        }
        return ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r6.o(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dqpj
            if (r0 == 0) goto L13
            r0 = r6
            dqpj r0 = (defpackage.dqpj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqpj r0 = new dqpj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r6)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            dqpv r2 = r0.d
            defpackage.ffci.b(r6)
            goto L46
        L38:
            defpackage.ffci.b(r6)
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = r5.e()
            if (r6 == r1) goto L59
            r2 = r5
        L46:
            ffud r6 = r2.i
            if (r6 == 0) goto L56
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.o(r0)
            if (r6 != r1) goto L56
            goto L59
        L56:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqpv.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.dqqj r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dqpk
            if (r0 == 0) goto L13
            r0 = r8
            dqpk r0 = (defpackage.dqpk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqpk r0 = new dqpk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.a
            dqog r7 = (defpackage.dqog) r7
            defpackage.ffci.b(r8)
            goto L6f
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r0.a
            dqpv r7 = (defpackage.dqpv) r7
            defpackage.ffci.b(r8)
            goto L5a
        L3e:
            defpackage.ffci.b(r8)
            dqpw r8 = r6.k()
            dqpw r2 = defpackage.dqpw.c
            if (r8 != r2) goto L4c
            java.lang.String r7 = "__GLOBAL__"
            return r7
        L4c:
            dqoh r8 = r6.g
            r0.a = r6
            r0.d = r4
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L59
            goto L81
        L59:
            r7 = r6
        L5a:
            dqog r8 = (defpackage.dqog) r8
            if (r8 != 0) goto L60
            r7 = 0
            return r7
        L60:
            dqoh r7 = r7.g
            r0.a = r8
            r0.d = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 == r1) goto L81
            r5 = r8
            r8 = r7
            r7 = r5
        L6f:
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = defpackage.ffdx.K(r8)
            boolean r7 = defpackage.ffkj.e(r7, r8)
            if (r7 == 0) goto L7e
            java.lang.String r7 = "body-parts"
            return r7
        L7e:
            java.lang.String r7 = "person"
            return r7
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqpv.g(dqqj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.dqqj r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dqpm
            if (r0 == 0) goto L13
            r0 = r7
            dqpm r0 = (defpackage.dqpm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqpm r0 = new dqpm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            dqpv r2 = r0.e
            defpackage.ffci.b(r7)
            goto L4a
        L3a:
            defpackage.ffci.b(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.f(r0)
            if (r7 == r1) goto L70
            r2 = r5
        L4a:
            java.util.Map r7 = r2.c
            dqqj r6 = (defpackage.dqqj) r6
            dqns r6 = r6.a()
            java.lang.CharSequence r6 = r6.a()
            java.lang.Object r6 = r7.get(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 0
            if (r6 == 0) goto L6f
            dqok r2 = r2.f
            r0.e = r7
            r0.a = r7
            r0.d = r3
            java.lang.Object r7 = r2.d(r6, r0)
            if (r7 == r1) goto L70
        L6d:
            dqof r7 = (defpackage.dqof) r7
        L6f:
            return r7
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqpv.h(dqqj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r11.l(r9, r0) != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.dqqj r9, defpackage.ffji r10, defpackage.ffji r11, defpackage.ffgu r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.dqpq
            if (r0 == 0) goto L13
            r0 = r12
            dqpq r0 = (defpackage.dqpq) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            dqpq r0 = new dqpq
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.ffci.b(r12)
            goto Lb3
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.b
            java.lang.Object r10 = r0.a
            ffji r10 = (defpackage.ffji) r10
            dqpv r11 = r0.g
            defpackage.ffci.b(r12)
            goto L7b
        L43:
            java.lang.Object r11 = r0.c
            java.lang.Object r10 = r0.b
            java.lang.Object r9 = r0.a
            dqqj r9 = (defpackage.dqqj) r9
            dqpv r2 = r0.g
            defpackage.ffci.b(r12)
            r12 = r11
            r11 = r2
            goto L68
        L53:
            defpackage.ffci.b(r12)
            r0.g = r8
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.f = r5
            java.lang.Object r12 = r8.f(r0)
            if (r12 == r1) goto Lb7
            r12 = r11
            r11 = r8
        L68:
            r0.g = r11
            r0.a = r10
            r0.b = r12
            r0.c = r6
            r0.f = r4
            java.lang.Object r9 = r11.g(r9, r0)
            if (r9 == r1) goto Lb7
            r7 = r12
            r12 = r9
            r9 = r7
        L7b:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto Lb6
            java.util.Map r2 = r11.d
            java.lang.Object r4 = r2.get(r12)
            if (r4 != 0) goto L8f
            dqph r4 = new dqph
            r4.<init>(r6)
            r2.put(r12, r4)
        L8f:
            dqph r4 = (defpackage.dqph) r4
            java.lang.Object r10 = r10.invoke(r4)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb3
            r9.invoke(r4)
            dqpr r9 = new dqpr
            r9.<init>(r12, r4)
            r0.g = r6
            r0.a = r6
            r0.b = r6
            r0.f = r3
            java.lang.Object r9 = r11.l(r9, r0)
            if (r9 == r1) goto Lb7
        Lb3:
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lb6:
            return r6
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqpv.i(dqqj, ffji, ffji, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        if (r2.p(r9, r0) != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.dqqj r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.dqps
            if (r0 == 0) goto L13
            r0 = r10
            dqps r0 = (defpackage.dqps) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqps r0 = new dqps
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L50
            if (r2 == r7) goto L48
            if (r2 == r6) goto L44
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            defpackage.ffci.b(r10)
            goto Lb3
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            defpackage.ffci.b(r10)
            return r10
        L40:
            defpackage.ffci.b(r10)
            return r10
        L44:
            defpackage.ffci.b(r10)
            return r10
        L48:
            java.lang.Object r9 = r0.a
            dqpv r2 = r0.e
            defpackage.ffci.b(r10)
            goto L60
        L50:
            defpackage.ffci.b(r10)
            r0.e = r8
            r0.a = r9
            r0.d = r7
            java.lang.Object r10 = r8.f(r0)
            if (r10 == r1) goto Lc3
            r2 = r8
        L60:
            boolean r10 = r9 instanceof defpackage.dqqg
            r7 = 0
            if (r10 == 0) goto L75
            r0.e = r7
            r0.a = r7
            r0.d = r6
            dqqj r9 = (defpackage.dqqj) r9
            java.lang.Object r9 = r2.m(r9, r7, r0)
            if (r9 != r1) goto L74
            goto Lc3
        L74:
            return r9
        L75:
            boolean r10 = r9 instanceof defpackage.dqqi
            if (r10 == 0) goto L89
            r0.e = r7
            r0.a = r7
            r0.d = r5
            dqqj r9 = (defpackage.dqqj) r9
            java.lang.Object r9 = r2.o(r9, r7, r0)
            if (r9 != r1) goto L88
            goto Lc3
        L88:
            return r9
        L89:
            boolean r10 = r9 instanceof defpackage.dqqe
            if (r10 == 0) goto L9d
            r0.e = r7
            r0.a = r7
            r0.d = r4
            dqqj r9 = (defpackage.dqqj) r9
            java.lang.Object r9 = r2.n(r9, r7, r7, r0)
            if (r9 != r1) goto L9c
            goto Lc3
        L9c:
            return r9
        L9d:
            boolean r10 = r9 instanceof defpackage.dqqb
            if (r10 == 0) goto Lb6
            dqqb r9 = (defpackage.dqqb) r9
            dqns r9 = r9.a()
            r0.e = r7
            r0.a = r7
            r0.d = r3
            java.lang.Object r9 = r2.p(r9, r0)
            if (r9 == r1) goto Lc3
        Lb3:
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lb6:
            boolean r9 = r9 instanceof defpackage.dqqh
            if (r9 == 0) goto Lbd
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lbd:
            ffcd r9 = new ffcd
            r9.<init>()
            throw r9
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqpv.j(dqqj, ffgu):java.lang.Object");
    }
}
