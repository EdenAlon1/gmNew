package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class C implements n {
    public static final C APPEND;
    public static final C CREATE;
    public static final C CREATE_NEW;
    public static final C DELETE_ON_CLOSE;
    public static final C DSYNC;
    public static final C READ;
    public static final C SPARSE;
    public static final C SYNC;
    public static final C TRUNCATE_EXISTING;
    public static final C WRITE;
    private static final /* synthetic */ C[] a;

    static {
        C c = new C("READ", 0);
        READ = c;
        C c2 = new C("WRITE", 1);
        WRITE = c2;
        C c3 = new C("APPEND", 2);
        APPEND = c3;
        C c4 = new C("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = c4;
        C c5 = new C("CREATE", 4);
        CREATE = c5;
        C c6 = new C("CREATE_NEW", 5);
        CREATE_NEW = c6;
        C c7 = new C("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = c7;
        C c8 = new C("SPARSE", 7);
        SPARSE = c8;
        C c9 = new C("SYNC", 8);
        SYNC = c9;
        C c10 = new C("DSYNC", 9);
        DSYNC = c10;
        a = new C[]{c, c2, c3, c4, c5, c6, c7, c8, c9, c10};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) a.clone();
    }
}
