package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvqr {
    public final /* synthetic */ cvqs a;

    public cvqr(cvqs cvqsVar) {
        this.a = cvqsVar;
    }

    public final ea a(eisx eisxVar, int i) {
        eisxVar.getClass();
        ((amav) this.a.a.b()).h(Boolean.valueOf(!((Boolean) cvqt.j.e()).booleanValue()));
        Bundle bundle = new Bundle(1);
        bundle.putInt("contact_picker_source", i - 1);
        cvqu a = cvqu.a(eisxVar);
        a.at(bundle);
        return a;
    }
}
