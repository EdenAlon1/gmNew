package defpackage;

import android.database.Cursor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eljk implements ejuh {
    final /* synthetic */ int a;
    final /* synthetic */ eljl b;

    public eljk(eljl eljlVar, int i) {
        this.a = i;
        this.b = eljlVar;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        int i = this.a;
        emxf.b(i > 0, "rowId must be positive");
        String[] strArr = {Integer.toString(i)};
        eljg eljgVar = this.b.a;
        return new erph(eljgVar.c.b("SELECT trace_data FROM tracing WHERE rowid = ?", strArr).e(new erow() { // from class: elje
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                int i2 = eljg.d;
                if (cursor.getCount() == 0) {
                    return eljw.a;
                }
                cursor.moveToFirst();
                return (eljw) ProtoParsers.h(cursor.getBlob(cursor.getColumnIndexOrThrow("trace_data")), eljw.a, eyfc.a());
            }
        }, eljgVar.b).g()).e(new erow() { // from class: eljj
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                return ejug.a((eljw) obj, eljk.this.b.b.f());
            }
        }, erpp.a);
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        return erqt.i(null);
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return "DebugTraceData";
    }
}
