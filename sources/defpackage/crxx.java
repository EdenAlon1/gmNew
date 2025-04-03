package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crxx {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final dtuu d;
    private final ffbr e;
    private final ffbr f;

    public crxx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, dtuu dtuuVar) {
        this.e = ffbrVar;
        this.a = ffbrVar2;
        this.f = ffbrVar3;
        this.b = ffbrVar4;
        this.c = ffbrVar5;
        this.d = dtuuVar;
    }

    public final ParticipantsTable.BindData a() {
        return ((bdrr) this.e.b()).a();
    }

    public final crwx b(bseh bsehVar, ParticipantsTable.BindData bindData, enhk enhkVar, final ConversationIdType conversationIdType) {
        bseh bsehVar2;
        engw engwVar;
        enhk enhkVar2;
        crtl crtlVar = new crtl();
        crtlVar.a(0L);
        if (bsehVar == null) {
            throw new NullPointerException("Null conversation");
        }
        crtlVar.a = bsehVar;
        engw n = engw.n(((bczy) this.a.b()).L(conversationIdType));
        if (n == null) {
            throw new NullPointerException("Null participantsList");
        }
        crtlVar.b = n;
        crtlVar.c = bindData;
        List L = ((bdmq) this.f.b()).L(conversationIdType, 1);
        crtlVar.d = L.size() > 0 ? (MessageCoreData) L.get(0) : null;
        buxo d = MessagesTable.d();
        d.z("hasUnreadIncomingMessagesForConversation");
        d.h(new Function() { // from class: crxw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.m(ConversationIdType.this);
                buxzVar.B(false);
                buxzVar.ak(100, 117);
                buxzVar.P(false);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        crtlVar.e = d.b().T();
        crtlVar.h = (byte) (crtlVar.h | 1);
        crtlVar.a(((bdmq) this.f.b()).e(conversationIdType));
        if (enhkVar == null) {
            enhkVar = (csgj.a() && ((Optional) this.b.b()).isPresent()) ? enhk.j(((crua) this.c.b()).b((Map) ((Optional) this.b.b()).get(), conversationIdType.toString())) : enoz.a;
        }
        if (enhkVar == null) {
            throw new NullPointerException("Null additionalFields");
        }
        crtlVar.g = enhkVar;
        if (crtlVar.h == 3 && (bsehVar2 = crtlVar.a) != null && (engwVar = crtlVar.b) != null && (enhkVar2 = crtlVar.g) != null) {
            return new crtm(bsehVar2, engwVar, crtlVar.c, crtlVar.d, crtlVar.e, crtlVar.f, enhkVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (crtlVar.a == null) {
            sb.append(" conversation");
        }
        if (crtlVar.b == null) {
            sb.append(" participantsList");
        }
        if ((1 & crtlVar.h) == 0) {
            sb.append(" hasUnreadMessages");
        }
        if ((crtlVar.h & 2) == 0) {
            sb.append(" latestIncomingReadMessageTimestampMs");
        }
        if (crtlVar.g == null) {
            sb.append(" additionalFields");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final Optional c(final ConversationIdType conversationIdType) {
        bseh r = ((bczy) this.a.b()).r(conversationIdType);
        final emwl a = eldl.a(new emwl() { // from class: crxu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                crxx crxxVar = crxx.this;
                return crxxVar.b((bseh) obj, crxxVar.a(), null, conversationIdType);
            }
        });
        return Optional.ofNullable(r).map(new Function() { // from class: crxv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (crwx) emwl.this.apply((bseh) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
