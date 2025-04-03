package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cets extends RuntimeException {
    public final UUID a;

    public cets(String str, UUID uuid) {
        super("Could not save WorkManager UUID to queue ".concat(str));
        this.a = uuid;
    }
}
