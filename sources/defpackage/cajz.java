package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cajz extends ffhv implements ffjm {
    final /* synthetic */ cakc a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cajz(ffgu ffguVar, cakc cakcVar) {
        super(2, ffguVar);
        this.a = cakcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cajz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((alxl) this.a.b.b()).a(new BugleConversationId(this.a.e.a), alxk.MINIMAL);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cajz cajzVar = new cajz(ffguVar, this.a);
        cajzVar.b = obj;
        return cajzVar;
    }
}
