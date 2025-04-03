package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djne {
    public final djnf a;

    public djne(djnf djnfVar) {
        this.a = djnfVar;
    }

    public final synchronized String a() {
        String uuid;
        uuid = UUID.randomUUID().toString();
        this.a.d.e(uuid);
        return uuid;
    }
}
