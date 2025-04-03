package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmm extends dllp {
    public dlmm() {
        super(dexf.FILE_DELETION, 10L);
    }

    private static void c(File file, FilenameFilter filenameFilter) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    c(file2, filenameFilter);
                } else if (filenameFilter.accept(file, file2.getName()) && !file2.delete()) {
                    Log.w("FILE_DELETION", "Unable to delete file: ".concat(String.valueOf(String.valueOf(file2))));
                }
            }
        }
    }

    @Override // defpackage.dllp
    public final dllv a(dllv dllvVar, emxc emxcVar) {
        File dataDir;
        Context createDeviceProtectedStorageContext;
        File dataDir2;
        if (!emxcVar.g() || ((deyi) emxcVar.c()).b != 1) {
            throw new IllegalArgumentException();
        }
        Context context = dllvVar.b;
        deyi deyiVar = (deyi) emxcVar.c();
        dexs dexsVar = deyiVar.b == 1 ? (dexs) deyiVar.c : dexs.a;
        int i = dexsVar.b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 == 1) {
            eygr eygrVar = dexsVar.c;
            dataDir = context.getDataDir();
            if (dataDir == null) {
                throw new IllegalStateException("Context missing dataDir");
            }
            c(dataDir, new dlml(dataDir, eygrVar));
            return dllvVar;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new UnsupportedOperationException("This storage type does not supported");
            }
            eygr eygrVar2 = dexsVar.c;
            File externalFilesDir = context.getExternalFilesDir(null);
            c(externalFilesDir, new dlml(externalFilesDir, eygrVar2));
            return dllvVar;
        }
        eygr eygrVar3 = dexsVar.c;
        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        dataDir2 = createDeviceProtectedStorageContext.getDataDir();
        if (dataDir2 == null) {
            throw new IllegalStateException("Context missing dataDir");
        }
        c(dataDir2, new dlml(dataDir2, eygrVar3));
        return dllvVar;
    }

    @Override // defpackage.dllp
    public final String b() {
        return "FILE_DELETION";
    }
}
