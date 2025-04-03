package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axxa implements Iterator, AutoCloseable, fflg {
    private final Cursor a;
    private final ffji b;
    private Object c;

    public axxa(Cursor cursor, ffji ffjiVar) {
        ffjiVar.getClass();
        this.a = cursor;
        this.b = ffjiVar;
    }

    private final Object a() {
        Object obj = this.c;
        if (obj == null) {
            obj = null;
            while (obj == null && this.a.moveToNext()) {
                obj = this.b.invoke(this.a);
            }
            this.c = obj;
        }
        return obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.a.isClosed()) {
            return;
        }
        this.a.close();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return a() != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object a = a();
        if (a != null) {
            this.c = null;
        } else {
            a = null;
        }
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
