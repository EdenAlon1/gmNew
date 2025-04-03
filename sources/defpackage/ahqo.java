package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahqo extends ffhv implements ffjm {
    final /* synthetic */ ahqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahqo(ahqt ahqtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ahqtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahqo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ahqt ahqtVar = this.a;
        ekzz f = eleg.f("fetchConversationList");
        try {
            ((aeix) ahqtVar.n.b()).j(cgix.HOME);
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahqo(this.a, ffguVar);
    }
}
