package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bflb {
    public static final String a = bsom.c.O.toString() + "=0 AND " + bsom.c.a.toString() + "=" + brww.c.b.toString();
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final dtzj f;
    public static final dtzj g;
    static final String h;

    static {
        bskp bskpVar = bsom.c;
        b = bskpVar.O.toString() + "=0 AND " + bskpVar.a.toString() + "=" + bsdr.c.a.toString();
        c = a("%ONE_ON_ONE_JOIN%");
        d = "messages._id=conversations.latest_message_id";
        e = a("%MESSAGES_JOIN%");
        bvvn e2 = ParticipantsTable.e();
        e2.z("ConversationListSubQueries.containsVerifiedSmsParticipantsSubquery");
        e2.f(new Function() { // from class: bfku
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = bflb.a;
                return ((bvtg) obj).F;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e2.h(new Function() { // from class: bfkv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                String str = bflb.a;
                String[] strArr = bsdr.a;
                bsdm bsdmVar = new bsdm(bsdr.a);
                bsdmVar.e(new Function() { // from class: bfkz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        String str2 = bflb.a;
                        return ((bscz) obj2).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsdmVar.f(new Function() { // from class: bfla
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsdq bsdqVar = (bsdq) obj2;
                        String str2 = bflb.a;
                        bsdqVar.c(ParticipantsTable.c.a);
                        return bsdqVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bvvwVar.l(bsdmVar.b());
                bvvwVar.p(byzi.VERIFICATION_NA);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f = new dtym(e2.b());
        bxco c2 = bxct.c();
        c2.c(new Function() { // from class: bfkw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = bflb.a;
                return ((bxby) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c2.e(new Function() { // from class: bfkx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxcs bxcsVar = (bxcs) obj;
                String str = bflb.a;
                bxcsVar.b(bsom.c.a);
                return bxcsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bxcm b2 = c2.b();
        String[] strArr = b2.l;
        if (strArr.length != 1) {
            throw new IllegalStateException("cannot do min on a projection with length other than 1");
        }
        g = new dtzq("SELECT MIN($R) FROM ($R)", new Object[]{dtub.o(strArr[0]), b2.I()});
        h = "(messages.conversation_id = conversations._id)";
        buxo d2 = MessagesTable.d();
        d2.z("hasUnreadMessages");
        d2.h(new Function() { // from class: bfky
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                String str = bflb.a;
                buxzVar.P(false);
                buxzVar.n(bsom.c.a);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d2.b();
    }

    private static String a(String str) {
        return str.substring(1, str.length() - 1);
    }
}
