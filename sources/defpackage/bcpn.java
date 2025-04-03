package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcpn {
    public static final ffbr a = new ffbr() { // from class: bcpm
        @Override // defpackage.ffbr, defpackage.ffbq
        public final Object b() {
            bcje a2 = bcjh.a();
            a2.z("duplicateDestinationIdMapQuery");
            a2.u();
            a2.n(new dtzq("$V", new Object[]{bcjh.c.a}), "backup_id");
            a2.n(new dtzq("$V{J:bugle_participants}", new Object[]{ParticipantsTable.c.a}), "bugle_id");
            bvvn e = ParticipantsTable.e();
            e.u();
            bvvl a3 = e.a();
            bvth bvthVar = ParticipantsTable.c.f;
            bcic bcicVar = bcjh.c.c;
            bvvw bvvwVar = new bvvw();
            bvvwVar.as(bcpl.b);
            dtvy s = a3.s(bvthVar, bcicVar, new bvvs(bvvwVar));
            ((dtrd) s).e = "bugle_participants";
            bcje a4 = bcjh.a();
            a4.z("duplicateCmsIdIdMapQuery");
            a4.u();
            a4.n(new dtzq("$V", new Object[]{bcjh.c.a}), "backup_id");
            a4.n(new dtzq("$V{J:bugle_participants}", new Object[]{ParticipantsTable.c.a}), "bugle_id");
            bvvn e2 = ParticipantsTable.e();
            e2.u();
            dtvy i = dtvz.i(e2.a(), ParticipantsTable.c.E, bcjh.c.q);
            ((dtrd) i).e = "bugle_participants";
            bcje a5 = bcjh.a();
            a5.z("nullDestinationIdMapQuery");
            a5.u();
            a5.n(new dtzq("$V", new Object[]{bcjh.c.a}), "backup_id");
            a5.n(new dtzq("$V{J:bugle_participants}", new Object[]{ParticipantsTable.c.a}), "bugle_id");
            bvvn e3 = ParticipantsTable.e();
            e3.u();
            dtvy h = dtvz.h(e3.a());
            bvvw bvvwVar2 = new bvvw();
            bvvwVar2.as(bcpl.c);
            bvvwVar2.as(bcpl.b);
            bvvs bvvsVar = new bvvs(bvvwVar2);
            dtrd dtrdVar = (dtrd) h;
            dtrdVar.d = bvvsVar;
            dtrdVar.e = "bugle_participants";
            a5.D(h.g());
            return ffdx.g((bcje) a2.j(s), (bcje) a4.j(i), a5);
        }
    };
}
