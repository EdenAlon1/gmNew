package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmdt {
    public static final dmdt a;
    public static final dmdt b;
    private static final /* synthetic */ dmdt[] c;

    static {
        dmdt dmdtVar = new dmdt("EXPANDED", 0);
        a = dmdtVar;
        dmdt dmdtVar2 = new dmdt("COLLAPSED", 1);
        b = dmdtVar2;
        dmdt[] dmdtVarArr = {dmdtVar, dmdtVar2};
        c = dmdtVarArr;
        ffhw.a(dmdtVarArr);
    }

    private dmdt(String str, int i) {
    }

    public static dmdt[] values() {
        return (dmdt[]) c.clone();
    }
}
