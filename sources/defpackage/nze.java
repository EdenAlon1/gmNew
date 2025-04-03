package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nze extends ffkk implements ffji {
    final /* synthetic */ Bundle a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nze(Bundle bundle) {
        super(1);
        this.a = bundle;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((String) obj).getClass();
        return Boolean.valueOf(!this.a.containsKey(r2));
    }
}
