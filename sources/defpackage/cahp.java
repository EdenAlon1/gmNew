package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cahp implements bdnu {
    public static final cskc a = cskc.g("BugleEtouffee", "EncryptedRetryMessageListener");
    public final ffbr b;
    private final ffbr c;

    public cahp(ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = ffbrVar;
        this.b = ffbrVar2;
    }

    private static void a(final MessageCoreData messageCoreData, Optional optional) {
        optional.ifPresent(new Consumer() { // from class: cahn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                bdhg bdhgVar = (bdhg) obj;
                csjb c = cahp.a.c();
                c.I("Update original RcsMessageId.");
                MessageCoreData messageCoreData2 = MessageCoreData.this;
                c.h(messageCoreData2.E());
                c.A("OriginalRcsMessageId", bdhgVar.f());
                c.r();
                messageCoreData2.bH(bdhgVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.bdnu
    public final void d(MessageCoreData messageCoreData) {
        if (messageCoreData.cB()) {
            final bdhg E = messageCoreData.E();
            E.getClass();
            String[] strArr = bwgw.a;
            bwgl bwglVar = new bwgl();
            bwglVar.f("deleteSavedDecryptResult");
            bwglVar.a(new Function() { // from class: cajh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwgv bwgvVar = (bwgv) obj;
                    bwgvVar.d(bdhg.this);
                    bwgvVar.b(byze.DECRYPTED);
                    return bwgvVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int d = bwglVar.d();
            cskc cskcVar = a;
            csjb a2 = cskcVar.a();
            a2.I("Deleted the saved decrypt result");
            a2.h(messageCoreData.E());
            a2.y("count", d);
            a2.r();
            if (bzwf.f()) {
                Optional a3 = ((cahm) this.c.b()).a(messageCoreData.aa());
                csjb a4 = cskcVar.a();
                a4.I("Received an encrypted message.");
                a4.B("IsRetry", a3.isPresent());
                a4.r();
                a3.ifPresent(new Consumer() { // from class: caho
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        final bdhg bdhgVar = (bdhg) obj;
                        String[] strArr2 = bwgw.a;
                        bwgl bwglVar2 = new bwgl();
                        bwglVar2.f("removePendingFtdMessage");
                        bwglVar2.a(new Function() { // from class: caif
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bwgv bwgvVar = (bwgv) obj2;
                                bwgvVar.d(bdhg.this);
                                bwgvVar.b(byze.FAILED_TO_DECRYPT);
                                return bwgvVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int d2 = bwglVar2.d();
                        csjb c = caig.a.c();
                        c.I("Removed the pending message");
                        c.h(bdhgVar);
                        c.y("count", d2);
                        c.r();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    @Override // defpackage.bdnu
    public final void e(MessageCoreData messageCoreData) {
        if (messageCoreData.cB()) {
            a(messageCoreData, ((cahm) this.c.b()).a(messageCoreData.aa()));
            a(messageCoreData, clbh.a(messageCoreData.aa(), clbg.ETOUFFEE_NAMESPACE, "original-rcs-message-id").map(new cahg()));
        }
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdnu
    public final void k(MessageCoreData messageCoreData) {
    }
}
