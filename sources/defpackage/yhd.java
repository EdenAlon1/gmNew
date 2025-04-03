package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yhd extends ffhv implements ffjm {
    final /* synthetic */ yhr a;
    final /* synthetic */ MessageId b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhd(ffgu ffguVar, yhr yhrVar, MessageId messageId) {
        super(2, ffguVar);
        this.a = yhrVar;
        this.b = messageId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yhd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        aler b;
        ffci.b(obj);
        abcp abcpVar = this.a.f;
        b = abcpVar.a.b(188415, null);
        abcpVar.b = b;
        ensk f = yhr.a.f();
        f.Y(ente.a, "BugleComposeRow2");
        ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replies/DraftReplyUiAdapterImpl$setReplyTo$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 97, "DraftReplyUiAdapterImpl.kt")).t("setReplyTo %s", this.b);
        ffkx ffkxVar = new ffkx();
        yhr yhrVar = this.a;
        yhrVar.e.a(new yhe(ffkxVar, yhrVar, this.b));
        if (ffkxVar.a) {
            this.a.g.i();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yhd yhdVar = new yhd(ffguVar, this.a, this.b);
        yhdVar.c = obj;
        return yhdVar;
    }
}
