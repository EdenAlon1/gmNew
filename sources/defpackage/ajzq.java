package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajzq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akag b;
    final /* synthetic */ UUID c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzq(ffgu ffguVar, akag akagVar, UUID uuid) {
        super(2, ffguVar);
        this.b = akagVar;
        this.c = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajzq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            bbhj bbhjVar = bbhj.a;
            ajzo ajzoVar = new ajzo(akagVar, uuid, null);
            this.a = 1;
            obj = bbhjVar.a("BasicRestoreWorkflowSteps#doBugleDbRestoreInternal", ajzoVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        long j = ((ffpw) obj).c;
        akag akagVar2 = this.b;
        axol.k(akagVar2.j, null, new ajzp(akagVar2, j, this.c, null), 3);
        return obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajzq ajzqVar = new ajzq(ffguVar, this.b, this.c);
        ajzqVar.d = obj;
        return ajzqVar;
    }
}
