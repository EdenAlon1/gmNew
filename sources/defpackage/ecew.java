package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecew implements ecez {
    private final dlpw a;

    public ecew(dlpw dlpwVar) {
        this.a = dlpwVar;
    }

    static eyja c(dlpw dlpwVar, long j) {
        return eykm.d(dlpwVar.f().toEpochMilli() - (dlpwVar.a() - j));
    }

    @Override // defpackage.ecez
    public ListenableFuture<ecep> b() {
        return erqt.i(new ecev(this));
    }
}
