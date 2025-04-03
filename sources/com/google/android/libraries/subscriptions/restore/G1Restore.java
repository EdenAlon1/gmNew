package com.google.android.libraries.subscriptions.restore;

import android.content.Context;
import android.provider.Telephony;
import com.google.android.libraries.subscriptions.restore.IG1Restore;
import defpackage.eflr;
import defpackage.efls;
import defpackage.eflt;
import defpackage.emxb;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class G1Restore extends IG1Restore.Stub {
    private final Context a;
    private final eflt b;
    private final efls c;

    /* renamed from: $r8$lambda$oufppheGWGrvC-nxm-Ywl0kdQKQ, reason: not valid java name */
    public static /* synthetic */ boolean m320$r8$lambda$oufppheGWGrvCnxmYwl0kdQKQ(G1Restore g1Restore) {
        return emxb.a(Telephony.Sms.getDefaultSmsPackage(g1Restore.a), g1Restore.a.getPackageName());
    }

    public G1Restore(Context context, eflt efltVar, efls eflsVar) {
        this.a = context;
        this.b = efltVar;
        this.c = eflsVar;
    }

    public static efls defaultConfig() {
        return new eflr();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0173 A[Catch: all -> 0x0163, TRY_ENTER, TryCatch #0 {all -> 0x0163, blocks: (B:513:0x00d7, B:515:0x00e0, B:517:0x00f2, B:519:0x00f8, B:521:0x0100, B:522:0x0105, B:525:0x010f, B:530:0x011a, B:535:0x0156, B:536:0x0128, B:538:0x0136, B:541:0x0144, B:544:0x0147, B:546:0x015c, B:548:0x00e8, B:24:0x0173, B:26:0x017f), top: B:512:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ce A[Catch: all -> 0x0602, TryCatch #18 {all -> 0x0602, blocks: (B:273:0x055b, B:276:0x0563, B:280:0x05ce, B:284:0x05e0, B:291:0x05f8, B:414:0x05d5, B:433:0x05c9, B:438:0x05c6, B:416:0x0599, B:419:0x05a1, B:422:0x05aa, B:423:0x05b0, B:424:0x05b8, B:432:0x05c1), top: B:272:0x055b, outer: #28, inners: #14, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05ff A[LOOP:9: B:276:0x0563->B:293:0x05ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x060d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0186 A[EDGE_INSN: B:30:0x0186->B:31:0x0186 BREAK  A[LOOP:0: B:18:0x00cb->B:28:0x0182], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0194 A[Catch: IOException -> 0x0953, TRY_LEAVE, TryCatch #22 {IOException -> 0x0953, blocks: (B:13:0x00ad, B:32:0x0189, B:33:0x018e, B:35:0x0194, B:483:0x0911, B:485:0x0915, B:500:0x0909), top: B:12:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x05d5 A[Catch: all -> 0x0602, TryCatch #18 {all -> 0x0602, blocks: (B:273:0x055b, B:276:0x0563, B:280:0x05ce, B:284:0x05e0, B:291:0x05f8, B:414:0x05d5, B:433:0x05c9, B:438:0x05c6, B:416:0x0599, B:419:0x05a1, B:422:0x05aa, B:423:0x05b0, B:424:0x05b8, B:432:0x05c1), top: B:272:0x055b, outer: #28, inners: #14, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0915 A[Catch: IOException -> 0x0953, TRY_LEAVE, TryCatch #22 {IOException -> 0x0953, blocks: (B:13:0x00ad, B:32:0x0189, B:33:0x018e, B:35:0x0194, B:483:0x0911, B:485:0x0915, B:500:0x0909), top: B:12:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0937 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.libraries.subscriptions.restore.IG1Restore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int requestRestore(android.net.Uri r34, android.net.Uri r35, android.net.Uri r36) {
        /*
            Method dump skipped, instructions count: 2512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.subscriptions.restore.G1Restore.requestRestore(android.net.Uri, android.net.Uri, android.net.Uri):int");
    }
}
