package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdpt {
    private static final cskc d = cskc.g("BugleDataModel", "MessagePartDatabaseOperations");
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    private final ffbr e;
    private final ffbr f;

    public bdpt(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.e = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.f = ffbrVar4;
        this.c = ffbrVar5;
    }

    public final MessagePartCoreData a(String str) {
        ekzz f = eleg.f("MessagePartDatabaseOperations#readMessagePartData partId");
        try {
            Function function = new Function() { // from class: bdpo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bcwz) bdpt.this.a.b()).e((PartsTable.BindData) obj);
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            };
            PartsTable.BindData a = PartsTable.a(str);
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) (a != null ? function.apply(a) : null);
            f.close();
            return messagePartCoreData;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(MessageCoreData messageCoreData, List list, boolean z) {
        ekzz f = eleg.f("MessagePartDatabaseOperationsImpl#addMessageParts");
        try {
            ContentResolver contentResolver = ((Context) this.e.b()).getContentResolver();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                Uri t = messagePartCoreData.t();
                if (!z || !messagePartCoreData.aZ() || t == null || csuu.t(t)) {
                    messageCoreData.aL(messagePartCoreData);
                } else {
                    try {
                        ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(t, "r");
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            messageCoreData.aL(messagePartCoreData);
                        }
                    } catch (IOException unused) {
                    } catch (SecurityException unused2) {
                        csjb a = d.a();
                        a.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, t);
                        a.r();
                    }
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(final MessageCoreData messageCoreData, boolean z) {
        ekzz f = eleg.f("MessagePartDatabaseOperationsImpl#readMessagePartData message");
        try {
            bwdf c = PartsTable.c();
            c.z("readMessagePartData");
            c.h(new Function() { // from class: bdpe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    bwdmVar.n(MessageCoreData.this.B());
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            Stream map = Collection.EL.stream(c.b().y()).map(new Function() { // from class: bdpf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bcwz) bdpt.this.a.b()).e((PartsTable.BindData) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            b(messageCoreData, (List) map.collect(endq.a), z);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(final MessagePartCoreData messagePartCoreData, String str) {
        String P = messagePartCoreData.P();
        if ((emxe.c(str) && emxe.c(P)) || cuxt.h(str, P)) {
            return;
        }
        ekzz f = eleg.f("MessagePartDatabaseOperationsImpl#resetBlobUploadMetadataOnGaiaEmailChange");
        try {
            String[] strArr = PartsTable.a;
            bwdi bwdiVar = new bwdi();
            bwdiVar.ap("resetBlobUploadMetadataOnGaiaEmailChange");
            int intValue = PartsTable.e().intValue();
            int intValue2 = PartsTable.e().intValue();
            if (intValue2 < 59570) {
                dtub.w("blob_gaia_email", intValue2);
            }
            if (intValue >= 59570) {
                dtub.u(bwdiVar.a, "blob_gaia_email", str);
            }
            bwdiVar.e();
            bwdiVar.a.putNull("blob_upload_timestamp");
            bwdiVar.a.putNull("blob_upload_permanent_failure");
            bwdiVar.a.putNull("media_encryption_key");
            bwdiVar.a.putNull("compressed_blob_id");
            bwdiVar.a.putNull("compressed_blob_upload_timestamp");
            bwdiVar.a.putNull("compressed_media_encryption_key");
            bwdiVar.a.putNull("compressed_blob_upload_permanent_failure");
            bwdiVar.am();
            bwdiVar.D(new Function() { // from class: bdpg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    bwdmVar.j(MessagePartCoreData.this.aa());
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final bwdh b = bwdiVar.b();
            engw engwVar = (engw) PartsTable.d().r("updateAndReturnUpdatedRowsAfterUpdate-txn-parts", new emyl() { // from class: bwdg
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emyl
                public final Object get() {
                    bwdf c = PartsTable.c();
                    c.z("updateAndReturnUpdatedRowsAfterUpdate-pre-parts");
                    c.u();
                    c.n(new dtzq("ROWID", new Object[0]), "_rowid");
                    bwdh bwdhVar = bwdh.this;
                    engw engwVar2 = bwdhVar.e;
                    int i = ((enou) engwVar2).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        c.k((bwdj) ((duap) engwVar2.get(i2)));
                    }
                    if (((dtrm) bwdhVar.d).b) {
                        bwdm bwdmVar = new bwdm();
                        bwdmVar.as(bwdhVar.h());
                        c.g(bwdmVar);
                    }
                    engr engrVar = new engr();
                    bwav bwavVar = (bwav) c.b().o();
                    while (bwavVar.moveToNext()) {
                        try {
                            engrVar.h(bwavVar.dd("_rowid"));
                        } catch (Throwable th) {
                            try {
                                bwavVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    bwavVar.close();
                    String str2 = (String) Collection.EL.stream(engrVar.g()).collect(Collectors.joining(","));
                    bwdhVar.e();
                    bwdf c2 = PartsTable.c();
                    c2.z("updateAndReturnUpdatedRowsAfterUpdate-post-parts");
                    bwdm bwdmVar2 = new bwdm();
                    bwdmVar2.as(new dtzq("ROWID IN ($R)", new Object[]{str2}));
                    c2.g(bwdmVar2);
                    return ((bwav) c2.b().o()).cW();
                }
            });
            if (engwVar.size() == 1) {
                messagePartCoreData.aO((PartsTable.BindData) engwVar.get(0));
            } else {
                d.r("Unexpected bindData size returned in resetBlobUploadMetadataOnGaiaEmailChange");
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(final MessageCoreData messageCoreData, final MessagePartCoreData messagePartCoreData, Uri uri, final Uri uri2) {
        boolean z = true;
        if (!messagePartCoreData.B().c() && !messageCoreData.B().equals(messagePartCoreData.B())) {
            z = false;
        }
        emxf.a(z);
        if (((Boolean) ((dtuu) this.c.b()).c("MessagePartDatabaseOperations#updatePartContentUriAndClearCache", new emyl() { // from class: bdpr
            @Override // defpackage.emyl
            public final Object get() {
                final MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                MessageCoreData messageCoreData2 = messageCoreData;
                ConversationIdType z2 = messageCoreData2.z();
                MessageIdType B = messageCoreData2.B();
                String aa = messagePartCoreData2.aa();
                String[] strArr = PartsTable.a;
                bwdi bwdiVar = new bwdi();
                bwdiVar.ap("updatePartContentUriAndRemoveFromScratch");
                Uri uri3 = uri2;
                bwdiVar.z(uri3);
                final bdpt bdptVar = bdpt.this;
                boolean f = bdptVar.f(z2, B, aa, bwdiVar);
                if (f) {
                    messagePartCoreData2.au(uri3);
                }
                ((dtuu) bdptVar.c.b()).g(new dtut() { // from class: bdow
                    @Override // defpackage.dtut
                    public final ekzz a() {
                        return eleg.f("BDOI::onPartInsertedSync::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: bdph
                    @Override // java.lang.Runnable
                    public final void run() {
                        azei azeiVar = (azei) bdpt.this.b.b();
                        final MessagePartCoreData messagePartCoreData3 = messagePartCoreData2;
                        azeiVar.d(new Consumer() { // from class: bdpa
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ((cpwf) obj).c(MessagePartCoreData.this);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                });
                return Boolean.valueOf(f);
            }
        })).booleanValue()) {
            if (messagePartCoreData.N() != eohh.GIF_CHOOSER) {
                cbgi.j((Context) this.e.b(), uri);
            }
        } else {
            csjb e = d.e();
            e.I("Failed to update part content uri");
            e.d(messageCoreData.B());
            e.r();
        }
    }

    public final boolean f(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, bwdi bwdiVar) {
        return g(conversationIdType, messageIdType, str, bwdiVar, true);
    }

    public final boolean g(ConversationIdType conversationIdType, MessageIdType messageIdType, final String str, bwdi bwdiVar, boolean z) {
        boolean z2;
        ekzz f = eleg.f("MessagePartDatabaseOperationsImpl#updatePartRowIfExists");
        try {
            csix.h();
            bwdiVar.am();
            bwdiVar.D(new Function() { // from class: bdpb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    bwdmVar.j(str);
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (bwdiVar.b().e() == 0) {
                z2 = false;
            } else {
                if (z) {
                    if (str != null) {
                        ((dtuu) this.c.b()).g(new dtut() { // from class: bdpc
                            @Override // defpackage.dtut
                            public final ekzz a() {
                                return eleg.f("MPDO::onPartUpdated::runAfterCommit");
                            }
                        }, null, new Runnable() { // from class: bdpd
                            @Override // java.lang.Runnable
                            public final void run() {
                                azei azeiVar = (azei) bdpt.this.b.b();
                                final String str2 = str;
                                azeiVar.d(new Consumer() { // from class: bdps
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj) {
                                        ((cpwf) obj).d(str2);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            }
                        });
                    }
                    cbgf cbgfVar = (cbgf) this.f.b();
                    String[] strArr = PartsTable.a;
                    cbgfVar.l(conversationIdType, messageIdType, "parts");
                }
                z2 = true;
            }
            f.close();
            return z2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, Uri uri) {
        ekzz f = eleg.f("MessagePartDatabaseOperations#updateMessagePartContentUri");
        try {
            efbd.b();
            String[] strArr = PartsTable.a;
            bwdi bwdiVar = new bwdi();
            bwdiVar.ap("updateMessagePartContentUri");
            bwdiVar.z(uri);
            bwdiVar.u(null);
            f(conversationIdType, messageIdType, str, bwdiVar);
            f.close();
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
