package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akex {
    public static final akex a;
    public static final akex b;
    private static final /* synthetic */ akex[] c;

    static {
        akex akexVar = new akex("SinglePane", 0);
        a = akexVar;
        akex akexVar2 = new akex("DualPane", 1);
        b = akexVar2;
        akex[] akexVarArr = {akexVar, akexVar2};
        c = akexVarArr;
        ffhw.a(akexVarArr);
    }

    private akex(String str, int i) {
    }

    public static akex[] values() {
        return (akex[]) c.clone();
    }
}
