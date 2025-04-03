package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyc implements ccun {
    private final dtuu a;

    public ccyc(dtuu dtuuVar) {
        dtuuVar.getClass();
        this.a = dtuuVar;
    }

    @Override // defpackage.ccun
    public final void a(String str, String str2, csgg csggVar) {
        try {
            bvvr f = ParticipantsTable.f();
            f.ap("CmsParticipantBackupTableAdapter#setCmsIdAndLifeCycleInTransaction");
            f.i(csggVar);
            f.g(str2);
            if (f.e(str)) {
            } else {
                throw new ccwp(str);
            }
        } catch (SQLiteConstraintException e) {
            throw new ccwv("Participants", str, e);
        }
    }

    @Override // defpackage.ccun
    public final void b(Iterable iterable, csgg csggVar) {
        Object obj;
        iterable.getClass();
        csggVar.getClass();
        this.a.i();
        bvvr f = ParticipantsTable.f();
        f.ap("CmsParticipantsBackupTableAdapter#setCmsLifeCyclesInTransaction1");
        f.i(csggVar);
        bvvw bvvwVar = new bvvw();
        bvvwVar.m(iterable);
        f.U(bvvwVar);
        if (f.b().e() == ffdx.C(iterable)) {
            return;
        }
        bvvn e = ParticipantsTable.e();
        e.z("CmsParticipantsBackupTableAdapter#setCmsLifeCyclesInTransaction2");
        e.c(ParticipantsTable.c.a);
        bvvw bvvwVar2 = new bvvw();
        bvvwVar2.m(iterable);
        e.g(bvvwVar2);
        engw f2 = e.b().f();
        f2.getClass();
        Set ar = ffdx.ar(f2);
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (!ar.contains((String) obj)) {
                    break;
                }
            }
        }
        String str = (String) obj;
        if (str == null) {
            str = "unknown";
        }
        throw new ccwp(str);
    }
}
