package com.google.android.apps.messaging.ui.debug;

import android.content.Context;
import android.content.Intent;
import defpackage.axol;
import defpackage.dawb;
import defpackage.dawv;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.fazb;
import defpackage.ffbr;
import defpackage.ffhe;
import defpackage.ffji;
import defpackage.ffjn;
import defpackage.ffkj;
import defpackage.ffsk;
import defpackage.ffsm;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LoadMessagesReceiver extends dawb {
    public static final ffji a = new ffji() { // from class: dawh
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            Intent intent = (Intent) obj;
            intent.getClass();
            return Integer.valueOf(intent.getIntExtra("num_messages", 1000));
        }
    };
    public static final ffji b = new ffji() { // from class: dawi
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            Intent intent = (Intent) obj;
            intent.getClass();
            return Integer.valueOf(intent.getIntExtra("messages_offset", 0));
        }
    };
    public static final ffjn c = new ffjn() { // from class: dawj
        @Override // defpackage.ffjn
        public final Object a(Object obj, Object obj2, Object obj3) {
            File dataDir;
            Intent intent = (Intent) obj;
            Context context = (Context) obj2;
            String str = (String) obj3;
            intent.getClass();
            context.getClass();
            str.getClass();
            String stringExtra = intent.getStringExtra("file_name");
            if (stringExtra != null) {
                return new File(stringExtra);
            }
            dataDir = context.getDataDir();
            return new File(dataDir, str);
        }
    };
    public static final enru d = enru.c("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver");
    public ffbr e;
    public ffbr f;
    public ffbr g;
    public ffbr h;
    public ffbr i;
    public fazb j;
    public fazb k;
    public ffbr l;

    @Override // defpackage.cniz
    public final ekzm a() {
        ffbr ffbrVar = this.e;
        if (ffbrVar == null) {
            ffkj.c("traceCreation");
            ffbrVar = null;
        }
        return ((elbx) ffbrVar.b()).b("LoadMessagesReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        elfl c2;
        context.getClass();
        intent.getClass();
        if (ffkj.e(intent.getAction(), "com.google.android.apps.messaging.load_messages")) {
            boolean booleanExtra = intent.getBooleanExtra("load_data_from_file", true);
            Object a2 = c.a(intent, context, "messages.csv");
            int intValue = ((Number) a.invoke(intent)).intValue();
            int intValue2 = ((Number) b.invoke(intent)).intValue();
            boolean booleanExtra2 = intent.getBooleanExtra("sync_bugle_db_after_load", true);
            ensk h = d.h();
            h.Y(ente.a, "BugleTests");
            File file = (File) a2;
            ((enrr) h.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver", "processBroadcast", 102, "LoadMessagesReceiver.kt")).L("Loading messages from csv file. loadDataFromFile=%s, filename=%s, numMessages=%s, offset=%s, syncBugleDbAfterLoad=%s", Boolean.valueOf(booleanExtra), file.getAbsolutePath(), Integer.valueOf(intValue), Integer.valueOf(intValue2), Boolean.valueOf(booleanExtra2));
            ffbr ffbrVar = this.g;
            if (ffbrVar == null) {
                ffkj.c("backgroundScope");
                ffbrVar = null;
            }
            Object b2 = ffbrVar.b();
            b2.getClass();
            c2 = axol.c((ffsk) b2, ffhe.a, ffsm.a, new dawv(booleanExtra, this, file, intValue, intValue2, booleanExtra2, context, null));
            q("LoadMessages", c2);
        }
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }

    public final fazb f() {
        fazb fazbVar = this.j;
        if (fazbVar != null) {
            return fazbVar;
        }
        ffkj.c("mmsSmsThreadIdResolver");
        return null;
    }

    public final fazb g() {
        fazb fazbVar = this.k;
        if (fazbVar != null) {
            return fazbVar;
        }
        ffkj.c("syncManager");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c2, code lost:
    
        if (defpackage.ffyk.a(r14, r1) != r2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.io.File r14, int r15, int r16, boolean r17, defpackage.ffgu r18) {
        /*
            r13 = this;
            r0 = r18
            boolean r1 = r0 instanceof defpackage.dawo
            if (r1 == 0) goto L15
            r1 = r0
            dawo r1 = (defpackage.dawo) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            dawo r1 = new dawo
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.b
            ffhh r2 = defpackage.ffhh.a
            int r3 = r1.d
            r4 = 1
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L3f
            if (r3 == r4) goto L36
            if (r3 != r5) goto L2e
            defpackage.ffci.b(r0)
            goto Lc5
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L36:
            boolean r14 = r1.a
            com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver r15 = r1.e
            defpackage.ffci.b(r0)
            r8 = r15
            goto L77
        L3f:
            defpackage.ffci.b(r0)
            fazb r0 = r13.g()
            java.lang.Object r0 = r0.b()
            coxg r0 = (defpackage.coxg) r0
            r3 = 0
            r0.q(r3)
            ffbr r0 = r13.k()
            java.lang.Object r0 = r0.b()
            r0.getClass()
            ffhd r0 = (defpackage.ffhd) r0
            ffhd r0 = defpackage.ekxi.a(r0)
            dawn r3 = new dawn
            r7 = r16
            r3.<init>(r6, r14, r7, r15)
            r1.e = r13
            r14 = r17
            r1.a = r14
            r1.d = r4
            java.lang.Object r0 = defpackage.ffra.a(r0, r3, r1)
            if (r0 == r2) goto Lc8
            r8 = r13
        L77:
            r11 = r14
            java.util.List r0 = (java.util.List) r0
            ffbr r14 = r8.l()
            java.lang.Object r14 = r14.b()
            cqoh r14 = (defpackage.cqoh) r14
            long r9 = r14.a()
            ffyd r14 = new ffyd
            r14.<init>(r0)
            dawm r15 = new dawm
            r15.<init>(r14, r6, r8)
            fgcp r14 = new fgcp
            r14.<init>(r15)
            axqj r15 = new axqj
            r15.<init>(r14, r6)
            fgcp r14 = new fgcp
            r14.<init>(r15)
            ffxx r14 = defpackage.ffxz.a(r14, r5)
            dawp r15 = new dawp
            r15.<init>(r8, r6)
            fgbt r0 = new fgbt
            r0.<init>(r14, r15)
            dawq r7 = new dawq
            r12 = 0
            r7.<init>(r8, r9, r11, r12)
            ffzb r14 = new ffzb
            r14.<init>(r0, r7)
            r1.e = r6
            r1.d = r5
            java.lang.Object r14 = defpackage.ffyk.a(r14, r1)
            if (r14 != r2) goto Lc5
            goto Lc8
        Lc5:
            ffcu r14 = defpackage.ffcu.a
            return r14
        Lc8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver.h(java.io.File, int, int, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r45, android.content.Context r46, boolean r47, defpackage.ffgu r48) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver.i(int, android.content.Context, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r17, java.lang.String r18, defpackage.ffgu r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            boolean r3 = r2 instanceof defpackage.dawu
            if (r3 == 0) goto L19
            r3 = r2
            dawu r3 = (defpackage.dawu) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            dawu r3 = new dawu
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.a
            ffhh r4 = defpackage.ffhh.a
            int r5 = r3.c
            r6 = 1
            if (r5 == 0) goto L3d
            if (r5 != r6) goto L35
            java.lang.String r1 = r3.f
            java.lang.String r4 = r3.e
            com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver r3 = r3.d
            defpackage.ffci.b(r2)
            r6 = r1
            r5 = r4
            goto L6b
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            defpackage.ffci.b(r2)
            ffbr r2 = r0.k()
            java.lang.Object r2 = r2.b()
            r2.getClass()
            ffhd r2 = (defpackage.ffhd) r2
            ffhd r2 = defpackage.ekxi.a(r2)
            dawt r5 = new dawt
            r7 = 0
            r5.<init>(r7, r0, r1)
            r3.d = r0
            r3.e = r1
            r7 = r18
            r3.f = r7
            r3.c = r6
            java.lang.Object r2 = defpackage.ffra.a(r2, r5, r3)
            if (r2 != r4) goto L68
            return r4
        L68:
            r3 = r0
            r5 = r1
            r6 = r7
        L6b:
            java.lang.Number r2 = (java.lang.Number) r2
            long r9 = r2.longValue()
            ffbr r1 = r3.l()
            java.lang.Object r1 = r1.b()
            cqoh r1 = (defpackage.cqoh) r1
            j$.time.Instant r1 = r1.f()
            long r7 = r1.toEpochMilli()
            r14 = 1
            r15 = 1
            r11 = -1
            r13 = 0
            android.content.ContentValues r1 = defpackage.davk.a(r5, r6, r7, r9, r11, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver.j(java.lang.String, java.lang.String, ffgu):java.lang.Object");
    }

    public final ffbr k() {
        ffbr ffbrVar = this.h;
        if (ffbrVar != null) {
            return ffbrVar;
        }
        ffkj.c("backgroundContext");
        return null;
    }

    public final ffbr l() {
        ffbr ffbrVar = this.f;
        if (ffbrVar != null) {
            return ffbrVar;
        }
        ffkj.c("clock");
        return null;
    }
}
