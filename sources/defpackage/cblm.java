package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cblm implements cblo {
    private static final cskc f = cskc.g("BugleDataModel", "RichCardMessagePartMediaDownloadHandler");
    public final dtuu a;
    public final ConversationIdType b;
    public final MessageIdType c;
    public final String d;
    public final ffbr e;
    private final errl g;
    private final cblf h;
    private final askf i;

    public cblm(errl errlVar, ffbr ffbrVar, dtuu dtuuVar, cblf cblfVar, askf askfVar, ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        this.g = errlVar;
        this.e = ffbrVar;
        this.a = dtuuVar;
        this.h = cblfVar;
        this.i = askfVar;
        this.b = conversationIdType;
        this.c = messageIdType;
        this.d = str;
    }

    @Override // defpackage.cblo
    public final void a(String str) {
        csjb c = f.c();
        c.I("Media download cancelled");
        c.A("requestedUri", str);
        c.r();
    }

    @Override // defpackage.cblo
    public final void b(String str) {
        csjb b = f.b();
        b.I("Media download failed");
        b.A("requestedUri", str);
        b.r();
        if (this.i.a()) {
            axnw.h(elfo.g(new Callable() { // from class: cblj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final cblm cblmVar = cblm.this;
                    return (Boolean) cblmVar.a.c("RichCardMessagePartMediaDownloadHandler#onFailure", new emyl() { // from class: cbll
                        @Override // defpackage.emyl
                        public final Object get() {
                            String[] strArr = PartsTable.a;
                            bwdi bwdiVar = new bwdi();
                            bwdiVar.x(byzh.PERMANENT_ERROR);
                            return Boolean.valueOf(bwdiVar.c(cblm.this.d));
                        }
                    });
                }
            }, this.g));
        }
    }

    @Override // defpackage.cblo
    public final void c(String str, long j, long j2) {
        CoreBuglePartialMessageId coreBuglePartialMessageId = new CoreBuglePartialMessageId(this.c, Long.parseLong(this.d));
        cqou cqouVar = new cqou();
        cqouVar.b(j);
        cqouVar.c(j2);
        cqpu d = cqouVar.d();
        cblf cblfVar = this.h;
        axol.k(cblfVar.b, null, new cble(cblfVar, coreBuglePartialMessageId, d, null), 3);
    }

    @Override // defpackage.cblo
    public final void d(String str) {
        csjb c = f.c();
        c.I("Media download started");
        c.A("requestedUri", str);
        c.y("handlerHashCode", hashCode());
        c.r();
        if (this.i.a()) {
            axnw.h(elfo.g(new Callable() { // from class: cblh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final cblm cblmVar = cblm.this;
                    return (Boolean) cblmVar.a.c("RichCardMessagePartMediaDownloadHandler#onStart", new emyl() { // from class: cblk
                        @Override // defpackage.emyl
                        public final Object get() {
                            String[] strArr = PartsTable.a;
                            bwdi bwdiVar = new bwdi();
                            bwdiVar.x(byzh.NONE);
                            return Boolean.valueOf(bwdiVar.c(cblm.this.d));
                        }
                    });
                }
            }, this.g));
        }
    }

    @Override // defpackage.cblo
    public final void e(String str, final Uri uri) {
        csjb c = f.c();
        c.I("Updating media part with local");
        c.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        c.I("and preview");
        c.r();
        axnw.h(elfo.f(new Runnable() { // from class: cblg
            @Override // java.lang.Runnable
            public final void run() {
                final cblm cblmVar = cblm.this;
                final Uri uri2 = uri;
                cblmVar.a.d("UpdateMessagePartUri", new Runnable() { // from class: cbli
                    @Override // java.lang.Runnable
                    public final void run() {
                        cblm cblmVar2 = cblm.this;
                        ((bdpt) cblmVar2.e.b()).h(cblmVar2.b, cblmVar2.c, cblmVar2.d, uri2);
                    }
                });
            }
        }, this.g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cblm)) {
            return false;
        }
        cblm cblmVar = (cblm) obj;
        return Objects.equals(this.b, cblmVar.b) && Objects.equals(this.c, cblmVar.c) && Objects.equals(this.d, cblmVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d);
    }
}
