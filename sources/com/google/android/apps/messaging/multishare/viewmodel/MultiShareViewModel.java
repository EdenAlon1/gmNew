package com.google.android.apps.messaging.multishare.viewmodel;

import com.google.android.apps.messaging.multishare.viewmodel.MultiShareViewModel;
import defpackage.ahuy;
import defpackage.ffbr;
import defpackage.lml;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MultiShareViewModel extends lml {
    public final ffbr a;
    public final ffbr b;

    public MultiShareViewModel(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        fA(new AutoCloseable() { // from class: aigs
            @Override // java.lang.AutoCloseable
            public final void close() {
                ((amav) MultiShareViewModel.this.b.b()).g();
            }
        });
        Object b = ffbrVar3.b();
        b.getClass();
        Iterator it = ((Iterable) b).iterator();
        while (it.hasNext()) {
            ((ahuy) it.next()).a();
        }
    }
}
