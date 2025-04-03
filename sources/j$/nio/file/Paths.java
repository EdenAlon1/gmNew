package j$.nio.file;

/* loaded from: classes9.dex */
public final class Paths {
    public static Path get(String str, String... strArr) {
        return FileSystems.getDefault().getPath(str, strArr);
    }
}
