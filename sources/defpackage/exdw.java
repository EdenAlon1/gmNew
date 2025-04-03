package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exdw {
    public final String a;
    public final exdv b;

    public exdw(String str, exdv exdvVar) {
        this.a = str;
        this.b = exdvVar;
        if (!exdvVar.b()) {
            throw new IllegalArgumentException("Invalid positive geofilter");
        }
    }
}
