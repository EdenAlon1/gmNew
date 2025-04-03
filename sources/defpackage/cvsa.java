package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvsa {
    public final ffsk a;
    public final ConversationId b;
    public final cwde c;
    public final cwis d;
    public final cvwh e;
    public final elbx f;
    public final cwch g;
    public final cwav h;
    public final ffbr i;
    private final ffbr j;

    public cvsa(ffsk ffskVar, ConversationId conversationId, cwde cwdeVar, cwis cwisVar, cvwh cvwhVar, elbx elbxVar, cwch cwchVar, cwav cwavVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        cwdeVar.getClass();
        cwisVar.getClass();
        cvwhVar.getClass();
        elbxVar.getClass();
        cwchVar.getClass();
        cwavVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = ffskVar;
        this.b = conversationId;
        this.c = cwdeVar;
        this.d = cwisVar;
        this.e = cvwhVar;
        this.f = elbxVar;
        this.g = cwchVar;
        this.h = cwavVar;
        this.j = ffbrVar;
        this.i = ffbrVar2;
    }

    public final ffix a(final amar amarVar, final int i, final cwjb cwjbVar, final boolean z) {
        return new cvrt(this, 100L, new ffix() { // from class: cvrs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ffix
            public final Object invoke() {
                amar amarVar2 = amarVar;
                cvsa cvsaVar = cvsa.this;
                ekzm b = cvsaVar.f.b("StartChat#contactClicked");
                try {
                    engw b2 = amarVar2.b();
                    if (((enou) b2).c < 0) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    int i2 = i;
                    if (z) {
                        cwav cwavVar = cvsaVar.h;
                        twk.e(cwavVar.b, 7, i2, cwavVar.f, 8);
                        cwavVar.f(false);
                    } else {
                        cwav cwavVar2 = cvsaVar.h;
                        twk.e(cwavVar2.b, 6, i2, cwavVar2.f, 8);
                        cwavVar2.f(false);
                    }
                    if (((enou) b2).c > 1) {
                        ArrayList arrayList = new ArrayList(ffdx.n(b2, 10));
                        enqv it = b2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ambh) it.next()).a);
                        }
                        if (ffdx.X(arrayList).size() > 1) {
                            cvsaVar.e.b(amarVar2);
                            ffig.a(b, null);
                            return ffcu.a;
                        }
                    }
                    aoku aokuVar = ((ambh) ffdx.K(b2)).a;
                    cvsaVar.d.c(cvrq.a(amarVar2, aokuVar));
                    if (cwjbVar == cwjb.a) {
                        aler alerVar = cvsaVar.h.e;
                        if (alerVar != null) {
                            alerVar.c();
                        }
                        axol.k(cvsaVar.a, null, new cvrx(cvsaVar, aokuVar, null), 3);
                    }
                    ffig.a(b, null);
                    return ffcu.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ffig.a(b, th);
                        throw th2;
                    }
                }
            }
        });
    }

    public final ffix b(final cvyr cvyrVar) {
        return new cvrt(this, 200L, new ffix() { // from class: cvru
            @Override // defpackage.ffix
            public final Object invoke() {
                cvsa cvsaVar = cvsa.this;
                ekzm b = cvsaVar.f.b("StartChat#doneClicked");
                try {
                    ConversationId conversationId = cvsaVar.b;
                    cvyr cvyrVar2 = cvyrVar;
                    if (conversationId == null || !cvsaVar.d.e().d.c() || (cvyrVar2.d() && !cvyrVar2.f())) {
                        cvsaVar.c(cvyrVar2);
                    } else {
                        axol.k(cvsaVar.a, null, new cvrz(cvsaVar, cvyrVar2, null), 3);
                    }
                    ffig.a(b, null);
                    return ffcu.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ffig.a(b, th);
                        throw th2;
                    }
                }
            }
        });
    }

    public final void c(cvyr cvyrVar) {
        if (cvyrVar.f()) {
            cvyrVar.c();
            return;
        }
        if (cvyrVar.e()) {
            aler alerVar = this.h.e;
            if (alerVar != null) {
                alerVar.c();
            }
            cwir e = this.d.e();
            List list = e.a;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ChipData) it.next()).a);
            }
            if (e.d == cwjb.c) {
                if (arrayList.isEmpty()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                if (arrayList.size() < 2) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (!e.d.a()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            if (arrayList.size() == 1) {
                axol.k(this.a, null, new cvrv(this, arrayList, null), 3);
            } else {
                axol.k(this.a, null, new cvrw(this, arrayList, cvyrVar, null), 3);
            }
        }
    }

    public final Object d() {
        return ((cwiw) this.j.b()).a().c();
    }
}
