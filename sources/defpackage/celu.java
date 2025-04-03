package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class celu implements cctm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/participants/CmsRestoreParticipantsWorkerAdapter");
    public final crty b;
    public final cefc c;
    private final ccqp d;
    private final asik e;
    private final axkm f;
    private final errl g;
    private final aszz h;

    public celu(crty crtyVar, ccqp ccqpVar, axkm axkmVar, asik asikVar, errl errlVar, aszz aszzVar, cefc cefcVar) {
        this.b = crtyVar;
        this.d = ccqpVar;
        this.f = axkmVar;
        this.e = asikVar;
        this.g = errlVar;
        this.h = aszzVar;
        this.c = cefcVar;
    }

    @Override // defpackage.cctm
    public final axew a() {
        return axew.PARTICIPANTS;
    }

    @Override // defpackage.cctm
    public final bqkx b() {
        return bqkx.PARTICIPANT;
    }

    @Override // defpackage.cctm
    public final ccdx c() {
        return this.d;
    }

    @Override // defpackage.cctm
    public final elfl d(String str) {
        return i(str, this.h.a());
    }

    @Override // defpackage.cctm
    public final elfl e(pot potVar) {
        return elfo.e(null);
    }

    @Override // defpackage.cctm
    public final epfx f() {
        return epfx.RESTORE_PARTICIPANT;
    }

    @Override // defpackage.cctm
    public final /* synthetic */ String g(Object obj) {
        return ((etah) obj).c;
    }

    @Override // defpackage.cctm
    public final String h() {
        return "Participants";
    }

    public final elfl i(final String str, final boolean z) {
        if (this.h.a()) {
            elfl b = this.c.b(str, etah.class);
            if (b == null) {
                b = null;
            } else if (z) {
                b = this.c.a(b, new ffji() { // from class: celp
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        return celu.this.i((String) obj, false);
                    }
                }, etah.class);
            }
            if (b != null) {
                return b;
            }
        }
        if (this.e.a()) {
            return this.f.m().i(new eroh() { // from class: celq
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    String str2 = str;
                    final celu celuVar = celu.this;
                    boolean z2 = z;
                    eyja eyjaVar = (eyja) obj;
                    if (eyjaVar == null || eyjaVar.equals(eykm.c)) {
                        ensk e = celu.a.e();
                        e.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/participants/CmsRestoreParticipantsWorkerAdapter", "listCmsItems", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "CmsRestoreParticipantsWorkerAdapter.java")).q("CmsRestoreParticipantsWorkerAdapter: Cms Delta sync timestamp is not present.");
                        elfl P = celuVar.b.P(str2);
                        return !z2 ? P : celuVar.c.a(P, new ffji() { // from class: celt
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                return celu.this.i((String) obj2, false);
                            }
                        }, etah.class);
                    }
                    ensk h = celu.a.h();
                    h.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/participants/CmsRestoreParticipantsWorkerAdapter", "listCmsItems", 87, "CmsRestoreParticipantsWorkerAdapter.java")).t("CmsRestoreParticipantsWorkerAdapter: Passing delta sync timestamp %s in ListParticipants.", eykm.i(eyjaVar));
                    elfl Q = celuVar.b.Q(str2, eyjaVar);
                    return !z2 ? Q : celuVar.c.a(Q, new ffji() { // from class: cels
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            return celu.this.i((String) obj2, false);
                        }
                    }, etah.class);
                }
            }, this.g);
        }
        elfl P = this.b.P(str);
        return z ? this.c.a(P, new ffji() { // from class: celr
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return celu.this.i((String) obj, false);
            }
        }, etah.class) : P;
    }
}
