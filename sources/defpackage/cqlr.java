package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqlr implements cpwf {
    public static final /* synthetic */ int a = 0;
    private static final cskc b = cskc.g("Bugle", "CopyFileTelephonyPartsCallback");
    private static final csjp c = new csjp(TimeUnit.SECONDS.toMillis(10));
    private static final cfup d = cfvl.k(cfvl.b, "delete_message_part_batch_size", 50);
    private final cqlw e;
    private final cqme f;
    private final ffbr g;

    public cqlr(cqlw cqlwVar, cqme cqmeVar, ffbr ffbrVar) {
        this.e = cqlwVar;
        this.f = cqmeVar;
        this.g = ffbrVar;
    }

    private final void e(bwav bwavVar) {
        if (bwavVar.getCount() > ((Integer) d.e()).intValue()) {
            csjb c2 = b.c();
            c2.I("Requested to delete more than 50 messages. Dividing work into batches of 50 messages.");
            c2.y("Total message count", bwavVar.getCount());
            c2.r();
        }
        cptg cptgVar = (cptg) cptj.a.createBuilder();
        while (bwavVar.moveToNext()) {
            String r = bwavVar.r();
            if (r != null) {
                cpth cpthVar = (cpth) cpti.a.createBuilder();
                String q = bwavVar.q();
                cpthVar.copyOnWrite();
                cpti cptiVar = (cpti) cpthVar.instance;
                q.getClass();
                cptiVar.b = q;
                cpthVar.copyOnWrite();
                ((cpti) cpthVar.instance).c = r;
                cptgVar.copyOnWrite();
                cptj cptjVar = (cptj) cptgVar.instance;
                cpti cptiVar2 = (cpti) cpthVar.build();
                cptiVar2.getClass();
                eygr eygrVar = cptjVar.b;
                if (!eygrVar.c()) {
                    cptjVar.b = eyfy.mutableCopy(eygrVar);
                }
                cptjVar.b.add(cptiVar2);
                if (((cptj) cptgVar.instance).b.size() == 100 || bwavVar.isLast()) {
                    ((cevh) this.e.a.b()).a(ceyr.g("delete_parts_work_item", (cptj) cptgVar.build()));
                    cptgVar.clear();
                }
            }
        }
    }

    @Override // defpackage.cpwf
    public final void a(final ConversationIdType conversationIdType) {
        csjb c2 = b.c();
        c2.I("onDeletingConversation");
        c2.A("conversationId", conversationIdType);
        c2.r();
        bwdf c3 = PartsTable.c();
        c3.z("onDeletingConversation");
        c3.h(new Function() { // from class: cqll
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                int i = cqlr.a;
                final ConversationIdType conversationIdType2 = ConversationIdType.this;
                bwdmVar.i(conversationIdType2);
                buxo d2 = MessagesTable.d();
                d2.f(new Function() { // from class: cqln
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i2 = cqlr.a;
                        return ((buum) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d2.h(new Function() { // from class: cqlo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buxz buxzVar = (buxz) obj2;
                        int i2 = cqlr.a;
                        buxzVar.m(ConversationIdType.this);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bwdmVar.o(d2.b());
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c3.e(new Function() { // from class: cqlm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwat bwatVar = (bwat) obj;
                int i = cqlr.a;
                return new bwau[]{bwatVar.a, bwatVar.S};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwav bwavVar = (bwav) c3.b().o();
        try {
            e(bwavVar);
            bwavVar.close();
        } catch (Throwable th) {
            try {
                bwavVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cpwf
    public final void b(final ConversationIdType conversationIdType, final List list) {
        csjb c2 = b.c();
        c2.I("App is deleting messages. Deleting related files from disk.");
        c2.A("conversationId", conversationIdType);
        c2.r();
        bwdf c3 = PartsTable.c();
        c3.z("+onDeletingMessages");
        c3.h(new Function() { // from class: cqlp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                int i = cqlr.a;
                bwdmVar.i(ConversationIdType.this);
                bwdmVar.p(list);
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c3.e(new Function() { // from class: cqlq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwat bwatVar = (bwat) obj;
                int i = cqlr.a;
                return new bwau[]{bwatVar.a, bwatVar.S};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwav bwavVar = (bwav) c3.b().o();
        try {
            e(bwavVar);
            bwavVar.close();
        } catch (Throwable th) {
            try {
                bwavVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cpwf
    public final void c(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.aa() == null) {
            csjb e = b.e();
            e.I("Invoked telephony callback. Part does not have id yet");
            e.A("part.getMessageId", messagePartCoreData.B());
            e.K(c, "missing_id");
            e.r();
            return;
        }
        Uri t = messagePartCoreData.t();
        if (t == null) {
            csjb c2 = b.c();
            c2.I("Inserted part has no URI, not copying to local cache");
            c2.A("partId", messagePartCoreData.aa());
            c2.K(c, "content_uri_null");
            c2.r();
            return;
        }
        if (!"mms".equals(t.getAuthority())) {
            csjb c3 = b.c();
            c3.I("Ignoring on part inserted. It was not inserting to telephony.");
            c3.A("messagePart.getContentUri().getAuthority()", t.getAuthority());
            c3.A("part.getMessageId", messagePartCoreData.B());
            c3.r();
            return;
        }
        csjb c4 = b.c();
        c4.I("Invoked telephony callback. Scheduling update.");
        c4.A("part.getContentUri().getAuthority()", t.getAuthority());
        c4.A("part.getMessageId", messagePartCoreData.B());
        c4.A("part.getPartId()", messagePartCoreData.aa());
        c4.K(c, "scheduling");
        c4.r();
        cqme cqmeVar = this.f;
        String aa = messagePartCoreData.aa();
        cptc cptcVar = (cptc) cptf.a.createBuilder();
        cptd cptdVar = (cptd) cpte.a.createBuilder();
        cptdVar.copyOnWrite();
        cpte cpteVar = (cpte) cptdVar.instance;
        aa.getClass();
        cpteVar.b = aa;
        String uri = t.toString();
        cptdVar.copyOnWrite();
        cpte cpteVar2 = (cpte) cptdVar.instance;
        uri.getClass();
        cpteVar2.c = uri;
        cptcVar.copyOnWrite();
        cptf cptfVar = (cptf) cptcVar.instance;
        cpte cpteVar3 = (cpte) cptdVar.build();
        cpteVar3.getClass();
        eygr eygrVar = cptfVar.b;
        if (!eygrVar.c()) {
            cptfVar.b = eyfy.mutableCopy(eygrVar);
        }
        cevh cevhVar = cqmeVar.a;
        cptfVar.b.add(cpteVar3);
        cevhVar.a(ceyr.g("CopyFileTelephonyPartHandler", cptcVar.build()));
    }

    @Override // defpackage.cpwf
    public final void d(String str) {
        MessagePartCoreData a2 = ((bdpt) this.g.b()).a(str);
        if (a2 != null) {
            c(a2);
            return;
        }
        csjb b2 = b.b();
        b2.I("Unable to store attachment copy for non-existent part");
        b2.A("partId", str);
        b2.r();
    }
}
