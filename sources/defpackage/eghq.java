package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eghq {
    private final egif a;
    private final Map b = new HashMap();

    public eghq(egif egifVar) {
        this.a = egifVar;
    }

    public final egie a(String str) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, this.a.a(3, emxc.j(str), fapt.OBAKE_GOOGLE_PHOTOS_CLUSTER_PHOTO_SUGGESTIONS, fapt.OBAKE_GOOGLE_PHOTOS_PROMOTABLE_CLUSTER_PHOTO_SUGGESTIONS));
        }
        return (egie) this.b.get(str);
    }
}
