package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajwa implements ajwb {
    private static final entd c = entd.p();
    public final ffbr a;
    public final ffbr b;
    private final Context d;
    private final cqoh e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final String i;
    private final fgjb j;

    public ajwa(Context context, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        context.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.d = context;
        this.e = cqohVar;
        this.a = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.b = ffbrVar5;
        this.i = "attachment_restore";
        this.j = new fgjf();
    }

    private final void i(File file, ParcelFileDescriptor parcelFileDescriptor) {
        eoej.a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), new FileOutputStream(file));
    }

    @Override // defpackage.ajwb
    public final File a(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.getClass();
        File file = new File(this.d.getDatabasePath("bugle_backup_db").getParentFile(), "restored_bugle_database_" + this.e.f().toEpochMilli() + ".db");
        try {
            i(file, parcelFileDescriptor);
            return file;
        } catch (FileNotFoundException e) {
            ensk j = c.j();
            j.Y(ente.a, "BugleBackup");
            ((ensz) j).q("Unable to open file when restoring database");
            throw new ajyt("Unable to open file when restoring database", e);
        } catch (IOException e2) {
            ensk j2 = c.j();
            j2.Y(ente.a, "BugleBackup");
            ((ensz) j2).q("Unable to copy bytes when restoring database");
            throw new ajyt("Unable to open file when restoring database", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac A[Catch: all -> 0x01d2, TryCatch #3 {all -> 0x01d2, blocks: (B:14:0x00a3, B:16:0x00ac, B:17:0x010e, B:26:0x0115, B:28:0x013d, B:29:0x0144, B:31:0x0159, B:32:0x015f, B:35:0x0172, B:43:0x017a, B:44:0x017d, B:46:0x0142, B:20:0x017e, B:21:0x0183, B:51:0x018b, B:52:0x01ad, B:48:0x01af, B:49:0x01d1, B:53:0x00c4, B:55:0x00d7, B:56:0x00da), top: B:13:0x00a3, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4 A[Catch: all -> 0x01d2, TryCatch #3 {all -> 0x01d2, blocks: (B:14:0x00a3, B:16:0x00ac, B:17:0x010e, B:26:0x0115, B:28:0x013d, B:29:0x0144, B:31:0x0159, B:32:0x015f, B:35:0x0172, B:43:0x017a, B:44:0x017d, B:46:0x0142, B:20:0x017e, B:21:0x0183, B:51:0x018b, B:52:0x01ad, B:48:0x01af, B:49:0x01d1, B:53:0x00c4, B:55:0x00d7, B:56:0x00da), top: B:13:0x00a3, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // defpackage.ajwb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.UUID r20, defpackage.sny r21, android.os.ParcelFileDescriptor r22, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwa.b(java.util.UUID, sny, android.os.ParcelFileDescriptor, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ec, code lost:
    
        if (r10 != r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.UUID r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwa.c(java.util.UUID, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.UUID r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ajvw
            if (r0 == 0) goto L13
            r0 = r6
            ajvw r0 = (defpackage.ajvw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajvw r0 = new ajvw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.UUID r5 = r0.d
            defpackage.ffci.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.a
            java.lang.Object r6 = r6.b()
            ajyr r6 = (defpackage.ajyr) r6
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.n(r5, r0)
            if (r6 == r1) goto L84
        L46:
            akcg r6 = (defpackage.akcg) r6
            r0 = 0
            if (r6 == 0) goto L54
            java.lang.String r6 = r6.e
            if (r6 == 0) goto L54
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
        L54:
            java.lang.String r6 = "BugleBackup"
            if (r0 != 0) goto L6b
            entd r0 = defpackage.ajwa.c
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            ensz r0 = (defpackage.ensz) r0
            java.lang.String r6 = "No backup DB found for %s for deletion"
            r0.t(r6, r5)
            goto L81
        L6b:
            boolean r0 = r0.delete()
            entd r1 = defpackage.ajwa.c
            ensk r1 = r1.h()
            ensn r2 = defpackage.ente.a
            r1.Y(r2, r6)
            ensz r1 = (defpackage.ensz) r1
            java.lang.String r6 = "Backup database deletion for session id %s successful: %s"
            r1.E(r6, r5, r0)
        L81:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwa.d(java.util.UUID, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
    
        if (r7.c(r2, r0) != r1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00bb -> B:12:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ce -> B:12:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwa.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
    
        if (r2 == r4) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d3 -> B:35:0x00d5). Please report as a decompilation issue!!! */
    @Override // defpackage.ajwb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.UUID r19, defpackage.ajwe r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwa.f(java.util.UUID, ajwe, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bd, code lost:
    
        if (r2 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0138, code lost:
    
        if (r14 != r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        if (r2 != r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #1 {all -> 0x0038, blocks: (B:43:0x0033, B:30:0x013a, B:37:0x00d8, B:16:0x00df, B:19:0x00ef, B:21:0x00f3, B:25:0x0109, B:27:0x0111, B:28:0x012c, B:15:0x00bf, B:13:0x00a2, B:35:0x00c2), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0111 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:43:0x0033, B:30:0x013a, B:37:0x00d8, B:16:0x00df, B:19:0x00ef, B:21:0x00f3, B:25:0x0109, B:27:0x0111, B:28:0x012c, B:15:0x00bf, B:13:0x00a2, B:35:0x00c2), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012c A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #1 {all -> 0x0038, blocks: (B:43:0x0033, B:30:0x013a, B:37:0x00d8, B:16:0x00df, B:19:0x00ef, B:21:0x00f3, B:25:0x0109, B:27:0x0111, B:28:0x012c, B:15:0x00bf, B:13:0x00a2, B:35:0x00c2), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:43:0x0033, B:30:0x013a, B:37:0x00d8, B:16:0x00df, B:19:0x00ef, B:21:0x00f3, B:25:0x0109, B:27:0x0111, B:28:0x012c, B:15:0x00bf, B:13:0x00a2, B:35:0x00c2), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // defpackage.ajwb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.UUID r12, defpackage.ajwe r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwa.g(java.util.UUID, ajwe, ffgu):java.lang.Object");
    }

    @Override // defpackage.ajwb
    public final void h(final int i, String str, ajwe ajweVar, long j) {
        ajweVar.getClass();
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        bqdvVar.z("updateUriAndLocalCachePathInPartsTable");
        bqdvVar.d(new Function() { // from class: ajvp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String[] strArr2 = bqea.a;
                bqdz bqdzVar = new bqdz();
                bqdzVar.aq(new dtwe("backup_id_map.backup_id", 1, Long.valueOf(i)));
                String[] strArr3 = PartsTable.a;
                bqdzVar.f("parts");
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bqct bqctVar = (bqct) ((bqdj) bqdvVar.b().o()).cT();
        bqctVar.az(4, "status");
        long j2 = bqctVar.e;
        if (j2 == 1) {
            ensk j3 = c.j();
            j3.Y(ente.a, "BugleBackup");
            ensz enszVar = (ensz) j3;
            enszVar.Y(csux.s, String.valueOf(i));
            enszVar.q("Invalid backup id map status STATUS_ID_ASSIGNED");
            throw new IllegalStateException("Invalid backup id map status");
        }
        if (j2 == 0) {
            ensk j4 = c.j();
            j4.Y(ente.a, "BugleBackup");
            ensz enszVar2 = (ensz) j4;
            enszVar2.Y(csux.s, String.valueOf(i));
            enszVar2.q("Invalid backup id map status STATUS_ID_INITIALIZED");
            throw new IllegalStateException("Invalid backup id map status");
        }
        if (j2 == -1) {
            if (!ajweVar.a()) {
                ensk j5 = c.j();
                j5.Y(ente.a, "BugleBackup");
                ensz enszVar3 = (ensz) j5;
                enszVar3.Y(csux.s, String.valueOf(i));
                enszVar3.q("Invalid backup id map status STATUS_DUPLICATE");
                return;
            }
            if (bqctVar.k() == -1) {
                ensk h = c.h();
                h.Y(ente.a, "BugleBackup");
                ensz enszVar4 = (ensz) h;
                enszVar4.Y(csux.s, String.valueOf(i));
                enszVar4.W(10, TimeUnit.SECONDS);
                enszVar4.q("STATUS_DUPLICATE with no mapped part id, deleting attachment file");
                try {
                    File file = new File(str);
                    if (true != file.exists()) {
                        file = null;
                    }
                    if (file != null) {
                        file.delete();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    ensk j6 = c.j();
                    j6.Y(ente.a, "BugleBackup");
                    ensz enszVar5 = (ensz) ((ensz) j6).g(e);
                    enszVar5.Y(csux.s, String.valueOf(i));
                    enszVar5.t("Unable to delete duplicate attachment file [%s]", str);
                    return;
                }
            }
            ensk h2 = c.h();
            h2.Y(ente.a, "BugleBackup");
            ensz enszVar6 = (ensz) h2;
            enszVar6.Y(csux.s, String.valueOf(i));
            enszVar6.W(10, TimeUnit.SECONDS);
            enszVar6.s("STATUS_DUPLICATE with mapped part id [%s]", bqctVar.k());
        }
        String[] strArr2 = PartsTable.a;
        bwdi bwdiVar = new bwdi();
        bwdiVar.ap("updateUriAndLocalCachePathInPartsTable");
        bwdiVar.D(new Function() { // from class: ajvq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                bwdmVar.getClass();
                bwdmVar.j(String.valueOf(bqct.this.k()));
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwdiVar.z(Uri.parse("file://".concat(str)));
        bwdiVar.r(str);
        bwdiVar.t(true);
        bwdiVar.n(j);
        if (bwdiVar.b().e() == 0) {
            ensk j7 = c.j();
            j7.Y(ente.a, "BugleBackup");
            ensz enszVar7 = (ensz) j7;
            enszVar7.Y(csux.s, String.valueOf(i));
            enszVar7.q("Unable to find part id to update");
        }
    }
}
