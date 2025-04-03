package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oce extends ffkk implements ffix {
    public static final oce a = new oce();

    public oce() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
