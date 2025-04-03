package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfsu implements dfsb {
    final /* synthetic */ dftd a;

    public dfsu(dftd dftdVar) {
        this.a = dftdVar;
    }

    @Override // defpackage.dfsb
    public final void a(boolean z) {
        Handler handler = this.a.o;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
