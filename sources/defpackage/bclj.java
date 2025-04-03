package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bclj {
    public static final ffbr a = new ffbr() { // from class: bcli
        @Override // defpackage.ffbr, defpackage.ffbq
        public final Object b() {
            String[] strArr = bbln.a;
            bblk bblkVar = new bblk(bbln.a);
            bblkVar.z("duplicateConversationPinQuery");
            bblkVar.u();
            bblkVar.n(new dtzq("$V", new Object[]{bbln.c.a}), "backup_id");
            bblkVar.n(new dtzq("$V{J:bugle_conversation_pin}", new Object[]{bryh.c.a}), "bugle_id");
            bblk bblkVar2 = (bblk) bblkVar.j(bcjs.c(bbln.c.b, bckf.a, "convo_id_map", false, 16));
            brye bryeVar = new brye(bryh.a);
            bryeVar.u();
            dtvy h = dtvz.h(bryeVar.a());
            String[] strArr2 = bqea.a;
            bqdz bqdzVar = new bqdz();
            bqdzVar.as(new dtzq("$V{J:bugle_conversation_pin} = $V{J:convo_id_map}", new Object[]{bryh.c.b, bqea.c.d}));
            bqdy bqdyVar = new bqdy(bqdzVar);
            dtrd dtrdVar = (dtrd) h;
            dtrdVar.d = bqdyVar;
            dtrdVar.e = "bugle_conversation_pin";
            return ffdx.b((bblk) bblkVar2.j(h));
        }
    };
}
