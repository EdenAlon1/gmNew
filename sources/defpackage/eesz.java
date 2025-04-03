package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesz implements eerx {
    private final eesu a;

    public eesz(eesu eesuVar) {
        this.a = eesuVar;
    }

    @Override // defpackage.eerx
    public final void a(String str, boolean z) {
        ListenableFuture listenableFuture;
        eesu eesuVar = this.a;
        if (!z) {
            if (eesuVar.f.contains(str)) {
                return;
            }
            eesuVar.m(str);
        } else {
            if (eesuVar.h.containsKey(str)) {
                listenableFuture = (ListenableFuture) eesuVar.h.get(str);
            } else {
                ListenableFuture c = eesuVar.a.c(str);
                eesuVar.h.put(str, c);
                listenableFuture = c;
            }
            erqt.r(listenableFuture, new eesn(eesuVar), eerw.a);
        }
    }

    @Override // defpackage.eerx
    public final void b() {
    }
}
