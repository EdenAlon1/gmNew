package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcnm {
    public static final ffbr a = new ffbr() { // from class: bcnj
        @Override // defpackage.ffbr, defpackage.ffbq
        public final Object b() {
            String[] strArr = bbtp.a;
            bbtm bbtmVar = new bbtm(bbtp.a);
            bbtmVar.z("duplicateReactedToMessageQuery");
            bbtmVar.u();
            bbtmVar.c(new Function() { // from class: bcnk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bbto bbtoVar = (bbto) obj;
                    bbtoVar.aq(new dtrx("message_reactions_backup.reacted_message_id", 5));
                    return bbtoVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bbtmVar.n(new dtzq("$V", new Object[]{bbtp.c.a}), "backup_id");
            bbtmVar.n(new dtzq("$V{J:bugle_message_reaction}", new Object[]{bueg.c.a}), "bugle_id");
            bbtm bbtmVar2 = new bbtm(bbtp.a);
            bbtmVar2.z("duplicateMessageReactionsQuery");
            bbtmVar2.u();
            bbtmVar2.c(new Function() { // from class: bcnl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bbto bbtoVar = (bbto) obj;
                    bbtoVar.aq(new dtrx("message_reactions_backup.reacted_message_id", 6));
                    return bbtoVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bbtmVar2.n(new dtzq("$V", new Object[]{bbtp.c.a}), "backup_id");
            bbtmVar2.n(new dtzq("$V{J:bugle_message_reaction}", new Object[]{bueg.c.a}), "bugle_id");
            return ffdx.g((bbtm) ((bbtm) bbtmVar.j(bcjs.c(bbtp.c.b, bckf.b, "message_id_map", false, 16))).j(bcnm.a()), (bbtm) ((bbtm) bbtmVar2.j(bcjs.c(bbtp.c.b, bckf.b, "message_id_map", false, 16))).j(bcnm.a()));
        }
    };

    public static final dtvy a() {
        bueb a2 = bueg.a();
        a2.u();
        dtvy h = dtvz.h(a2.b());
        String[] strArr = bqea.a;
        bqdz bqdzVar = new bqdz();
        bqdzVar.as(new dtzq("$V{J:bugle_message_reaction} = $V{J:message_id_map}", new Object[]{bueg.c.b, bqea.c.d}));
        bqdy bqdyVar = new bqdy(bqdzVar);
        dtrd dtrdVar = (dtrd) h;
        dtrdVar.d = bqdyVar;
        dtrdVar.e = "bugle_message_reaction";
        return h;
    }
}
