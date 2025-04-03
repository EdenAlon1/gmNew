package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
@ffbs
/* loaded from: classes2.dex */
public final class yda implements ycs {
    private static final enru b = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/LegacyMessageDraftParser");
    public final llv a;
    private final xsw c;
    private final xgp d;

    public yda(llv llvVar, xsw xswVar, xgp xgpVar) {
        llvVar.getClass();
        this.a = llvVar;
        this.c = xswVar;
        this.d = xgpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        r0 = defpackage.yda.b.j();
        r0.Y(defpackage.ente.a, "BugleComposeRow2");
        ((defpackage.enrr) r0.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/LegacyMessageDraftParser", "getAttachments", 76, "LegacyMessageDraftParser.kt")).D("Skipping incoming attachment with missing values. mediaType: %s, uri: %s", r4, r11);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00bd -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yda.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    @Override // defpackage.ycs
    public final Object b(ffgu ffguVar) {
        ensk e = b.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/LegacyMessageDraftParser", "peek", 35, "LegacyMessageDraftParser.kt")).q("Starting LegacyMessageDraftParser.peek");
        return d(new ffix() { // from class: ycw
            @Override // defpackage.ffix
            public final Object invoke() {
                return (MessageCoreData) yda.this.a.b("draft_data");
            }
        }, ffguVar);
    }

    @Override // defpackage.ycs
    public final Object c(ffgu ffguVar) {
        ensk e = b.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/LegacyMessageDraftParser", "remove", 28, "LegacyMessageDraftParser.kt")).q("Starting LegacyMessageDraftParser.remove");
        return d(new ffix() { // from class: ycx
            @Override // defpackage.ffix
            public final Object invoke() {
                return (MessageCoreData) yda.this.a.c("draft_data");
            }
        }, ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffix r24, defpackage.ffgu r25) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yda.d(ffix, ffgu):java.lang.Object");
    }
}
