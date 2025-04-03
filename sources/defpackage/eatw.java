package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eatw {
    public static final eatw a;
    public static final eatw b;
    private static final /* synthetic */ eatw[] d;
    public final int c;

    static {
        eatw eatwVar = new eatw("SYSTEM_TRAY", 0, 1);
        a = eatwVar;
        eatw eatwVar2 = new eatw("IN_APP", 1, 2);
        b = eatwVar2;
        eatw[] eatwVarArr = {eatwVar, eatwVar2};
        d = eatwVarArr;
        ffhw.a(eatwVarArr);
    }

    private eatw(String str, int i, int i2) {
        this.c = i2;
    }

    public static eatw[] values() {
        return (eatw[]) d.clone();
    }
}
