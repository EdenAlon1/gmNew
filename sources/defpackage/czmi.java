package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czmi {
    public static final czmi a;
    public static final czmi b;
    public static final czmi c;
    private static final /* synthetic */ czmi[] d;

    static {
        czmi czmiVar = new czmi("NOT_QUALIFIED", 0);
        a = czmiVar;
        czmi czmiVar2 = new czmi("QUALIFIED_INCOMING", 1);
        b = czmiVar2;
        czmi czmiVar3 = new czmi("QUALIFIED_OUTGOING", 2);
        c = czmiVar3;
        czmi[] czmiVarArr = {czmiVar, czmiVar2, czmiVar3};
        d = czmiVarArr;
        ffhw.a(czmiVarArr);
    }

    private czmi(String str, int i) {
    }

    public static czmi[] values() {
        return (czmi[]) d.clone();
    }
}
