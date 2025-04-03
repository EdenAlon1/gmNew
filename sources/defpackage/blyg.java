package defpackage;

import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class blyg {
    public static final String a = j("%CONVERSATION_ID%");
    public static final String b = j("%ORDER_DIRECTION%");
    public static final String c = j("%EXCLUDE_DRAFTS%");
    private static final String e = j("%ROOT_MESSAGE_ID%");
    private static final String f = j("%ID_COMPARATOR%");
    private static final String g = j("%TIMESTAMP_COMPARATOR%");
    private static final String h = j("%TIMESTAMP_VALUE_VAL%");
    public static final String d = j("%TIMESTAMP_COLUMN_VAL%");

    static {
        j("%PARTICIPANT_ID%");
    }

    public static bmjq a(ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        bmjr i2 = i(true, conversationIdType, messageIdType, i + 1);
        i2.p(i(false, conversationIdType, messageIdType, i).b());
        return i2.b();
    }

    public static bmpr b(ConversationIdType conversationIdType, MessageIdType messageIdType, long j, int i) {
        String[] strArr = bmpy.a;
        bmpt bmptVar = new bmpt(bmpy.a);
        bmptVar.z("getMessageIdsAfterIdChunk");
        bmptVar.o(d, "messages.received_timestamp");
        bmptVar.o(e, messageIdType.b());
        bmptVar.o(b, "ASC");
        bmptVar.o(g, ">");
        bmptVar.o(a, conversationIdType.a());
        bmptVar.o(c, "messages.message_status <> 3");
        bmptVar.o(h, String.valueOf(j));
        bmptVar.d(new Function() { // from class: blxz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmpx bmpxVar = (bmpx) obj;
                bmpxVar.as(blyg.h(">"));
                return bmpxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bmptVar.x(i);
        return bmptVar.b();
    }

    public static bmpr c(ConversationIdType conversationIdType, MessageIdType messageIdType, long j, int i) {
        return f(conversationIdType, messageIdType, j, i).b();
    }

    public static bmpr d(ConversationIdType conversationIdType) {
        String[] strArr = bmpy.a;
        bmpt bmptVar = new bmpt(bmpy.a);
        bmptVar.z("queryFirstMessageIds");
        bmptVar.o(d, "messages.received_timestamp");
        bmptVar.o(b, "ASC");
        bmptVar.o(a, conversationIdType.a());
        bmptVar.o(c, "messages.message_status <> 3");
        bmptVar.x(1);
        return bmptVar.b();
    }

    public static bmpt e(ConversationIdType conversationIdType, int i) {
        String[] strArr = bmpy.a;
        bmpt bmptVar = new bmpt(bmpy.a);
        bmptVar.z("getLatestMessageIds");
        bmptVar.o(d, "messages.received_timestamp");
        bmptVar.o(b, "DESC");
        bmptVar.o(f, "<");
        bmptVar.o(a, conversationIdType.toString());
        bmptVar.o(c, "messages.message_status <> 3");
        bmptVar.x(i);
        return bmptVar;
    }

    public static bmpt f(ConversationIdType conversationIdType, MessageIdType messageIdType, long j, int i) {
        String[] strArr = bmpy.a;
        bmpt bmptVar = new bmpt(bmpy.a);
        bmptVar.z("getMessageIdsBeforeIdChunk");
        bmptVar.o(d, "messages.received_timestamp");
        bmptVar.o(e, messageIdType.b());
        bmptVar.o(b, "DESC");
        bmptVar.o(g, "<");
        bmptVar.o(a, conversationIdType.toString());
        bmptVar.o(c, "messages.message_status <> 3");
        bmptVar.o(h, String.valueOf(j));
        bmptVar.d(new Function() { // from class: blyb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmpx bmpxVar = (bmpx) obj;
                bmpxVar.as(blyg.h("<"));
                return bmpxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bmptVar.x(i);
        return bmptVar;
    }

    public static bmwn g(ConversationIdType conversationIdType, int i) {
        String[] strArr = bmwq.a;
        bmwn bmwnVar = new bmwn(bmwq.a);
        bmwnVar.z("getLatestMessageIdsWithReactions");
        bmwnVar.o(d, "messages.received_timestamp");
        bmwnVar.o(b, "DESC");
        bmwnVar.o(f, "<");
        bmwnVar.o(a, conversationIdType.toString());
        bmwnVar.o(c, "messages.message_status <> 3");
        bmwnVar.d(new Function() { // from class: blyc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                bmwp bmwpVar = (bmwp) obj;
                String str = blyg.a;
                Function[] functionArr = {new Function() { // from class: blye
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bmwp bmwpVar2 = (bmwp) obj2;
                        String str2 = blyg.a;
                        int a2 = bmwq.a().P().a();
                        Integer.valueOf(a2).getClass();
                        if (a2 < 30010) {
                            dtub.w("is_hidden", a2);
                        }
                        bmwpVar2.aq(new dtwe("messages.is_hidden", 1, 0));
                        return bmwpVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: blyf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bmwp bmwpVar2 = (bmwp) obj2;
                        String str2 = blyg.a;
                        bmwpVar2.as(new dtzq("b.$R NOTNULL", new Object[]{"reacted_message_id"}));
                        return bmwpVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }};
                bmwp[] bmwpVarArr = new bmwp[2];
                for (int i2 = 0; i2 < 2; i2++) {
                    Function function = functionArr[i2];
                    String[] strArr2 = bmwq.a;
                    apply = function.apply(new bmwp());
                    bmwpVarArr[i2] = (bmwp) apply;
                }
                bmwpVar.ar(bmwpVarArr);
                return bmwpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bmwnVar.x(i);
        return bmwnVar;
    }

    public static dtzj h(String str) {
        buun buunVar = MessagesTable.c.i;
        buum buumVar = MessagesTable.c;
        return new dtzq("$V $R $R OR ($V = $R AND $V $R $R)", new Object[]{buunVar, "%TIMESTAMP_COMPARATOR%", "%TIMESTAMP_VALUE_VAL%", buumVar.i, "%TIMESTAMP_VALUE_VAL%", buumVar.a, str, "%ROOT_MESSAGE_ID%"});
    }

    public static bmjr i(boolean z, ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        Object apply;
        String[] strArr = bmju.a;
        bmjr bmjrVar = new bmjr(bmju.a);
        bmjrVar.z("+MessageIdsQueries#queryMessageIds");
        bmjrVar.o(d, "messages.received_timestamp");
        bmjrVar.o(b, true != z ? "DESC" : "ASC");
        bmjrVar.o(f, true != z ? "<" : ">=");
        bmjrVar.o(a, conversationIdType.toString());
        bmjrVar.o(c, "messages.message_status <> 3");
        bmjrVar.o(e, DatabaseUtils.sqlEscapeString(String.valueOf(messageIdType.a)));
        bmjrVar.o(g, true == z ? ">" : "<");
        apply = new Function() { // from class: blya
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmjt bmjtVar = (bmjt) obj;
                String str = blyg.a;
                bmjtVar.as(new dtzq("b.$R=$R AND ($R $R b.$R OR ($R = b.$R AND $R $R b.$R))", new Object[]{"_id", "%ROOT_MESSAGE_ID%", "%TIMESTAMP_COLUMN_VAL%", "%TIMESTAMP_COMPARATOR%", "received_timestamp", "%TIMESTAMP_COLUMN_VAL%", "received_timestamp", "messages._id", "%ID_COMPARATOR%", "_id"}));
                return bmjtVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bmjt());
        bmjrVar.k(new bmjs((bmjt) apply));
        bmjrVar.x(i);
        return bmjrVar;
    }

    private static String j(String str) {
        return str.substring(1, str.length() - 1);
    }
}
