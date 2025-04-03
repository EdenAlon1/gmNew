package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejto implements ejuh {
    final /* synthetic */ ejtr a;
    private final Uri b;
    private final String[] c;
    private final ejui d;

    public ejto(ejtr ejtrVar, Uri uri, String[] strArr) {
        this.a = ejtrVar;
        this.b = uri;
        this.c = strArr;
        this.d = new ejtq(ejtrVar, uri).a;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        return this.a.b(this.b, this.c, null, null, null).e(eldl.g(new erow() { // from class: ejtn
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                return ejug.a((Cursor) obj, ejto.this.a.d.f());
            }
        }), erpp.a);
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        return erqt.i(null);
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return this.d;
    }
}
