package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgp {
    private final atcj a;

    public xgp(atcj atcjVar) {
        this.a = atcjVar;
    }

    public final xhi a() {
        if (!this.a.a()) {
            return new xhi("todo");
        }
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return new xhi(uuid);
    }
}
