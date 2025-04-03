package defpackage;

import android.content.ContentUris;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckdh implements ckdi {
    final /* synthetic */ ckdm a;

    public ckdh(ckdm ckdmVar) {
        this.a = ckdmVar;
    }

    @Override // defpackage.ckdi
    public final Uri a(Uri uri, Uri uri2, MessagePartCoreData messagePartCoreData, String str, final UUID uuid) {
        final long parseId = ContentUris.parseId(uri);
        lt ltVar = new lt();
        ltVar.e = uri2;
        String V = messagePartCoreData.V();
        if (V != null) {
            ltVar.h(V.getBytes());
        }
        if (str != null) {
            ltVar.k(str.getBytes());
        }
        ltVar.f("<file_transfer_original>".getBytes());
        final Uri b = ((cgtc) this.a.g.b()).b(ltVar, parseId, null);
        if (this.a.r.a()) {
            ((azei) this.a.s.b()).d(new Consumer() { // from class: ckdd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((cpdd) obj).f(b, uuid);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            ckdm ckdmVar = this.a;
            ckdmVar.m.ifPresent(new Consumer() { // from class: ckde
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((cpdd) ((ffbr) obj).b()).f(b, uuid);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        this.a.r(uri, 100);
        axnw.h(elfo.g(new Callable() { // from class: ckdf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(((cgtc) ckdh.this.a.g.b()).g(parseId));
            }
        }, this.a.e).e(Exception.class, new emwl() { // from class: ckdg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk j = ckdm.a.j();
                j.Y(ente.a, "BugleTelephony");
                ((enrr) ((enrr) ((enrr) j).g((Exception) obj)).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl$OriginalTelephonyDbHelper", "saveAttachment", 650, "RcsTelephonyAccessImpl.java")).s("Failed to delete existing attachments in Telephony. Telephony Message: %s", parseId);
                return true;
            }
        }, this.a.q));
        return b;
    }
}
