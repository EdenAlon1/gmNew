package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxze implements erqj {
    final /* synthetic */ ecwj a;

    public dxze(ecwj ecwjVar) {
        this.a = ecwjVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = ((dwpj) this.a.b()).c;
        if (((Boolean) obj).booleanValue()) {
            Log.d("PhFileGroupPop", "Added file groups ".concat(String.valueOf(str)));
        } else {
            Log.e("PhFileGroupPop", "Failed to add file group ".concat(String.valueOf(str)));
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("PhFileGroupPop", "Failed to add file group", th);
    }
}
