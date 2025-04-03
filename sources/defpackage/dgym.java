package defpackage;

import android.os.Looper;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface dgym {
    dhre a(CurrentLocationRequest currentLocationRequest, dhqd dhqdVar);

    dhre b(LocationRequest locationRequest, Executor executor, dgyt dgytVar);

    dhre c(int i);

    void d(dgyt dgytVar);

    void e(LocationRequest locationRequest, dgyt dgytVar, Looper looper);
}
