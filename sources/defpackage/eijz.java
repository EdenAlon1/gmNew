package defpackage;

import android.util.Base64;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijz {
    private static final enru a = enru.c("com/google/android/rcs/client/messaging/serializers/ProtoMessageSerializer");
    private final Set b;

    public eijz(Set set) {
        set.getClass();
        this.b = set;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [eyhs, java.lang.Object] */
    public static final eyhs d(eikv eikvVar, eijp eijpVar) {
        ?? h = ((eyhz) eikvVar.c.invoke()).h(Base64.decode(((eijk) eijpVar).a.I(), 0));
        h.getClass();
        return h;
    }

    public final eijp a(eyhs eyhsVar, ffmo ffmoVar) {
        Object obj;
        eyhsVar.getClass();
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ffkj.e(((eikv) obj).a, ffiu.a(ffmoVar))) {
                break;
            }
        }
        eikv eikvVar = (eikv) obj;
        if (eikvVar == null) {
            throw new IllegalArgumentException(a.i(ffmoVar, "Unknown proto: ", ", please register it."));
        }
        eijj eijjVar = new eijj();
        eijjVar.c(eikvVar.b);
        eijjVar.b(eyee.x(Base64.encode(eyhsVar.toByteArray(), 0)));
        return eijjVar.a();
    }

    public final eikv b(ContentType contentType) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ffkj.e(((eikv) obj).b, contentType)) {
                break;
            }
        }
        eikv eikvVar = (eikv) obj;
        if (eikvVar == null) {
            ((enrr) a.j().h("com/google/android/rcs/client/messaging/serializers/ProtoMessageSerializer", "findProtoConfigByContentType", 56, "ProtoMessageSerializer.kt")).t("Unknown content type: %s, please register it.", contentType);
        }
        return eikvVar;
    }

    public final eikv c(ffmo ffmoVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ffkj.e(((eikv) obj).a, ffiu.a(ffmoVar))) {
                break;
            }
        }
        eikv eikvVar = (eikv) obj;
        if (eikvVar != null) {
            return eikvVar;
        }
        throw new IllegalArgumentException(a.i(ffmoVar, "Unknown proto: ", ", please register it."));
    }
}
