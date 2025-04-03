package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aplf {
    public static final aplf a;
    public static final aplf b;
    private static final /* synthetic */ aplf[] c;

    static {
        aplf aplfVar = new aplf("RCS", 0);
        a = aplfVar;
        aplf aplfVar2 = new aplf("XMS", 1);
        b = aplfVar2;
        aplf[] aplfVarArr = {aplfVar, aplfVar2};
        c = aplfVarArr;
        ffhw.a(aplfVarArr);
    }

    private aplf(String str, int i) {
    }

    public static aplf[] values() {
        return (aplf[]) c.clone();
    }
}
