package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajwy extends ffhv implements ffjm {
    final /* synthetic */ ajyr a;
    final /* synthetic */ UUID b;
    final /* synthetic */ akcg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajwy(ffgu ffguVar, ajyr ajyrVar, UUID uuid, akcg akcgVar) {
        super(2, ffguVar);
        this.a = ajyrVar;
        this.b = uuid;
        this.c = akcgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajwy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((dtuu) this.a.c.b()).d("addAttachmentFileMetadata", new ajxa(this.b, this.c));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajwy ajwyVar = new ajwy(ffguVar, this.a, this.b, this.c);
        ajwyVar.d = obj;
        return ajwyVar;
    }
}
