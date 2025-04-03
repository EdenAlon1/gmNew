package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caxp extends CursorWrapper {
    private boolean a;

    public caxp(Cursor cursor) {
        super(cursor);
    }

    private final elav a(String str) {
        return this.a ? new caxo() : eleg.f(str);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        elav a = a("DatabaseWrapperSpanCursor#getCount");
        try {
            this.a = true;
            int count = getWrappedCursor().getCount();
            a.close();
            return count;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(int i) {
        elav a = a("DatabaseWrapperSpanCursor#move");
        try {
            boolean move = getWrappedCursor().move(i);
            a.close();
            return move;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        elav a = a("DatabaseWrapperSpanCursor#moveToFirst");
        try {
            boolean moveToFirst = getWrappedCursor().moveToFirst();
            a.close();
            return moveToFirst;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        elav a = a("DatabaseWrapperSpanCursor#moveToLast");
        try {
            boolean moveToLast = getWrappedCursor().moveToLast();
            a.close();
            return moveToLast;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        elav a = a("DatabaseWrapperSpanCursor#moveToNext");
        try {
            boolean moveToNext = getWrappedCursor().moveToNext();
            a.close();
            return moveToNext;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) {
        elav a = a("DatabaseWrapperSpanCursor#moveToPosition");
        try {
            boolean moveToPosition = getWrappedCursor().moveToPosition(i);
            a.close();
            return moveToPosition;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        elav a = a("DatabaseWrapperSpanCursor#moveToPrevious");
        try {
            boolean moveToPrevious = getWrappedCursor().moveToPrevious();
            a.close();
            return moveToPrevious;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
