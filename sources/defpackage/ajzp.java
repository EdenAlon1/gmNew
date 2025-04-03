package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajzp extends ffhv implements ffjm {
    int a;
    int b;
    final /* synthetic */ akag c;
    final /* synthetic */ long d;
    final /* synthetic */ UUID e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzp(akag akagVar, long j, UUID uuid, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = akagVar;
        this.d = j;
        this.e = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajzp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Exception exc;
        ffhh ffhhVar = ffhh.a;
        int i = this.b;
        int i2 = 0;
        try {
        } catch (Exception e) {
            exc = e;
        }
        if (i == 0) {
            ffci.b(obj);
            try {
                akag akagVar = this.c;
                this.a = 0;
                this.b = 1;
                obj = ffra.a(ekxi.a(akagVar.g), new ajzv(null), this);
                if (obj != ffhhVar) {
                }
                return ffhhVar;
            } catch (Exception e2) {
                exc = e2;
                i = 0;
                ensk j = akag.a.j();
                j.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) j).g(exc).h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$doBugleDbRestore$2$1$2$1", "invokeSuspend", 370, "BasicRestoreWorkflowSteps.kt")).q("Failed to gather metrics for doBugleDbRestore complete event. Resolving metrics to default value.");
                ajyw ajywVar = (ajyw) this.c.i.b();
                long j2 = this.d;
                eqza eqzaVar = eqza.DO_BUGLE_DATABASE_RESTORE;
                Duration ofSeconds = Duration.ofSeconds(ffpw.h(j2), ffpw.d(j2));
                ofSeconds.getClass();
                ajyw.b(ajywVar, eqzaVar, this.e, i, 0, i2, null, ofSeconds, 168);
                return ffcu.a;
            }
        }
        if (i != 1) {
            i = this.a;
            ffci.b(obj);
            i2 = ((Number) obj).intValue();
            ajyw ajywVar2 = (ajyw) this.c.i.b();
            long j22 = this.d;
            eqza eqzaVar2 = eqza.DO_BUGLE_DATABASE_RESTORE;
            Duration ofSeconds2 = Duration.ofSeconds(ffpw.h(j22), ffpw.d(j22));
            ofSeconds2.getClass();
            ajyw.b(ajywVar2, eqzaVar2, this.e, i, 0, i2, null, ofSeconds2, 168);
            return ffcu.a;
        }
        int i3 = this.a;
        ffci.b(obj);
        i = ((Number) obj).intValue();
        akag akagVar2 = this.c;
        this.a = i;
        this.b = 2;
        obj = ffra.a(ekxi.a(akagVar2.g), new ajzt(null), this);
        if (obj == ffhhVar) {
            return ffhhVar;
        }
        i2 = ((Number) obj).intValue();
        ajyw ajywVar22 = (ajyw) this.c.i.b();
        long j222 = this.d;
        eqza eqzaVar22 = eqza.DO_BUGLE_DATABASE_RESTORE;
        Duration ofSeconds22 = Duration.ofSeconds(ffpw.h(j222), ffpw.d(j222));
        ofSeconds22.getClass();
        ajyw.b(ajywVar22, eqzaVar22, this.e, i, 0, i2, null, ofSeconds22, 168);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajzp(this.c, this.d, this.e, ffguVar);
    }
}
