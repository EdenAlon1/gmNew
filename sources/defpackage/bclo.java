package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bclo {
    public static final dtzj a = new dtzq("SELECT DISTINCT backup_participants_by_conversation.conversation_id AS backup_id, bugle_participants_by_conversation.conversation_id AS bugle_id, $V AS table_name, $V AS status FROM ( SELECT conversation_participants_backup.conversation_id, group_concat(p_map.bugle_id) OVER (PARTITION BY conversation_participants_backup.conversation_id ORDER BY p_map.bugle_id RANGE BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) AS grouped_participants FROM backup_id_map AS p_map JOIN conversation_participants_backup ON p_map.backup_id = conversation_participants_backup.participant_id WHERE p_map.table_name = $V ) AS backup_participants_by_conversation INNER JOIN ( SELECT conversation_participants.conversation_id, group_concat(conversation_participants.participant_id) OVER (PARTITION BY conversation_participants.conversation_id ORDER BY conversation_participants.participant_id RANGE BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) AS grouped_participants FROM conversation_participants ) AS bugle_participants_by_conversation ON backup_participants_by_conversation.grouped_participants = bugle_participants_by_conversation.grouped_participants INNER JOIN conversations ON conversations._id = bugle_participants_by_conversation.conversation_id INNER JOIN conversations_backup ON conversations_backup._id = backup_participants_by_conversation.conversation_id INNER JOIN backup_id_map AS c_map ON c_map.backup_id = backup_participants_by_conversation.conversation_id WHERE conversations.conv_type <> 2 AND conversations_backup.conversation_type <> 2 AND c_map.status = $V", new Object[]{bckf.a.a, -1L, bckf.c.a, 1L});
    public static final ffbr b = new ffbr() { // from class: bcln
        @Override // defpackage.ffbr, defpackage.ffbq
        public final Object b() {
            dtzj dtzjVar = bclo.a;
            bbos a2 = bbov.a();
            a2.z("duplicateRcsGroupIdQuery");
            a2.u();
            a2.n(new dtzq("$V", new Object[]{bbov.c.a}), "backup_id");
            a2.n(new dtzq("$V{J:bugle_conversations}", new Object[]{bsom.c.a}), "bugle_id");
            a2.c(bbov.c.a);
            bsob e = bsom.e();
            e.u();
            dtvy i = dtvz.i(e.b(), bsom.c.aa, bbov.c.k);
            ((dtrd) i).e = "bugle_conversations";
            bbos a3 = bbov.a();
            a3.z("duplicateCmsIdQuery");
            a3.u();
            a3.n(new dtzq("$V", new Object[]{bbov.c.a}), "backup_id");
            a3.n(new dtzq("$V{J:bugle_conversations}", new Object[]{bsom.c.a}), "bugle_id");
            bsob e2 = bsom.e();
            e2.u();
            dtvy i2 = dtvz.i(e2.b(), bsom.c.Z, bbov.c.s);
            ((dtrd) i2).e = "bugle_conversations";
            return ffdx.g((bbos) a2.j(i), (bbos) a3.j(i2));
        }
    };
}
