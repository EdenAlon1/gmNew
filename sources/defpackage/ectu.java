package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ectu {
    private volatile dhvo b;
    public final AtomicReference a = new AtomicReference();
    private final AtomicBoolean c = new AtomicBoolean(false);

    public final ListenableFuture a(Context context, boolean z, boolean z2) {
        if (!z) {
            return erqt.i(true);
        }
        Boolean bool = (Boolean) this.a.get();
        if (bool != null) {
            return erqt.i(bool);
        }
        dhvo dhvoVar = this.b;
        if (dhvoVar == null) {
            synchronized (this) {
                dhvoVar = this.b;
                if (dhvoVar == null) {
                    dhvo a = dhvm.a(context);
                    this.b = a;
                    dhvoVar = a;
                }
            }
        }
        if (z2 && !this.c.getAndSet(true)) {
            dfra dfraVar = (dfra) dhvoVar;
            final dftp b = dftq.b(new dhvn() { // from class: ectr
                @Override // defpackage.dhvn
                public final void a() {
                    ectu.this.a.set(null);
                }
            }, dfraVar.i, dhvn.class.getSimpleName());
            final UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener = ((dhvl) dfraVar.g).a;
            final dhvg dhvgVar = (dhvg) dhvoVar;
            dfuf dfufVar = new dfuf() { // from class: dhva
                @Override // defpackage.dfuf
                public final void a(Object obj, Object obj2) {
                    UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener2 = new UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener(b);
                    ((UsageReportingClientImpl) obj).M(usageReportingOptInOptionsChangedListener, usageReportingOptInOptionsChangedListener2, new dhve(dhvg.this, (dhri) obj2, usageReportingOptInOptionsChangedListener2));
                }
            };
            dfuf dfufVar2 = new dfuf() { // from class: dhvb
                @Override // defpackage.dfuf
                public final void a(Object obj, Object obj2) {
                    dhvg dhvgVar2 = dhvg.this;
                    ((UsageReportingClientImpl) obj).M(((dhvl) dhvgVar2.g).a, null, new dhvf(dhvgVar2, (dhri) obj2));
                }
            };
            dfud dfudVar = new dfud();
            dfudVar.a = dfufVar;
            dfudVar.b = dfufVar2;
            dfudVar.c = b;
            dfudVar.d = new Feature[]{dhuy.a};
            dfudVar.e = 4507;
            dfraVar.j(dfudVar.a());
        }
        return ernq.f(erny.f(erqc.o(duin.a(dhvoVar.b())), eldl.a(new emwl() { // from class: ects
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dhvq dhvqVar = (dhvq) ((dhvh) obj).a;
                dfwv.n(dhvqVar.a);
                int i = dhvqVar.a.a;
                boolean z3 = true;
                if (i != 1 && i != 3) {
                    z3 = false;
                }
                AtomicReference atomicReference = ectu.this.a;
                Boolean valueOf = Boolean.valueOf(z3);
                atomicReference.set(valueOf);
                return valueOf;
            }
        }), erpp.a), Throwable.class, new emwl() { // from class: ectt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (Throwable) obj);
                return true;
            }
        }, erpp.a);
    }
}
