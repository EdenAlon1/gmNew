package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwz implements ljv {
    public static final entd a = entd.c("Bugle");
    public final ffbr b;
    final ArrayList c = new ArrayList();
    public volatile boolean d = true;
    private final errl e;

    public ddwz(errl errlVar, ffbr ffbrVar) {
        this.e = errlVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        this.d = false;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.c.clear();
    }

    public final void g(int i, ViewGroup viewGroup, ddwy ddwyVar) {
        emxf.a(efbd.g());
        final ddwx ddwxVar = new ddwx();
        ddwxVar.b = i;
        ddwxVar.a = viewGroup;
        ddwxVar.f = ddwyVar;
        ddwxVar.d = new ddxa(viewGroup.getContext());
        ddwxVar.e = this.e.submit(new Runnable() { // from class: ddww
            @Override // java.lang.Runnable
            public final void run() {
                final ddwz ddwzVar = ddwz.this;
                final ddwx ddwxVar2 = ddwxVar;
                if (ddwzVar.d) {
                    try {
                        ddwxVar2.c = ddwxVar2.d.inflate(ddwxVar2.b, ddwxVar2.a, false);
                    } catch (RuntimeException e) {
                        ((ensz) ((ensz) ddwz.a.a(Level.WARNING).g(e)).h("com/google/android/apps/messaging/ui/util/AsyncLayoutInflater", "inflateInternal", 84, "AsyncLayoutInflater.java")).q("Failed to inflate resource in the background! Retrying on the UI thread");
                        ((cfyt) ddwzVar.b.b()).b(e);
                    }
                    efbd.e(new Runnable() { // from class: ddwv
                        @Override // java.lang.Runnable
                        public final void run() {
                            ddwz ddwzVar2 = ddwz.this;
                            if (ddwzVar2.d) {
                                ddwx ddwxVar3 = ddwxVar2;
                                if (ddwxVar3.c == null) {
                                    ddwxVar3.c = ddwxVar3.d.inflate(ddwxVar3.b, ddwxVar3.a, false);
                                }
                                ddwxVar3.f.a(ddwxVar3.c);
                                ddwzVar2.c.remove(ddwxVar3.e);
                            }
                        }
                    });
                }
            }
        });
        this.c.add(ddwxVar.e);
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
