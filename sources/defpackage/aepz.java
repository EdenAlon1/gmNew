package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.photos.client.MediaUploadStates;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aepz implements ejlr<Void, MediaUploadStates> {
    public static final ffbz a = ffca.a(new ffix() { // from class: aepx
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = aepz.a;
            return entd.c("BugleHqms");
        }
    });
    public bcvr b;
    private final ffbr c;

    public aepz(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.c = ffbrVar;
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void c(Object obj, Object obj2) {
        MediaUploadStates mediaUploadStates = (MediaUploadStates) obj2;
        mediaUploadStates.getClass();
        ensk n = aepy.a().n();
        Collection values = mediaUploadStates.a.values();
        ArrayList arrayList = new ArrayList(ffdx.n(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((drso) it.next()).getClass();
            int i = fflc.a;
            arrayList.add(new ffkb(cls).c());
        }
        n.t("Requesting media upload states successful with states: %s", arrayList);
        bcvr bcvrVar = this.b;
        if (bcvrVar != null) {
            Map map = mediaUploadStates.a;
            boolean z = false;
            for (MessagePartCoreData messagePartCoreData : bcvrVar.C()) {
                Uri t = messagePartCoreData.t();
                t.getClass();
                String uri = t.toString();
                if (map.containsKey(uri)) {
                    messagePartCoreData.aC((drso) map.get(uri));
                    z = true;
                }
            }
            if (z) {
                bcvrVar.J(1);
            }
        }
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        ((ensz) ((ensz) aepy.a().i()).g(th)).q("Requesting media upload states failed");
        axnw.h(((cfyt) this.c.b()).b(th));
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
