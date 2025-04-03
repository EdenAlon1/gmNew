package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apyw {
    public static final apyw a;
    public static final apyw b;
    private static final /* synthetic */ apyw[] c;

    static {
        apyw apywVar = new apyw("ADD", 0);
        a = apywVar;
        apyw apywVar2 = new apyw("REMOVE", 1);
        b = apywVar2;
        apyw[] apywVarArr = {apywVar, apywVar2};
        c = apywVarArr;
        ffhw.a(apywVarArr);
    }

    private apyw(String str, int i) {
    }

    public static apyw[] values() {
        return (apyw[]) c.clone();
    }
}
