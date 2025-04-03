package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdgb {
    private final ffbr a;

    public bdgb(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final bdfy a(long j, byyt byytVar, ParticipantsTable.BindData bindData, long j2) {
        bdfy as;
        ekzz f = eleg.f("GetOrCreateConversationDatabaseOperations#getOrCreateConversationFromParticipant");
        try {
            csix.h();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(bindData);
            if (((Boolean) ayhv.a.e()).booleanValue()) {
                bczy bczyVar = (bczy) this.a.b();
                bdgc y = bdgd.y();
                y.p(arrayList);
                y.f(byytVar);
                y.n(true);
                y.m(0);
                y.u(j2);
                y.o(true);
                y.l(false);
                y.z(new cpxu(j));
                y.k(false);
                as = bczyVar.j(y.A());
            } else {
                as = ((bczy) this.a.b()).as(covk.a, j, byytVar, arrayList, j2);
            }
            f.close();
            return as;
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final bdfy b(cpbd cpbdVar, byyt byytVar, int i) {
        return c(covk.a, cpbdVar, byytVar, i);
    }

    public final bdfy c(cotp cotpVar, cpbd cpbdVar, byyt byytVar, int i) {
        ekzz f = eleg.f("GetOrCreateConversationDatabaseOperations#getOrCreateConversationFromThreadData");
        try {
            csix.h();
            ArrayList K = ((bczy) this.a.b()).K(cpbdVar, i);
            bdfy as = ((bczy) this.a.b()).as(cotpVar, cpbdVar.a, byytVar, K, -1L);
            f.close();
            return as;
        } finally {
        }
    }

    public final ConversationIdType d(long j, byyt byytVar, ParticipantsTable.BindData bindData) {
        return a(j, byytVar, bindData, -1L).a();
    }
}
