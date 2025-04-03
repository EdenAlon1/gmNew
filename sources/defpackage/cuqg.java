package defpackage;

import android.util.LruCache;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuqg {
    public static final entd a = entd.c("BugleSpam");
    public static final Object b = new Object();
    public static final cfup c = cfvl.e(cfvl.b, "moirai_max_number_of_messages_to_send", 10);
    static final cfup d = cfvl.i(cfvl.b, "moirai_enable_uma_logs", false);
    public static final enhk e = enhk.o(cuqh.b, rum.USER_FEEDBACK_CONFIRMED_SPAM, cuqh.e, rum.USER_FEEDBACK_BLOCKED_SPAM, cuqh.c, rum.USER_FEEDBACK_DELETED_SPAM, cuqh.d, rum.USER_FEEDBACK_LEFT_SPAM);
    public final emyl f = emys.a(new emyl() { // from class: cuqf
        @Override // defpackage.emyl
        public final Object get() {
            entd entdVar = cuqg.a;
            return new LruCache(BasePaymentResult.ERROR_REQUEST_FAILED);
        }
    });
    public final ffbr g;
    public final ffbr h;
    public final crsl i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final errl m;
    public final errl n;

    public cuqg(ffbr ffbrVar, ffbr ffbrVar2, crsl crslVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, errl errlVar, errl errlVar2) {
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = crslVar;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
        this.l = ffbrVar5;
        this.m = errlVar;
        this.n = errlVar2;
    }

    public final void a(engw engwVar, final rum rumVar) {
        if (engwVar.isEmpty()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiSpamReporter", "reportHadesDetectedMessages", 269, "MoiraiSpamReporter.java")).q("MoiraiSpamReporterImpl#reportHadesDetectedMessages: No detections to log, skipping.");
            return;
        }
        final engw K = ((bdmq) this.j.b()).K(engwVar);
        if (K.isEmpty()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiSpamReporter", "reportHadesDetectedMessages", 278, "MoiraiSpamReporter.java")).q("MoiraiSpamReporterImpl#reportHadesDetectedMessages: No messages to log, skipping.");
        } else {
            axnw.h(((cupz) this.h.b()).a((MessageCoreData) K.get(0)).h(new emwl() { // from class: cuqc
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    boolean equals;
                    if (!((Boolean) obj).booleanValue()) {
                        return null;
                    }
                    engw engwVar2 = K;
                    rum rumVar2 = rumVar;
                    cuqg cuqgVar = cuqg.this;
                    if (((Boolean) cuqg.d.e()).booleanValue()) {
                        if (rumVar2 == rum.USER_FEEDBACK_MARKED_NOT_SPAM) {
                            ((akzt) cuqgVar.l.b()).c("Bugle.Spam.Hades.FalsePositive.Count");
                        } else {
                            ((akzt) cuqgVar.l.b()).e("Bugle.Spam.Hades.TruePositivePerFeedbackType.Count", rumVar2.h);
                            if (rumVar2 == rum.USER_FEEDBACK_LEFT_SPAM) {
                                synchronized (cuqg.b) {
                                    equals = Boolean.TRUE.equals(((LruCache) cuqgVar.f.get()).get(((MessageCoreData) engwVar2.get(0)).z()));
                                    ((LruCache) cuqgVar.f.get()).put(((MessageCoreData) engwVar2.get(0)).z(), Boolean.TRUE);
                                }
                                if (equals) {
                                    ((akzt) cuqgVar.l.b()).c("Bugle.Spam.Hades.RepeatedReport.SpamFolder.Count");
                                }
                            }
                        }
                        ((akzt) cuqgVar.l.b()).e("Bugle.Spam.Hades.DetectedMessage.Hist", engwVar2.size());
                    }
                    int size = engwVar2.size();
                    for (int i = 0; i < size; i++) {
                        axnw.h(((cunw) cuqgVar.g.b()).d(culg.a((MessageCoreData) engwVar2.get(i)), rumVar2));
                    }
                    return null;
                }
            }, this.m));
        }
    }
}
