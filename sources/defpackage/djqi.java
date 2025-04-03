package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djqi implements eenp {
    private final djqf a;

    public djqi(djqf djqfVar) {
        this.a = djqfVar;
    }

    @Override // defpackage.eenp
    public final void a(String str, Throwable th) {
        Object[] objArr = {th.getMessage()};
        djqf djqfVar = this.a;
        dkty.h(djqfVar.m, "Transport error while receiving a message: %s", objArr);
        Bundle bundle = new Bundle();
        bundle.putString("transport_id", str);
        bundle.putSerializable("transport_error_cause", th);
        djqfVar.s(5, bundle);
    }
}
