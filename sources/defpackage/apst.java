package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apst {
    public static final apst a;
    public static final apst b;
    private static final /* synthetic */ apst[] c;

    static {
        apst apstVar = new apst("STAR", 0);
        a = apstVar;
        apst apstVar2 = new apst("UNSTAR", 1);
        b = apstVar2;
        apst[] apstVarArr = {apstVar, apstVar2};
        c = apstVarArr;
        ffhw.a(apstVarArr);
    }

    private apst(String str, int i) {
    }

    public static apst[] values() {
        return (apst[]) c.clone();
    }
}
