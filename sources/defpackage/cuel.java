package defpackage;

import android.content.ContentValues;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuel extends ffhv implements ffjm {
    final /* synthetic */ cuem a;
    final /* synthetic */ long b;
    final /* synthetic */ cuen c;
    final /* synthetic */ cuef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuel(cuem cuemVar, long j, cuen cuenVar, cuef cuefVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cuemVar;
        this.b = j;
        this.c = cuenVar;
        this.d = cuefVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuel) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final cuem cuemVar = this.a;
        final long j = this.b;
        final cuen cuenVar = this.c;
        final cuef cuefVar = this.d;
        Object c = cuemVar.a.c("A2pConversationSubscriptionsDatabaseOperations#setSubscriptionState", new emyl() { // from class: cuek
            @Override // defpackage.emyl
            public final Object get() {
                Object apply;
                long j2 = j;
                cuen cuenVar2 = cuenVar;
                cuef cuefVar2 = cuefVar;
                cuem cuemVar2 = cuem.this;
                final cuee e = cuem.e(j2);
                if (e == null) {
                    Instant f = ((cqoh) cuemVar2.b.b()).f();
                    f.getClass();
                    cuee cueeVar = new cuee(j2, cuenVar2, cuefVar2, f);
                    String[] strArr = bqbh.a;
                    bqah bqahVar = new bqah();
                    bqahVar.e(cueeVar.a);
                    bqahVar.d(cueeVar.d);
                    bqahVar.c(cueeVar.b);
                    bqahVar.b(cueeVar.c);
                    bqae a = bqahVar.a();
                    final dtve a2 = bqbh.a();
                    return Boolean.valueOf(Long.valueOf(dtub.b(bqbh.a(), "a2p_conversation_subscriptions", a, new Function() { // from class: bqac
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return Long.valueOf(dtve.this.S("a2p_conversation_subscriptions", (ContentValues) obj2));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bqad
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj2) {
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    })).longValue() > 0);
                }
                String[] strArr2 = bqbh.a;
                bqbe bqbeVar = new bqbe();
                bqbeVar.ap("A2pConversationSubscriptionsDatabaseOperations-updateSubscription");
                apply = new Function() { // from class: cuej
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bqbg bqbgVar = (bqbg) obj2;
                        bqbgVar.b(cuee.this.a);
                        return bqbgVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bqbg());
                bqbeVar.af(new bqbf((bqbg) apply));
                Instant f2 = ((cqoh) cuemVar2.b.b()).f();
                if (f2 == null) {
                    bqbeVar.a.putNull("last_action_timestamp");
                } else {
                    bqbeVar.a.put("last_action_timestamp", Long.valueOf(bdgw.a(f2)));
                }
                if (cuenVar2 != cuen.CONVERSATION_TOOLSTONE_STATE_UNSPECIFIED) {
                    if (cuenVar2 == null) {
                        bqbeVar.a.putNull("conversation_toolstone_state");
                    } else {
                        bqbeVar.a.put("conversation_toolstone_state", Integer.valueOf(cuenVar2.a()));
                    }
                }
                if (cuefVar2 != cuef.CONVERSATION_SUBSCRIPTION_STATE_UNSPECIFIED) {
                    if (cuefVar2 == null) {
                        bqbeVar.a.putNull("conversation_subscription_state");
                    } else {
                        bqbeVar.a.put("conversation_subscription_state", Integer.valueOf(cuefVar2.a()));
                    }
                }
                bqbeVar.am();
                return Boolean.valueOf(bqbeVar.a().e() > 0);
            }
        });
        c.getClass();
        return c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cuel(this.a, this.b, this.c, this.d, ffguVar);
    }
}
