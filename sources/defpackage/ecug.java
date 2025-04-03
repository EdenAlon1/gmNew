package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecug implements ecto {
    public final Context a;
    public final ClearcutMetricSnapshotTransmitter b;
    private final emyl c;
    private final boolean d;
    private final ecty e;

    public ecug(final Context context, emxc emxcVar, ecty ectyVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.a = context;
        this.c = emys.a(new emyl() { // from class: ecue
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(fdsy.a.get().b(context));
            }
        });
        this.d = ((Boolean) emxcVar.e(false)).booleanValue();
        this.e = ectyVar;
        this.b = clearcutMetricSnapshotTransmitter;
    }

    @Override // defpackage.ecto
    public final ectn a() {
        return new ectn(9);
    }

    @Override // defpackage.ecto
    public final ListenableFuture b(final fgqx fgqxVar) {
        int i;
        if (this.d) {
            fgpu fgpuVar = fgqxVar.i;
            if (fgpuVar == null) {
                fgpuVar = fgpu.a;
            }
            if ((fgpuVar.b & 1) != 0) {
                return erny.f(this.e.a(), new emwl() { // from class: ecud
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ectk ectkVar = (ectk) ((ectl) obj).toBuilder();
                        ectkVar.copyOnWrite();
                        ectl ectlVar = (ectl) ectkVar.instance;
                        fgqx fgqxVar2 = fgqxVar;
                        fgqxVar2.getClass();
                        ectlVar.c = fgqxVar2;
                        ectlVar.b |= 1;
                        ectl ectlVar2 = (ectl) ectkVar.build();
                        ecug ecugVar = ecug.this;
                        String[] strArr = {ecugVar.b.getClass().getName()};
                        Intent intent = new Intent();
                        Context context = ecugVar.a;
                        intent.setComponent(new ComponentName(context, (Class<?>) LifeboatReceiver.class));
                        intent.setPackage(context.getPackageName());
                        intent.putExtra("Transmitters", strArr);
                        intent.putExtra("MetricSnapshot", ectlVar2.toByteArray());
                        context.sendBroadcast(intent);
                        return null;
                    }
                }, erpp.a);
            }
        }
        if ((fgqxVar.b & 1024) != 0 && ((Boolean) this.c.get()).booleanValue()) {
            fgqw fgqwVar = (fgqw) fgqxVar.toBuilder();
            fgqg fgqgVar = fgqxVar.l;
            if (fgqgVar == null) {
                fgqgVar = fgqg.a;
            }
            eygr<fgqe> eygrVar = fgqgVar.k;
            if (!eygrVar.isEmpty()) {
                fgqn fgqnVar = (fgqn) fgqo.a.createBuilder();
                fgqe fgqeVar = null;
                for (fgqe fgqeVar2 : eygrVar) {
                    if (fgqeVar != null && (i = fgqeVar.e + 1) != fgqeVar2.d) {
                        fgqnVar.b(0);
                        fgqnVar.a(i);
                    }
                    fgqnVar.b(fgqeVar2.c);
                    fgqnVar.a(fgqeVar2.d);
                    fgqeVar = fgqeVar2;
                }
                if (fgqeVar != null && (fgqeVar.b & 4) != 0) {
                    int i2 = fgqeVar.e + 1;
                    fgqnVar.b(0);
                    fgqnVar.a(i2);
                }
                fgqf fgqfVar = (fgqf) fgqgVar.toBuilder();
                fgqfVar.copyOnWrite();
                ((fgqg) fgqfVar.instance).k = fgqg.emptyProtobufList();
                fgqfVar.copyOnWrite();
                fgqg fgqgVar2 = (fgqg) fgqfVar.instance;
                fgqo fgqoVar = (fgqo) fgqnVar.build();
                fgqoVar.getClass();
                fgqgVar2.j = fgqoVar;
                fgqgVar2.b |= 128;
                fgqgVar = (fgqg) fgqfVar.build();
            }
            fgqwVar.copyOnWrite();
            fgqx fgqxVar2 = (fgqx) fgqwVar.instance;
            fgqgVar.getClass();
            fgqxVar2.l = fgqgVar;
            fgqxVar2.b |= 1024;
            fgqxVar = (fgqx) fgqwVar.build();
        }
        ListenableFuture g = erny.g(this.e.a(), new eroh() { // from class: ecuc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ectk ectkVar = (ectk) ((ectl) obj).toBuilder();
                ectkVar.copyOnWrite();
                ectl ectlVar = (ectl) ectkVar.instance;
                fgqx fgqxVar3 = fgqxVar;
                fgqxVar3.getClass();
                ectlVar.c = fgqxVar3;
                ectlVar.b |= 1;
                ectl ectlVar2 = (ectl) ectkVar.build();
                ecug ecugVar = ecug.this;
                return ecugVar.b.a(ecugVar.a, ectlVar2);
            }
        }, erpp.a);
        if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
            erqt.r(g, new ecuf(), erpp.a);
        }
        return g;
    }
}
