package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import j$.nio.file.u;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.util.Iterator;

/* loaded from: classes9.dex */
final class l implements Iterator {
    private final u a;
    private final File[] b;
    private int c = 0;
    final /* synthetic */ m d;

    l(m mVar, Path path, u uVar) {
        this.d = mVar;
        File[] listFiles = path.toFile().listFiles();
        this.b = listFiles == null ? new File[0] : listFiles;
        this.a = uVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o next() {
        o oVar;
        i iVar;
        String str;
        String str2;
        do {
            int i = this.c;
            File[] fileArr = this.b;
            if (i >= fileArr.length) {
                return null;
            }
            this.c = i + 1;
            File file = fileArr[i];
            m mVar = this.d;
            iVar = mVar.d;
            String path = file.getPath();
            str = mVar.b;
            str2 = mVar.c;
            oVar = new o(iVar, path, str, str2);
            try {
            } catch (IOException e) {
                throw new DirectoryIteratorException(e);
            }
        } while (!this.a.accept(oVar));
        return oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.c--;
        return true;
    }
}
