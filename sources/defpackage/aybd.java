package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aybd extends ejte {
    public static final entd a = entd.c("BugleContacts");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffsk e;
    private final aycf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aybd(Executor executor, elbx elbxVar, ffsk ffskVar, ffbr ffbrVar, aycf aycfVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        super(elbxVar, "ContactChangeObserver", executor);
        executor.getClass();
        elbxVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        aycfVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.e = ffskVar;
        this.b = ffbrVar;
        this.f = aycfVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    @Override // defpackage.ejte
    public final void a(boolean z, Uri uri) {
        int i = axwg.a;
        if (!axwg.a()) {
            b();
        }
        ((ensz) a.f()).q("Contacts change observer triggered");
        this.f.a.set(true);
        axol.k(this.e, null, new aybc(this, null), 3);
    }

    public final void b() {
        ((ejtr) this.b.b()).e(this);
    }
}
