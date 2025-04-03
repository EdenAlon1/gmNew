package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdb {
    public final Context a;
    final BroadcastReceiver b;
    public fdxk c;

    public dzdb(Context context) {
        this.c = null;
        this.a = context;
        dzda dzdaVar = new dzda(this);
        this.b = dzdaVar;
        String b = fdqf.a.get().b();
        int a = (int) fdqf.a.get().a();
        dyhr.e("StubFactory", a.z(a, b, "tachyonHostName = ", " and tachyonPortNumber = "));
        fexv fexvVar = new fexv(b, a);
        dzcn.a(fexvVar);
        dyhr.a("OkHttpChannelBuilder", "Using API key for authentication.");
        fexvVar.i(new dyje(context));
        this.c = fexvVar.a();
        context.registerReceiver(dzdaVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final ListenableFuture a() {
        return erqt.i(new dzcj((fbgv) fbgv.h(new fbgu(), this.c)));
    }

    public final ListenableFuture b() {
        return erqt.i(new dzcj((fbkf) fbkf.h(new fbke(), this.c)));
    }

    public final ListenableFuture c() {
        return erqt.i(new dzcj((fbob) fbob.h(new fboa(), this.c)));
    }

    public final ListenableFuture d() {
        return erqt.i(new dzcj(fbqb.a(this.c)));
    }
}
