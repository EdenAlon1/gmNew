package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diul {
    public final dkrx a;
    public final djqt b;
    public final Object c = new Object();
    public final dkxc d;

    public diul(dkrx dkrxVar, djqt djqtVar, dkxc dkxcVar) {
        this.a = dkrxVar;
        this.b = djqtVar;
        this.d = dkxcVar;
    }

    public final void a() {
        synchronized (this.c) {
            this.a.m();
            this.b.a.deleteFile("capabilities-pidf.xml");
        }
    }
}
