package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acl implements hgo {
    final /* synthetic */ acj a;

    public acl(acj acjVar) {
        this.a = acjVar;
    }

    @Override // defpackage.hgo
    public final void a() {
        ffcu ffcuVar;
        adg adgVar = this.a.a;
        if (adgVar != null) {
            adgVar.b();
            ffcuVar = ffcu.a;
        } else {
            ffcuVar = null;
        }
        if (ffcuVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
