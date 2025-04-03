package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class akdn extends ffkh implements ffji {
    public akdn(Object obj) {
        super(1, obj, akee.class, "detectorLoop", "detectorLoop(Ljava/util/UUID;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UUID uuid = (UUID) obj;
        uuid.getClass();
        akee akeeVar = (akee) this.g;
        return axol.k(akeeVar.i, null, new akdo(akeeVar, uuid, null), 3);
    }
}
