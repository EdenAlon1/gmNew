package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckkh extends ffhv implements ffjm {
    final /* synthetic */ alxj a;
    final /* synthetic */ ckki b;
    final /* synthetic */ alxh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckkh(alxj alxjVar, ckki ckkiVar, alxh alxhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = alxjVar;
        this.b = ckkiVar;
        this.c = alxhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckkh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        int i;
        ffci.b(obj);
        ConversationId c = this.a.c();
        c.getClass();
        final ConversationIdType a = amic.a(c);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.BUGLE_COMPOSE_DISABLED_EVENT, eoluVar);
        ezkk ezkkVar = (ezkk) ezkm.a.createBuilder();
        ezkkVar.getClass();
        alxh alxhVar = this.c;
        switch (alxhVar) {
            case NONE:
                i = 2;
                break;
            case CONVERSATION_UNKNOWN:
                i = 3;
                break;
            case GROUP_EMPTY:
                i = 4;
                break;
            case GROUP_TOO_LARGE:
                i = 5;
                break;
            case GROUP_NOT_A_MEMBER:
                i = 6;
                break;
            case RECIPIENT_INCOMING_ONLY:
                i = 7;
                break;
            case SELFIDENTITY_UNAVAILABLE:
                i = 8;
                break;
            case RCS_DISCONNECTED:
                i = 9;
                break;
            case RCS_UNSUPPORTED_BY_CARRIER:
                i = 10;
                break;
            case CONVERSATION_ENDED:
                i = 11;
                break;
            case NOT_DEFAULT_SMS_APP:
                i = 12;
                break;
            case GROUP_NO_SELF_NUMBER:
                i = 13;
                break;
            case PARENTAL_APPROVAL_REQUIRED:
                i = 14;
                break;
            case RCS_GROUP_CREATION_IN_PROGRESS:
                i = 15;
                break;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(alxhVar.toString()));
        }
        ezkkVar.copyOnWrite();
        ezkm ezkmVar = (ezkm) ezkkVar.instance;
        ezkmVar.c = i - 1;
        ezkmVar.b |= 1;
        alxj alxjVar = this.a;
        int a2 = alxjVar instanceof amfx ? ckki.a(Integer.valueOf(((amfx) alxjVar).v())) : ckki.a((Integer) bsom.j(bdgq.b(alxjVar.c().b()), new Function() { // from class: ckkd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return Integer.valueOf(((bseh) obj2).k());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        ckki ckkiVar = this.b;
        ezkkVar.copyOnWrite();
        ezkm ezkmVar2 = (ezkm) ezkkVar.instance;
        ezkmVar2.d = a2 - 1;
        ezkmVar2.b |= 2;
        if (((atmx) ckkiVar.b.b()).a()) {
            long a3 = ((akvz) ckkiVar.d.b()).a(alxjVar.c());
            ezkkVar.copyOnWrite();
            ezkm ezkmVar3 = (ezkm) ezkkVar.instance;
            ezkmVar3.b |= 32;
            ezkmVar3.h = a3;
        }
        ezkkVar.copyOnWrite();
        ezkm ezkmVar4 = (ezkm) ezkkVar.instance;
        ezkmVar4.e = 2;
        ezkmVar4.b |= 4;
        bvvn e = ParticipantsTable.e();
        e.z("getParticipantsCountFromConversationParticipantsTable");
        e.h(new Function() { // from class: ckkg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Object apply;
                bvvw bvvwVar = (bvvw) obj2;
                bvvwVar.getClass();
                brwp a4 = brww.a();
                apply = new Function() { // from class: ckkb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        brvy brvyVar = (brvy) obj3;
                        brvyVar.getClass();
                        return brvyVar.c;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(brww.c);
                a4.c((brvz) apply);
                final ConversationIdType conversationIdType = ConversationIdType.this;
                a4.e(new Function() { // from class: ckkc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        brwv brwvVar = (brwv) obj3;
                        brwvVar.getClass();
                        brwvVar.b(ConversationIdType.this);
                        return brwvVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bvvwVar.l(a4.b());
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = e.b().i();
        ezkkVar.copyOnWrite();
        ezkm ezkmVar5 = (ezkm) ezkkVar.instance;
        ezkmVar5.b = 8 | ezkmVar5.b;
        ezkmVar5.f = i2;
        bvvn e2 = ParticipantsTable.e();
        e2.z("getParticipantsCountFromConversationToParticipantsTable");
        e2.h(new Function() { // from class: ckka
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bvvw bvvwVar = (bvvw) obj2;
                bvvwVar.getClass();
                String[] strArr = bsdr.a;
                bsdm bsdmVar = new bsdm(bsdr.a);
                bsdmVar.e(new Function() { // from class: ckke
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        bscz bsczVar = (bscz) obj3;
                        bsczVar.getClass();
                        return bsczVar.b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final ConversationIdType conversationIdType = ConversationIdType.this;
                bsdmVar.f(new Function() { // from class: ckkf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        bsdq bsdqVar = (bsdq) obj3;
                        bsdqVar.getClass();
                        bsdqVar.b(ConversationIdType.this);
                        return bsdqVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bvvwVar.l(bsdmVar.b());
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i3 = e2.b().i();
        ezkkVar.copyOnWrite();
        ezkm ezkmVar6 = (ezkm) ezkkVar.instance;
        ezkmVar6.b |= 16;
        ezkmVar6.g = i3;
        eyfy build = ezkkVar.build();
        build.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.cv = (ezkm) build;
        eolvVar.h |= 16777216;
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        ((akyb) this.b.a.b()).a().j((eolu) builder, alal.LOG_SPEC_DSDR_GROUP_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckkh(this.a, this.b, this.c, ffguVar);
    }
}
