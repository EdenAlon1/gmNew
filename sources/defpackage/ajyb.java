package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajyb extends ffhv implements ffjm {
    final /* synthetic */ UUID a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyb(ffgu ffguVar, UUID uuid) {
        super(2, ffguVar);
        this.a = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajyb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bxmu.a;
        bxmp bxmpVar = new bxmp(bxmu.a);
        bxmpVar.z("getDatabaseMetadata");
        bxmpVar.c(ajyc.a);
        bxkz a = bxle.a();
        a.c(new ajyd(this.a));
        bxlk bxlkVar = (bxlk) ((bxmd) ((bxmp) bxmpVar.j(dtvz.i(a.b(), bxle.c.a, bxmu.b.b))).b().o()).cS();
        if (bxlkVar != null) {
            return bxlkVar.l();
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajyb ajybVar = new ajyb(ffguVar, this.a);
        ajybVar.b = obj;
        return ajybVar;
    }
}
