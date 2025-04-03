package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;
import android.provider.Telephony;
import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawp extends ffhv implements ffjm {
    long a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ LoadMessagesReceiver d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawp(LoadMessagesReceiver loadMessagesReceiver, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = loadMessagesReceiver;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dawp) c((List) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List list;
        long j;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            j = this.a;
            list = (List) this.c;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            list = (List) this.c;
            long a = ((cqoh) this.d.l().b()).a();
            ffbr ffbrVar = this.d.i;
            if (ffbrVar == null) {
                ffkj.c("contentResolver");
                ffbrVar = null;
            }
            ejtr ejtrVar = (ejtr) ffbrVar.b();
            final Uri uri = Telephony.Sms.Inbox.CONTENT_URI;
            final ContentValues[] contentValuesArr = (ContentValues[]) list.toArray(new ContentValues[0]);
            ListenableFuture c = ejtrVar.c(new ejtp() { // from class: ejtj
                @Override // defpackage.ejtp
                public final Object a(ejno ejnoVar) {
                    final Uri uri2 = uri;
                    final ContentValues[] contentValuesArr2 = contentValuesArr;
                    Integer num = (Integer) ejnoVar.e(uri2, new ejnm() { // from class: ejne
                        @Override // defpackage.ejnm
                        public final Object a(ContentProviderClient contentProviderClient) {
                            return Integer.valueOf(contentProviderClient.bulkInsert(uri2, contentValuesArr2));
                        }
                    });
                    num.intValue();
                    return num;
                }
            });
            this.c = list;
            this.a = a;
            this.b = 1;
            if (fgfz.c(c, this) == ffhhVar) {
                return ffhhVar;
            }
            j = a;
        }
        long a2 = ((cqoh) this.d.l().b()).a();
        ensk h = LoadMessagesReceiver.d.h();
        h.Y(ente.a, "BugleTests");
        ((enrr) h.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver$loadMessagesFromFile$3", "invokeSuspend", 149, "LoadMessagesReceiver.kt")).v("Inserted %d messages in %d ms", list.size(), a2 - j);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dawp dawpVar = new dawp(this.d, ffguVar);
        dawpVar.c = obj;
        return dawpVar;
    }
}
