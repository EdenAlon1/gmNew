package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demz {
    public static final demz a;
    public static final demz b;
    public static final demz c;
    private static final /* synthetic */ demz[] e;
    public final int d;

    static {
        demz demzVar = new demz("EDIT_PICTURE", 0, ewom.PRIVACY_PROFILE_PICTURE_SCREEN.qw);
        a = demzVar;
        demz demzVar2 = new demz("EDIT_PICTURE_SETTINGS", 1, ewom.PRIVACY_PROFILE_PICTURE_SCREEN.qw);
        b = demzVar2;
        demz demzVar3 = new demz("EDIT_NAME", 2, ewom.PROFILE_NAME_EDIT_SCREEN.qw);
        c = demzVar3;
        demz[] demzVarArr = {demzVar, demzVar2, demzVar3};
        e = demzVarArr;
        ffhw.a(demzVarArr);
    }

    private demz(String str, int i, int i2) {
        this.d = i2;
    }

    public static demz[] values() {
        return (demz[]) e.clone();
    }
}
