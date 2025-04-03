package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajzm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akag b;
    final /* synthetic */ UUID c;
    final /* synthetic */ ffkz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzm(ffgu ffguVar, akag akagVar, UUID uuid, ffkz ffkzVar) {
        super(2, ffguVar);
        this.b = akagVar;
        this.c = uuid;
        this.d = ffkzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajzm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            akag akagVar = this.b;
            UUID uuid = this.c;
            ffkz ffkzVar = this.d;
            bbhj bbhjVar = bbhj.a;
            ajzl ajzlVar = new ajzl(akagVar, uuid, ffkzVar, null);
            this.a = 1;
            obj = bbhjVar.a("BasicRestoreWorkflowSteps#doAttachmentRestoreInternal", ajzlVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        long j = ((ffpw) obj).c;
        ajyw ajywVar = (ajyw) this.b.i.b();
        UUID uuid2 = this.c;
        ffkz ffkzVar2 = this.d;
        eqza eqzaVar = eqza.DO_ATTACHMENTS_RESTORE;
        int i = ffkzVar2.a;
        Duration ofSeconds = Duration.ofSeconds(ffpw.h(j), ffpw.d(j));
        ofSeconds.getClass();
        ajyw.b(ajywVar, eqzaVar, uuid2, 0, i, 0, null, ofSeconds, 180);
        return obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajzm ajzmVar = new ajzm(ffguVar, this.b, this.c, this.d);
        ajzmVar.e = obj;
        return ajzmVar;
    }
}
