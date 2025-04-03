package defpackage;

import android.content.ContentValues;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axmt {
    private static final cskc b = cskc.g("BugleDataModel", "CloudSyncDatabaseOperations");
    public final ffbr a;
    private final dtuu c;
    private final ffbr d;
    private final ffbr e;

    public axmt(ffbr ffbrVar, dtuu dtuuVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.c = dtuuVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
    }

    public static ConversationIdType a(final String str) {
        ConversationIdType conversationIdType;
        ekzz f = eleg.f("CloudSyncDatabaseOperations#getExistingCloudSyncConversation");
        try {
            csix.h();
            bsob e = bsom.e();
            e.z("getExistingCloudSyncConversation");
            e.r();
            e.g(new Function() { // from class: axmr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bskp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.i(new Function() { // from class: axms
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    bsolVar.L(1);
                    int intValue = bsom.g().intValue();
                    if (intValue < 8500) {
                        dtub.w("participant_id_list", intValue);
                    }
                    bsolVar.aq(new dtrt("conversations.participant_id_list", 1, String.valueOf(str)));
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bskr bskrVar = (bskr) e.b().o();
            try {
                if (bskrVar.moveToFirst()) {
                    if (bskrVar.getCount() != 1) {
                        csjb e2 = b.e();
                        e2.I("Unexpected cursor size:");
                        e2.G(bskrVar.getCount());
                        e2.s(new Throwable());
                    }
                    conversationIdType = bskrVar.h();
                } else {
                    conversationIdType = bdgq.a;
                }
                bskrVar.close();
                f.close();
                return conversationIdType;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ConversationIdType b(byyt byytVar, List list) {
        ekzz f = eleg.f("CloudSyncDatabaseOperations#getOrCreateCloudSyncConversation");
        try {
            efbd.b();
            String c = c(list);
            ConversationIdType a = a(c);
            if (a.b()) {
                a = ((bczy) this.e.b()).aq(-1L, byytVar, list, 1, c, -1L);
            }
            f.close();
            return a;
        } finally {
        }
    }

    public final String c(List list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((bdrr) this.d.b()).i((ParticipantsTable.BindData) list.get(i));
        }
        Arrays.sort(strArr);
        return TextUtils.join(",", strArr);
    }

    public final boolean d(ConversationIdType conversationIdType, cpxu cpxuVar) {
        ekzz f = eleg.f("CloudSyncDatabaseOperations#isCloudSyncConversation");
        try {
            boolean z = false;
            if (cpxuVar.d()) {
                if (((bczy) this.e.b()).b(conversationIdType) == 1) {
                    z = true;
                }
            }
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean e(final String str, final Bundle bundle, final MessageCoreData messageCoreData) {
        return ((Boolean) this.c.c("CloudSyncDatabaseOperations#updateMessageWithCloudSyncId", new emyl() { // from class: axmq
            @Override // defpackage.emyl
            public final Object get() {
                Bundle bundle2 = bundle;
                boolean z = false;
                boolean z2 = bundle2.getBoolean("com.google.android.apps.messaging.cloudsync.extra.READ", false);
                boolean z3 = z2 || bundle2.getBoolean("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED", false);
                if (z2 || z3) {
                    final String str2 = str;
                    String[] strArr = MessagesTable.a;
                    buxr buxrVar = new buxr();
                    buxrVar.ap("updateMessageWithCloudSyncIdInternal");
                    buxrVar.Y(new Function() { // from class: axmp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            buxzVar.d(str2);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    if (z2) {
                        buxrVar.F(true);
                    }
                    buxrVar.v(true);
                    bundle2.getBoolean("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED");
                    bundle2.getBoolean("com.google.android.apps.messaging.cloudsync.extra.READ");
                    boolean z4 = csjy.b;
                    if (buxrVar.b().e() > 0) {
                        MessageCoreData messageCoreData2 = messageCoreData;
                        ((cbgf) axmt.this.a.b()).l(messageCoreData2.z(), messageCoreData2.B(), (String[]) new ContentValues(buxrVar.b().a).keySet().toArray(new String[0]));
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }

    public final String[] f(ConversationIdType conversationIdType, buxs buxsVar) {
        String[] strArr;
        if (buxsVar == null) {
            String[] strArr2 = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.as(new dtzq("1", new Object[0]));
            buxsVar = new buxs(buxzVar);
        }
        ekzz f = eleg.f("CloudSyncDatabaseOperations#getMessageCloudSyncIds");
        try {
            String[] strArr3 = MessagesTable.a;
            buxz buxzVar2 = new buxz();
            buxzVar2.e();
            if (!conversationIdType.b()) {
                buxzVar2.m(conversationIdType);
            }
            buxo d = MessagesTable.d();
            d.z("+getMessageCloudSyncIds");
            d.f(new Function() { // from class: axmo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((buum) obj).B;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.g(buxzVar2);
            d.k(buxsVar);
            d.r();
            buuo buuoVar = (buuo) d.b().o();
            try {
                if (buuoVar.getCount() > 0) {
                    ArrayList arrayList = new ArrayList();
                    while (buuoVar.moveToNext()) {
                        String C = buuoVar.C();
                        if (C != null) {
                            arrayList.add(C);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        strArr = (String[]) arrayList.toArray(new String[0]);
                        buuoVar.close();
                        f.close();
                        return strArr;
                    }
                }
                buuoVar.close();
                strArr = null;
                f.close();
                return strArr;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
