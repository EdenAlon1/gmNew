package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mop extends Exception {
    public mop(UUID uuid) {
        super("Media does not support uuid: ".concat(uuid.toString()));
    }
}
