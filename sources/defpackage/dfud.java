package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfud {
    public dfuf a;
    public dfuf b;
    public dftp c;
    public Feature[] d;
    public int e;
    private final Runnable f = new Runnable() { // from class: dfua
        @Override // java.lang.Runnable
        public final void run() {
        }
    };
    private boolean g = true;

    public final dfue a() {
        dfwv.b(this.a != null, "Must set register function");
        dfwv.b(this.b != null, "Must set unregister function");
        dfwv.b(this.c != null, "Must set holder");
        dftn dftnVar = this.c.b;
        dfwv.o(dftnVar, "Key must not be null");
        return new dfue(new dfub(this, this.c, this.d, this.g, this.e), new dfuc(this, dftnVar), this.f);
    }

    public final void b() {
        this.g = false;
    }
}
