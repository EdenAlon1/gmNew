package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efkd {
    public static final void a(String str, efke efkeVar) {
        emxf.f(!str.contains("PRAGMA"), "You should not include the PRAGMA in your statement: %s", str);
        efkeVar.a.add(str);
    }
}
