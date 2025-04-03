package defpackage;

import android.content.Context;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.File;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajyr {
    public static final entd a = entd.c("BugleBackup");
    public final ffhd b;
    public final ffbr c;
    public final cqoh d;
    public final ffsk e;
    public final Context f;
    public final ffbr g;
    public final ffsk h;
    public final azac i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;

    public ajyr(ffhd ffhdVar, ffbr ffbrVar, cqoh cqohVar, ffsk ffskVar, Context context, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar2, azac azacVar, ffbr ffbrVar5) {
        ffhdVar.getClass();
        ffbrVar.getClass();
        cqohVar.getClass();
        ffskVar.getClass();
        context.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffskVar2.getClass();
        azacVar.getClass();
        ffbrVar5.getClass();
        this.b = ffhdVar;
        this.c = ffbrVar;
        this.d = cqohVar;
        this.e = ffskVar;
        this.f = context;
        this.j = ffbrVar2;
        this.g = ffbrVar3;
        this.k = ffbrVar4;
        this.h = ffskVar2;
        this.i = azacVar;
        this.l = ffbrVar5;
    }

    public static final long A(final UUID uuid) {
        bxkz a2 = bxle.a();
        a2.z("getRestoreWorkflowExecutionIdSync");
        a2.c(new Function() { // from class: ajwn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxld bxldVar = (bxld) obj;
                entd entdVar = ajyr.a;
                bxldVar.b(Optional.of(uuid));
                return bxldVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bxjb bxjbVar = (bxjb) ((bxkf) a2.b().o()).cS();
        if (bxjbVar != null) {
            return bxjbVar.k();
        }
        throw new ajww(uuid);
    }

    public static final void B(bxld bxldVar) {
        akci akciVar = akci.COMPLETE_SUCCESS;
        bxldVar.aq(new dtwe("restore_workflow_executions.status", 9, Integer.valueOf(akciVar == null ? 0 : akciVar.q)));
    }

    public static final boolean x(bxjb bxjbVar) {
        return bxjbVar.m().compareTo(akci.COMPLETE_SUCCESS) < 0;
    }

    public static final ajwc y(bxjb bxjbVar) {
        bxjbVar.az(1, "session_id");
        Object orElseThrow = bxjbVar.b.orElseThrow();
        orElseThrow.getClass();
        UUID uuid = (UUID) orElseThrow;
        akci m = bxjbVar.m();
        m.getClass();
        bxjbVar.az(2, "feature");
        akdb akdbVar = bxjbVar.c;
        akdbVar.getClass();
        bxjbVar.az(4, "start_time");
        Instant instant = bxjbVar.e;
        instant.getClass();
        bxjbVar.az(5, "finish_time");
        Instant instant2 = bxjbVar.f;
        akcd l = bxjbVar.l();
        bxjbVar.az(7, "initial_messages_version");
        long j = bxjbVar.h;
        bxjbVar.az(8, "status_timestamp");
        Instant instant3 = bxjbVar.i;
        instant3.getClass();
        bxjbVar.az(9, "last_attachment_request_timestamp");
        Instant instant4 = bxjbVar.j;
        instant4.getClass();
        bxjbVar.az(10, "config");
        akcz akczVar = bxjbVar.k;
        if (akczVar == null) {
            akczVar = akcz.a;
            akczVar.getClass();
        }
        return new ajwc(uuid, akdbVar, m, instant, instant2, l, j, instant3, instant4, akczVar);
    }

    public final File a(UUID uuid, akcb akcbVar, String str) {
        return new File(c(uuid), "original_message_" + akcbVar.d + "_part_" + akcbVar.c + "." + str);
    }

    public final File b(UUID uuid, akcb akcbVar) {
        return a(uuid, akcbVar, "metadata");
    }

    public final File c(UUID uuid) {
        uuid.getClass();
        File filesDir = this.f.getFilesDir();
        Objects.toString(uuid);
        File file = new File(filesDir, "attachment_restore/".concat(uuid.toString()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final Object d(UUID uuid, akcg akcgVar, ffgu ffguVar) {
        if (akcgVar.c != 3) {
            throw new IllegalArgumentException("attachmentMetadata must contain field AttachmentMetadata");
        }
        Object a2 = ffra.a(ekxi.a(this.b), new ajwy(null, this, uuid, akcgVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.Set r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyr.e(java.util.Set, ffgu):java.lang.Object");
    }

    public final Object f(UUID uuid, akci akciVar, ffgu ffguVar) {
        if (akciVar.compareTo(akci.COMPLETE_SUCCESS) < 0) {
            throw new IllegalArgumentException(a.i(akciVar, "status [", "] is not a completed status"));
        }
        Object a2 = ffra.a(ekxi.a(this.b), new ajxc(null, this, uuid, akciVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ajxg
            if (r0 == 0) goto L13
            r0 = r5
            ajxg r0 = (defpackage.ajxg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajxg r0 = new ajxg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.i(r0)
            if (r5 == r1) goto L67
        L3a:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L4c
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4c
        L4a:
            r3 = r1
            goto L62
        L4c:
            java.util.Iterator r5 = r5.iterator()
        L50:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r5.next()
            ajwc r0 = (defpackage.ajwc) r0
            akdb r0 = r0.b
            akdb r2 = defpackage.akdb.D2D
            if (r0 != r2) goto L50
        L62:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyr.g(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ajxh
            if (r0 == 0) goto L13
            r0 = r6
            ajxh r0 = (defpackage.ajxh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajxh r0 = new ajxh
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            r0.c = r3
            ffhd r6 = r5.b
            ffhd r6 = defpackage.ekxi.a(r6)
            ajyg r2 = new ajyg
            r4 = 0
            r2.<init>(r4, r5)
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 == r1) goto L73
        L46:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L58
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L58
        L56:
            r3 = r1
            goto L6e
        L58:
            java.util.Iterator r6 = r6.iterator()
        L5c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r6.next()
            ajwc r0 = (defpackage.ajwc) r0
            akdb r0 = r0.b
            akdb r2 = defpackage.akdb.D2D
            if (r0 != r2) goto L5c
        L6e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyr.h(ffgu):java.lang.Object");
    }

    public final Object i(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new ajxi(null, this), ffguVar);
    }

    public final Object j(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new ajxl(null, this), ffguVar);
    }

    public final Object k(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new ajxo(null, this), ffguVar);
    }

    public final Object l(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new ajxr(null, this), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.UUID r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ajxy
            if (r0 == 0) goto L13
            r0 = r7
            ajxy r0 = (defpackage.ajxy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajxy r0 = new ajxy
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.b
            ffhd r7 = defpackage.ekxi.a(r7)
            ajxx r2 = new ajxx
            r4 = 0
            r2.<init>(r4, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyr.m(java.util.UUID, ffgu):java.lang.Object");
    }

    public final Object n(UUID uuid, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new ajyb(null, uuid), ffguVar);
    }

    public final Object o(UUID uuid, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new ajyf(null, this, uuid), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.ffgu r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.ajyk
            if (r0 == 0) goto L13
            r0 = r12
            ajyk r0 = (defpackage.ajyk) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ajyk r0 = new ajyk
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r2 = r0.b
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.a
            java.util.List r4 = (java.util.List) r4
            ajyr r5 = r0.f
            defpackage.ffci.b(r12)
            goto Lc0
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3d:
            java.lang.Object r2 = r0.b
            j$.time.Duration r2 = (j$.time.Duration) r2
            java.lang.Object r4 = r0.a
            j$.time.Instant r4 = (j$.time.Instant) r4
            ajyr r5 = r0.f
            defpackage.ffci.b(r12)
            goto L79
        L4b:
            defpackage.ffci.b(r12)
            cqoh r12 = r11.d
            ffbr r2 = r11.k
            j$.time.Instant r12 = r12.f()
            java.lang.Object r2 = r2.b()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            j$.time.Duration r2 = j$.time.Duration.ofDays(r5)
            r0.f = r11
            r0.a = r12
            r0.b = r2
            r0.e = r4
            java.lang.Object r4 = r11.i(r0)
            if (r4 == r1) goto Le0
            r5 = r4
            r4 = r12
            r12 = r5
            r5 = r11
        L79:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r12 = r12.iterator()
        L84:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto Laa
            java.lang.Object r7 = r12.next()
            r8 = r7
            ajwc r8 = (defpackage.ajwc) r8
            akci r9 = r8.c
            akci r10 = defpackage.akci.WAITING_ON_APP_UPDATE_INITIAL_PROMPT_SHOWN
            if (r9 != r10) goto L84
            r4.getClass()
            j$.time.Instant r8 = r8.h
            j$.time.Duration r8 = defpackage.ernl.a(r4, r8)
            int r8 = r8.compareTo(r2)
            if (r8 < 0) goto L84
            r6.add(r7)
            goto L84
        Laa:
            entd r12 = defpackage.ajyr.a
            ensk r12 = r12.h()
            ensz r12 = (defpackage.ensz) r12
            int r2 = r6.size()
            java.lang.String r4 = "Marking %s executions with initial prompt shown as ready for reprompt"
            r12.r(r4, r2)
            java.util.Iterator r2 = r6.iterator()
            r4 = r6
        Lc0:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto Ldf
            java.lang.Object r12 = r2.next()
            ajwc r12 = (defpackage.ajwc) r12
            java.util.UUID r12 = r12.a
            akci r6 = defpackage.akci.WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT
            r0.f = r5
            r0.a = r4
            r0.b = r2
            r0.e = r3
            java.lang.Object r12 = r5.s(r12, r6, r0)
            if (r12 != r1) goto Lc0
            goto Le0
        Ldf:
            return r4
        Le0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyr.p(ffgu):java.lang.Object");
    }

    public final Object q(long j, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.b), new ajyl(null, j), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        if (defpackage.ffra.a(r11, r4, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.util.UUID r11, defpackage.akdb r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyr.r(java.util.UUID, akdb, ffgu):java.lang.Object");
    }

    public final Object s(UUID uuid, akci akciVar, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.b), new ajyq(null, this, uuid, akciVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    public final void t(UUID uuid, akci akciVar, ffji ffjiVar) {
        if (!((auck) this.l.b()).a()) {
            String[] strArr = bxle.a;
            bxlb bxlbVar = new bxlb();
            bxlbVar.ap("runUpdateExecutionStatus");
            bxlbVar.c(akciVar);
            bxlbVar.d(this.d.f());
            ((bxlb) ffjiVar.invoke(bxlbVar)).a(Optional.of(uuid));
            return;
        }
        synchronized (this) {
            String[] strArr2 = bxle.a;
            bxlb bxlbVar2 = new bxlb();
            bxlbVar2.ap("runUpdateExecutionStatus");
            bxlbVar2.c(akciVar);
            bxlbVar2.d(this.d.f());
            ((bxlb) ffjiVar.invoke(bxlbVar2)).a(Optional.of(uuid));
        }
    }

    public final void u(final UUID uuid, final akcg akcgVar) {
        uuid.getClass();
        if (akcgVar.c != 2) {
            throw new IllegalArgumentException("databaseMetadata must contain field BackupDatabaseMetadata");
        }
        bxkz a2 = bxle.a();
        a2.z("setDatabaseFileMetadataSync");
        a2.c(new Function() { // from class: ajwo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxld bxldVar = (bxld) obj;
                entd entdVar = ajyr.a;
                bxldVar.b(Optional.of(uuid));
                return bxldVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bxjb bxjbVar = (bxjb) ((bxkf) a2.b().o()).cS();
        if (bxjbVar == null) {
            throw new ajww(uuid);
        }
        if (!x(bxjbVar)) {
            throw new IllegalStateException(a.i(uuid, "restore execution [", "] already is not active"));
        }
        if (bxjbVar.l() != null) {
            throw new IllegalStateException(a.i(uuid, "restore execution [", "] already has database metadata"));
        }
        ((dtuu) this.c.b()).d("setDatabaseFileMetadataSync", new Runnable() { // from class: ajwp
            @Override // java.lang.Runnable
            public final void run() {
                entd entdVar = ajyr.a;
                String[] strArr = bxle.a;
                bxlb bxlbVar = new bxlb();
                bxlbVar.ap("setDatabaseFileMetadataSync");
                akcg akcgVar2 = akcg.this;
                akcd akcdVar = akcgVar2.c == 2 ? (akcd) akcgVar2.d : akcd.a;
                if (akcdVar == null) {
                    bxlbVar.a.putNull("backup_database_metadata");
                } else {
                    bxlbVar.a.put("backup_database_metadata", akcdVar.toByteArray());
                }
                bxjb bxjbVar2 = bxjbVar;
                bxlbVar.a(Optional.of(uuid));
                String[] strArr2 = bxmu.a;
                bxlp bxlpVar = new bxlp();
                bxlpVar.f(bxjbVar2.k());
                bxlpVar.c(akcgVar2);
                bxlpVar.d(bxmw.a);
                bxlpVar.e(bxmv.a);
                bxlpVar.b();
            }
        });
    }

    public final void v(final UUID uuid, akci akciVar) {
        bxkz a2 = bxle.a();
        a2.z("updateExecutionStatusQuery");
        a2.c(new Function() { // from class: ajws
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxld bxldVar = (bxld) obj;
                entd entdVar = ajyr.a;
                bxldVar.b(Optional.of(uuid));
                return bxldVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtsu o = a2.b().o();
        try {
            if (((bxkf) o).getCount() == 0) {
                throw new ajww(uuid);
            }
            ffig.a(o, null);
            t(uuid, akciVar, new ffji() { // from class: ajwj
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    bxlb bxlbVar = (bxlb) obj;
                    entd entdVar = ajyr.a;
                    bxlbVar.getClass();
                    return bxlbVar;
                }
            });
        } finally {
        }
    }

    public final void w(final UUID uuid, final akci akciVar) {
        uuid.getClass();
        akciVar.getClass();
        ((dtuu) this.c.b()).d("updateExecutionStatusSync", new Runnable() { // from class: ajwu
            @Override // java.lang.Runnable
            public final void run() {
                ajyr.this.v(uuid, akciVar);
            }
        });
    }

    public final Object z(UUID uuid) {
        Instant f = this.d.f();
        String[] strArr = bxle.a;
        bxlb bxlbVar = new bxlb();
        int intValue = bxle.c().intValue();
        int intValue2 = bxle.c().intValue();
        if (intValue2 < 60330) {
            dtub.w("last_attachment_request_timestamp", intValue2);
        }
        if (intValue >= 60330) {
            if (f == null) {
                bxlbVar.a.putNull("last_attachment_request_timestamp");
            } else {
                bxlbVar.a.put("last_attachment_request_timestamp", Long.valueOf(bdgw.a(f)));
            }
        }
        bxlbVar.a(Optional.of(uuid));
        return ffcu.a;
    }
}
