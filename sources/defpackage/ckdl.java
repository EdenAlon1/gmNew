package defpackage;

import android.content.ContentUris;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckdl implements ckdi {
    final /* synthetic */ ckdm a;

    public ckdl(ckdm ckdmVar) {
        this.a = ckdmVar;
    }

    @Override // defpackage.ckdi
    public final Uri a(Uri uri, Uri uri2, final MessagePartCoreData messagePartCoreData, String str, final UUID uuid) {
        ckdm ckdmVar = this.a;
        long parseId = ContentUris.parseId(uri);
        if (!ckdmVar.t(parseId)) {
            return null;
        }
        lt ltVar = new lt();
        ltVar.e = uri2;
        String V = messagePartCoreData.V();
        if (V != null) {
            ltVar.h(V.getBytes());
        }
        if (str != null) {
            ltVar.k(str.getBytes());
        }
        ltVar.f("<file_transfer_thumbnail>".getBytes());
        final Uri b = ((cgtc) this.a.g.b()).b(ltVar, parseId, null);
        if (this.a.r.a()) {
            ((azei) this.a.s.b()).d(new Consumer() { // from class: ckdj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((cpdd) obj).j(b, ckdl.this.a.v(messagePartCoreData), uuid);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return b;
        }
        ckdm ckdmVar2 = this.a;
        ckdmVar2.m.ifPresent(new Consumer() { // from class: ckdk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cpdd) ((ffbr) obj).b()).j(b, ckdl.this.a.v(messagePartCoreData), uuid);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return b;
    }
}
