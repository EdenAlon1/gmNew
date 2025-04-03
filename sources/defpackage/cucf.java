package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cucf {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/SpamReporter");
    public static final emyl b = cfvl.y("spam_reporter_kt_fix_undo_archive_status");
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final croc f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final dtuu k;
    public final ffbr l;
    public final ffbr m;

    public cucf(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, croc crocVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, dtuu dtuuVar, ffbr ffbrVar8, ffbr ffbrVar9) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        crocVar.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        dtuuVar.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = crocVar;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = dtuuVar;
        this.l = ffbrVar8;
        this.m = ffbrVar9;
    }

    public final byyt a(boolean z, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData) {
        bseh r;
        if (z) {
            return byyt.SPAM_FOLDER;
        }
        byyt byytVar = byyt.UNARCHIVED;
        return (bindData == null || (r = ((bczy) this.h.b()).r(conversationIdType)) == null || r.q() != 1 || !bindData.Y()) ? byytVar : byyt.BLOCKED_FOLDER;
    }

    public final cudm b(final cuci cuciVar) {
        efbd.b();
        final cudl cudlVar = (cudl) cudm.a.createBuilder();
        cudlVar.copyOnWrite();
        cudm cudmVar = (cudm) cudlVar.instance;
        cudmVar.b |= 32;
        cudmVar.h = cuciVar.e;
        cudlVar.copyOnWrite();
        cudm cudmVar2 = (cudm) cudlVar.instance;
        cudmVar2.b |= 64;
        cudmVar2.i = cuciVar.f;
        int a2 = erfd.a(cuciVar.m);
        cudlVar.copyOnWrite();
        cudm cudmVar3 = (cudm) cudlVar.instance;
        cudmVar3.b |= 128;
        cudmVar3.j = a2;
        return (cudm) this.k.c("SpamReporter#updateAndReportSpamStatus", new emyl() { // from class: cubx
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00f2, code lost:
            
                if (defpackage.ffkj.e(r4, new defpackage.cukz(defpackage.fffi.b(r7))) == false) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0197, code lost:
            
                if (r4 != null) goto L62;
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0147  */
            @Override // defpackage.emyl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 541
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cubx.get():java.lang.Object");
            }
        });
    }
}
