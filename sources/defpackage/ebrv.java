package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebrv {
    public abstract ebry a();

    public abstract void b(ebrx ebrxVar);

    public final void c(final ebrw ebrwVar) {
        b(new ebrx() { // from class: ebru
            @Override // defpackage.ebrx
            public final ListenableFuture a(emxc emxcVar) {
                ebrw.this.a(emxcVar);
                return erqt.i(true);
            }
        });
    }
}
