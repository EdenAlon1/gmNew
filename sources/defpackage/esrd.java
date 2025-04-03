package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esrd {
    public static final esrd a;
    public static final esrd b;
    public static final esrd c;
    private static final /* synthetic */ esrd[] d;

    static {
        esrd esrdVar = new esrd("UNKNOWN", 0);
        a = esrdVar;
        esrd esrdVar2 = new esrd("DEFAULT", 1);
        b = esrdVar2;
        esrd esrdVar3 = new esrd("ADMINISTRATED", 2);
        c = esrdVar3;
        esrd[] esrdVarArr = {esrdVar, esrdVar2, esrdVar3};
        d = esrdVarArr;
        ffhw.a(esrdVarArr);
    }

    private esrd(String str, int i) {
    }

    public static esrd[] values() {
        return (esrd[]) d.clone();
    }

    public final boolean a(esqr esqrVar) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return esqq.d != ((esqj) esqrVar).a;
            }
            if (ordinal != 2) {
                throw null;
            }
        }
        return true;
    }
}
