package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azsz implements Runnable {
    final /* synthetic */ engw a;
    final /* synthetic */ aztd b;

    public azsz(engw engwVar, aztd aztdVar) {
        this.a = engwVar;
        this.b = aztdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        enqv it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            String[] strArr = bxth.a;
            dtro[] aG = bindData.aG("self_participants", new bxro[0]);
            aG.getClass();
            bxro bxroVar = (bxro) ffdo.H(aG);
            String n = bxroVar != null ? bxroVar.n() : null;
            azsu g = this.b.a.g(bindData.r(), n, null);
            bvvr f = ParticipantsTable.f();
            int intValue = ParticipantsTable.i().intValue();
            if (ParticipantsTable.i().intValue() >= 59930 && intValue >= 59930) {
                f.a.put("my_identity_token", azsv.b(g));
            }
            f.e(bindData.S());
        }
    }
}
