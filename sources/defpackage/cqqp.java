package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import org.chromium.net.ConnectionMigrationOptions;
import org.chromium.net.CronetEngine;
import org.chromium.net.DnsOptions;
import org.chromium.net.QuicOptions;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqqp implements cqqq {
    public final cqqn a;
    public final chks b;
    public final ffbr c;
    public final enru d;
    private final Context e;
    private final ffbz f;

    public cqqp(Context context, cqqn cqqnVar, chks chksVar, ffbr ffbrVar) {
        context.getClass();
        chksVar.getClass();
        ffbrVar.getClass();
        this.e = context;
        this.a = cqqnVar;
        this.b = chksVar;
        this.c = ffbrVar;
        this.d = enru.c("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine");
        this.f = ffca.a(new ffix() { // from class: cqqo
            @Override // defpackage.ffix
            public final Object invoke() {
                cqqp cqqpVar = cqqp.this;
                ensk e = cqqpVar.d.e();
                e.Y(ente.a, "BugleFileTransfer");
                ((enrr) e.h("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine", "getCronetEngineInternal", 44, "BugleQuicCronetEngine.kt")).q("Initializing BugleQuicCronetEngine.");
                CronetEngine.Builder createBuilder = cqqpVar.b.a().createBuilder();
                createBuilder.getClass();
                createBuilder.enableHttp2(true);
                createBuilder.enableQuic(true);
                DnsOptions.Builder builder = DnsOptions.builder();
                builder.enableStaleDns(true);
                builder.useBuiltInDnsResolver(true);
                builder.preestablishConnectionsToStaleDnsResults(true);
                builder.persistHostCache(true);
                DnsOptions.StaleDnsOptions.Builder builder2 = DnsOptions.StaleDnsOptions.builder();
                builder2.useStaleOnNameNotResolved(true);
                Object b = cqqpVar.a.e.b();
                b.getClass();
                builder2.allowCrossNetworkUsage(((Boolean) b).booleanValue());
                Object b2 = cqqpVar.a.c.b();
                b2.getClass();
                builder2.setFreshLookupTimeoutMillis(((Number) b2).longValue());
                Object b3 = cqqpVar.a.d.b();
                b3.getClass();
                builder2.setMaxExpiredDelayMillis(((Number) b3).longValue());
                builder.setStaleDnsOptions(builder2.build());
                createBuilder.setDnsOptions(builder.build()).getClass();
                if (((aslm) cqqpVar.c.b()).a()) {
                    try {
                        cqqpVar.c(createBuilder);
                    } catch (IllegalArgumentException e2) {
                        ensk j = cqqpVar.d.j();
                        j.Y(ente.a, "BugleFileTransfer");
                        ((enrr) ((enrr) j).g(e2).h("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine", "configureQuicHints", 103, "BugleQuicCronetEngine.kt")).q("Exception occurred while getting access to CronetCache directory, keeping http cache in memory.");
                        Object b4 = cqqpVar.a.b.b();
                        b4.getClass();
                        createBuilder.enableHttpCache(1, ((Number) b4).longValue());
                    }
                } else {
                    cqqpVar.c(createBuilder);
                }
                eygr eygrVar = ((ezgw) cqqpVar.a.a.b()).b;
                eygrVar.getClass();
                ensk e3 = cqqpVar.d.e();
                e3.Y(ente.a, "BugleFileTransfer");
                ((enrr) e3.h("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine", "configureQuicHints", 111, "BugleQuicCronetEngine.kt")).t("Configuring CronetEngine with quic hints: %s", eygrVar);
                Iterator<E> it = eygrVar.iterator();
                while (it.hasNext()) {
                    createBuilder.addQuicHint((String) it.next(), 443, 443);
                }
                ConnectionMigrationOptions.Builder builder3 = ConnectionMigrationOptions.builder();
                builder3.enableDefaultNetworkMigration(true);
                createBuilder.setConnectionMigrationOptions(builder3.build()).getClass();
                cqqn cqqnVar2 = cqqpVar.a;
                QuicOptions.Builder builder4 = QuicOptions.builder();
                Object b5 = cqqnVar2.f.b();
                b5.getClass();
                builder4.setRetransmittableOnWireTimeoutMillis(((Number) b5).longValue());
                createBuilder.setQuicOptions(builder4.build()).getClass();
                CronetEngine build = createBuilder.build();
                build.getClass();
                return build;
            }
        });
    }

    @Override // defpackage.cqqq
    public final CronetEngine a() {
        return b();
    }

    public final CronetEngine b() {
        return (CronetEngine) this.f.a();
    }

    public final void c(CronetEngine.Builder builder) {
        efbd.b();
        File file = new File(this.e.getCacheDir(), "bugle_cronet_cache");
        if (!file.isDirectory() && !file.mkdir()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        CronetEngine.Builder storagePath = builder.setStoragePath(file.getAbsolutePath());
        Object b = this.a.b.b();
        b.getClass();
        storagePath.enableHttpCache(2, ((Number) b).longValue()).getClass();
    }
}
