package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cugm {
    public final ffbr a;
    public final ffbr b;
    public final ffsk c;

    public cugm(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffskVar;
    }

    static /* synthetic */ void d(cugm cugmVar, ConversationIdType conversationIdType, cugj cugjVar, erfe erfeVar, int i, int i2, int i3, int i4) {
        if ((i4 & 16) != 0) {
            i2 = 0;
        }
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        cugmVar.a(conversationIdType, cugjVar, erfeVar, i, i2, i3, null);
    }

    public final void a(ConversationIdType conversationIdType, cugj cugjVar, erfe erfeVar, int i, int i2, int i3, eres eresVar) {
        axol.k(this.c, null, new cugk(this, conversationIdType, cugjVar, i2, erfeVar, i, i3, eresVar, null), 3);
    }

    public final void b(ConversationIdType conversationIdType, cugj cugjVar, erfe erfeVar, int i, int i2, int i3) {
        conversationIdType.getClass();
        cugjVar.getClass();
        erfeVar.getClass();
        if (!ffdx.g(erfe.REPORTED_SPAM, erfe.REPORTED_NOT_SPAM, erfe.BLOCKED, erfe.UNBLOCKED, erfe.DISMISSED_WARNING_BANNER).contains(erfeVar)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        d(this, conversationIdType, cugjVar, erfeVar, i, i2, i3, 64);
    }

    public final void c(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, byyt byytVar, erfe erfeVar, int i, int i2, int i3) {
        conversationIdType.getClass();
        erfeVar.getClass();
        efbd.b();
        b(conversationIdType, ((cugi) this.a.b()).b(bindData, byytVar), erfeVar, i, i2, i3);
    }

    public final void e(final ConversationIdType conversationIdType) {
        cugj cugjVar;
        efbd.b();
        cugi cugiVar = (cugi) this.a.b();
        efbd.b();
        bukw a = buld.a();
        a.z("SpamLoggingMetadata#cacheMetadataForConversationDelete");
        a.c(new Function() { // from class: cugf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bulc bulcVar = (bulc) obj;
                bulcVar.b(ConversationIdType.this);
                return bulcVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (a.b().T()) {
            cugj cugjVar2 = new cugj(((cqoh) cugiVar.h.b()).f().toEpochMilli());
            cugi.i(cugjVar2, conversationIdType);
            cugi.j(cugjVar2, conversationIdType);
            cugiVar.g(cugjVar2, null, conversationIdType);
            cugiVar.f(cugjVar2, conversationIdType);
            cugiVar.e(cugjVar2, conversationIdType);
            cuha cuhaVar = (cuha) cugiVar.a.b();
            efbd.b();
            final long a2 = cuhaVar.a();
            String[] strArr = cuiq.a;
            cuin cuinVar = new cuin(cuiq.a);
            cuinVar.z("SpamLoggingIds#getValidConversationLoggingIdsWithoutExpiringOldIds");
            cuinVar.c(new Function() { // from class: cugp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cuip cuipVar = (cuip) obj;
                    cfup cfupVar = cuha.a;
                    cuipVar.b(ConversationIdType.this);
                    cuipVar.aq(new dtwe("spam_logging_ids_table.generation_timestamp", 9, Long.valueOf(a2)));
                    return cuipVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw y = cuinVar.b().y();
            y.getClass();
            cugjVar2.h = y;
            cugjVar = cugjVar2;
        } else {
            cugjVar = null;
        }
        if (cugjVar != null) {
            d(this, conversationIdType, cugjVar, erfe.DELETED, 3, 0, 0, 112);
        }
    }
}
