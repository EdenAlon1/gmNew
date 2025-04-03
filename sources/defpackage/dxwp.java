package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxwp implements dxvh {
    final /* synthetic */ emxc a;
    final /* synthetic */ Context b;

    public dxwp(emxc emxcVar, Context context) {
        this.a = emxcVar;
        this.b = context;
    }

    @Override // defpackage.dxvh
    public final void a(String str, int i) {
        if (i == 1 && this.a.g()) {
            dxbr.d(this.b, (Class) this.a.c(), str);
        }
    }

    @Override // defpackage.dxvh
    public final void b(String str, int i) {
        if (i == 0 && this.a.g()) {
            dxbr.e(this.b, (Class) this.a.c(), str);
        }
    }
}
