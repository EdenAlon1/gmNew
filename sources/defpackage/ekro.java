package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekro {
    public ekrl a;
    public ekrh b;
    public ffbr c;

    public final ekrp a() {
        emxf.m(this.a != null, "Every SyncletBinding must have a non-null SyncKey.");
        emxf.m(this.b != null, "Every SyncletBinding must have a non-null SyncConfig.");
        emxf.m(this.c != null, "Every SyncletBinding must have a non-null Synclet.");
        return new ekrf(true, this.a, this.b, this.c);
    }

    public final void b(String str) {
        this.a = ekrl.a(str);
    }
}
