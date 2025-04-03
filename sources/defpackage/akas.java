package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akas extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akbo b;
    final /* synthetic */ UUID c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akas(ffgu ffguVar, akbo akboVar, UUID uuid) {
        super(2, ffguVar);
        this.b = akboVar;
        this.c = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akas) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            akbo akboVar = this.b;
            UUID uuid = this.c;
            bbhj bbhjVar = bbhj.a;
            akaq akaqVar = new akaq(akboVar, uuid, null);
            this.a = 1;
            obj = bbhjVar.a("RestoreAnytimeCompatibleRestoreWorkflowSteps#doBugleDbRestoreInternal", akaqVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        long j = ((ffpw) obj).c;
        akbo akboVar2 = this.b;
        axol.k(akboVar2.j, null, new akar(akboVar2, this.c, j, null), 3);
        return obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akas akasVar = new akas(ffguVar, this.b, this.c);
        akasVar.d = obj;
        return akasVar;
    }
}
