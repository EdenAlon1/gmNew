package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcvo implements ejuh {
    final /* synthetic */ boolean a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ dcvp e;

    public dcvo(dcvp dcvpVar, boolean z, ConversationIdType conversationIdType, String str, boolean z2) {
        this.a = z;
        this.b = conversationIdType;
        this.c = str;
        this.d = z2;
        this.e = dcvpVar;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        ekzz f = eleg.f("MessageDataSource#SearchMediaViewerDataSourceFactoryImpl#LoadData");
        try {
            final boolean z = this.a;
            final ConversationIdType conversationIdType = this.b;
            final String str = this.c;
            final boolean z2 = this.d;
            try {
                erph e = new erph(elfo.g(new Callable() { // from class: dcvm
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ConversationId a;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        String str2 = str;
                        dcvo dcvoVar = dcvo.this;
                        boolean z3 = z;
                        boolean z4 = z2;
                        blqw s = z3 ? dcvoVar.e.b.s(conversationIdType2, str2, z4) : dcvoVar.e.b.q(conversationIdType2, str2, z4);
                        try {
                            ArrayList arrayList = new ArrayList();
                            enqv it = s.cY(new Supplier() { // from class: dcvl
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new MediaSearchResult();
                                }
                            }).iterator();
                            while (it.hasNext()) {
                                MediaSearchResult mediaSearchResult = (MediaSearchResult) it.next();
                                String b = dcvoVar.e.c.b(mediaSearchResult.g());
                                Uri h = mediaSearchResult.h();
                                String k = mediaSearchResult.k();
                                if (h == null) {
                                    throw new IllegalStateException("URI from result is null, cannot display media.");
                                }
                                if (k == null) {
                                    throw new IllegalStateException("Content type from result is null, cannot display media.");
                                }
                                dcuw dcuwVar = new dcuw();
                                dcuwVar.c(h);
                                dcuwVar.b(k);
                                final dcvp dcvpVar = dcvoVar.e;
                                dcuwVar.b = dcvpVar.c.e(mediaSearchResult.f(), mediaSearchResult.l(), Optional.ofNullable(mediaSearchResult.n()).map(new Function() { // from class: dcvk
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return ((aolr) dcvp.this.d.b()).n((String) obj);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }));
                                dcuwVar.c = b;
                                dcuwVar.d = mediaSearchResult.i();
                                dcvp dcvpVar2 = dcvoVar.e;
                                ConversationIdType i = mediaSearchResult.i();
                                CoreBugleMessageId coreBugleMessageId = null;
                                if (i == null) {
                                    a = null;
                                } else {
                                    ames amesVar = dcvpVar2.e;
                                    String n = mediaSearchResult.n();
                                    mediaSearchResult.az(21, "has_ea2p_bot_recipient");
                                    a = amesVar.a(i, n, mediaSearchResult.e);
                                }
                                dcuwVar.e = a;
                                dcuwVar.f = mediaSearchResult.j();
                                MessageIdType j = mediaSearchResult.j();
                                if (j != null) {
                                    try {
                                        coreBugleMessageId = new CoreBugleMessageId(j, Long.parseLong(mediaSearchResult.m()));
                                    } catch (NumberFormatException unused) {
                                        coreBugleMessageId = new CoreBugleMessageId(j, -1L);
                                    }
                                }
                                dcuwVar.g = coreBugleMessageId;
                                arrayList.add(dcuwVar.a());
                            }
                            s.close();
                            return arrayList;
                        } catch (Throwable th) {
                            try {
                                s.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, this.e.a)).e(eldl.g(new erow() { // from class: dcvn
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj) {
                        return ejug.a((List) obj, dcvo.this.e.f.f());
                    }
                }), erpp.a);
                f.a(e);
                f.close();
                return e;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    f.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        return elfo.e(null);
    }

    @Override // defpackage.ejuh
    public final /* bridge */ /* synthetic */ Object c() {
        return String.format("search_media_viewer_content_key,convId=%s,participantId=%s", this.b, this.c);
    }
}
