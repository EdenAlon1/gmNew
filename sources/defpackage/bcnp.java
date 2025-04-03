package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcnp {
    public static final ffbr a = new ffbr() { // from class: bcno
        @Override // defpackage.ffbr, defpackage.ffbq
        public final Object b() {
            String[] strArr = bbvc.a;
            bbuz bbuzVar = new bbuz(bbvc.a);
            bbuzVar.z("duplicateMessageRepliesQuery");
            bbuzVar.u();
            bbuzVar.n(new dtzq("$V", new Object[]{bbvc.c.a}), "backup_id");
            bbuzVar.n(new dtzq("$V{J:bugle_message_replies}", new Object[]{bufy.c.a}), "bugle_id");
            bbuz bbuzVar2 = (bbuz) bbuzVar.j(bcjs.c(bbvc.c.a, bckf.b, "messages_id_map", false, 16));
            bufs bufsVar = new bufs(bufy.a);
            bufsVar.u();
            dtvy h = dtvz.h(bufsVar.a());
            String[] strArr2 = bqea.a;
            bqdz bqdzVar = new bqdz();
            bqdzVar.as(new dtzq("$V{J:bugle_message_replies} = $V{J:messages_id_map}", new Object[]{bufy.c.a, bqea.c.d}));
            bqdy bqdyVar = new bqdy(bqdzVar);
            dtrd dtrdVar = (dtrd) h;
            dtrdVar.d = bqdyVar;
            dtrdVar.e = "bugle_message_replies";
            return ffdx.b((bbuz) bbuzVar2.j(h));
        }
    };
}
