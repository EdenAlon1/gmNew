package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayiw extends ffhv implements ffjm {
    final /* synthetic */ ConversationIdType a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayiw(ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayiw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = aykg.a;
        ayjy ayjyVar = new ayjy();
        final ConversationIdType conversationIdType = this.a;
        ayjyVar.c(new Function() { // from class: ayiv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                aykf aykfVar = (aykf) obj2;
                aykfVar.b(ConversationIdType.this);
                return aykfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ayjyVar.f("removeUpgradedMmsGroupFromCache");
        int d = ayjyVar.d();
        ensk h = ayix.a.h();
        h.Y(ente.a, "BugleBCM");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.p, this.a);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/conversation/match/ConversationMatcherCacheClearer$onMmsGroupUpgraded$1", "invokeSuspend", 45, "ConversationMatcherCacheClearer.kt")).r("onMmsGroupUpgraded: Removed %s entries from BCM cache", d);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ayiw(this.a, ffguVar);
    }
}
