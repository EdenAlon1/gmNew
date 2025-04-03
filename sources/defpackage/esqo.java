package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqo {
    public static final esqo a;
    public static final esqo b;
    public static final esqo c;
    private static final /* synthetic */ esqo[] d;

    static {
        esqo esqoVar = new esqo("UNKNOWN_GROUP_ICON_MODIFICATION_POLICY", 0);
        a = esqoVar;
        esqo esqoVar2 = new esqo("NO_GROUP_ICON_MODIFICATION_ALLOWED", 1);
        b = esqoVar2;
        esqo esqoVar3 = new esqo("GROUP_ICON_MODIFICATION_ALLOWED", 2);
        c = esqoVar3;
        esqo[] esqoVarArr = {esqoVar, esqoVar2, esqoVar3};
        d = esqoVarArr;
        ffhw.a(esqoVarArr);
    }

    private esqo(String str, int i) {
    }

    public static esqo[] values() {
        return (esqo[]) d.clone();
    }
}
