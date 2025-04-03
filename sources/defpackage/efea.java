package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efea implements efbi {
    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        Uri build = efbhVar.e.buildUpon().fragment(null).build();
        efbm efbmVar = efbhVar.a;
        enjk.o(arrayDeque, efbmVar.b(build));
        long j = 0;
        while (!arrayDeque.isEmpty()) {
            Uri uri = (Uri) arrayDeque.remove();
            if (efbmVar.i(uri)) {
                enjk.o(arrayDeque, efbmVar.b(uri));
            } else {
                if (!efbmVar.h(uri)) {
                    throw new FileNotFoundException(String.format("Child %s could not be opened", uri));
                }
                j += efbmVar.a(uri);
            }
        }
        return Long.valueOf(j);
    }
}
