package defpackage;

import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dfvj {
    public Object d;
    public boolean e = false;
    final /* synthetic */ BaseGmsClient f;

    public dfvj(BaseGmsClient baseGmsClient, Object obj) {
        this.f = baseGmsClient;
        this.d = obj;
    }

    protected abstract void b();

    protected abstract void d();

    public final void e() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void f() {
        e();
        synchronized (this.f.j) {
            this.f.j.remove(this);
        }
    }
}
