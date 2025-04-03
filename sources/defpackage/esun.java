package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esun implements essr, esuq, esrx {
    public final essk a;
    public final esrg b;
    private final espp c;
    private final esph d;
    private final cprj e;
    private final cpgj f;

    public esun(espp esppVar, essk esskVar, esph esphVar, esrg esrgVar, cprj cprjVar, cpgj cpgjVar) {
        esppVar.getClass();
        esskVar.getClass();
        this.c = esppVar;
        this.a = esskVar;
        this.d = esphVar;
        this.b = esrgVar;
        this.e = cprjVar;
        this.f = cpgjVar;
    }

    public static final String m() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return uuid;
    }

    public static final fata n(esqb esqbVar) {
        fasy fasyVar = (fasy) esqa.a(esqbVar.a).toBuilder();
        fasyVar.getClass();
        int i = esqbVar.b;
        if (i == 0) {
            throw null;
        }
        fasyVar.copyOnWrite();
        fata fataVar = (fata) fasyVar.instance;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        fataVar.d = i - 2;
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(fataVar.e)).getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (esqbVar.getCause() instanceof fedn) {
            Throwable cause = esqbVar.getCause();
            cause.getClass();
            fedn fednVar = (fedn) cause;
            if (fednVar.getCause() instanceof NetworkException) {
                Throwable cause2 = fednVar.getCause();
                cause2.getClass();
                NetworkException networkException = (NetworkException) cause2;
                linkedHashMap.put("CRONET_NETWORK_ERROR", Integer.valueOf(networkException.getErrorCode()));
                linkedHashMap.put("CRONET_INTERNAL_ERROR", Integer.valueOf(networkException.getCronetInternalErrorCode()));
                if (networkException instanceof QuicException) {
                    linkedHashMap.put("CRONET_QUIC_ERROR", Integer.valueOf(((QuicException) networkException).getQuicDetailedErrorCode()));
                }
            }
        }
        fasyVar.copyOnWrite();
        fata fataVar2 = (fata) fasyVar.instance;
        eyhm eyhmVar = fataVar2.e;
        if (!eyhmVar.b) {
            fataVar2.e = eyhmVar.a();
        }
        fataVar2.e.putAll(linkedHashMap);
        return fasp.a(fasyVar);
    }

    public static final esqv q(fcho fchoVar, String str) {
        URI uri;
        esqz a = esra.a();
        emwd m = new esto().m();
        fgte b = fgte.b(fchoVar.f);
        if (b == null) {
            b = fgte.UNRECOGNIZED;
        }
        Object fP = m.fP(b);
        fP.getClass();
        a.e((esrd) fP);
        if (str == null) {
            fcey fceyVar = fchoVar.d;
            if (fceyVar == null) {
                fceyVar = fcey.a;
            }
            str = fceyVar.b;
            str.getClass();
        }
        a.d(str);
        fcey fceyVar2 = fchoVar.d;
        if (fceyVar2 == null) {
            fceyVar2 = fcey.a;
        }
        String str2 = fceyVar2.c;
        a.b(str2 != null ? new esqs(str2) : esqs.a);
        fcey fceyVar3 = fchoVar.d;
        if (fceyVar3 == null) {
            fceyVar3 = fcey.a;
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(fceyVar3.f);
        unmodifiableMap.getClass();
        a.c(unmodifiableMap);
        esrb a2 = a.a();
        esqg esqgVar = new esqg();
        fcek fcekVar = fchoVar.c;
        if (fcekVar == null) {
            fcekVar = fcek.a;
        }
        fcekVar.getClass();
        esqgVar.c(fcekVar);
        String str3 = fchoVar.g;
        str3.getClass();
        try {
            uri = URI.create(str3);
        } catch (IllegalArgumentException unused) {
            esrh d = new esre().d();
            ((esre) d).a = "Failed to parse group conference URI.";
            cpgj.a(d.a());
            uri = null;
        }
        if (uri != null) {
            esqgVar.b(uri);
        }
        esrd esrdVar = a2.b;
        emwd m2 = new estn(esrdVar).m();
        eygr eygrVar = fchoVar.e;
        eygrVar.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(eygrVar, 10));
        Iterator<E> it = eygrVar.iterator();
        while (it.hasNext()) {
            Object fP2 = m2.fP((fchr) it.next());
            fP2.getClass();
            arrayList.add((esqy) fP2);
        }
        fcic fcicVar = fchoVar.h;
        if (fcicVar == null) {
            fcicVar = fcic.a;
        }
        fcicVar.getClass();
        esqr a3 = essv.a(fcicVar);
        if (esrdVar.a(a3)) {
            return new esqv(esqgVar.a(), a2, a3, engq.f(arrayList));
        }
        throw new esso();
    }

    public static final List r(fcaf fcafVar) {
        fcdz fcdzVar;
        eygr eygrVar = fcafVar.c;
        eygrVar.getClass();
        int i = 10;
        ArrayList arrayList = new ArrayList(ffdx.n(eygrVar, 10));
        Iterator it = eygrVar.iterator();
        while (it.hasNext()) {
            fcgc fcgcVar = (fcgc) it.next();
            fcek fcekVar = fcgcVar.b;
            if (fcekVar == null) {
                fcekVar = fcek.a;
            }
            fcekVar.getClass();
            eygr<fcfm> eygrVar2 = fcgcVar.c;
            eygrVar2.getClass();
            ArrayList arrayList2 = new ArrayList(ffdx.n(eygrVar2, i));
            for (fcfm fcfmVar : eygrVar2) {
                fcfmVar.getClass();
                eyee eyeeVar = fcfmVar.c;
                eyeeVar.getClass();
                fcfa fcfaVar = fcfmVar.f;
                if (fcfaVar == null) {
                    fcfaVar = fcfa.a;
                }
                fcfa fcfaVar2 = fcfaVar;
                fcfaVar2.getClass();
                long j = fcfmVar.g;
                eygr<fcdx> eygrVar3 = fcfmVar.e;
                eygrVar3.getClass();
                ArrayList arrayList3 = new ArrayList(ffdx.n(eygrVar3, i));
                for (fcdx fcdxVar : eygrVar3) {
                    fcdxVar.getClass();
                    fcdz fcdzVar2 = fcdxVar.c;
                    if (fcdzVar2 == null) {
                        fcdzVar2 = fcdz.a;
                    }
                    Iterator it2 = it;
                    String str = fcdzVar2.b == 1 ? (String) fcdzVar2.c : "";
                    str.getClass();
                    if ((fcdxVar.b & 2) != 0) {
                        fcdzVar = fcdxVar.d;
                        if (fcdzVar == null) {
                            fcdzVar = fcdz.a;
                        }
                    } else {
                        fcdzVar = null;
                    }
                    arrayList3.add(new esur(str, fcdzVar != null ? fcdzVar.b == 1 ? (String) fcdzVar.c : "" : null));
                    it = it2;
                }
                eygi eygiVar = fcfmVar.d;
                eygiVar.getClass();
                arrayList2.add(new esus(eyeeVar, fcfaVar2, j, arrayList3, eygiVar));
                i = 10;
            }
            arrayList.add(new esuu(fcekVar, arrayList2));
            it = it;
            i = 10;
        }
        return arrayList;
    }

    private static final void s(esro esroVar, String str) {
        esrh c = new esre().c();
        esre esreVar = (esre) c;
        esreVar.b = Optional.of(esroVar.a);
        esreVar.a = str;
        cpgj.a(c.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.esrx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.esqu r12, java.lang.Iterable r13, defpackage.ffgu r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.estu
            if (r0 == 0) goto L13
            r0 = r14
            estu r0 = (defpackage.estu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            estu r0 = new estu
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r14)
            r5 = r11
            goto L59
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.ffci.b(r14)
            boolean r14 = defpackage.ffdx.at(r13)
            if (r14 != 0) goto L3c
            ffel r12 = defpackage.ffel.a
            return r12
        L3c:
            java.lang.String r6 = m()
            estm r9 = new estm
            fast r14 = defpackage.fast.ADD_GROUP_USERS
            r9.<init>(r14, r6)
            estv r4 = new estv
            r10 = 0
            r5 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.c = r3
            java.lang.Object r14 = r11.j(r9, r4, r0)
            if (r14 != r1) goto L59
            return r1
        L59:
            r14.getClass()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esun.a(esqu, java.lang.Iterable, ffgu):java.lang.Object");
    }

    @Override // defpackage.esrx
    public final Object b(esqm esqmVar, ffgu ffguVar) {
        String m = m();
        estm estmVar = new estm(fast.CREATE_GROUP, m, esqmVar.d);
        return j(estmVar, new estw(this, m, esqmVar, estmVar, null), ffguVar);
    }

    @Override // defpackage.esrx
    public final Object c(esqu esquVar, ffgu ffguVar) {
        String m = m();
        estm estmVar = new estm(fast.GET_GROUP_INFO, m);
        return j(estmVar, new esty(this, m, esquVar, estmVar, null), ffguVar);
    }

    @Override // defpackage.esrx
    public final Object d(Iterable iterable, ffgu ffguVar) {
        if (!ffdx.at(iterable)) {
            return ffel.a;
        }
        String m = m();
        estm estmVar = new estm(fast.GET_GROUP_INFOS, m);
        return j(estmVar, new estz(this, m, iterable, estmVar, null), ffguVar);
    }

    @Override // defpackage.esrx
    public final Object e(ffgu ffguVar) {
        String m = m();
        estm estmVar = new estm(fast.GET_GROUP_IDS, m);
        return j(estmVar, new esua(this, m, estmVar, null), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.esrx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.esqu r12, java.lang.Iterable r13, defpackage.ffgu r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.esug
            if (r0 == 0) goto L13
            r0 = r14
            esug r0 = (defpackage.esug) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            esug r0 = new esug
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r14)
            r5 = r11
            goto L59
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.ffci.b(r14)
            boolean r14 = defpackage.ffdx.at(r13)
            if (r14 != 0) goto L3c
            ffel r12 = defpackage.ffel.a
            return r12
        L3c:
            java.lang.String r6 = m()
            estm r9 = new estm
            fast r14 = defpackage.fast.KICK_GROUP_USERS
            r9.<init>(r14, r6)
            esuh r4 = new esuh
            r10 = 0
            r5 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.c = r3
            java.lang.Object r14 = r11.j(r9, r4, r0)
            if (r14 != r1) goto L59
            return r1
        L59:
            r14.getClass()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esun.f(esqu, java.lang.Iterable, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.esrx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.esqu r12, defpackage.esrc r13, defpackage.ffgu r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.esul
            if (r0 == 0) goto L13
            r0 = r14
            esul r0 = (defpackage.esul) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            esul r0 = new esul
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r14)
            r5 = r11
            goto L58
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.ffci.b(r14)
            boolean r14 = r13.a()
            if (r14 != 0) goto L5d
            esqd r14 = r13.c
            java.lang.String r6 = m()
            estm r9 = new estm
            fast r2 = defpackage.fast.GROUP_PROFILE_UPDATED
            r9.<init>(r2, r6, r14)
            esum r4 = new esum
            r10 = 0
            r5 = r11
            r8 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.c = r3
            java.lang.Object r14 = r11.j(r9, r4, r0)
            if (r14 != r1) goto L58
            return r1
        L58:
            fcgu r14 = (defpackage.fcgu) r14
            ffcu r12 = defpackage.ffcu.a
            return r12
        L5d:
            r5 = r11
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Must provide at least one property to update."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esun.g(esqu, esrc, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.essr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.esro r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.esui
            if (r0 == 0) goto L13
            r0 = r12
            esui r0 = (defpackage.esui) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            esui r0 = new esui
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r12)
            r5 = r10
            goto L52
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            defpackage.ffci.b(r12)
            java.lang.String r12 = "Revoking message"
            s(r11, r12)
            java.lang.String r6 = m()
            estr r8 = new estr
            r8.<init>(r11, r6)
            esuj r4 = new esuj
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r12 = r10.j(r8, r4, r0)
            if (r12 != r1) goto L52
            return r1
        L52:
            fccf r12 = (defpackage.fccf) r12
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esun.h(esro, ffgu):java.lang.Object");
    }

    @Override // defpackage.essr
    public final Object i(esqf esqfVar, esro esroVar, ffgu ffguVar) {
        s(esroVar, "Sending message");
        String m = m();
        estq estqVar = new estq(esroVar, esqfVar, m, esroVar.f);
        return j(estqVar, new esuk(this, m, esroVar, esqfVar, estqVar, null), ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v7, types: [estj] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.estj r5, defpackage.ffji r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.estt
            if (r0 == 0) goto L13
            r0 = r7
            estt r0 = (defpackage.estt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            estt r0 = new estt
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.a
            esun r6 = r0.e
            defpackage.ffci.b(r7)     // Catch: defpackage.esqb -> L2b io.grpc.StatusException -> L2d
            goto L48
        L2b:
            r7 = move-exception
            goto L55
        L2d:
            r7 = move-exception
            goto L62
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.ffci.b(r7)
            r0.e = r4     // Catch: defpackage.esqb -> L52 io.grpc.StatusException -> L5f
            r0.a = r5     // Catch: defpackage.esqb -> L52 io.grpc.StatusException -> L5f
            r0.d = r3     // Catch: defpackage.esqb -> L52 io.grpc.StatusException -> L5f
            java.lang.Object r7 = r6.invoke(r0)     // Catch: defpackage.esqb -> L52 io.grpc.StatusException -> L5f
            if (r7 != r1) goto L47
            return r1
        L47:
            r6 = r4
        L48:
            esrg r0 = r6.b     // Catch: defpackage.esqb -> L2b io.grpc.StatusException -> L2d
            fatc r1 = r5.c()     // Catch: defpackage.esqb -> L2b io.grpc.StatusException -> L2d
            r0.a(r1)     // Catch: defpackage.esqb -> L2b io.grpc.StatusException -> L2d
            return r7
        L52:
            r6 = move-exception
            r7 = r6
            r6 = r4
        L55:
            esrg r6 = r6.b
            fatc r5 = r5.a(r7)
            r6.a(r5)
            throw r7
        L5f:
            r6 = move-exception
            r7 = r6
            r6 = r4
        L62:
            estd r0 = new estd
            cpgj r1 = r6.f
            io.grpc.Status r1 = r7.a
            r1.getClass()
            febo r2 = r7.b
            espw r1 = defpackage.essm.b(r1, r2)
            io.grpc.Status r2 = r7.a
            r2.getClass()
            java.lang.String r3 = "GRPC error in TachygramTransport"
            r0.<init>(r3, r1, r7, r2)
            esrg r6 = r6.b
            fatc r5 = r5.a(r0)
            r6.a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esun.j(estj, ffji, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r7, defpackage.esqd r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esun.k(java.lang.String, esqd, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.esuq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.fcek r12, int r13, defpackage.ffgu r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.esue
            if (r0 == 0) goto L13
            r0 = r14
            esue r0 = (defpackage.esue) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            esue r0 = new esue
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r14)
            r5 = r11
            goto L4f
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.ffci.b(r14)
            java.lang.String r6 = m()
            ests r9 = new ests
            r14 = 5
            r9.<init>(r14, r6)
            esuf r4 = new esuf
            r10 = 0
            r5 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.c = r3
            java.lang.Object r14 = r11.j(r9, r4, r0)
            if (r14 != r1) goto L4f
            return r1
        L4f:
            fcan r14 = (defpackage.fcan) r14
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esun.p(fcek, int, ffgu):java.lang.Object");
    }
}
