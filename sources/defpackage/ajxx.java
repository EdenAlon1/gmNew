package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajxx extends ffhv implements ffjm {
    final /* synthetic */ UUID a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajxx(ffgu ffguVar, UUID uuid) {
        super(2, ffguVar);
        this.a = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajxx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bxmu.a;
        bxmp bxmpVar = new bxmp(bxmu.a);
        bxmpVar.z("getAttachmentMetadataForNonRestoredAttachments");
        bxmpVar.c(ajxz.a);
        bxkz a = bxle.a();
        a.c(new ajya(this.a));
        return ((bxmp) bxmpVar.j(dtvz.i(a.b(), bxle.c.a, bxmu.b.b))).b().y();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajxx ajxxVar = new ajxx(ffguVar, this.a);
        ajxxVar.b = obj;
        return ajxxVar;
    }
}
