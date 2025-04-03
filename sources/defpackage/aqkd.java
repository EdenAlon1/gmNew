package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqkd implements cbft {
    public final List a;
    public final dtrs b;
    public final bvvl c;
    public final dtrs d;
    public final bsdl e;
    private final dtuu f;
    private final ffbr g;

    public aqkd(dtuu dtuuVar, ffbr ffbrVar) {
        dtuuVar.getClass();
        ffbrVar.getClass();
        this.f = dtuuVar;
        this.g = ffbrVar;
        this.a = new ArrayList();
        this.b = new aqlw(new aqkc(this));
        bvvn e = ParticipantsTable.e();
        e.z("ParticipantChangeObserver#query1");
        e.b();
        bvvn e2 = ParticipantsTable.e();
        bwom b = ProfilesTable.a().b();
        bwnl bwnlVar = ProfilesTable.c.b;
        bvth bvthVar = ParticipantsTable.c.a;
        bwor bworVar = new bwor();
        bworVar.aq(new dtrx("profiles_table.participant_id", 6));
        dtvy s = b.s(bwnlVar, bvthVar, new bwoq(bworVar));
        ((dtrd) s).e = "profiles_table_join_tag";
        e2.G(s.g());
        e2.z("ParticipantChangeObserver#query2");
        this.c = e2.b();
        this.d = new aqll(new aqkb(this));
        String[] strArr = bsdr.a;
        bsdm bsdmVar = new bsdm(bsdr.a);
        bsdmVar.z("ParticipantChangeObserver#query2");
        this.e = bsdmVar.b();
    }

    public final engw a() {
        engw a;
        synchronized (this.a) {
            a = engq.a(this.a);
        }
        return a;
    }

    public final void b(final Set set, final boolean z) {
        String valueOf;
        dtut dtutVar = new dtut() { // from class: aqjy
            @Override // defpackage.dtut
            public final ekzz a() {
                return eleg.f("PCQL::handleChange::runAfterCommit");
            }
        };
        if (((asnw) this.g.b()).a()) {
            valueOf = "ParticipantObservableSupplier::" + set.hashCode();
        } else {
            valueOf = String.valueOf(set.hashCode());
        }
        this.f.g(dtutVar, valueOf, new Runnable() { // from class: aqjz
            @Override // java.lang.Runnable
            public final void run() {
                Set set2 = set;
                int size = set2.size();
                aqkd aqkdVar = this;
                if (size >= 10) {
                    Iterator<E> it = aqkdVar.a().iterator();
                    while (it.hasNext()) {
                        ((aqke) it.next()).a();
                    }
                } else {
                    for (aqke aqkeVar : aqkdVar.a()) {
                        boolean z2 = z;
                        if (((Boolean) aqkeVar.a.a.a(set2, Boolean.valueOf(z2))).booleanValue()) {
                            axnw.h(aqkeVar.b.a());
                        }
                    }
                }
            }
        });
    }

    @Override // defpackage.cbft
    public final void c() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return;
            }
            this.c.P(this.b);
            this.e.P(this.d);
        }
    }

    @Override // defpackage.cbft
    public final void d() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return;
            }
            this.c.L(this.b);
            this.e.L(this.d);
            Iterator<E> it = a().iterator();
            while (it.hasNext()) {
                ((aqke) it.next()).a();
            }
        }
    }
}
