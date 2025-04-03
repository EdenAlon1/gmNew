package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeut {
    public final eeuu a;
    public final Object b = new Object();
    public final Object c = new Object();
    public eeuq d;
    public eeuq e;

    public eeut(eeuu eeuuVar) {
        this.a = eeuuVar;
    }

    public static final void b() {
        throw new IllegalStateException("metadataVersion == null. ExpressiveStickerClient#maybeSyncWithServer() must be invoked first.");
    }

    public final String a() {
        String str;
        synchronized (this.b) {
            eeuq eeuqVar = this.d;
            str = eeuqVar == null ? null : eeuqVar.c;
        }
        return str;
    }
}
