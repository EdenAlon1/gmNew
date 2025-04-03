package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eetn implements eeuh {
    public final eetm a;
    public final eeti b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final eety d;
    public Runnable e;
    public String f;
    private final eere g;
    private ListenableFuture h;

    public eetn(eere eereVar, eeti eetiVar, eetm eetmVar, eety eetyVar) {
        this.g = eereVar;
        this.a = eetmVar;
        this.b = eetiVar;
        this.d = eetyVar;
    }

    public final void a() {
        this.c.removeCallbacks(this.e);
        ListenableFuture listenableFuture = this.h;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
    }

    public final void b(eumg eumgVar) {
        ListenableFuture listenableFuture = this.h;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
        if (TextUtils.isEmpty(this.f)) {
            this.b.m(Collections.EMPTY_LIST);
            this.a.a();
            return;
        }
        eeuc eeucVar = (eeuc) this.a;
        eeucVar.f.setVisibility(0);
        eeucVar.g.setVisibility(0);
        eeucVar.h.setVisibility(8);
        eeucVar.i.setVisibility(8);
        ListenableFuture f = this.g.f(this.f);
        this.h = f;
        erqt.r(f, new eetl(this), eerw.a);
        eeui a = this.g.a();
        eumi eumiVar = (eumi) eumj.a.createBuilder();
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).b = eumh.a(21);
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).e = eumgVar.a();
        ((eeuj) a).g((eumj) eumiVar.build());
    }
}
