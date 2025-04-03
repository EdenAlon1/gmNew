package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlez implements dlev {
    private static final enru a = enru.c("com/google/android/libraries/abuse/hades/moirai/featureprovider/FeatureProvider");
    private final ffji b;
    private final dkzv c;

    public dlez(ffji ffjiVar, dkzv dkzvVar) {
        this.b = ffjiVar;
        this.c = dkzvVar;
    }

    @Override // defpackage.dlev
    public final Object a(dlfy dlfyVar, ffgu ffguVar) {
        rsn rsnVar;
        if (this.b.invoke(dlfyVar) == null) {
            ((enrr) a.h().h("com/google/android/libraries/abuse/hades/moirai/featureprovider/FeatureProvider", "process", 17, "FeatureProvider.kt")).q("Nothing found to evaluate in feature provider payload.");
            return null;
        }
        dkzv dkzvVar = this.c;
        ByteBuffer put = ByteBuffer.allocateDirect(dkzvVar.b.b.d()).put(dkzvVar.b.b.o());
        put.flip();
        put.getClass();
        try {
            rsnVar = new rsn();
            put.order(ByteOrder.LITTLE_ENDIAN);
            rsnVar.h(put.getInt(put.position()) + put.position(), put);
        } catch (Exception e) {
            ((enrr) ((enrr) dkzv.a.j()).g(e).h("com/google/android/libraries/abuse/hades/moirai/blocklist/BloomFilterProcessor", "asBloom", 35, "BloomFilterProcessor.kt")).q("GetRootAsBloom throws an exception. ");
            rsnVar = null;
        }
        if (rsnVar != null) {
            rso rsoVar = new rso();
            int d = rsnVar.d(4);
            if (d != 0) {
                rsoVar.h(rsnVar.c(d + rsnVar.a), rsnVar.b);
            } else {
                rsoVar = null;
            }
            if (rsoVar != null) {
                int d2 = rsoVar.d(6);
                String g = d2 != 0 ? rsoVar.g(d2 + rsoVar.a) : null;
                g.getClass();
                return new dlew(g, put);
            }
        }
        ((enrr) dkzv.a.j().h("com/google/android/libraries/abuse/hades/moirai/blocklist/BloomFilterProcessor", "run", 26, "BloomFilterProcessor.kt")).q("ByteBuffer Metadata is null. ");
        return null;
    }
}
