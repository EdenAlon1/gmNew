package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbx implements eerx {
    final /* synthetic */ bzby a;

    public bzbx(bzby bzbyVar) {
        this.a = bzbyVar;
    }

    @Override // defpackage.eerx
    public final void a(String str, boolean z) {
        synchronized (this.a) {
            bzby bzbyVar = this.a;
            fcek fcekVar = bzbyVar.k;
            String str2 = bzbyVar.l;
            if (fcekVar != null && !TextUtils.isEmpty(str2)) {
                erny.g(erqc.o(this.a.m.a(fcekVar, str2, str, z).s()), csvx.a, erpp.a);
            }
        }
    }

    @Override // defpackage.eerx
    public final void b() {
    }
}
