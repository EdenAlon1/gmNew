package defpackage;

import android.content.Context;
import com.google.android.libraries.geller.portable.Geller;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dufb {
    public final Geller a;
    public final String b;
    public emwl c;
    public final ExecutorService d;
    public final ExecutorService e;
    public final ExecutorService f;
    public final Set g;
    public emwl h = new emwl() { // from class: duey
        @Override // defpackage.emwl
        public final Object apply(Object obj) {
            return new duby();
        }
    };
    public eyev i = eyki.f(60);
    public final Boolean j = true;
    public String k = "geller-pa.googleapis.com";
    public Map l = enoz.a;
    public Context m;
    public emxc n;
    public emxc o;
    public emxc p;
    public final dybe q;

    public dufb(Geller geller, String str, dybe dybeVar, Set set, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        int i = engw.d;
        if (enou.a == null) {
            throw new NullPointerException("Null gellerRetryableErrorCodes");
        }
        eyeu eyeuVar = (eyeu) eyev.a.createBuilder();
        eyeuVar.copyOnWrite();
        ((eyev) eyeuVar.instance).b = 300L;
        if (((eyev) eyeuVar.build()) == null) {
            throw new NullPointerException("Null gellerSyncRetryInitialDelay");
        }
        this.m = null;
        emux emuxVar = emux.a;
        this.n = emuxVar;
        this.o = emuxVar;
        this.p = emuxVar;
        this.a = geller;
        this.b = str;
        this.q = dybeVar;
        this.g = set;
        this.d = executorService;
        this.e = executorService2;
        this.f = executorService3;
    }
}
