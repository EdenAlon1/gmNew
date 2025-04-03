package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhuf {
    public static final dhuf a = new dhuf(new Object() { // from class: dhtz
    });
    public final Object b = new Object();
    public dhre c;
    public int d;
    public final dhtz e;

    public dhuf(dhtz dhtzVar) {
        this.e = dhtzVar;
    }

    public final String toString() {
        String str;
        synchronized (this.b) {
            str = "ShareableTimeSignalSupplierManager{shareableSimpleClientInitializerFactory=" + toString() + ", createShareableTimeSignalSupplierAdapterTask=" + String.valueOf(this.c) + ", usageCount=" + this.d + "}";
        }
        return str;
    }
}
