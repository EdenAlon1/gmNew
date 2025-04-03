package defpackage;

import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebol implements View.OnClickListener {
    public boolean a;
    final /* synthetic */ ebon b;

    public ebol(ebon ebonVar) {
        this.b = ebonVar;
    }

    public final void a() {
        Runnable runnable = this.b.e;
        if (runnable != null) {
            runnable.run();
        }
        efbd.e(new Runnable() { // from class: eboj
            @Override // java.lang.Runnable
            public final void run() {
                ebol.this.a = false;
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a) {
            return;
        }
        this.a = true;
        Runnable runnable = this.b.d;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.b.c;
        if (runnable2 != null) {
            runnable2.run();
        }
        ebnt ebntVar = (ebnt) this.b.b.e(new ebnt() { // from class: eboi
            @Override // defpackage.ebnt
            public final ListenableFuture a() {
                return erqt.i(true);
            }
        });
        view.getContext();
        erqt.r(ebntVar.a(), new ebok(this, view), koa.e(view.getContext()));
    }
}
