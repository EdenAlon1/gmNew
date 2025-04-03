package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhq {
    public static final jhq a;
    public static final jhq b;
    public static final jhq c;
    public static final jhq d;
    public static final jhq e;
    private static final /* synthetic */ jhq[] h;
    public final int f;
    public final int g;

    static {
        jhq jhqVar = new jhq("Copy", 0, 0);
        a = jhqVar;
        jhq jhqVar2 = new jhq("Paste", 1, 1);
        b = jhqVar2;
        jhq jhqVar3 = new jhq("Cut", 2, 2);
        c = jhqVar3;
        jhq jhqVar4 = new jhq("SelectAll", 3, 3);
        d = jhqVar4;
        jhq jhqVar5 = new jhq("Autofill", 4, 4);
        e = jhqVar5;
        jhq[] jhqVarArr = {jhqVar, jhqVar2, jhqVar3, jhqVar4, jhqVar5};
        h = jhqVarArr;
        ffhw.a(jhqVarArr);
    }

    private jhq(String str, int i, int i2) {
        this.f = i2;
        this.g = i2;
    }

    public static jhq[] values() {
        return (jhq[]) h.clone();
    }
}
