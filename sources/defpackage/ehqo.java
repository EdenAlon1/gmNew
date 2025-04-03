package defpackage;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqo implements kud {
    final /* synthetic */ BaseTransientBottomBar a;

    public ehqo(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // defpackage.kud
    public final kxh ey(View view, kxh kxhVar) {
        this.a.m = kxhVar.a();
        this.a.n = kxhVar.b();
        BaseTransientBottomBar baseTransientBottomBar = this.a;
        baseTransientBottomBar.o = kxhVar.c();
        baseTransientBottomBar.k();
        return kxhVar;
    }
}
