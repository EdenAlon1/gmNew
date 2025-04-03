package defpackage;

import android.util.SparseArray;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azzf implements cskg {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/ParticipantIdCache");
    private final cpn b = new cpn();
    private final SparseArray c = new SparseArray();
    private boolean d = true;

    public final synchronized String a(String str) {
        return (String) this.b.get(str);
    }

    public final synchronized void b() {
        this.b.clear();
        this.c.clear();
    }

    public final synchronized void c(String str, String str2) {
        if (this.d) {
            this.b.put(str, str2);
        }
    }

    public final synchronized void d(ParticipantsTable.BindData bindData) {
        String S = bindData.S();
        if (bdtd.m(bindData)) {
            e(bindData.r(), S);
            return;
        }
        String U = bindData.U();
        if (U != null) {
            c(U, S);
            return;
        }
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/ParticipantIdCache", "putParticipant", 70, "ParticipantIdCache.java")).q("Problem caching participant ID: normalizationDestination was null");
    }

    public final synchronized void e(int i, String str) {
        if (this.d) {
            this.c.put(i, str);
        }
    }

    public final synchronized void f(bvpo bvpoVar) {
        if (bdtd.n(bvpoVar)) {
            this.c.remove(bvpoVar.d);
        }
        this.b.remove(bvpoVar.f);
    }

    public final synchronized void g() {
        this.d = true;
    }

    public final synchronized void h() {
        b();
        this.d = false;
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        b();
    }
}
