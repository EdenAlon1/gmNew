package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzj extends lml {
    public final ConversationIdType a;
    private final ffbz b;
    private final ffbz c;
    private final ffbz d;
    private final ffbz e;
    private final ffbz f;

    public tzj(llv llvVar, final ffbr ffbrVar, final ffbr ffbrVar2, final ffbr ffbrVar3, final ffbr ffbrVar4) {
        llvVar.getClass();
        this.a = bdgq.b((String) llvVar.b("conversation_id"));
        this.b = ffca.a(new ffix() { // from class: tze
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ffix
            public final Object invoke() {
                tzs tzsVar = (tzs) ffbr.this.b();
                tzz tzzVar = tzsVar.b;
                int i = engw.d;
                engw engwVar = enou.a;
                if (engwVar == null) {
                    throw new NullPointerException("Null conversationIds");
                }
                becn becnVar = new becn(this.a, engwVar);
                bgmk a = bfkt.a();
                String[] strArr = bgmn.a;
                bgmm bgmmVar = new bgmm();
                int intValue = bgmn.c().intValue();
                if (intValue < 29020) {
                    dtub.w("delete_timestamp", intValue);
                }
                bgmmVar.aq(new dtwe("conversations.delete_timestamp", 1, 0L));
                bgmo.l(null);
                bgmo.l(null);
                bgmo.l(null);
                bgmo.l(null);
                bgmo.l(null);
                bgmo.l(null);
                bgmo.l(false);
                ConversationIdType conversationIdType = becnVar.a;
                if (!conversationIdType.b()) {
                    bgmmVar.aq(new dtrt("conversations._id", 1, Long.valueOf(bdgq.a(conversationIdType))));
                }
                engw engwVar2 = becnVar.b;
                if (!engwVar2.isEmpty()) {
                    engr engrVar = new engr();
                    enqv it = engwVar2.iterator();
                    while (it.hasNext()) {
                        engrVar.h(String.valueOf(bdgq.a((ConversationIdType) it.next())));
                    }
                    bgmmVar.aq(new dtrw("conversations._id", 3, bgmm.at(engrVar.g()), true));
                }
                bgmk a2 = bfkt.a();
                a2.d(bgmmVar);
                if (((Boolean) ((cfup) bzaq.p.get()).e()).booleanValue()) {
                    bgme bgmeVar = bgmn.b;
                    a2.c(new bgmh(bgmeVar.b, false), new bgmh(bgmeVar.a, true));
                } else {
                    a2.c(new bgmh(bgmn.b.b, false));
                }
                a.d(bgmmVar);
                a.c(new bgmh(bgmn.b.b, false));
                return tzzVar.a("conversation_metadata", a.b(), new tzp(tzsVar, null));
            }
        });
        this.c = ffca.a(new ffix() { // from class: tzf
            @Override // defpackage.ffix
            public final Object invoke() {
                tzs tzsVar = (tzs) ffbr.this.b();
                tzz tzzVar = tzsVar.b;
                bfkr n = bfks.n();
                ((becl) n).f = this.a;
                return tzzVar.a("conversation_metadata", n.a().l(), new tzr(tzsVar, null));
            }
        });
        this.d = ffca.a(new ffix() { // from class: tzg
            @Override // defpackage.ffix
            public final Object invoke() {
                tzv tzvVar = (tzv) ffbr.this.b();
                tzz tzzVar = tzvVar.c;
                ConversationIdType conversationIdType = this.a;
                return tzzVar.a("participants", bcui.c(conversationIdType), new tzu(tzvVar, conversationIdType, null));
            }
        });
        this.e = ffca.a(new ffix() { // from class: tzh
            @Override // defpackage.ffix
            public final Object invoke() {
                uag uagVar = (uag) ffbr.this.b();
                tzz tzzVar = uagVar.b;
                bvvn e = ParticipantsTable.e();
                e.z("SelfParticipantsDataServiceFactory");
                e.h(new Function() { // from class: uad
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvvw bvvwVar = (bvvw) obj;
                        bvvwVar.x(-2);
                        return bvvwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return tzzVar.a("self_participant", e.b(), new uaf(uagVar, null));
            }
        });
        this.f = ffca.a(new ffix() { // from class: tzi
            @Override // defpackage.ffix
            public final Object invoke() {
                uac uacVar = (uac) ffbr.this.b();
                BugleConversationId bugleConversationId = new BugleConversationId(this.a);
                tzn tznVar = uacVar.b;
                aqge d = uacVar.c.d(bugleConversationId);
                uab uabVar = new uab(uacVar, null);
                return tznVar.a.a("recipients_model", new tzm(d), new tzk(uabVar, d, null));
            }
        });
    }

    public final uah a() {
        return (uah) this.c.a();
    }

    public final uah b() {
        return (uah) this.d.a();
    }

    public final uah c() {
        return (uah) this.f.a();
    }

    public final uah e() {
        return (uah) this.e.a();
    }

    @Override // defpackage.lml
    protected final void fD() {
        if (this.b.b()) {
            ((uah) this.b.a()).c();
        }
        if (this.c.b()) {
            a().c();
        }
        if (this.d.b()) {
            b().c();
        }
        if (this.e.b()) {
            e().c();
        }
        if (this.f.b()) {
            c().c();
        }
    }
}
