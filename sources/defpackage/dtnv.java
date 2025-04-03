package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtnv implements Serializable, dtny {
    private static final TimeUnit a = TimeUnit.MINUTES;
    private static final long serialVersionUID = 0;

    @Override // defpackage.dtny
    public final int a() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return dtny.class;
    }

    @Override // defpackage.dtny
    public final int b() {
        return 1000;
    }

    @Override // defpackage.dtny
    public final int c() {
        return 1;
    }

    @Override // defpackage.dtny
    public final int d() {
        return 1;
    }

    @Override // defpackage.dtny
    public final int e() {
        return 1000;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtny) {
            dtny dtnyVar = (dtny) obj;
            dtnyVar.d();
            dtnyVar.e();
            dtnyVar.a();
            dtnyVar.b();
            dtnyVar.c();
            dtnyVar.f();
            if (a.equals(dtnyVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dtny
    public final long f() {
        return 1L;
    }

    @Override // defpackage.dtny
    public final TimeUnit g() {
        return a;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (a.hashCode() ^ (-810573619)) - 1944263094;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.concurrent.monitoring.ThreadMonitoringConfiguration()";
    }
}
