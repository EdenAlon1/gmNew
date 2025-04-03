package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfpz extends dfqa {
    private final Callable e;

    public dfpz(Callable callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // defpackage.dfqa
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
