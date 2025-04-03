package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class gmn {
    public static final gmn a;
    public static final gmn b;
    private static final /* synthetic */ gmn[] c;

    static {
        gmn gmnVar = new gmn("THUMB", 0);
        a = gmnVar;
        gmn gmnVar2 = new gmn("TRACK", 1);
        b = gmnVar2;
        gmn[] gmnVarArr = {gmnVar, gmnVar2};
        c = gmnVarArr;
        ffhw.a(gmnVarArr);
    }

    private gmn(String str, int i) {
    }

    public static gmn[] values() {
        return (gmn[]) c.clone();
    }
}
