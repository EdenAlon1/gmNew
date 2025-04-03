package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionsJsonParser;
import com.google.android.ims.rcsservice.chatsession.message.RichCardParser;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cerv extends ceut {
    public static final cfva a = cfvl.i(cfvl.b, "enable_rbm_welcome_message_rich_cards", false);
    public static final cskc b = cskc.g("Bugle", "RbmChatbotDirectoryWelcomeMessageHandler");
    public final byzp c;
    public final bavs d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final cqoh k;
    private final ffbr l;
    private final dtuu m;

    public cerv(byzp byzpVar, bavs bavsVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, dtuu dtuuVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, cqoh cqohVar) {
        this.c = byzpVar;
        this.d = bavsVar;
        this.l = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.m = dtuuVar;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = cqohVar;
    }

    private static elfl k() {
        return elfo.e(ceyt.i());
    }

    private static elfl l() {
        return elfo.e(ceyt.k());
    }

    private final void m(final String str, final String str2, final ConversationIdType conversationIdType, final String str3, final boolean z, final List list) {
        this.m.d("RbmChatbotDirectoryWelcomeMessageHandler#createMessage", new Runnable() { // from class: cert
            @Override // java.lang.Runnable
            public final void run() {
                cerv cervVar = cerv.this;
                aztg h = ((ckds) cervVar.i.b()).h();
                final bdhg a2 = ((awtm) cervVar.j.b()).a();
                long epochMilli = cervVar.k.f().toEpochMilli();
                SelfIdentityId g = h.g();
                String str4 = str3;
                boolean z2 = z;
                String str5 = true != z2 ? str4 : null;
                byzp byzpVar = cervVar.c;
                ConversationIdType conversationIdType2 = conversationIdType;
                String str6 = str5;
                String str7 = str2;
                MessageCoreData y = byzpVar.y(a2, str7, g, conversationIdType2, 100, 3, str6, true, true, epochMilli, epochMilli);
                csjb c = cerv.b.c();
                c.I("Creating RCS message for Welcome Message");
                c.A("botId", str);
                c.f(str7);
                c.c(conversationIdType2);
                c.h(a2);
                c.r();
                if (z2) {
                    cerv.b.p("Adding rich card parts for Welcome Message...");
                    cervVar.d.a(str4, y, true);
                }
                MessageIdType a3 = ((bdjr) cervVar.e.b()).a(y);
                if (a3.c()) {
                    cerv.b.r("Unable to persist Welcome Message");
                    return;
                }
                List list2 = list;
                csjb c2 = cerv.b.c();
                c2.I("Created rich card parts for Welcome Message");
                c2.A("messageRowId", a3);
                c2.r();
                if (!list2.isEmpty()) {
                    csjb c3 = cerv.b.c();
                    c3.I("Adding suggestions");
                    c3.y("count", list2.size());
                    c3.r();
                    final bdhg a4 = ((awtm) cervVar.j.b()).a();
                    Collection.EL.stream(list2).forEach(new Consumer() { // from class: ceru
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ConversationSuggestion conversationSuggestion = (ConversationSuggestion) obj;
                            cfva cfvaVar = cerv.a;
                            conversationSuggestion.setRcsMessageId(bdhg.this.f());
                            conversationSuggestion.setTargetRcsMessageId(a2.f());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    ((ctpl) cervVar.f.b()).b(list2, a3, true, epochMilli);
                }
                ((cbgf) cervVar.h.b()).k(conversationIdType2);
                ((ejvp) cervVar.g.b()).b(elfo.e(conversationIdType2), "latest_message");
            }
        });
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RbmChatbotDirectoryWelcomeMessageHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cerx.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl elflVar;
        cerx cerxVar = (cerx) eyhsVar;
        Uri parse = Uri.parse(cerxVar.b);
        String b2 = emxe.b(parse.getQueryParameter("welcome_message_content"));
        String b3 = emxe.b(parse.getQueryParameter("welcome_message_type"));
        String queryParameter = parse.getQueryParameter("suggestions");
        ConversationIdType b4 = bdgq.b(cerxVar.c);
        String str = cerxVar.d;
        ekzz f = eleg.f("RbmChatbotDirectoryWelcomeMessageHandler#processPendingWorkItemAsync");
        try {
            if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(b3)) {
                if (!RbmSpecificMessage.CONTENT_TYPE.equals(b3) && !"text/plain".equals(b3)) {
                    csjb e = b.e();
                    e.I("Unrecognized content type");
                    e.A("welcomeMessageContentType", b3);
                    e.r();
                } else {
                    if (bdmq.a(b4) <= 0) {
                        ParticipantsTable.BindData c = ((bdrr) this.l.b()).c(str);
                        if (c == null) {
                            csjb e2 = b.e();
                            e2.I("Participant wasn't found in database, skipping Welcome Message");
                            e2.A("botId", str);
                            e2.A("conversationId", b4);
                            e2.r();
                            elflVar = l();
                        } else {
                            int i = engw.d;
                            List list = enou.a;
                            if (queryParameter != null && !queryParameter.isEmpty()) {
                                list = new ConversationSuggestionsJsonParser().parse(new String(Base64.decode(queryParameter, 0), StandardCharsets.UTF_8));
                                csjb c2 = b.c();
                                c2.I("Adding suggestions");
                                c2.y("number", list.size());
                                c2.r();
                            }
                            List list2 = list;
                            if ("text/plain".equals(b3)) {
                                m(str, c.S(), b4, b2, false, list2);
                                elflVar = k();
                            } else if (((Boolean) a.e()).booleanValue()) {
                                String str2 = new String(Base64.decode(b2, 0), StandardCharsets.UTF_8);
                                if (new RichCardParser(str2, false).parse() == null) {
                                    csjb e3 = b.e();
                                    e3.I("Unable to parse JSON for Welcome Message:");
                                    e3.M("richCard", str2);
                                    e3.M("content", b2);
                                    e3.r();
                                    elflVar = l();
                                } else {
                                    m(str, c.S(), b4, str2, true, list2);
                                    elflVar = k();
                                }
                            } else {
                                b.p("Rich cards are not enabled for Welcome Message");
                                elflVar = l();
                            }
                        }
                        f.close();
                        return elflVar;
                    }
                    csjb c3 = b.c();
                    c3.I("There are messages in conversation, not inserting Welcome Message");
                    c3.A("conversationId", b4);
                    c3.r();
                }
                elflVar = l();
                f.close();
                return elflVar;
            }
            b.p("There is no Welcome Message data in intent URI.");
            elflVar = l();
            f.close();
            return elflVar;
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
