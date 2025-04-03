package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class euf {
    public static final euf a;
    public static final euf b;
    public static final euf c;
    private static final /* synthetic */ euf[] d;

    static {
        euf eufVar = new euf("Cursor", 0);
        a = eufVar;
        euf eufVar2 = new euf("SelectionStart", 1);
        b = eufVar2;
        euf eufVar3 = new euf("SelectionEnd", 2);
        c = eufVar3;
        euf[] eufVarArr = {eufVar, eufVar2, eufVar3};
        d = eufVarArr;
        ffhw.a(eufVarArr);
    }

    private euf(String str, int i) {
    }

    public static euf[] values() {
        return (euf[]) d.clone();
    }
}
