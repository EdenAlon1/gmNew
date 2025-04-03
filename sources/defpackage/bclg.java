package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bclg {
    public static final ffbr a = new ffbr() { // from class: bcle
        @Override // defpackage.ffbr, defpackage.ffbq
        public final Object b() {
            bbkb a2 = bbke.a();
            a2.z("duplicateConversationParticipantsQuery");
            a2.u();
            a2.n(new dtzq("$V", new Object[]{bbke.c.a}), "backup_id");
            a2.n(new dtzq("$V{J:bugle_conversation_participants}", new Object[]{brww.c.a}), "bugle_id");
            bbkb bbkbVar = (bbkb) ((bbkb) a2.j(bclg.b())).j(bclg.c());
            brwp a3 = brww.a();
            a3.u();
            dtvy h = dtvz.h(a3.b());
            String[] strArr = bqea.a;
            bqdz bqdzVar = new bqdz();
            bqdzVar.as(new dtzq("$V{J:bugle_conversation_participants} = $V{J:convo_id_map}", new Object[]{brww.c.b, bqea.c.d}));
            bqdzVar.as(new dtzq("$V{J:bugle_conversation_participants} = $V{J:participant_id_map}", new Object[]{brww.c.c, bqea.c.d}));
            bqdy bqdyVar = new bqdy(bqdzVar);
            dtrd dtrdVar = (dtrd) h;
            dtrdVar.d = bqdyVar;
            dtrdVar.e = "bugle_conversation_participants";
            return ffdx.g((bbkb) bbkbVar.j(h), bclg.a());
        }
    };
    public static final ffbr b = new ffbr() { // from class: bclf
        @Override // defpackage.ffbr, defpackage.ffbq
        public final Object b() {
            bbkb a2 = bbke.a();
            a2.z("duplicateConversationToParticipantsQuery");
            a2.u();
            a2.n(new dtzq("$V", new Object[]{bbke.c.a}), "backup_id");
            a2.n(new dtzq("$V", new Object[]{-1}), "bugle_id");
            bbkb bbkbVar = (bbkb) ((bbkb) a2.j(bclg.b())).j(bclg.c());
            String[] strArr = bsdr.a;
            bsdm bsdmVar = new bsdm(bsdr.a);
            bsdmVar.u();
            dtvy h = dtvz.h(bsdmVar.b());
            String[] strArr2 = bqea.a;
            bqdz bqdzVar = new bqdz();
            bqdzVar.as(new dtzq("$V{J:bugle_conversation_to_participants} = $V{J:convo_id_map}", new Object[]{bsdr.c.a, bqea.c.d}));
            bqdzVar.as(new dtzq("$V{J:bugle_conversation_to_participants} = $V{J:participant_id_map}", new Object[]{bsdr.c.b, bqea.c.d}));
            bqdy bqdyVar = new bqdy(bqdzVar);
            dtrd dtrdVar = (dtrd) h;
            dtrdVar.d = bqdyVar;
            dtrdVar.e = "bugle_conversation_to_participants";
            return ffdx.g((bbkb) bbkbVar.j(h), bclg.a());
        }
    };

    public static final bbkb a() {
        bbkb a2 = bbke.a();
        a2.z("parentConversationWasADuplicateQuery");
        a2.u();
        a2.n(new dtzq("$V", new Object[]{bbke.c.a}), "backup_id");
        a2.n(new dtzq("$V", new Object[]{-1}), "bugle_id");
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        bqdvVar.u();
        bqdvVar.d(new Function() { // from class: bcld
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.f(bckf.a.a);
                bqdzVar.c(-1L);
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return (bbkb) a2.j(dtvz.i(bqdvVar.b(), bqea.c.c, bbke.c.b));
    }

    public static final dtvy b() {
        return bcjs.c(bbke.c.b, bckf.a, "convo_id_map", false, 16);
    }

    public static final dtvy c() {
        return bcjs.c(bbke.c.c, bckf.c, "participant_id_map", false, 16);
    }
}
