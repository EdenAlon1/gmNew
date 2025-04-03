package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbk implements bjt {
    public final llg b;
    public boolean a = false;
    public final Object c = new Object();

    public cbk(llg llgVar) {
        this.b = llgVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        synchronized (this.c) {
            if (this.a) {
                return;
            }
            if (!(th instanceof atb)) {
                avw.b("CameraController", "Tap-to-focus failed.", th);
                this.b.j(new ccy(4));
            } else {
                avw.b("CameraController", "Tap-to-focus canceled", th);
                this.b.j(new ccy(0));
                c();
            }
        }
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aue aueVar = (aue) obj;
        synchronized (this.c) {
            if (this.a) {
                return;
            }
            if (aueVar == null) {
                return;
            }
            avw.a("CameraController", "Tap-to-focus onSuccess: " + aueVar.a);
            this.b.j(new ccy(true != aueVar.a ? 3 : 2));
        }
    }

    public final void c() {
        synchronized (this.c) {
            this.a = true;
        }
    }
}
