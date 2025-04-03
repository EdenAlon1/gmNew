package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbgp {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/actionhelpers/MmsMergingTargetRcsGroupFinder");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final cqoh j;

    public bbgp(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, cqoh cqohVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        cqohVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
        this.j = cqohVar;
    }

    private final void c(Uri uri, int i) {
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/MmsMergingTargetRcsGroupFinder", "logsMergingFailureDueToNoMatchingRcsGroupFound", 90, "MmsMergingTargetRcsGroupFinder.kt")).B("Found no matching RCS group conversation, not merging MMS message (%s) on subId (%d).", uri, i);
        ((ckuy) this.f.b()).d();
    }

    private final void d(Uri uri, int i, ConversationIdType conversationIdType) {
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/MmsMergingTargetRcsGroupFinder", "logsMergingSuccess", 103, "MmsMergingTargetRcsGroupFinder.kt")).J("Found single matching RCS group conversation (%s), merging MMS message (%s) on subId (%d) into it.", conversationIdType, uri, Integer.valueOf(i));
        ((ckuy) this.f.b()).f();
    }

    private final boolean e(bseh bsehVar) {
        return bsehVar.m() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r13, int r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbgp.a(android.net.Uri, int, ffgu):java.lang.Object");
    }

    public final boolean b(bseh bsehVar) {
        if (!e(bsehVar)) {
            return false;
        }
        if (bsehVar.L() == ckte.j) {
            return true;
        }
        Instant ofEpochMilli = Instant.ofEpochMilli(bsehVar.x());
        cqoh cqohVar = this.j;
        ffbr ffbrVar = this.i;
        Instant f = cqohVar.f();
        Object b = ffbrVar.b();
        b.getClass();
        return ofEpochMilli.isAfter(f.o(((Number) b).longValue(), ChronoUnit.DAYS));
    }
}
