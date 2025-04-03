package defpackage;

import j$.time.Duration;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqv {
    public static final enru a = enru.c("com/google/android/apps/messaging/backup/analytics/D2DEventLogger");
    public final ffsk b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public sqv(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffbrVar3.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.b = ffskVar;
        this.e = ffbrVar3;
    }

    public static final eyee b(UUID uuid) {
        return eyee.x(ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
    }

    public static final eqoe c(int i, int i2, int i3) {
        eqod eqodVar = (eqod) eqoe.a.createBuilder();
        eqodVar.getClass();
        int a2 = cptn.a(i);
        eqodVar.copyOnWrite();
        eqoe eqoeVar = (eqoe) eqodVar.instance;
        eqoeVar.c = a2 - 1;
        eqoeVar.b |= 1;
        int a3 = cptn.a(i2);
        eqodVar.copyOnWrite();
        eqoe eqoeVar2 = (eqoe) eqodVar.instance;
        eqoeVar2.d = a3 - 1;
        eqoeVar2.b |= 2;
        int a4 = cptn.a(i3);
        eqodVar.copyOnWrite();
        eqoe eqoeVar3 = (eqoe) eqodVar.instance;
        eqoeVar3.e = a4 - 1;
        eqoeVar3.b |= 4;
        eyfy build = eqodVar.build();
        build.getClass();
        return (eqoe) build;
    }

    public static /* synthetic */ void d(sqv sqvVar, int i, eqom eqomVar, UUID uuid, dfkd dfkdVar, int i2) {
        eqomVar.getClass();
        axol.k(sqvVar.b, null, new sqs(sqvVar, i, eqomVar, uuid, (i2 & 64) != 0 ? null : dfkdVar, (i2 & 128) != 0, null), 3);
    }

    public static /* synthetic */ void e(sqv sqvVar, int i, Duration duration, int i2, int i3, int i4, UUID uuid, dfkd dfkdVar, int i5) {
        boolean z = (i5 & 128) != 0;
        dfkd dfkdVar2 = (i5 & 64) != 0 ? null : dfkdVar;
        int i6 = (i5 & 16) != 0 ? 0 : i4;
        axol.k(sqvVar.b, null, new squ(sqvVar, i, duration, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, i6, uuid, dfkdVar2, z, null), 3);
    }

    public final ffbr a(boolean z) {
        return (z || !((aucj) this.e.b()).a()) ? this.c : this.d;
    }
}
