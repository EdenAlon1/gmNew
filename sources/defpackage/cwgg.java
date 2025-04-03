package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwgg implements cwfz {
    public final ffsk a;
    public final cwhc b;
    public final cwis c;
    public final cwde d;
    public final cwav e;
    public final ffbr f;
    private final cwiw g;

    public cwgg(ffsk ffskVar, cwhc cwhcVar, cwis cwisVar, cwiw cwiwVar, cwde cwdeVar, cwav cwavVar, ffbr ffbrVar) {
        ffskVar.getClass();
        cwhcVar.getClass();
        cwisVar.getClass();
        cwiwVar.getClass();
        cwdeVar.getClass();
        cwavVar.getClass();
        ffbrVar.getClass();
        this.a = ffskVar;
        this.b = cwhcVar;
        this.c = cwisVar;
        this.g = cwiwVar;
        this.d = cwdeVar;
        this.e = cwavVar;
        this.f = ffbrVar;
    }

    @Override // defpackage.cwfz
    public final ffix a(final ConversationId conversationId) {
        return new cwga(this, new ffix() { // from class: cwgd
            @Override // defpackage.ffix
            public final Object invoke() {
                cwgg cwggVar = cwgg.this;
                cwggVar.d.c(conversationId);
                cwav cwavVar = cwggVar.e;
                twk.e(cwavVar.b, 17, 0, cwavVar.f, 10);
                cwavVar.f(true);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.cwfz
    public final ffix b(final aqkh aqkhVar, final aoku aokuVar, final cwir cwirVar) {
        cwirVar.getClass();
        return new cwga(this, new ffix() { // from class: cwgc
            @Override // defpackage.ffix
            public final Object invoke() {
                aqkh aqkhVar2 = aqkhVar;
                cjwi cjwiVar = cjwi.PROFILE_PEOPLE_SHARING_SOURCE;
                cjvk cjvkVar = (cjvk) aqkhVar2;
                cjvt cjvtVar = cjvkVar.g;
                String b = cjze.b(cjvtVar.c, cjvtVar.e, cjwiVar);
                aoku aokuVar2 = aokuVar;
                if (b == null) {
                    b = ttz.a(aokuVar2);
                }
                String str = b;
                cwgg cwggVar = cwgg.this;
                cwir cwirVar2 = cwirVar;
                cwggVar.c.c(new ChipData(aokuVar2, str, null, cjvkVar.h.a, false, 20, null));
                String n = aokuVar2.n();
                if (n == null) {
                    n = "";
                }
                cwggVar.e.d(n, (String) cwggVar.b.a().a());
                if (cwirVar2.d == cwjb.a) {
                    axol.k(cwggVar.a, null, new cwge(cwggVar, aokuVar2, null), 3);
                }
                cwggVar.b.c();
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.cwfz
    public final ffix c(final ambn ambnVar, final cwir cwirVar) {
        ambnVar.getClass();
        cwirVar.getClass();
        return new cwga(this, new ffix() { // from class: cwgb
            @Override // defpackage.ffix
            public final Object invoke() {
                ambn ambnVar2 = ambnVar;
                ChipData chipData = new ChipData(ambnVar2.b(), ambnVar2.e(), ambnVar2.g(), ambnVar2.a(), false, 16, null);
                cwgg cwggVar = cwgg.this;
                cwggVar.c.c(chipData);
                String n = ambnVar2.b().n();
                if (n == null) {
                    n = "";
                }
                cwggVar.e.d(n, (String) cwggVar.b.a().a());
                if (cwirVar.d == cwjb.a) {
                    axol.k(cwggVar.a, null, new cwgf(cwggVar, ambnVar2, null), 3);
                }
                cwggVar.b.c();
                return ffcu.a;
            }
        });
    }

    public final aqux d() {
        return (aqux) this.g.a().c();
    }
}
