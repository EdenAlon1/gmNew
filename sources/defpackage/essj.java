package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class essj implements essn {
    private static final Set b = fffi.d(fgtg.PHONE_NUMBER, fgtg.GAIA_ID);
    public final cpqz a;
    private final esrg c;
    private final essx d;

    public essj(cpqz cpqzVar, esrg esrgVar, essx essxVar) {
        this.a = cpqzVar;
        this.c = esrgVar;
        this.d = essxVar;
    }

    public static final fcek e(fcek fcekVar, int i) {
        fgtg b2 = fgtg.b(fcekVar.b);
        if (b2 == null) {
            b2 = fgtg.UNRECOGNIZED;
        }
        b2.getClass();
        if (b.contains(b2)) {
            return fcekVar;
        }
        esrh c = new esre().c();
        ((esre) c).a = "Handling unsupported requester ID type, " + b2.a() + " as an empty group updater for GroupMessage of type " + fbzm.b(i);
        cpgj.a(c.a());
        return null;
    }

    private final Object f(fcho fchoVar, fcek fcekVar, Instant instant, int i, essw esswVar, ffgu ffguVar) {
        String str;
        IllegalStateException illegalStateException;
        String str2;
        if (fchoVar.e.size() == 0) {
            throw new essp(i, "Received notification for creation of an empty group.");
        }
        emwd m = new esto().m();
        fgte b2 = fgte.b(fchoVar.f);
        if (b2 == null) {
            b2 = fgte.UNRECOGNIZED;
        }
        Object fP = m.fP(b2);
        fP.getClass();
        esrd esrdVar = (esrd) fP;
        esqg esqgVar = new esqg();
        fcek fcekVar2 = fchoVar.c;
        if (fcekVar2 == null) {
            fcekVar2 = fcek.a;
        }
        fcekVar2.getClass();
        esqgVar.c(fcekVar2);
        try {
            URI create = URI.create(fchoVar.g);
            create.getClass();
            esqgVar.b(create);
        } catch (IllegalArgumentException unused) {
            esrh d = new esre().d();
            ((esre) d).a = "Failed to parse group conference URI.";
            cpgj.a(d.a());
        }
        fcey a = fbfj.a(fchoVar);
        if (a == null || (str = a.b) == null) {
            str = "";
        }
        fcey a2 = fbfj.a(fchoVar);
        esqs esqsVar = (a2 == null || (str2 = a2.c) == null) ? esqs.a : new esqs(str2);
        fcey fceyVar = fchoVar.d;
        if (fceyVar == null) {
            fceyVar = fcey.a;
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(fceyVar.f);
        unmodifiableMap.getClass();
        esrb esrbVar = new esrb(str, esrdVar, unmodifiableMap, esqsVar);
        fcic fcicVar = fchoVar.h;
        if (fcicVar == null) {
            fcicVar = fcic.a;
        }
        fcicVar.getClass();
        esqr a3 = essv.a(fcicVar);
        if (!esrdVar.a(a3)) {
            throw new essp(i, "Received incompatible group type and group features.");
        }
        emwd m2 = new estn(esrdVar).m();
        try {
            eygr eygrVar = fchoVar.e;
            eygrVar.getClass();
            ArrayList arrayList = new ArrayList(ffdx.n(eygrVar, 10));
            Iterator<E> it = eygrVar.iterator();
            while (it.hasNext()) {
                try {
                    Object fP2 = m2.fP((fchr) it.next());
                    fP2.getClass();
                    arrayList.add((esqy) fP2);
                } catch (IllegalStateException e) {
                    illegalStateException = e;
                    throw new essp(i, "Received notification with incompatible group type and member role.", illegalStateException);
                }
            }
            ffcf ffcfVar = new ffcf(new esqv(esqgVar.a(), esrbVar, a3, engq.f(arrayList)), e(fcekVar, i));
            Object c = c(fast.CREATE_GROUP, new essb(this, (esqv) ffcfVar.a, (fcek) ffcfVar.b, instant, esswVar, null), ffguVar);
            return c == ffhh.a ? c : ffcu.a;
        } catch (IllegalStateException e2) {
            illegalStateException = e2;
        }
    }

    @Override // defpackage.essn
    public final Iterable a() {
        return ffdx.b(fbzs.GROUP);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.essn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fbzt r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.essg
            if (r0 == 0) goto L13
            r0 = r6
            essg r0 = (defpackage.essg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            essg r0 = new essg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            essj r5 = r0.d
            defpackage.ffci.b(r6)     // Catch: defpackage.esqb -> L29
            goto L42
        L29:
            r6 = move-exception
            goto L7b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            r0.d = r4     // Catch: defpackage.esqb -> L78
            r0.c = r3     // Catch: defpackage.esqb -> L78
            java.lang.Object r6 = r4.d(r5, r0)     // Catch: defpackage.esqb -> L78
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            fast r6 = (defpackage.fast) r6     // Catch: defpackage.esqb -> L29
            esrg r0 = r5.c     // Catch: defpackage.esqb -> L29
            fatc r1 = defpackage.fatc.a     // Catch: defpackage.esqb -> L29
            eyfq r1 = r1.createBuilder()     // Catch: defpackage.esqb -> L29
            fatb r1 = (defpackage.fatb) r1     // Catch: defpackage.esqb -> L29
            r1.getClass()     // Catch: defpackage.esqb -> L29
            fasu r2 = defpackage.fasu.a     // Catch: defpackage.esqb -> L29
            eyfq r2 = r2.createBuilder()     // Catch: defpackage.esqb -> L29
            fass r2 = (defpackage.fass) r2     // Catch: defpackage.esqb -> L29
            r2.getClass()     // Catch: defpackage.esqb -> L29
            defpackage.faso.b(r6, r2)     // Catch: defpackage.esqb -> L29
            r6 = 4
            defpackage.faso.d(r6, r2)     // Catch: defpackage.esqb -> L29
            r6 = 3
            defpackage.faso.e(r6, r2)     // Catch: defpackage.esqb -> L29
            fasu r6 = defpackage.faso.a(r2)     // Catch: defpackage.esqb -> L29
            defpackage.fasq.b(r6, r1)     // Catch: defpackage.esqb -> L29
            fatc r6 = defpackage.fasq.a(r1)     // Catch: defpackage.esqb -> L29
            r0.a(r6)     // Catch: defpackage.esqb -> L29
            ffcu r5 = defpackage.ffcu.a
            return r5
        L78:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L7b:
            boolean r0 = r6 instanceof defpackage.essp
            esrg r5 = r5.c
            if (r0 == 0) goto Lac
            r0 = r6
            essp r0 = (defpackage.essp) r0
            int r0 = r0.c
            if (r0 == 0) goto Laa
            int r0 = r0 + (-2)
            r1 = -1
            if (r0 == r1) goto La7
            if (r0 == 0) goto La7
            switch(r0) {
                case 5: goto La4;
                case 6: goto La1;
                case 7: goto L9e;
                case 8: goto L9b;
                case 9: goto La7;
                case 10: goto L98;
                default: goto L92;
            }
        L92:
            ffcd r5 = new ffcd
            r5.<init>()
            throw r5
        L98:
            fast r0 = defpackage.fast.CHANGE_GROUP_INFO
            goto Lae
        L9b:
            fast r0 = defpackage.fast.GROUP_PROFILE_UPDATED
            goto Lae
        L9e:
            fast r0 = defpackage.fast.KICK_GROUP_USERS
            goto Lae
        La1:
            fast r0 = defpackage.fast.ADD_GROUP_USERS
            goto Lae
        La4:
            fast r0 = defpackage.fast.CREATE_GROUP
            goto Lae
        La7:
            fast r0 = defpackage.fast.GROUP_OPERATION_UNSPECIFIED
            goto Lae
        Laa:
            r5 = 0
            throw r5
        Lac:
            fast r0 = defpackage.fast.GROUP_OPERATION_UNSPECIFIED
        Lae:
            fatc r0 = defpackage.esry.a(r6, r0)
            r5.a(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.essj.b(fbzt, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fast r5, defpackage.ffji r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.essh
            if (r0 == 0) goto L13
            r0 = r7
            essh r0 = (defpackage.essh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            essh r0 = new essh
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            fast r5 = r0.e
            essj r6 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L45
        L2b:
            r7 = move-exception
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ffci.b(r7)
            r0.d = r4     // Catch: java.lang.Throwable -> L48
            r0.e = r5     // Catch: java.lang.Throwable -> L48
            r0.c = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L48:
            r6 = move-exception
            r7 = r6
            r6 = r4
        L4b:
            esrg r6 = r6.c
            fatc r5 = defpackage.esry.a(r7, r5)
            r6.a(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.essj.c(fast, ffji, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0203, code lost:
    
        if (r0 != r9) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0285, code lost:
    
        if (r0 != r9) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0351, code lost:
    
        if (r0 != r9) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x039f, code lost:
    
        if (r0 != r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        if (r0 == r9) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03a4, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fbzt r17, defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.essj.d(fbzt, ffgu):java.lang.Object");
    }
}
