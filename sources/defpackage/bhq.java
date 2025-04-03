package defpackage;

import android.util.CloseGuard;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhq implements bhr {
    private final CloseGuard a = new CloseGuard();

    @Override // defpackage.bhr
    public final void a() {
        this.a.close();
    }

    @Override // defpackage.bhr
    public final void b(String str) {
        this.a.open(str);
    }

    @Override // defpackage.bhr
    public final void c() {
        this.a.warnIfOpen();
    }
}
