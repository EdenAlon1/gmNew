package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcui {
    public static bsdm a(final ConversationIdType conversationIdType) {
        String[] strArr = bsdr.a;
        bsdm bsdmVar = new bsdm(bsdr.a);
        bsdmVar.z("createParticipantIdFromConversationToParticipantsTableQueryBuilder");
        bsdmVar.f(new Function() { // from class: bcug
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsdq bsdqVar = (bsdq) obj;
                bsdqVar.b(ConversationIdType.this);
                return bsdqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bsdmVar;
    }

    public static bvvl b(final bsdl bsdlVar) {
        bvvn e = ParticipantsTable.e();
        e.z("createParticipantsTableQuery");
        e.h(new Function() { // from class: bcuh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.l(bsdl.this);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.C(h(ParticipantsTable.c.m) + "," + h(ParticipantsTable.c.g));
        return e.b();
    }

    public static bvvl c(ConversationIdType conversationIdType) {
        return f(conversationIdType, false);
    }

    public static bvvl d(ConversationIdType conversationIdType) {
        final bvvl g = g();
        bsdm a = a(conversationIdType);
        a.f(new Function() { // from class: bcue
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsdq bsdqVar = (bsdq) obj;
                bsdqVar.aq(new dtru("conversation_to_participants.participant_id", 4, bvvl.this));
                return bsdqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a.e(new Function() { // from class: bcuf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bscz) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return b(a.b());
    }

    public static bvvl e(ConversationIdType conversationIdType) {
        return f(conversationIdType, true);
    }

    private static bvvl f(ConversationIdType conversationIdType, boolean z) {
        bvvl g = g();
        bsdm a = a(conversationIdType);
        a.e(new Function() { // from class: bcud
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bscz) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a.p(g);
        final bsdl b = a.b();
        bvvn e = ParticipantsTable.e();
        e.z("createParticipantsTableQuery");
        e.h(new Function() { // from class: bcub
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.l(bsdl.this);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (z) {
            bwon a2 = ProfilesTable.a();
            a2.c(new Function() { // from class: bcuc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwnk bwnkVar = (bwnk) obj;
                    return new bwnl[]{bwnkVar.i, bwnkVar.g, bwnkVar.h};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dtvy i = dtvz.i(a2.b(), ProfilesTable.c.b, ParticipantsTable.c.a);
            ((dtrd) i).e = "profiles_table_join_tag";
            e.G(i.g());
            bvth bvthVar = ParticipantsTable.c.m;
            bvtg bvtgVar = ParticipantsTable.c;
            bvth bvthVar2 = bvtgVar.m;
            bwnl bwnlVar = ProfilesTable.c.i;
            bwnl bwnlVar2 = ProfilesTable.c.i;
            bvth bvthVar3 = bvtgVar.g;
            e.B(new dtzq("(NULLIF($V, '') ISNULL), NULLIF($V, ''),(NULLIF($V{J:profiles_table_join_tag}, '') ISNULL),NULLIF($V{J:profiles_table_join_tag}, ''),(NULLIF($V, '') ISNULL), NULLIF($V, '')", new Object[]{bvthVar, bvthVar2, bwnlVar, bwnlVar2, bvthVar3, bvthVar3}));
        } else {
            e.C(h(ParticipantsTable.c.m) + "," + h(ParticipantsTable.c.g));
        }
        return e.b();
    }

    private static bvvl g() {
        bvvn e = ParticipantsTable.e();
        e.z("ConversationParticipantsQueryFactory#createQuery");
        e.f(new Function() { // from class: bctz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bvtg) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.h(new Function() { // from class: bcua
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
        return e.b();
    }

    private static String h(bvth bvthVar) {
        return dtzi.a(new dtzq("(NULLIF($V, '') ISNULL), NULLIF($V, '')", new Object[]{bvthVar, bvthVar}));
    }
}
