package defpackage;

import android.content.Context;
import j$.util.Map;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgvm {
    public static final /* synthetic */ int a = 0;
    private static final Map b;
    private static final entd c;
    private static final cfup d;
    private final Context e;
    private final Optional f;
    private final Optional g;
    private final cqoh h;
    private final ctyp i;
    private final cgvp j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private fanw p;

    static {
        eslj esljVar = eslj.WRONG_VERIFICATION_CODE_SELECTED;
        fagh faghVar = fagh.INTERNAL;
        eslj esljVar2 = eslj.USER_CANCELED_VERIFICATION;
        fagh faghVar2 = fagh.ABORTED;
        b = ffew.g(new ffcf(eslj.NONE, fagh.OK), new ffcf(esljVar, faghVar), new ffcf(eslj.VERIFICATION_TIMED_OUT, fagh.DEADLINE_EXCEEDED), new ffcf(esljVar2, faghVar2), new ffcf(eslj.USER_DENIED_VERIFICATION_NOT_ME, faghVar2), new ffcf(eslj.USER_CANCELED_VERIFICATION_ON_WEB, faghVar2), new ffcf(eslj.VERIFICATION_EMOJI_DOWNLOAD_FAILED, faghVar2), new ffcf(eslj.NEW_REQUEST_WHILE_WAITING_FOR_VERIFICATION, faghVar2), new ffcf(eslj.NOT_LATEST_ATTEMPT, faghVar), new ffcf(eslj.REQUEST_COMPLETE_WITH_UNKNOWN_RESULT, faghVar), new ffcf(eslj.VERIFICATION_DATA_SERVICE_NOT_PRESENT, faghVar), new ffcf(eslj.VERIFICATION_INTENTS_NOT_PRESENT, faghVar), new ffcf(eslj.REQUEST_OUT_OF_DATE, faghVar), new ffcf(eslj.REQUEST_NOT_RECEIVED_QUICKLY, faghVar), new ffcf(eslj.UKEY2_MESSAGE_MISSING, faghVar), new ffcf(eslj.UKEY2_ALERT_ERROR, faghVar), new ffcf(eslj.UKEY2_HANDSHAKE_ERROR, faghVar), new ffcf(eslj.UKEY2_OTHER_ERROR, faghVar), new ffcf(eslj.WRONG_UKEY2_MESSAGE_TYPE, faghVar), new ffcf(eslj.CMS_BACKUP_KEY_NOT_FOUND, faghVar), new ffcf(eslj.UNABLE_TO_ENCRYPT_CMS_BACKUP_KEY, faghVar));
        c = entd.c("BugleGDitto");
        d = cfvl.f(cfvl.b, "request_expiration_timeout_millis", 300000L);
    }

    public cgvm(Context context, Optional optional, Optional optional2, cqoh cqohVar, ctyp ctypVar, cgvp cgvpVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        context.getClass();
        cqohVar.getClass();
        cgvpVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.e = context;
        this.f = optional;
        this.g = optional2;
        this.h = cqohVar;
        this.i = ctypVar;
        this.j = cgvpVar;
        this.k = ffbrVar;
        this.l = ffbrVar2;
        this.m = ffbrVar3;
        this.n = ffbrVar4;
        this.o = ffbrVar5;
    }

    public static /* synthetic */ void m(cgvm cgvmVar, String str, String str2, ezlj ezljVar, Integer num, Integer num2, int i) {
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        cgvmVar.q(str, str2, ezljVar, num, num2, 2);
    }

    public static /* synthetic */ Optional r(cgvm cgvmVar, String str, String str2, eslj esljVar, ezlj ezljVar, int i, int i2) {
        if ((i2 & 16) != 0) {
            i = 2;
        }
        return cgvmVar.n(str, str2, esljVar, ezljVar, i, null);
    }

    public final eslj a(cgvo cgvoVar) {
        cgvoVar.getClass();
        switch (cgvoVar.ordinal()) {
            case 1:
                ((ensz) c.h()).q("Sending Gaia pairing wrong verification code selected response");
                return eslj.WRONG_VERIFICATION_CODE_SELECTED;
            case 2:
                ((ensz) c.h()).q("Sending Gaia pairing user canceled verification response");
                return eslj.USER_CANCELED_VERIFICATION;
            case 3:
                ((ensz) c.h()).q("Sending Gaia pairing user canceled verification on web response");
                return eslj.USER_CANCELED_VERIFICATION_ON_WEB;
            case 4:
                ((ensz) c.h()).q("Sending Gaia pairing user denied verification response");
                return eslj.USER_DENIED_VERIFICATION_NOT_ME;
            case 5:
                ((ensz) c.j()).q("Sending Gaia pairing emoji downloaded failed response");
                return eslj.VERIFICATION_EMOJI_DOWNLOAD_FAILED;
            case 6:
                ((ensz) c.h()).q("Sending Gaia pairing verification time out response");
                return eslj.VERIFICATION_TIMED_OUT;
            case 7:
                ((ensz) c.h()).q("Sending Gaia pairing success response");
                return eslj.NONE;
            case 8:
                ((ensz) c.h()).q("Sending new request while waiting for verification response");
                return eslj.NEW_REQUEST_WHILE_WAITING_FOR_VERIFICATION;
            default:
                ((ensz) c.j()).q("Sending request complete with unknown result response");
                return eslj.REQUEST_COMPLETE_WITH_UNKNOWN_RESULT;
        }
    }

    public final eslj b(eslh eslhVar) {
        eslhVar.getClass();
        entd entdVar = c;
        entdVar.n().C("Received client finish, attemptId: %s, timestamp: %d", eslhVar.c, eslhVar.e);
        if (ffkj.e(this.j.a.get(), eslhVar.c)) {
            return null;
        }
        entdVar.n().t("Current attempt(%s) is not the latest attempt, ignoring", eslhVar.c);
        return eslj.NOT_LATEST_ATTEMPT;
    }

    public final eslj c(eslh eslhVar) {
        eslhVar.getClass();
        entd entdVar = c;
        entdVar.n().C("Received client init, attemptId: %s, timestamp: %d", eslhVar.c, eslhVar.e);
        if (ffkj.e(this.j.a.get(), eslhVar.c)) {
            return null;
        }
        if (this.j.b.get() >= eslhVar.e) {
            entdVar.n().t("Current attempt(%s) is not the latest attempt, ignoring", eslhVar.c);
            return eslj.NOT_LATEST_ATTEMPT;
        }
        entdVar.n().t("Current attempt(%s) is the latest attempt, updating", eslhVar.c);
        cgvp cgvpVar = this.j;
        cgvpVar.a.set(eslhVar.c);
        cgvp cgvpVar2 = this.j;
        cgvpVar2.b.set(eslhVar.e);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cgvf
            if (r0 == 0) goto L13
            r0 = r5
            cgvf r0 = (defpackage.cgvf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgvf r0 = new cgvf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            ctyp r5 = r4.i
            cfup r2 = defpackage.bzaq.j
            java.lang.Object r2 = r2.e()
            java.lang.String r2 = (java.lang.String) r2
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a(r2)
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            long r0 = java.lang.Long.parseLong(r5)
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgvm.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:3|(5:5|6|(1:(1:9)(2:72|73))(2:74|(1:76)(1:77))|10|(7:14|15|(1:17)|18|(1:20)(1:37)|21|(2:35|36)(5:25|(1:27)(1:34)|(1:29)(1:33)|30|31))(11:47|48|(1:50)|51|(1:53)|54|55|56|57|58|59)))|47|48|(0)|51|(0)|54|55|56|57|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0182, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0183, code lost:
    
        r8.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: Exception -> 0x0124, fans -> 0x012b, fant -> 0x0132, TryCatch #4 {fans -> 0x012b, fant -> 0x0132, Exception -> 0x0124, blocks: (B:15:0x005c, B:17:0x0060, B:18:0x0064, B:20:0x006b, B:21:0x0070, B:23:0x0083, B:25:0x0089, B:30:0x00a2, B:35:0x011c, B:36:0x0123), top: B:14:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[Catch: Exception -> 0x0124, fans -> 0x012b, fant -> 0x0132, TryCatch #4 {fans -> 0x012b, fant -> 0x0132, Exception -> 0x0124, blocks: (B:15:0x005c, B:17:0x0060, B:18:0x0064, B:20:0x006b, B:21:0x0070, B:23:0x0083, B:25:0x0089, B:30:0x00a2, B:35:0x011c, B:36:0x0123), top: B:14:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d A[Catch: Exception -> 0x019a, fans -> 0x01a1, fant -> 0x01a8, TryCatch #5 {fans -> 0x01a1, fant -> 0x01a8, Exception -> 0x019a, blocks: (B:48:0x0139, B:50:0x013d, B:51:0x0141, B:53:0x0148, B:54:0x014c, B:56:0x0155, B:57:0x017d, B:62:0x0183), top: B:47:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148 A[Catch: Exception -> 0x019a, fans -> 0x01a1, fant -> 0x01a8, TryCatch #5 {fans -> 0x01a1, fant -> 0x01a8, Exception -> 0x019a, blocks: (B:48:0x0139, B:50:0x013d, B:51:0x0141, B:53:0x0148, B:54:0x014c, B:56:0x0155, B:57:0x017d, B:62:0x0183), top: B:47:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v3, types: [bzme, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r8) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgvm.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v3, types: [bzme, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cgvh
            if (r0 == 0) goto L13
            r0 = r5
            cgvh r0 = (defpackage.cgvh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgvh r0 = new cgvh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            j$.util.Optional r5 = r4.f
            java.lang.Object r5 = r5.get()
            elfl r5 = r5.c()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L70
        L44:
            bzlz r5 = (defpackage.bzlz) r5
            r0 = 0
            if (r5 == 0) goto L6f
            int r5 = r5.ordinal()
            r1 = 5
            if (r5 == r1) goto L6c
            r1 = 10
            if (r5 == r1) goto L69
            r1 = 11
            if (r5 == r1) goto L66
            entd r5 = defpackage.cgvm.c
            ensk r5 = r5.j()
            ensz r5 = (defpackage.ensz) r5
            java.lang.String r1 = "Expected a user cancel event, but found none."
            r5.q(r1)
            return r0
        L66:
            eslj r5 = defpackage.eslj.USER_CANCELED_VERIFICATION_ON_WEB
            return r5
        L69:
            eslj r5 = defpackage.eslj.USER_DENIED_VERIFICATION_NOT_ME
            return r5
        L6c:
            eslj r5 = defpackage.eslj.USER_CANCELED_VERIFICATION
            return r5
        L6f:
            return r0
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgvm.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v3, types: [bzme, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cgvr r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cgvi
            if (r0 == 0) goto L13
            r0 = r6
            cgvi r0 = (defpackage.cgvi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgvi r0 = new cgvi
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cgvr r5 = r0.e
            cgvm r0 = r0.d
            defpackage.ffci.b(r6)
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            j$.util.Optional r6 = r4.f
            java.lang.Object r6 = r6.get()
            bzlz r2 = defpackage.bzlz.ERROR_UKEY2
            elfl r6 = r6.g(r2)
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto Ldc
            r0 = r4
        L4f:
            cgvp r6 = r0.j
            cgvo r0 = defpackage.cgvo.j
            r6.b(r0)
            int r6 = r5.a
            int r0 = r6 + (-1)
            r1 = 0
            if (r6 == 0) goto Ldb
            r6 = 2
            if (r0 == r3) goto L88
            if (r0 == r6) goto L75
            entd r6 = defpackage.cgvm.c
            ensk r6 = r6.j()
            java.lang.String r0 = "OTHER_EXCEPTION"
            defpackage.a.K(r6, r0, r5)
            ffcf r5 = new ffcf
            eslj r6 = defpackage.eslj.UKEY2_OTHER_ERROR
            r5.<init>(r6, r1)
            return r5
        L75:
            entd r6 = defpackage.cgvm.c
            ensk r6 = r6.j()
            java.lang.String r0 = "HANDSHAKE_EXCEPTION"
            defpackage.a.K(r6, r0, r5)
            ffcf r5 = new ffcf
            eslj r6 = defpackage.eslj.UKEY2_HANDSHAKE_ERROR
            r5.<init>(r6, r1)
            return r5
        L88:
            entd r0 = defpackage.cgvm.c
            ensk r0 = r0.j()
            java.lang.String r1 = "ALERT_EXCEPTION"
            defpackage.a.K(r0, r1, r5)
            faom r0 = defpackage.faom.a
            eyfq r0 = r0.createBuilder()
            faoj r0 = (defpackage.faoj) r0
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r0.instance
            faom r1 = (defpackage.faom) r1
            r1.c = r3
            int r2 = r1.b
            r2 = r2 | r3
            r1.b = r2
            java.lang.Throwable r5 = r5.getCause()
            r5.getClass()
            fant r5 = (defpackage.fant) r5
            faoa r5 = r5.a
            byte[] r5 = r5.toByteArray()
            eyee r5 = defpackage.eyee.x(r5)
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r0.instance
            faom r1 = (defpackage.faom) r1
            int r2 = r1.b
            r6 = r6 | r2
            r1.b = r6
            r1.d = r5
            eyfy r5 = r0.build()
            r5.getClass()
            faom r5 = (defpackage.faom) r5
            ffcf r6 = new ffcf
            eslj r0 = defpackage.eslj.UKEY2_ALERT_ERROR
            r6.<init>(r0, r5)
            return r6
        Ldb:
            throw r1
        Ldc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgvm.g(cgvr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r5, defpackage.eslh r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.cgvk
            if (r0 == 0) goto L13
            r0 = r8
            cgvk r0 = (defpackage.cgvk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cgvk r0 = new cgvk
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r5 = r0.a
            eslh r7 = r0.e
            defpackage.ffci.b(r8)
            goto L6e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r8)
            j$.util.Optional r8 = r4.f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L4c
            entd r5 = defpackage.cgvm.c
            ensk r5 = r5.n()
            java.lang.String r6 = "verificationDataService is not present"
            r5.q(r6)
            eslj r5 = defpackage.eslj.VERIFICATION_DATA_SERVICE_NOT_PRESENT
            return r5
        L4c:
            j$.util.Optional r8 = r4.g
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L62
            entd r5 = defpackage.cgvm.c
            ensk r5 = r5.n()
            java.lang.String r6 = "pairingVerificationIntents is not present"
            r5.q(r6)
            eslj r5 = defpackage.eslj.VERIFICATION_INTENTS_NOT_PRESENT
            return r5
        L62:
            r0.e = r7
            r0.a = r5
            r0.d = r3
            java.lang.Object r8 = r4.d(r0)
            if (r8 == r1) goto Lcd
        L6e:
            java.lang.Number r8 = (java.lang.Number) r8
            long r0 = r8.longValue()
            long r2 = r7.e
            long r0 = r0 - r2
            cfup r8 = defpackage.cgvm.d
            java.lang.Object r2 = r8.e()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L95
            entd r5 = defpackage.cgvm.c
            ensk r5 = r5.n()
            java.lang.String r6 = "received the request initiated %s ms ago, ignoring"
            r5.s(r6, r0)
            eslj r5 = defpackage.eslj.REQUEST_OUT_OF_DATE
            return r5
        L95:
            java.lang.Object r8 = r8.e()
            java.lang.Number r8 = (java.lang.Number) r8
            long r0 = r8.longValue()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 > 0) goto Lbe
            int r5 = r7.b
            r5 = r5 & 2
            if (r5 == 0) goto Lae
            r5 = 0
            return r5
        Lae:
            entd r5 = defpackage.cgvm.c
            ensk r5 = r5.j()
            ensz r5 = (defpackage.ensz) r5
            java.lang.String r6 = "The Ukey2Message is missing"
            r5.q(r6)
            eslj r5 = defpackage.eslj.UKEY2_MESSAGE_MISSING
            return r5
        Lbe:
            entd r7 = defpackage.cgvm.c
            ensk r7 = r7.n()
            long r5 = r5 / r2
            java.lang.String r8 = "The age %s ms of the message is too old, ignoring"
            r7.s(r8, r5)
            eslj r5 = defpackage.eslj.REQUEST_NOT_RECEIVED_QUICKLY
            return r5
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgvm.h(long, eslh, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v3, types: [bzme, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(byte[] r5, defpackage.ffgu r6) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgvm.i(byte[], ffgu):java.lang.Object");
    }

    public final boolean j(String str) {
        boolean booleanValue;
        str.getClass();
        cgvp cgvpVar = this.j;
        synchronized (cgvpVar.c) {
            Boolean bool = (Boolean) cgvpVar.d.get(str);
            booleanValue = bool != null ? bool.booleanValue() : false;
        }
        if (booleanValue) {
            c.n().t("Received duplicated request (%s), ignoring", str);
            return true;
        }
        cgvp cgvpVar2 = this.j;
        synchronized (cgvpVar2.c) {
            if (str.length() > 0) {
                cgvpVar2.d.put(str, true);
            }
        }
        return false;
    }

    public final byte[] k(faom faomVar) {
        byte[] bArr;
        faomVar.getClass();
        try {
            fanw fanwVar = new fanw(fanu.a);
            this.p = fanwVar;
            fanwVar.b(faomVar.toByteArray());
            fanw fanwVar2 = this.p;
            if (fanwVar2 == null) {
                ffkj.c("handshake");
                fanwVar2 = null;
            }
            int i = fanwVar2.f;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                faod faodVar = (faod) faog.a.createBuilder();
                faodVar.copyOnWrite();
                faog faogVar = (faog) faodVar.instance;
                faogVar.b |= 1;
                faogVar.c = 1;
                eyee x = eyee.x(fanw.e());
                faodVar.copyOnWrite();
                faog faogVar2 = (faog) faodVar.instance;
                faogVar2.b |= 2;
                faogVar2.d = x;
                faodVar.copyOnWrite();
                faog faogVar3 = (faog) faodVar.instance;
                faogVar3.b |= 4;
                faogVar3.f = "AES_256_CBC-HMAC_SHA256";
                if (!fanwVar2.a.containsKey(fanu.a)) {
                    byte[] byteArray = faoq.a(fanwVar2.c.getPublic()).toByteArray();
                    faob faobVar = (faob) faoc.a.createBuilder();
                    eyee x2 = eyee.x(byteArray);
                    faobVar.copyOnWrite();
                    faoc faocVar = (faoc) faobVar.instance;
                    faocVar.b |= 1;
                    faocVar.c = x2;
                    fanwVar2.a.put(fanu.a, fanwVar2.h(5, ((faoc) faobVar.build()).toByteArray()));
                }
                faoe faoeVar = (faoe) faof.a.createBuilder();
                faoeVar.copyOnWrite();
                faof faofVar = (faof) faoeVar.instance;
                faofVar.c = 100;
                faofVar.b |= 1;
                eyee x3 = eyee.x(fanwVar2.f((byte[]) fanwVar2.a.get(fanu.a)));
                faoeVar.copyOnWrite();
                faof faofVar2 = (faof) faoeVar.instance;
                faofVar2.b |= 2;
                faofVar2.d = x3;
                faof faofVar3 = (faof) faoeVar.build();
                faodVar.copyOnWrite();
                faog faogVar4 = (faog) faodVar.instance;
                faofVar3.getClass();
                eygr eygrVar = faogVar4.e;
                if (!eygrVar.c()) {
                    faogVar4.e = eyfy.mutableCopy(eygrVar);
                }
                faogVar4.e.add(faofVar3);
                fanwVar2.d = fanwVar2.h(3, ((faog) faodVar.build()).toByteArray());
                fanwVar2.f = 2;
                bArr = fanwVar2.d;
            } else if (i2 == 2) {
                if (!fanwVar2.a.containsKey(fanwVar2.b)) {
                    fanwVar2.c("Client state is CLIENT_AFTER_SERVER_INIT, and cipher is " + String.valueOf(fanwVar2.b) + ", but no corresponding raw client finished message has been generated");
                }
                fanwVar2.f = 7;
                bArr = (byte[]) fanwVar2.a.get(fanwVar2.b);
            } else {
                if (i2 != 4) {
                    fanwVar2.c("Cannot get next message in state: ".concat(fanv.a(i)));
                    throw new AssertionError();
                }
                faon faonVar = (faon) faoo.a.createBuilder();
                faonVar.copyOnWrite();
                faoo faooVar = (faoo) faonVar.instance;
                faooVar.b |= 1;
                faooVar.c = 1;
                eyee x4 = eyee.x(fanw.e());
                faonVar.copyOnWrite();
                faoo faooVar2 = (faoo) faonVar.instance;
                faooVar2.b |= 2;
                faooVar2.d = x4;
                int i3 = fanwVar2.b.b;
                faonVar.copyOnWrite();
                faoo faooVar3 = (faoo) faonVar.instance;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                faooVar3.e = i4;
                faooVar3.b |= 4;
                eyee byteString = faoq.a(fanwVar2.c.getPublic()).toByteString();
                faonVar.copyOnWrite();
                faoo faooVar4 = (faoo) faonVar.instance;
                faooVar4.b |= 8;
                faooVar4.f = byteString;
                fanwVar2.e = fanwVar2.h(4, ((faoo) faonVar.build()).toByteArray());
                fanwVar2.f = 6;
                bArr = fanwVar2.e;
            }
            bArr.getClass();
            return bArr;
        } catch (fans e) {
            throw new cgvr(e, 3);
        } catch (fant e2) {
            throw new cgvr(e2, 2);
        } catch (Exception e3) {
            throw new cgvr(e3, 1);
        }
    }

    public final byte[] l(faom faomVar) {
        faomVar.getClass();
        try {
            fanw fanwVar = this.p;
            fanw fanwVar2 = null;
            if (fanwVar == null) {
                ffkj.c("handshake");
                fanwVar = null;
            }
            fanwVar.b(faomVar.toByteArray());
            fanw fanwVar3 = this.p;
            if (fanwVar3 == null) {
                ffkj.c("handshake");
            } else {
                fanwVar2 = fanwVar3;
            }
            byte[] g = fanwVar2.g();
            g.getClass();
            return g;
        } catch (fans e) {
            throw new cgvr(e, 3);
        } catch (fant e2) {
            throw new cgvr(e2, 2);
        } catch (Exception e3) {
            throw new cgvr(e3, 1);
        }
    }

    public final Optional n(String str, String str2, eslj esljVar, ezlj ezljVar, int i, faom faomVar) {
        str.getClass();
        str2.getClass();
        esljVar.getClass();
        ezljVar.getClass();
        if (i == 0) {
            throw null;
        }
        if (esljVar == eslj.USER_CANCELED_VERIFICATION_ON_WEB) {
            ezljVar = ezlj.CREATE_GAIA_PAIRING_CANCELED;
        }
        fagh faghVar = (fagh) Map.EL.getOrDefault(b, esljVar, fagh.UNKNOWN);
        ((bzea) this.n.b()).t(ezljVar, i, str2, str, esljVar, faghVar);
        esli esliVar = (esli) eslk.a.createBuilder();
        esliVar.getClass();
        if (faomVar != null) {
            esll.h(faomVar, esliVar);
        }
        esll.f(str, esliVar);
        esll.d(esljVar, esliVar);
        esll.g(faghVar, esliVar);
        return Optional.of(esll.a(esliVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v1, types: [bzme, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.eslh r11, int r12, defpackage.ffgu r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.cgvj
            if (r0 == 0) goto L13
            r0 = r13
            cgvj r0 = (defpackage.cgvj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cgvj r0 = new cgvj
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r11 = r0.b
            int r12 = r0.a
            defpackage.ffci.b(r13)
            goto L7d
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            defpackage.ffci.b(r13)
            int r13 = r11.g
            int r7 = defpackage.ffmk.g(r3, r13)
            entd r13 = defpackage.cgvm.c
            ensk r2 = r13.h()
            ensz r2 = (defpackage.ensz) r2
            java.lang.String r4 = "verificationCodeRevision: %s"
            r2.r(r4, r7)
            int r11 = r11.h
            int r8 = defpackage.ffmk.g(r3, r11)
            ensk r11 = r13.h()
            ensz r11 = (defpackage.ensz) r11
            java.lang.String r13 = "confirmedKeyDerivation: %s"
            r11.r(r13, r8)
            j$.util.Optional r11 = r10.f
            cqoh r13 = r10.h
            java.lang.Object r4 = r11.get()
            j$.time.Instant r11 = r13.f()
            long r5 = r11.toEpochMilli()
            r9 = r12
            elfl r11 = r4.l(r5, r7, r8, r9)
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r11 = defpackage.fgfz.c(r11, r0)
            if (r11 == r1) goto L8d
            r12 = r7
            r11 = r8
        L7d:
            ffcf r13 = new ffcf
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            r13.<init>(r0, r12)
            return r13
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgvm.o(eslh, int, ffgu):java.lang.Object");
    }

    public final void p(String str, String str2, ezlj ezljVar, int i, int i2, int i3) {
        str2.getClass();
        ezljVar.getClass();
        ((bzea) this.n.b()).s(ezljVar, i3, str2, str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void q(String str, String str2, ezlj ezljVar, Integer num, Integer num2, int i) {
        str.getClass();
        str2.getClass();
        ezljVar.getClass();
        ((bzea) this.n.b()).u(ezljVar, i, str2, str, num, num2);
    }
}
