package defpackage;

import android.app.ActivityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrf {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public csrf(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    public final void a() {
        ((ActivityManager) this.c.b()).clearApplicationUserData();
        ctzh.a();
    }

    public final void b(String str) {
        ((akzt) this.b.b()).c(str);
        ((akzt) this.b.b()).a();
        a();
    }
}
