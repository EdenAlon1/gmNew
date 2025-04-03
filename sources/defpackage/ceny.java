package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceny {
    public static final Object a() {
        buxo d = MessagesTable.d();
        d.z("BugleDbCmsObjectCounter#countObjectsWithCmsId-messages");
        buxz buxzVar = new buxz();
        int intValue = MessagesTable.g().intValue();
        if (intValue < 31010) {
            dtub.w("cms_id", intValue);
        }
        buxzVar.aq(new dtrx("messages.cms_id", 6));
        d.k(new buxs(buxzVar));
        int i = d.b().i();
        bvvn e = ParticipantsTable.e();
        e.z("BugleDbCmsObjectCounter#countObjectsWithCmsId-participants");
        bvvw bvvwVar = new bvvw();
        bvvwVar.f();
        e.k(new bvvs(bvvwVar));
        int i2 = e.b().i();
        bsob e2 = bsom.e();
        e2.z("BugleDbCmsObjectCounter#countObjectsWithCmsId-conversations");
        bsol bsolVar = new bsol();
        bsolVar.f();
        e2.k(new bsof(bsolVar));
        return new cenx(i, e2.b().i(), i2);
    }
}
