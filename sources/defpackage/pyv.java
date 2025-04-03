package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyv implements Callable {
    final /* synthetic */ otj a;
    final /* synthetic */ pzg b;

    public pyv(pzg pzgVar, otj otjVar) {
        this.b = pzgVar;
        this.a = otjVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List call() {
        this.b.a.n();
        try {
            Cursor a = ovn.a(this.b.a, this.a, true);
            try {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (a.moveToNext()) {
                    String string = a.getString(0);
                    if (!hashMap.containsKey(string)) {
                        hashMap.put(string, new ArrayList());
                    }
                    String string2 = a.getString(0);
                    if (!hashMap2.containsKey(string2)) {
                        hashMap2.put(string2, new ArrayList());
                    }
                }
                a.moveToPosition(-1);
                this.b.o(hashMap);
                this.b.n(hashMap2);
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    String string3 = a.getString(0);
                    pqp f = pzn.f(a.getInt(1));
                    pot c = pot.c(a.getBlob(2));
                    int i = a.getInt(3);
                    int i2 = a.getInt(4);
                    arrayList.add(new pyi(string3, f, c, a.getLong(14), a.getLong(15), a.getLong(16), new poj(pzn.g(a.getBlob(6)), pzn.l(a.getInt(5)), a.getInt(7) != 0, a.getInt(8) != 0, a.getInt(9) != 0, a.getInt(10) != 0, a.getLong(11), a.getLong(12), pzn.h(a.getBlob(13))), i, pzn.d(a.getInt(17)), a.getLong(18), a.getLong(19), a.getInt(20), i2, a.getLong(21), a.getInt(22), (ArrayList) hashMap.get(a.getString(0)), (ArrayList) hashMap2.get(a.getString(0))));
                }
                this.b.a.q();
                return arrayList;
            } finally {
                a.close();
            }
        } finally {
            this.b.a.o();
        }
    }

    protected final void finalize() {
        this.a.j();
    }
}
