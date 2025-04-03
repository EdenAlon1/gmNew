package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpb extends dtpg {
    public final String a;
    public final int b;
    public final boolean c;
    public final dtpi d;

    public dtpb(String str, int i, boolean z, dtpi dtpiVar) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = dtpiVar;
    }

    @Override // defpackage.dtpg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dtpg
    public final dtpi b() {
        return this.d;
    }

    @Override // defpackage.dtpg
    public final String c() {
        return this.a;
    }

    @Override // defpackage.dtpg
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtpg) {
            dtpg dtpgVar = (dtpg) obj;
            if (this.a.equals(dtpgVar.c()) && this.b == dtpgVar.a()) {
                dtpgVar.e();
                dtpgVar.f();
                dtpgVar.g();
                if (this.c == dtpgVar.d() && this.d.equals(dtpgVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Alert.DURATION_SHOW_INDEFINITELY) * 1000003) ^ Alert.DURATION_SHOW_INDEFINITELY) * 1000003) ^ 1231) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ThreadPoolConfig{name=" + this.a + ", numThreads=" + this.b + ", maxThreadSize=2147483647, maxQueueSize=2147483647, enableStats=true, enabledMetrics=" + this.c + ", listener=" + this.d.toString() + "}";
    }

    @Override // defpackage.dtpg
    public final void e() {
    }

    @Override // defpackage.dtpg
    public final void f() {
    }

    @Override // defpackage.dtpg
    public final void g() {
    }
}
