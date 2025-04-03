package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctqx extends ffhv implements ffjm {
    final /* synthetic */ fbre a;
    final /* synthetic */ ctrc b;
    final /* synthetic */ String c;
    final /* synthetic */ ConversationIdType d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctqx(ffgu ffguVar, fbre fbreVar, ctrc ctrcVar, String str, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = fbreVar;
        this.b = ctrcVar;
        this.c = str;
        this.d = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctqx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!ekxi.b(u())) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#updateSmartSuggestionConsumptionState");
        try {
            String[] strArr = bvhn.a;
            bvhf bvhfVar = new bvhf();
            bvhfVar.ap("updateSmartSuggestionConsumptionStateFuture");
            bvhfVar.am();
            fbre fbreVar = this.a;
            int intValue = bvhn.c().intValue();
            int intValue2 = bvhn.c().intValue();
            if (intValue2 < 53080) {
                dtub.w("consumption_state", intValue2);
            }
            if (intValue >= 53080) {
                if (fbreVar == null) {
                    bvhfVar.a.putNull("consumption_state");
                } else {
                    bvhfVar.a.put("consumption_state", Integer.valueOf(fbreVar.a()));
                }
            }
            bvhfVar.c(new ctqz(this.c));
            if (bvhfVar.b().e() > 0 && ((Boolean) ((cfup) czur.a.get()).e()).booleanValue()) {
                Optional f2 = this.b.f(this.c);
                final ctqy ctqyVar = new ctqy(this.b, this.d);
                f2.ifPresent(new Consumer() { // from class: ctqw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final /* synthetic */ void o(Object obj2) {
                        ffji.this.invoke(obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctqx ctqxVar = new ctqx(ffguVar, this.a, this.b, this.c, this.d);
        ctqxVar.e = obj;
        return ctqxVar;
    }
}
