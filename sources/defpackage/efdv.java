package defpackage;

import java.io.File;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdv implements efbi {
    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        efdw efdwVar = new efdw();
        efdwVar.c();
        File a = efdwVar.a(efbhVar);
        eoeo.a(a);
        return new RandomAccessFile(a, "rw");
    }
}
