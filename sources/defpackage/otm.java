package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class otm extends osb {
    final /* synthetic */ otp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otm(String[] strArr, otp otpVar) {
        super(strArr);
        this.b = otpVar;
    }

    @Override // defpackage.osb
    public final void a(Set set) {
        aer a = aer.a();
        final otp otpVar = this.b;
        Runnable runnable = new Runnable() { // from class: otl
            @Override // java.lang.Runnable
            public final void run() {
                otp otpVar2 = otp.this;
                AtomicBoolean atomicBoolean = otpVar2.h;
                boolean n = otpVar2.n();
                if (atomicBoolean.compareAndSet(false, true) && n) {
                    otb otbVar = otpVar2.a;
                    ffqy.d(otbVar.k(), otpVar2.i, null, new otk(otpVar2, null), 2);
                }
            }
        };
        if (a.c()) {
            runnable.run();
        } else {
            a.b(runnable);
        }
    }
}
