package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecty {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    private final ectg e;
    private final ecti f;
    private final ectq g;

    public ecty(Context context, emxc emxcVar) {
        String packageName = context.getPackageName();
        ectg ectgVar = ectg.a;
        ecti ectiVar = ecti.a;
        ectq ectqVar = ectq.a;
        Boolean bool = false;
        bool.getClass();
        boolean booleanValue = ((Boolean) emxcVar.e(bool)).booleanValue();
        this.c = "ANDROID_MESSAGING_PRIMES";
        this.e = ectgVar;
        this.f = ectiVar;
        this.g = ectqVar;
        this.d = booleanValue;
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
        this.b = "com.google.android.client_error_logging#".concat(String.valueOf(packageName));
    }

    public final ListenableFuture a() {
        final ListenableFuture i = erqt.i(emux.a);
        int i2 = engw.d;
        final ListenableFuture i3 = erqt.i(enou.a);
        final ListenableFuture i4 = erqt.i(emux.a);
        return erqt.b(i, i3, i4).a(new Callable() { // from class: ectx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ectv ectvVar = (ectv) ectw.a.createBuilder();
                ectvVar.copyOnWrite();
                ectw ectwVar = (ectw) ectvVar.instance;
                ectwVar.c |= 1;
                ecty ectyVar = ecty.this;
                ectwVar.d = ectyVar.c;
                ectvVar.a(ectyVar.a);
                ectvVar.a(ectyVar.b);
                ectvVar.copyOnWrite();
                ectw ectwVar2 = (ectw) ectvVar.instance;
                ectwVar2.c |= 2;
                ectwVar2.e = false;
                ectvVar.copyOnWrite();
                ectw ectwVar3 = (ectw) ectvVar.instance;
                ectwVar3.c |= 16;
                ectwVar3.i = ectyVar.d;
                ListenableFuture listenableFuture = i;
                ListenableFuture listenableFuture2 = i3;
                ListenableFuture listenableFuture3 = i4;
                try {
                    emxc emxcVar = (emxc) erqt.q(listenableFuture);
                    if (emxcVar.g()) {
                        String str = (String) emxcVar.c();
                        ectvVar.copyOnWrite();
                        ectw ectwVar4 = (ectw) ectvVar.instance;
                        ectwVar4.c |= 8;
                        ectwVar4.g = str;
                    }
                } catch (Exception e) {
                    ((enrr) ((enrr) ((enrr) ecdj.a.e()).g(e)).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'b', "ClearcutMetricSnapshotBuilder.java")).q("Failed to set Account Name, falling back to Zwieback logging.");
                }
                try {
                    List list = (List) erqt.q(listenableFuture2);
                    ectvVar.copyOnWrite();
                    ectw ectwVar5 = (ectw) ectvVar.instance;
                    eygi eygiVar = ectwVar5.h;
                    if (!eygiVar.c()) {
                        ectwVar5.h = eyfy.mutableCopy(eygiVar);
                    }
                    eydl.addAll(list, ectwVar5.h);
                } catch (Exception e2) {
                    ((enrr) ((enrr) ((enrr) ecdj.a.e()).g(e2)).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'j', "ClearcutMetricSnapshotBuilder.java")).q("Failed to set external Experiment Ids.");
                }
                try {
                    emxc emxcVar2 = (emxc) erqt.q(listenableFuture3);
                    if (emxcVar2.g()) {
                        String str2 = (String) emxcVar2.c();
                        ectvVar.copyOnWrite();
                        ectw ectwVar6 = (ectw) ectvVar.instance;
                        ectwVar6.c |= 4;
                        ectwVar6.f = str2;
                    }
                } catch (Exception e3) {
                    ((enrr) ((enrr) ((enrr) ecdj.a.e()).g(e3)).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 't', "ClearcutMetricSnapshotBuilder.java")).q("Failed to set Zwieback.");
                }
                ectk ectkVar = (ectk) ectl.a.createBuilder();
                ectkVar.e(ectw.b, (ectw) ectvVar.build());
                return (ectl) ectkVar.build();
            }
        }, erpp.a);
    }
}
