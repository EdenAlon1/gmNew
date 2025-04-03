package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcnw {
    public static final ffbr a = new ffbr() { // from class: bcnv
        @Override // defpackage.ffbr, defpackage.ffbq
        public final Object b() {
            String[] strArr = bbwh.a;
            bbwe bbweVar = new bbwe(bbwh.a);
            bbweVar.z("duplicateMessageStarQuery");
            bbweVar.u();
            bbweVar.n(new dtzq("$V", new Object[]{bbwh.c.a}), "backup_id");
            bbweVar.n(new dtzq("$V{J:bugle_message_star}", new Object[]{bumm.c.a}), "bugle_id");
            bbwe bbweVar2 = (bbwe) bbweVar.j(bcjs.c(bbwh.c.b, bckf.b, "message_star_id_map", false, 16));
            bumh bumhVar = new bumh(bumm.a);
            bumhVar.u();
            dtvy h = dtvz.h(bumhVar.a());
            String[] strArr2 = bqea.a;
            bqdz bqdzVar = new bqdz();
            bqdzVar.as(new dtzq("$V{J:bugle_message_star} = $V{J:message_star_id_map}", new Object[]{bumm.c.b, bqea.c.d}));
            bqdy bqdyVar = new bqdy(bqdzVar);
            dtrd dtrdVar = (dtrd) h;
            dtrdVar.d = bqdyVar;
            dtrdVar.e = "bugle_message_star";
            return ffdx.b((bbwe) bbweVar2.j(h));
        }
    };
}
