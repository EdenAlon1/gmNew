package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.internal.training.IInAppTrainer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgvz implements dgub {
    private final IInAppTrainer a;

    public dgvz(IInAppTrainer iInAppTrainer) {
        this.a = iInAppTrainer;
    }

    public static dhre c(final Context context, final Executor executor, final InAppTrainerOptions inAppTrainerOptions) {
        final dhri dhriVar = new dhri();
        executor.execute(new Runnable() { // from class: dgvu
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Context context2 = context;
                dhri dhriVar2 = dhriVar;
                Executor executor2 = executor;
                InAppTrainerOptions inAppTrainerOptions2 = inAppTrainerOptions;
                if (!edyt.c) {
                    synchronized (dgtn.a) {
                        z = dgtn.b;
                    }
                    if (!z) {
                        Class<?> cls = context2.getApplicationContext().getClass();
                        if (!cls.equals(Application.class) && !"android.support.multidex.MultiDexApplication".equals(cls.getName())) {
                            dhriVar2.c(new dfqu(new Status(10, a.N(cls, "Cannot create in-app trainer: android.app.Application class has been subclassed (", ") and BrellaInit.myAppCanHandleMultipleProcesses() was not called"))));
                            return;
                        }
                    }
                }
                try {
                    IInAppTrainer iInAppTrainer = (IInAppTrainer) dgvf.a(context2, "com.google.android.gms.learning.dynamite.training.InAppTrainerImpl", new dgve() { // from class: dgvv
                        @Override // defpackage.dgve
                        public final IInterface a(IBinder iBinder) {
                            return IInAppTrainer.Stub.asInterface(iBinder);
                        }
                    });
                    dgvw dgvwVar = new dgvw(dhriVar2, iInAppTrainer);
                    try {
                        if (iInAppTrainer.initY2023W12(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, dgvwVar)) {
                            return;
                        }
                        if (!inAppTrainerOptions2.l.isEmpty()) {
                            dhriVar2.c(new dfqu(new Status(10, "Input resources are not supported.")));
                            return;
                        }
                        try {
                            if (iInAppTrainer.initY2022W24(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, dgvwVar)) {
                                return;
                            }
                            if (dgvz.d(inAppTrainerOptions2.k) || dgvz.d(inAppTrainerOptions2.i) || dgvz.d(inAppTrainerOptions2.f)) {
                                dhriVar2.c(new dfqu(new Status(10, "appdata Uri scheme is not supported.")));
                                return;
                            }
                            try {
                                if (iInAppTrainer.initY2020W36(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, dgvwVar)) {
                                    return;
                                }
                                if (inAppTrainerOptions2.k != null) {
                                    dhriVar2.c(new dfqu(new Status(10, "local computation plan with TensorflowSpec is not supported.")));
                                    return;
                                }
                                try {
                                    if (iInAppTrainer.initY2020W30(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, dgvwVar)) {
                                        return;
                                    }
                                    if (inAppTrainerOptions2.a().length > 0) {
                                        dhriVar2.c(new dfqu(new Status(10, "Context data is not supported.")));
                                        return;
                                    }
                                    try {
                                        if (iInAppTrainer.initY2020W18(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, dgvwVar)) {
                                            return;
                                        }
                                        if (inAppTrainerOptions2.d != null && inAppTrainerOptions2.j != null) {
                                            dhriVar2.c(new dfqu(new Status(10, "Training interval is not supported for federated computation.")));
                                            return;
                                        }
                                        try {
                                            if (iInAppTrainer.initW24(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, dgvwVar)) {
                                                return;
                                            }
                                            int i = inAppTrainerOptions2.e;
                                            if (i != 0 && i != 1) {
                                                dhriVar2.c(new dfqu(new Status(10, "Unsupported AttestationMode")));
                                                return;
                                            }
                                            try {
                                                if (iInAppTrainer.initV26(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, dgvwVar)) {
                                                    return;
                                                }
                                                dhriVar2.c(new dfqu(new Status(17, "Failed to init impl")));
                                            } catch (RemoteException e) {
                                                dhriVar2.c(new dfqu(new Status(8, emyt.a(e))));
                                            }
                                        } catch (RemoteException e2) {
                                            dhriVar2.c(new dfqu(new Status(8, emyt.a(e2))));
                                        }
                                    } catch (RemoteException e3) {
                                        dhriVar2.c(new dfqu(new Status(8, emyt.a(e3))));
                                    }
                                } catch (RemoteException e4) {
                                    dhriVar2.c(new dfqu(new Status(8, emyt.a(e4))));
                                }
                            } catch (RemoteException e5) {
                                dhriVar2.c(new dfqu(new Status(8, emyt.a(e5))));
                            }
                        } catch (RemoteException e6) {
                            dhriVar2.c(new dfqu(new Status(8, emyt.a(e6))));
                        }
                    } catch (RemoteException e7) {
                        dhriVar2.c(new dfqu(new Status(8, emyt.a(e7))));
                    }
                } catch (dgvd e8) {
                    dhriVar2.c(new dfqu(new Status(17, "Cannot create in-app trainer: ".concat(String.valueOf(e8.getMessage())))));
                }
            }
        });
        return dhriVar.a;
    }

    public static boolean d(Uri uri) {
        return uri != null && "appdir".equals(uri.getScheme());
    }

    @Override // defpackage.dgub
    public final dhre a() {
        dhri dhriVar = new dhri();
        try {
            this.a.stop(new dgvy(dhriVar));
        } catch (RemoteException e) {
            dhriVar.c(new dfqu(new Status(8, emyt.a(e))));
        }
        return dhriVar.a;
    }

    @Override // defpackage.dgub
    public final dhre b() {
        dhri dhriVar = new dhri();
        try {
            this.a.start(0, new dgvx(dhriVar));
        } catch (RemoteException e) {
            dhriVar.c(new dfqu(new Status(8, emyt.a(e))));
        }
        return dhriVar.a;
    }
}
