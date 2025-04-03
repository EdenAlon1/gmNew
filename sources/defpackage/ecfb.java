package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecfb implements ecez {
    final ffbr a;
    final ffbr b;
    final ffbr c;
    final ffbr d;

    public ecfb(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    @Override // defpackage.ecez
    public final ListenableFuture<ecep> b() {
        return erqt.i(new ecfa(this));
    }
}
