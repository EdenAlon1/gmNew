package j$.io;

import j$.nio.file.FileSystems;
import j$.nio.file.Path;
import java.io.File;

/* loaded from: classes9.dex */
public final /* synthetic */ class FileRetargetClass {
    public static Path toPath(File file) {
        return FileSystems.getDefault().getPath(file.getPath(), new String[0]);
    }
}
