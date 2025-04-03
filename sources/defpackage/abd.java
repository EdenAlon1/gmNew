package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abd extends ffkk implements ffix {
    final /* synthetic */ abe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abd(abe abeVar) {
        super(0);
        this.a = abeVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        final abe abeVar = this.a;
        final aca acaVar = new aca(new Runnable() { // from class: abb
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    super/*hl*/.onBackPressed();
                } catch (IllegalStateException e) {
                    if (!ffkj.e(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    if (!ffkj.e(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            final abe abeVar2 = this.a;
            if (!ffkj.e(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: abc
                    @Override // java.lang.Runnable
                    public final void run() {
                        abe.this.x(acaVar);
                    }
                });
                return acaVar;
            }
            abeVar2.x(acaVar);
        }
        return acaVar;
    }
}
