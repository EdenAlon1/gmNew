package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecml extends ecmt implements ecgn, ecje {
    private final Context a;
    private final ecgx b;
    private final ecne c;
    private final ecmb d;
    private final ecmk e;
    private final ArrayMap f;
    private final ecjc g;
    private final ffbr h;
    private final ecmv i;

    /* JADX WARN: Type inference failed for: r4v2, types: [fazb, java.lang.Object] */
    public ecml(ecjd ecjdVar, Context context, ecgx ecgxVar, fazb<ecmp> fazbVar, ecmb ecmbVar, ffbr<ecmm> ffbrVar, ffbr<fgpf> ffbrVar2, Executor executor, ecnf ecnfVar, ffbr<Boolean> ffbrVar3, ecmu ecmuVar, ecmv ecmvVar) {
        ArrayMap arrayMap = new ArrayMap();
        this.f = arrayMap;
        emxf.l(true);
        this.g = ecjdVar.a(executor, fazbVar, ffbrVar2);
        this.a = context;
        this.b = ecgxVar;
        this.h = ffbrVar;
        this.d = ecmbVar;
        ecmk ecmkVar = new ecmk(context, arrayMap, ffbrVar3);
        this.e = ecmkVar;
        ?? b = ecnfVar.a.b();
        b.getClass();
        errm errmVar = (errm) ecnfVar.b.b();
        errmVar.getClass();
        this.c = new ecne(b, errmVar, ecmkVar);
        this.i = ecmvVar;
    }

    private final ListenableFuture h(ecmn ecmnVar) {
        ecmm ecmmVar;
        fgqo fgqoVar;
        boolean isEnabled;
        int i;
        if (!this.g.d()) {
            return erre.a;
        }
        synchronized (this.f) {
            ecmmVar = (ecmm) this.f.remove(((ecmc) ecmnVar).a);
            if (this.f.isEmpty()) {
                this.c.j();
            }
        }
        if (ecmmVar == null) {
            ((enrr) ((enrr) ecdj.a.h()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 199, "FrameMetricServiceImpl.java")).t("Measurement not found: %s", new ecgk(((ecmh) ((ecmc) ecmnVar).a).a));
            return erre.a;
        }
        ecmv ecmvVar = this.i;
        ecmc ecmcVar = (ecmc) ecmnVar;
        String e = ecmcVar.a.e();
        if (Build.VERSION.SDK_INT >= 29) {
            isEnabled = Trace.isEnabled();
            if (isEnabled) {
                Trace.endAsyncSection(String.format("J<%s>", e), 352691800);
                for (ecna ecnaVar : ((ecnd) ecmvVar.b.b()).c) {
                    int a = ecnc.a(ecnaVar.b);
                    if (a == 0) {
                        a = 1;
                    }
                    switch (a - 1) {
                        case 1:
                            i = 0;
                            break;
                        case 2:
                            i = ecmmVar.g;
                            break;
                        case 3:
                            i = ecmmVar.i;
                            break;
                        case 4:
                            i = ecmmVar.j;
                            break;
                        case 5:
                            i = ecmmVar.k;
                            break;
                        case 6:
                            i = ecmmVar.l;
                            break;
                        case 7:
                            i = ecmmVar.n;
                            break;
                        default:
                            ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/jank/JankPerfettoTrigger", "endTraceSectionAndEmitCounters", 153, "JankPerfettoTrigger.java")).t("UNKNOWN COUNTER with %s as the name", ecnaVar.c);
                            continue;
                    }
                    Trace.setCounter(ecnaVar.c.replace("%EVENT_NAME%", e), i);
                }
            }
        }
        if (ecmmVar.i == 0) {
            return erre.a;
        }
        ecmv ecmvVar2 = this.i;
        if (((ecnd) ecmvVar2.b.b()).d) {
            ((ecmp) ecmvVar2.c.b()).e();
            long millis = TimeUnit.SECONDS.toMillis(9L);
            Long.valueOf(millis).getClass();
            if (ecmmVar.n <= millis && ecmmVar.g != 0) {
                ecjn ecjnVar = (ecjn) ecmvVar2.a.b();
                String replace = ((ecnd) ecmvVar2.b.b()).b.replace("%PACKAGE_NAME%", ecmvVar2.d.getPackageName());
                replace.getClass();
                ecjnVar.a(replace);
            }
        }
        long a2 = ecmmVar.c.a() - ecmmVar.d;
        fgqf fgqfVar = (fgqf) fgqg.a.createBuilder();
        fgqfVar.copyOnWrite();
        fgqg fgqgVar = (fgqg) fgqfVar.instance;
        fgqgVar.b |= 16;
        fgqgVar.g = ((int) a2) + 1;
        int i2 = ecmmVar.g;
        fgqfVar.copyOnWrite();
        fgqg fgqgVar2 = (fgqg) fgqfVar.instance;
        fgqgVar2.b |= 1;
        fgqgVar2.c = i2;
        int i3 = ecmmVar.i;
        fgqfVar.copyOnWrite();
        fgqg fgqgVar3 = (fgqg) fgqfVar.instance;
        fgqgVar3.b |= 2;
        fgqgVar3.d = i3;
        int i4 = ecmmVar.j;
        fgqfVar.copyOnWrite();
        fgqg fgqgVar4 = (fgqg) fgqfVar.instance;
        fgqgVar4.b |= 4;
        fgqgVar4.e = i4;
        int i5 = ecmmVar.l;
        fgqfVar.copyOnWrite();
        fgqg fgqgVar5 = (fgqg) fgqfVar.instance;
        fgqgVar5.b |= 32;
        fgqgVar5.h = i5;
        int i6 = ecmmVar.n;
        fgqfVar.copyOnWrite();
        fgqg fgqgVar6 = (fgqg) fgqfVar.instance;
        fgqgVar6.b |= 64;
        fgqgVar6.i = i6;
        int i7 = ecmmVar.k;
        fgqfVar.copyOnWrite();
        fgqg fgqgVar7 = (fgqg) fgqfVar.instance;
        fgqgVar7.b |= 8;
        fgqgVar7.f = i7;
        int i8 = ecmmVar.o;
        if (i8 != Integer.MIN_VALUE) {
            int[] iArr = ecmmVar.f;
            int[] iArr2 = ecmm.b;
            fgqn fgqnVar = (fgqn) fgqo.a.createBuilder();
            int i9 = 0;
            while (true) {
                if (i9 >= 52) {
                    if (iArr[51] > 0) {
                        fgqnVar.a(i8 + 1);
                        fgqnVar.b(0);
                    }
                    fgqoVar = (fgqo) fgqnVar.build();
                } else if (iArr2[i9] > i8) {
                    fgqnVar.b(0);
                    fgqnVar.a(i8 + 1);
                    fgqoVar = (fgqo) fgqnVar.build();
                } else {
                    int i10 = iArr[i9];
                    if (i10 > 0 || (i9 > 0 && iArr[i9 - 1] > 0)) {
                        fgqnVar.b(i10);
                        fgqnVar.a(iArr2[i9]);
                    }
                    i9++;
                }
            }
            fgqfVar.copyOnWrite();
            fgqg fgqgVar8 = (fgqg) fgqfVar.instance;
            fgqoVar.getClass();
            fgqgVar8.o = fgqoVar;
            fgqgVar8.b |= 2048;
            int i11 = ecmmVar.h;
            fgqfVar.copyOnWrite();
            fgqg fgqgVar9 = (fgqg) fgqfVar.instance;
            fgqgVar9.b |= 512;
            fgqgVar9.m = i11;
            int i12 = ecmmVar.m;
            fgqfVar.copyOnWrite();
            fgqg fgqgVar10 = (fgqg) fgqfVar.instance;
            fgqgVar10.b |= 1024;
            fgqgVar10.n = i12;
        }
        int i13 = 0;
        while (i13 < 28) {
            int i14 = i13 + 1;
            if (ecmmVar.e[i13] > 0) {
                fgqd fgqdVar = (fgqd) fgqe.a.createBuilder();
                int i15 = ecmmVar.e[i13];
                fgqdVar.copyOnWrite();
                fgqe fgqeVar = (fgqe) fgqdVar.instance;
                fgqeVar.b |= 1;
                fgqeVar.c = i15;
                int i16 = ecmm.a[i13];
                fgqdVar.copyOnWrite();
                fgqe fgqeVar2 = (fgqe) fgqdVar.instance;
                fgqeVar2.b |= 2;
                fgqeVar2.d = i16;
                if (i14 < 28) {
                    int i17 = ecmm.a[i14] - 1;
                    fgqdVar.copyOnWrite();
                    fgqe fgqeVar3 = (fgqe) fgqdVar.instance;
                    fgqeVar3.b |= 4;
                    fgqeVar3.e = i17;
                }
                fgqfVar.copyOnWrite();
                fgqg fgqgVar11 = (fgqg) fgqfVar.instance;
                fgqe fgqeVar4 = (fgqe) fgqdVar.build();
                fgqeVar4.getClass();
                eygr eygrVar = fgqgVar11.k;
                if (!eygrVar.c()) {
                    fgqgVar11.k = eyfy.mutableCopy(eygrVar);
                }
                fgqgVar11.k.add(fgqeVar4);
            }
            i13 = i14;
        }
        fgqg fgqgVar12 = (fgqg) fgqfVar.build();
        emxc a3 = ecmi.a(this.a);
        if (a3.g()) {
            fgqf fgqfVar2 = (fgqf) fgqgVar12.toBuilder();
            int intValue = ((Float) a3.c()).intValue();
            fgqfVar2.copyOnWrite();
            fgqg fgqgVar13 = (fgqg) fgqfVar2.instance;
            fgqgVar13.b |= 256;
            fgqgVar13.l = intValue;
            fgqgVar12 = (fgqg) fgqfVar2.build();
        }
        fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
        fgqwVar.copyOnWrite();
        fgqx fgqxVar = (fgqx) fgqwVar.instance;
        fgqgVar12.getClass();
        fgqxVar.l = fgqgVar12;
        fgqxVar.b |= 1024;
        fgqx fgqxVar2 = (fgqx) fgqwVar.build();
        ecjc ecjcVar = this.g;
        eciu m = eciv.m();
        m.f(fgqxVar2);
        ecim ecimVar = (ecim) m;
        ecimVar.b = ecmcVar.b;
        ecmx ecmxVar = ecmcVar.a;
        ecimVar.c = true != ((ecmh) ecmxVar).b ? null : "Activity";
        ecimVar.a = ecmxVar.e();
        m.c(((ecmh) ecmcVar.a).a != null);
        return ecjcVar.b(m.a());
    }

    private final void k(ecmx ecmxVar) {
        boolean isEnabled;
        if (this.g.c(ecmxVar.e())) {
            synchronized (this.f) {
                if (this.f.size() >= 25) {
                    ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 149, "FrameMetricServiceImpl.java")).t("Too many concurrent measurements, ignoring %s", ecmxVar);
                    return;
                }
                ecmm ecmmVar = (ecmm) this.f.put(ecmxVar, (ecmm) this.h.b());
                if (ecmmVar != null) {
                    this.f.put(ecmxVar, ecmmVar);
                    ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 162, "FrameMetricServiceImpl.java")).t("measurement already started: %s", ecmxVar);
                    return;
                }
                if (this.f.size() == 1) {
                    this.c.i();
                }
                String e = ecmxVar.e();
                if (Build.VERSION.SDK_INT >= 29) {
                    isEnabled = Trace.isEnabled();
                    if (isEnabled) {
                        Trace.beginAsyncSection(String.format("J<%s>", e), 352691800);
                    }
                }
            }
        }
    }

    public ListenableFuture<Void> a(Activity activity) {
        ecmx d = ecmx.d(activity);
        emux emuxVar = emux.a;
        return h(new ecmc(d, null, emuxVar, emuxVar));
    }

    @Override // defpackage.ecmt
    public ListenableFuture<Void> b(ecmr ecmrVar) {
        ecmh ecmhVar;
        ecmg ecmgVar = (ecmg) ecmrVar;
        ecda ecdaVar = ecmgVar.b;
        if (ecdaVar != null) {
            emyw.e(ecdaVar);
            ecmhVar = new ecmh(null, ecdaVar, false);
        } else {
            ecmhVar = new ecmh(ecmgVar.a, null, false);
        }
        return h(new ecmc(ecmhVar, ecmgVar.c, ecmgVar.d, ecmgVar.e));
    }

    public void c(Activity activity) {
        k(ecmx.d(activity));
    }

    @Override // defpackage.ecmt
    public void d(ecda ecdaVar) {
        k(new ecmh(null, ecdaVar, false));
    }

    @Override // defpackage.ecgn
    public void i(ecda ecdaVar) {
        synchronized (this.f) {
            this.f.clear();
        }
    }

    @Override // defpackage.ecje
    public void n() {
        this.b.a(this.c);
        this.b.a(this.d);
    }

    @Override // defpackage.ecgn
    public /* synthetic */ void j(ecda ecdaVar) {
    }
}
